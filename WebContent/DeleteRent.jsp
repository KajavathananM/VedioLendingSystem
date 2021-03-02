<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
</head>
<body bgcolor="#D3D3D3">
<form method="post" action="DeleteRentServlet">

		<table align="center">
		
			<tr>
				<td width="300">Rent ID:</td>
				<td><input style="width: 250px; border-radius: 5px" type="text"
					name="RentID" width="100" height="50" required></td>
			</tr>
			
			<tr align="left">
				<td></td>
				<td><button value="Delete" type="submit"
						style="background-color: blue; color: white">Delete</button></td>
			</tr>

</body>
</html>