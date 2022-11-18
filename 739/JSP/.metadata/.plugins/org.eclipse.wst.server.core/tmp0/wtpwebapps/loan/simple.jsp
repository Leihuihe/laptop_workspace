<%@ page errorPage="Error.jsp" %>
<jsp:useBean id = "interesting" class = "beans.InterestingBean">
 </jsp:useBean>
   
<html>
  <head>
    <title>Simple</title>
  </head>
  <body style="font-family:verdana;font-size:10pt;">
    <%@ include file="Header.jsp" %>
    <%
      double amount = Double.parseDouble(request.getParameter("amount"));
      double interest = Double.parseDouble(request.getParameter("interest"));
      int period = Integer.parseInt(request.getParameter("period"));
      // interesting.setAmount(amount);
      interesting.setInterest(interest);
      interesting.setPeriod(period);
    %>
    
    <jsp:setProperty name = "interesting" property = "amount" 
        value = "${param.amount}" />
     
    <b>Pincipal using simple interest:</b>
    <p>
   
    <p>
    <% 
        out.println("Interest is " +interesting.getSimpleInterestResult());
    %>
    
    </p>
    OR in JSP way:
    <jsp:getProperty name = "interesting" property = "simpleInterestResult"/>
    
     <br/><br/>
    <jsp:include page="Footer.jsp"/>
  </body>
</html>