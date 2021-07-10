<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process Form</title>
        <link rel="stylesheet" type="text/css" href="css/table.css">
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
        <a href="<%=request.getContextPath()%>">Приложение other_ee</a>




        <h2>TABLE EXAMPLE</h2>

        <!--* Static table example -->
        <table>
            <tr>
                <th>Company</th>
                <th>Contact</th>
                <th>Country</th>
            </tr>
            <tr>
                <td>Alfreds Futterkiste1</td>
                <td>Maria Anders</td>
                <td>Germany</td>
            </tr>
            <tr>
                <td>Alfreds Futterkiste2</td>
                <td>Maria Anders</td>
                <td>Germany</td>
            </tr>
        </table>

        <!--* Dynamic table example -->

        <%
            String[] values = {"ONE", "TWO", "THREE"};
        %>    
        <h2>TABLE EXAMPLE2</h2>
        <table>
            <tr>
                <th>Company</th>
                <th>Contact</th>
                <th>Country</th>
            </tr>
            <%
                for (String v : values) {
            %>   
            <tr>
                <td><%=v%></td>
                <td>Maria Anders</td>
                <td>Germany</td>
            </tr>
            <%
                }
            %>     
        </table>

    </body>
</html>
