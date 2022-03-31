<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyPage</title>
</head>
<body>
<form method="post" action="MyGetServlet">
<table align=center && border="1">
<tr>
  <td>Product Id</td>
  <td><input type="text" name="productid" value="100" placeholder="Enter the Product Id"></td>
  </tr>
  <tr>
  <td>Product Name</td>
  <td><input type="text" name="productname" value="Redmi"  placeholder="Enter the Product Name"></td>
   </tr>
   <td>Product Colour</td>
  <td><input type="text" name="productcolor" value="Blue" placeholder="Enter the Product Color"></td>
   </tr>
    </tr>
   <td>Product Price</td>
  <td><input type="text" name="productprice" value="12000" placeholder="Enter the Product Price"></td>
   </tr>
   
  <tr>
  <td><input type="submit" value="submit"></td>
  </tr>

</table>




</form>



</body>
</html>