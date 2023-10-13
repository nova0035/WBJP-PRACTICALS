<html>
    <body>
        <h1>
        <%
            int mark1 = Integer.parseInt(request.getParameter("sub1"));
            int mark2 = Integer.parseInt(request.getParameter("sub2"));
            int mark3 = Integer.parseInt(request.getParameter("sub3"));
            int mark4 = Integer.parseInt(request.getParameter("sub4"));
            int mark5 = Integer.parseInt(request.getParameter("sub5"));

            int average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;

            if (average >= 90) {
                out.print("GRADE A");
            }
            else if (average >= 80) {
                out.print("GRADE B");
            }
            else if (average >= 70) {
                out.print("GRADE C");
            }
            else if (average >= 60) {
                out.print("GRADE D");
            }
            else {
                out.print("GRADE F");
            }
        %>
        </h1>
    </body>
</html>
