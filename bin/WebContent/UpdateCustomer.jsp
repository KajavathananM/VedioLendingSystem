<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#D3D3D3">
<form name=update method="post" action="UpdateCustomer">
	<table align="center">
			<caption>
				<h2 align="Center">Customer Details</h2>
			</caption>
			<tr>
				<td>Customer NIC.No:</td>
				<td><input  type="text" placeholder="960000000V" size="10" name="NIC" required /></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><textarea  rows="1" cols="46" name="Name" required /></textarea></td>
			</tr>

			
			<tr>
				<td>E-mail Address:</td>
				<td><input  type="email" size="46" name="email"required /></td>
			</tr>

			<tr>
				<td >Contact Number:</td>
				<td><input type="text" size="46" name="Telephone" placeholder="0112000000" required /></td>
			</tr>


		
				<td><button type="reset" value="Reset"
						class="SubmitnReset" style="background-color: black; color: white">RESET</button></td>

				<td><button type="submit" value="UpdateCustomer"
						style="background-color: black; color: white">UPDATE CUSTOMER</button></td>
		
			</tr>
		<img  align="left" src="update.png" width=20% height=20%>
		</table>
		
	</form>
</body>
</html>