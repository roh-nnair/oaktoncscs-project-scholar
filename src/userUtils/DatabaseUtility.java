package userUtils;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
	
	public void insertUser(String first, String last, String email, String password)
	{
		Connection conn = null;
		PreparedStatement stmnt = null;
		try
		{
			conn = ds.getConnection();
			stmnt = conn.prepareStatement("INSERT INTO users (email, password, first_name, last_name) VALUES"
					+ "(?, ?, ?, ?)");
			stmnt.setString(1, email);
			stmnt.setString(2, password);
			stmnt.setString(3, first);
			stmnt.setString(4, last);
			stmnt.execute();
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		finally {
			close(conn, stmnt, null);
		}
	}

}
