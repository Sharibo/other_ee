<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process Form</title>
    </head>
    <body>
        <h1>Process Form Result</h1>

        <%
            String string_1 = "Hello";
            out.print("<h2>");
            out.print(string_1);
        %>

        <%
            String string_2 = "World";
            out.print(string_2);
            out.print("</h2>");
        %>
        
        <br>

        <%
            if (true) {
        %>
        <h2>if-block</h2>
        <%
            }
        %>

        <br>

        <%
            out.print(request.getContextPath());
            String string_3 = (String) request.getAttribute("firstAtribute");
        %>

        <br>

        <%
            out.print("first name: " + string_3);
        %>

        <!--* JSP Expression -->
        <%-- JSP-комментарий --%>

        <h2>first name: <%=string_3%></h2>

    </body>
</html>
