<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<% String name = request.getParameter("name"); %>
<body>
	<table border="0" style="font-family:verdana;font-size:10pt;">
        <tr>
          <td>Thank you ${param.name} for your registration</td>
          
        </tr>
        </table>
</body>
</html>