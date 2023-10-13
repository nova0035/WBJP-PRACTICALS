<%@ page import="java.sql.*" %>

<html>
    <body>
        <%
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");

            Statement stmt = conn.createStatement();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO studentdata VALUES (?,?,?);");

            pstmt.setString(1,"153");
            pstmt.setString(2,"Bhavya");
            pstmt.setString(3,"8.29");

            if (pstmt.executeUpdate() == 1){
                out.print("VALUES INSERTED SUCCESSFULLY <br>");
            }
            else{
                out.print("VALUES CANNOT BE INSERTED <br>");
            }
            
            if ( stmt.executeUpdate("UPDATE studentdata SET spi = 8.29 WHERE enrno = 153;") == 1){
                out.print("SPI UPDATED SUCCESSFULLY <br>");
            }
            else{
                out.print("SPI CANNOT BE UPDATED <br>");
            }

            ResultSet student_data = stmt.executeQuery("SELECT * FROM studentdata");

            out.print("<table border='1px'>");
            
            while(student_data.next()){
                out.print("<tr><td>");
                out.print(student_data.getString(1) + "</td><td>" + student_data.getString(2) + "</td><td>" + student_data.getString(3) + "</td></tr>");
            }

            out.print("</table>");
        }

        catch(Exception e){
            out.print(e.getMessage());
        }

        %>

    </body>
</html>
