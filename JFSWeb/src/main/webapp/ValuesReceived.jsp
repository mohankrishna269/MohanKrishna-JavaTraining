<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="MyValuesServlet">
<table align=center && border="1">
<tr>
  <td>Product Id</td>
  <td><input type="text" name="productid" ></td>
  </tr>
  <tr>
  <td>Product Name</td>
  <td><input type="text" name="productname"></td>
   </tr>
   <td>Product Colour</td>
  <td><input type="text" name="productcolor"></td>
   </tr>
    </tr>
   <td>Product Price</td>
  <td><input type="text" name="productprice"></td>
   </tr>
   
  <tr>
  <td><input type="submit" value="submit"></td>
  </tr>

</table>




</form>



</body>
</html>