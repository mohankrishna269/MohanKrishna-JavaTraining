<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Model.ProductClass" %>
<%@page import="java.util.*"%>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>Product Added</h1>
<%ProductClass p=(ProductClass)request.getAttribute("PROD");
out.print(p.getProduct_id());
out.print(p.getProduct_name());
out.print(p.getProduct_color());
out.print(p.getProduct_price());

%></center>
</body>
</html>