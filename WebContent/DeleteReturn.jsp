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
<title>View</title>
</head>
<body bgcolor="#D3D3D3">

	
	<form action="DeleteReturn"><table>
	<tr>
				<td>Customer NIC_No:</td>
				<td><input id="NICNo" type="text" placeholder="950000000V" name="NICNo"
					size="10" required /></td>
	</tr>
	<tr>
				<td> Return_Id:</td>
				<td><input id="No" type="text"  name="No"
					size="10"  /></td>
	</tr>
	<td><button type="submit" value="Delete" name="Delete"
						style="background-color: black; color: white;align:centre">DELETE CUSTOMER</button></td></table></form>
						
	<table style="width:95%" border="1"cellspacing="1"cellpading="2"bordercolor="0033FF" align="center" valign="top" style = "margin-left : 180px">
			
		

		<tr>
            <th> <pre>ReturnCustomerId  </pre></th>
			<th> <pre> ReturnId      </pre> </th>
			<th> <pre> ReturnDvdCode </pre> </th>
			<th> <pre> ReturnDate  </pre> </th>
		</tr>
            <%
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lend", "root", "root");
                Statement stm = (Statement) conn.createStatement();
                String SQL = "select * from return_";
                ResultSet rt = stm.executeQuery(SQL);
                while(rt.next()){ 
            %>
                <tr>
                        	<td><%= rt.getString("ReturnCustomerId")%></td>
							<td><%= rt.getString("ReturnId")%></td>
                        	<td><%= rt.getString("ReturnDvdCode")%></td>
                        	<td><%= rt.getString("ReturnDate")%></td>
               </tr>        
		 	<% 
                     }
                    //out.println(rs.getString("nic")+ "           " + rs.getString("docName") + "         "+rs.getString("specialization")+ "         " + rs.getString("date"));
                }
                    catch(ClassNotFoundException ex){ 
                        out.println("Error : "+ ex);
                    }catch(SQLException ex){
                        out.println("Error : "+ ex);
                    }
             %>
            
            <br/>
			<br/>
        	<br/>
        	</table>
        	</form>
</body>
</html>