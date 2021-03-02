<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculating Balance </title>
    <link rel="stylesheet" type="text/css" href="Style1.css"/> 


<body bgcolor= "lightgray"/>
<br><br><br>
<form name="calFine" align="center">

<table style=center: 500px">
<h3 style=center: 600px">Calculations - DVD Return  </h3>
<tr><td><p style=center: 80px">  Returning Date : </p> </td>
	<td><input type="date" id="CurrentDate" style="border: none;height:30px;margin-left: 30px" size="34" placeholder="  mm/dd/yyyy"><br></td>
</tr>
<tr>	<td><p style=center: 80px"> Rent Deadline :  </p></td>
	<td><input type="date" id="DueDate" style="border: none;height:30px;margin-left: 30px" size="34" placeholder="  mm/dd/yyyy"></td>
</tr>
<tr>
            

		<img src="DVD.png" align="middle" style="width:128px;height:128px;">

						<form method="post" action="CalculateBalance">
		
	
						<td><button type="submit" value="CalculateBalance"
						style="background-color: black; color: white">Calculate Balance</button></td>
	
						</form>

						<form method="post" action="Home2.jsp">
		
	
						<td><button type="Reset" 
						style="background-color: black; color: white">Back</button></td>
	
					</form>




</tr>
</table>
</form>
</body>
</html>