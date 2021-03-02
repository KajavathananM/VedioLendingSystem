<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#D3D3D3">
<form method="post" action="AddRentServlet">

		<table align="center">
			<tr>
				<td width="300">Customer ID:</td>
				<td><input style="width: 250px; border-radius: 5px" type="text"
					name="CustomerID" width="100" height="50" required></td>
			</tr>
			
			
			<tr>
				<td width="300">Rent ID:</td>
				<td><input style="width: 250px; border-radius: 5px" type="text"
					name="RentID" width="100" height="50" required></td>
			</tr>
			
			<tr>
				<td width="300">DVD BarCode :</td>
				<td><input style="width: 250px; border-radius: 5px" type="text"
					name="DVDBarcode" width="100" height="50"></td>
			</tr>
			
			<tr>
				<td width="300">Rent Date:</td>
				<td><input style="width: 250px; border-radius: 5px"
					type="Date" name="Date" ></td>
			</tr>
			<tr>
				<td width="300">DeadLine :</td>
				<td><input style="width: 250px; border-radius: 5px"
					type="Date" name="DeadLine" ></td>
			</tr>

			<tr align="left">
				<td></td>
				<td><button value="Rent" type="submit"
						style="background-color: blue; color: white">Rent</button></td>
			</tr></table>
			
		

	</form>
</body>
</html>