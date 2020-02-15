package userUtils;

import java.security.SecureRandom;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.sql.DataSource;

public class DatabaseUtility //directly connects web app to local database
{
	
	private DataSource ds;
	
	public DatabaseUtility(DataSource ds) 
	{
		this.ds = ds;
	}
	
	//Helper method to close connection to the database
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) 
	{
		try 
		{
			if(myRs != null) 
			{
				myRs.close();
			}

			if(myStmt != null) 
			{
				myStmt.close();
			}

			{ 
				myConn.close();
			}
		}
		catch(Exception exc) 
		{
			exc.printStackTrace();
		}
	}
	/******************************************************
	 * @param first first name of the user
	 * @param last last name of the user
	 * @param email email of the user
	 * @param password password of the user
	 * 
	 * This method inserts user data into the database
	 */
	public void insertUser(String first, String last, String email, String password)
	{
		Connection conn = null; 
		PreparedStatement stmnt = null;
		try
		{
			String salt = generateSalt(); //generates the salt of hte password
			conn = ds.getConnection(); //establishes connection to the mysql db
			stmnt = conn.prepareStatement("INSERT INTO users (email, password, first_name, last_name, hash_salt, is_confirmed) VALUES"
					+ "(?, ?, ?, ?, ?, false)"); //initializes sql insertion statement
			stmnt.setString(1, email); //sets the first question mark in stmnt to email
			stmnt.setString(2, hash(password,salt)); //sets the second question mark to the salted hashed password
			stmnt.setString(3, first); //sets the first question mark to first
			stmnt.setString(4, last); //sets the second question mark to last
			stmnt.setString(5, salt); //sets the last question mark to the salt of the hash
			stmnt.execute(); //executes the insertion
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		finally {
			close(conn, stmnt, null); //closes all db objects active in the method
		}
	}
	
	/************************************************
	 * 
	 * @param email the email supplied by the user
	 * @param pass the password supplied by the user
	 * @return true if the user is in the database and the password given by the user matches that in the database
	 * 
	 */
	public boolean retrieveUser(String email, String pass) 	{
		Connection conn = null;
		PreparedStatement stmnt = null;
		ResultSet rs = null;
		try {
			conn = ds.getConnection(); //establishes connection to the db
			stmnt = conn.prepareStatement("SELECT * FROM users WHERE email = ?"); //prepares sql query to obtain user data
			stmnt.setString(1, email); //sets question mark in query to email
			rs = stmnt.executeQuery(); //sets rs to the resulting set of data
			rs.next(); //points rs to the data supplied
			if(rs != null && rs.getString(2).equals(hash(pass,rs.getString(6)))) //if the user exists and the password hashes match then return true
				return true;
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		finally {
			close(conn, stmnt, rs); // close db objects
		}
		return false;
	}
	
	/*****************************************
	 * @param email supplied user email
	 * @return true if the user is confirmed and false is they aren't
	 */
	public boolean emailIsConfirmed(String email) 
	{
		Connection conn = null;
		PreparedStatement stmnt = null;
		ResultSet rs = null;
		try 
		{
			conn = ds.getConnection(); //establish connection to database
			stmnt = conn.prepareStatement("select from users where email = ?"); //queries for the user with the given email
			stmnt.setString(1, email);
			rs = stmnt.executeQuery();
			rs.next();
			if(rs.getString(5).equals("1")) //if user is confirmed return true
				return true;
		}
		catch(Exception exc) 
		{
			exc.printStackTrace();
		}
		finally 
		{
			close(conn,stmnt,rs); //close db objects
		}
		
		return false;
	}
	
	/******************************************************
	 * @param pass the plaintext password
	 * @param salt the randomized salt
	 * @return a salted hashed -- encrypted -- password
	 * @throws Exception
	 */
	private static String hash(String pass, String salt) throws Exception 
	{
		char[] chars = pass.toCharArray();
		byte[] saltBytes = salt.getBytes();
	
		PBEKeySpec spec = new PBEKeySpec(pass.toCharArray(), saltBytes, 65536, 128);
		Arrays.fill(chars, Character.MIN_VALUE);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
		
		return Base64.getEncoder().encodeToString(factory.generateSecret(spec).getEncoded());
	}
	
	/******************************************
	 * 
	 * @return randomized string that will act as the salt for the password hashing
	 */
	private static String generateSalt()
	{
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		
		return Base64.getEncoder().encodeToString(salt);
	}

}
