<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#D3D3D3">
	<form name ="SearchVideo"method ="post"action="/SearchVideo">
		<table align="center">
		<caption>Search Video</caption>
			<tr>
				<td><input type="text" name="search" value="Enter name of video"></td>
				<td><button type="submit" value="AddVideo"
						style="background-color: black; color: white">Search</button></td>
			</tr>
		</table>
	</form>
</body>
</html>