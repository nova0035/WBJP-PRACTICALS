import java.sql.*;

public class Practical1 {
	public static void main(String[] args) {
    
		try{
      
			Class.forName("com.mysql.jdbc.Driver"); 

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test ", "root", "");

			System.out.println("Connection Established Successfully");

			Statement stmt = conn.createStatement();

			// stmt.execute("CREATE TABLE data (srno int(2), name varchar(20));");
			// System.out.println("Table Created Successfully");

			int reply = stmt.executeUpdate("INSERT INTO data VALUES (1,'hello');");

			if(reply == 1){
				System.out.println("Value Inserted Successfully");
			} 
		}
		catch(SQLException sqle){
			sqle.getMessage();
		}
      
		catch(ClassNotFoundException ce){
			ce.getMessage();
		}
	}
}
