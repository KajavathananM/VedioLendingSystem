<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#D3D3D3">
<form method="post" action="UpdateRentServlet">

		<table align="center">
		
			<tr>
				<td width="300">Customer Id:</td>
				<td><input style="width: 250px; border-radius: 5px"
					type="text" name="RentCustomerId" ></td>
			</tr>
			<tr>
				<td width="300">Rent DVD Code:</td>
				<td><input style="width: 250px; border-radius: 5px"
					type="text" name="RentDvdCode" ></td>
			</tr>
			<tr>
				<td width="300">Rent Date:</td>
				<td><input style="width: 250px; border-radius: 5px"
					type="Date" name="RentDate" ></td>
			</tr>
			
			<tr align="left">
				<td></td>
				<td><button value="Update" type="submit"
						style="background-color: Black; color: white">Update</button></td>
			</tr>
		</table>

	</form>

</body>
</html>