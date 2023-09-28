import java.sql.*;
import java.util.Scanner;

public class Practical2 {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test ", "root", "");

			System.out.println("Connection Established Successfully");

			Statement stmt = conn.createStatement();

			System.out.println("Products");
			System.out.println("1) IPhone 15");
			System.out.println("2) Acer One 14 Laptop");
			System.out.println("3) Nikon X30 Camera");
			System.out.println("4) Samsung 80 cm Wondertainment Series LED TV");
			System.out.println("5) Sony WH-CH520 Wireless Headphone");

			Scanner scan = new Scanner(System.in);

			System.out.print("_ : ");	
			int choice = scan.nextInt();

			PreparedStatement pstmt = conn.prepareStatement("SELECT price FROM data WHERE device_name = ?;");
			ResultSet rs;			 
			switch(choice){
				case 1:
					pstmt.setString(1,"iphone_15");
					rs = pstmt.executeQuery();
					rs.next();
					System.out.println("\nIPhone 15 Price = " + rs.getInt(1));
					break;
				case 2:
					pstmt.setString(1,"acer_one_14");
					rs = pstmt.executeQuery();
					rs.next();
					System.out.println("\nAcer One 14 Laptop Price = " + rs.getInt(1));
					break;
				case 3:
					pstmt.setString(1,"nikon_Z30");
					rs = pstmt.executeQuery();
					rs.next();
					System.out.println("Nikon Z30 Camera Price = " + rs.getInt(1));
					break;
				case 4:
					pstmt.setString(1,"samsung_80cm_wondertainment");
					rs = pstmt.executeQuery();
					rs.next();
					System.out.println("\nSamsung 80 cm Wondertainment Series LED TV Price = " + rs.getInt(1));
					break;
				case 5:
					pstmt.setString(1,"sony_wh-ch520");
					rs = pstmt.executeQuery();
					rs.next();
					System.out.println("\nSONY WH-CH520 Wireless Headphone Price = " + rs.getInt(1));
					break;
			}
		}
		catch(SQLException sqle){
			sqle.getMessage();
		}
		catch(ClassNotFoundException cnfe){
			cnfe.getMessage();
		}
	}
}
