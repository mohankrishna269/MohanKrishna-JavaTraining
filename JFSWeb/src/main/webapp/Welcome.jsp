<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyWebPage</title>
</head>
<body bgcolor="yellow">

<form method="get" action="MyGetServlet">


<input type="text" name="id">
<input type="submit" name="productReceivePage">
</form>


<marquee><h1>Welcome to my Page</h1></marquee>
<center>Date is:</center>
<br>

<%
Date date=new Date();
out.print(date.toString());
%>
</body>
</html>