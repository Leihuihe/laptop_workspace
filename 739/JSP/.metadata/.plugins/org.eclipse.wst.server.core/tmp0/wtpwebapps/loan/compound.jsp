
<%@ page errorPage="error.jsp" %>
<%!
  public double calculate(double amount, double interest, int period) {
    if(amount <= 0) {
      throw new IllegalArgumentException("Amount should be greater than 0: " + amount);
    }
    if(interest <= 0) {
      throw new IllegalArgumentException("Interest should be greater than 0: " + interest);
    }
    if(period <= 0) {
      throw new IllegalArgumentException("Period should be greater than 0: " + period);
    }
    return amount*Math.pow(1 + interest/100, period);
  }
%>

<jsp:useBean id = "interesting" class = "beans.InterestingBean">
 </jsp:useBean>
<html>
  <head>
    <title>Compound</title>
  </head>
  <body style="font-family:verdana;font-size:10pt;">
    <%@ include file="Header.jsp" %>
    <%
      double amount = Double.parseDouble(request.getParameter("amount"));
      double interest = Double.parseDouble(request.getParameter("interest"));
      int period = Integer.parseInt(request.getParameter("period"));
    
      interesting.setInterest(interest);
      interesting.setPeriod(period);
    %>
   <jsp:setProperty name = "interesting" property = "amount" 
        value = "${param.amount}" />
     
    <b>Pincipal using compound interest:</b>
    <p>
   
    <p>
    <% 
        out.println("Interest is " +interesting.getcompoundInterestResult());
    %>
    
    </p>
    OR in JSP way: 
    <jsp:getProperty name = "interesting" property = "compoundInterestResult"/>
    
     <br/><br/>
    <jsp:include page="Footer.jsp"/>
  </body>
</html>

