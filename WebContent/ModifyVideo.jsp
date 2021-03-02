<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#D3D3D3">
	<form name="ModifyVideo" method="post" >
		<table align="center">
			<caption>Add or Update Video</caption>

			<tr>
				<td>Video Id</td>
				<td><input type="text" size="10" name="DvdId"></td>

			</tr>
			<tr>
				<td>Video Name</td>
				<td><textarea rows="1" cols="46" name="DvdName"></textarea></td>
			</tr>


			<tr>
				<td>Price</td>
				<td><input type="text" size="46" name="DvdPrice"></td>
			</tr>


			<tr>


				<td><button type="submit" value="AddVideo"
						style="background-color: black; color: white"
						formaction="AddVideo">ADD VIDEO</button></td>

				<td><button type="submit" value="UpdateVideo"
						style="background-color: black; color: white"
						formaction="UpdateVideo">UPDATE VIDEO</button></td>
			</tr>

		</table>
		<hr></hr>
		<br />
		<table align="center">
			<caption>Delete Video</caption>
			<tr>
				<td>Video Id</td>
				<td><a href="AddVideo.jsp"></a><input type="text" size="10"
					name="videoId"></td>
			</tr>

			<tr>
				<td><button type="submit" value="DeleteVideo"
						style="background-color: black; color: white"
						formaction="DeleteVideo">DELETE VIDEO</button></td>
			</tr>

		</table>

		<table style="width: 95%" border="1" cellspacing="1" cellpacing="2"
			bordercolor="0033FF" align="center" valign="top"
			style="margin-left : 180px">

			<tr>
				<td><pre>DVD Id</pre></td>
				<td><pre>DVD Name</pre></td>
				<td><pre>DVD Price</pre></td>

			</tr>
			<%
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");
                Statement stm = (Statement) con.createStatement();
                String SQL = "select * from dvd";
                ResultSet rs = stm.executeQuery(SQL);
                while(rs.next()){ 
            %>

			<tr>
				<td><%=rs.getString("DvdId")%></td>
				<td><%= rs.getString("DvdName")%></td>
				<td><%= rs.getString("DvdPrice")%></td>

			</tr>
				<%
                	}
                    
                }
				catch(ClassNotFoundException ex){ 
           		 out.println("Error : "+ ex);
        		}catch(SQLException ex){
           		 out.println("Error : "+ ex);
        		}
                %>
		</table>
	</form>
</body>
</html>