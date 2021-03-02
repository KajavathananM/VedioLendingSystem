<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ReturnVideo</title>
</head>
<body bgcolor="#D3D3D3">

<form name="Return" method="post" action="ReturnVideo">
		
	
		<table align="center">
			<caption>
				<h1 align="Center"><B> Customer Return Details</B></h1>
			</caption>
			
			
			<tr>
				<td>Customer NIC_No:</td>
				<td><input name="NICNo" type="text" placeholder="950000000V"
					size="10" required /></td>
			</tr>

			
			<tr>
				<td>Return ID:</td>
				<td><input name="Return_Id" type="text" placeholder="a1"
					size="2" required /></td>
			</tr>
			
			
			
			<tr>
				<td >DVD Code/Codes:</td>
				<td><input name="code" type="text"placeholder="AB123"  required /></td>
			</tr>

		
			<tr>
				<td>Return Date:</td>
				<td><input name="returnDate" type="date" placeholder="DD/MM/YYYY" required></td>
			</tr>
			<tr></tr><tr></tr>
			<tr></tr><tr></tr>
			<tr></tr><tr></tr>
			<tr></tr><tr></tr>
			<tr>
			
				<td><button type="submit" value="Return"
						style="background-color: black; color: white">Return</button></td>
			</tr>

			
			</table>
			
			</form>
	
			<img src="DVD.png" align="middle" style="width:128px;height:128px;">

			<form method="post" action="ListReturn.jsp">
			
			<td><button type="submit" value="ListReturn"                                                                
				style="background-color: black; color: white">List Return</button></td>
			
			</form>
	

		<form method="post" action="CalculateBalance.jsp">
		
	
						<td><button type="submit" value="CalculateBalance"
						style="background-color: black; color: white">Calculate Balance</button></td>
	
		</form>

</body>
</html>