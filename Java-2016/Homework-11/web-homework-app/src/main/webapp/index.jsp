<%@ page import="ro.sci.classes.AgeCalculator"%>
<%@ page import="java.sql.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.io.IOException" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
	<p align = "center" style = "font-size:40px;font-weight : bold">
	Your age in days is : 
 		 <%
  		 AgeCalculator ac = new AgeCalculator();
   
   		 Date today = java.sql.Date.valueOf(LocalDate.now());
		 Date birthDate = java.sql.Date.valueOf(LocalDate.of(1996, 5, 31));
 
  		 out.print(ac.daysBetween(birthDate, today));
		 %>
		 !!
	</p>
		
</body>
</html>