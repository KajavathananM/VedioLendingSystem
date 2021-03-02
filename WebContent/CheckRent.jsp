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
<title>Rent DVD Details</title>

<table align="center">

				<h2 align="Center">Customer Rent Service</h2>
	</table>

<table align="middle">

	<nav>
	<ul class="tab1" style="margin: 10px">

		<li class="li1"><B><a href="AddRent.jsp">RENT</a></B></li>

		<li class="li1"><B><a href="updateRent.jsp">UPDATE</a></B></li>

		<li class="li1"><B><a href="DeleteRent.jsp">DELETE</a></B></li>

	</ul>
	</nav>



</table>

</head>
<body bgcolor="#D3D3D3">
	<form method="post" action="AddrentRentServlet"></form>

	</table>

	<table style="width: 95%" border="1" cellspacing="1" cellpading="2"
		bordercolor="0033FF" align="center" valign="top"
		style="margin-left : 180px">

		<tr>
			<td>Customer Id</td>
			<td>Rent Id</td>
			<td>DVD Code</td>
			<td>Rent Date</td>
			<td>DeadLine</td>
		</tr>
		<%
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");
                Statement stm = (Statement) con.createStatement();
                String SQL = "select * from rent";
                ResultSet rs = stm.executeQuery(SQL);
                while(rs.next()){ 
            %>

		<tr>
			<td><%=rs.getString("RentCustomerId")%></td>
			<td><%= rs.getString("RentId")%></td>
			<td><%= rs.getString("RentDvdCode")%></td>
			<td><%= rs.getString("RentDate")%></td>
			<td><%= rs.getString("RentDeadLine")%></td>
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