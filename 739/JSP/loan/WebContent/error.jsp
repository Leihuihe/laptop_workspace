 
<%@ page isErrorPage="true" %>
<html>
  <head>
    <title>Simple</title>
  </head>
  <body style="font-family:verdana;font-size:10pt;">
    <%@ include file="Header.jsp" %>
    <p style="color=#FF0000"><b><%= exception.getMessage() %></b></p>
    <jsp:include page="Footer.jsp"/>
  </body>
</html>       

