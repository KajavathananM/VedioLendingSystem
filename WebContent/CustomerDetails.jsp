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
<form name = "abc" action="DeleteCustomer"><table>
	<tr>
				<td >Enter NIC Number:</td>
				<td><input  type="text" placeholder="960000000V" size="10" name="NIC"  required /></td>

	</tr>

	<td><button type="submit" value="Update" name="Update"
						style="background-color: black; color: white ;align:right">UPDATE CUSTOMER</button></td>
						</form>
						
	<form>
	<td><button type="submit" value="Delete" name="Delete" 
						style="background-color: black; color: white; align:left">DELETE CUSTOMER</button></td></table></form>
						
<table style="width:95%" border="1"cellspacing="1"cellpading="2"bordercolor="0033FF" align="center" valign="top" style = "margin-left : 180px">
			
		

		<tr>
            <th> <pre> NIC No:  </pre></th>
			<th> <pre>  Name       </pre> </th>
			<th> <pre> Email </pre> </th>
			<th> <pre> Phone No:  </pre> </th>
		</tr>
            <%
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");
                Statement stm = (Statement) con.createStatement();
                String SQL = "select * from customer";
                ResultSet rs = stm.executeQuery(SQL);
                while(rs.next()){ 
            %>
                <tr>
                        <td><%=rs.getString("NIC")%></td>
						<td><%= rs.getString("C_Name")%></td>
                        <td><%= rs.getString("Email")%></td>
                        <td><%= rs.getString("Telephone")%></td>
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
            <br/>
	<br/>
        <br/></table></form>
</body>
</html>