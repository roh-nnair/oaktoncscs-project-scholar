package userUtils;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

public class DatabaseUtility {
	
	private DataSource ds;
	
	public DatabaseUtility(DataSource ds) {
		this.ds = ds;
	}

}
