<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Add Athlete Page</title>
</head>
<body>
	<h2>
		<center>Enter Details</center>
	</h2>
	<table border="1">
		<form action="addUser" onsubmit="return validation()">
			<tr>
				<td>Athlete Name</td>
				<td><input type="text" name="athleteName" id="user" />
				</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><label for="Male">Male</label><input type="radio"
					name="gender" value="Male">
					<label for="Female">Female</label><input type="radio" 
					name="gender" value="Female">
				</td>
				</tr>
			<tr>
				<td>Category</td>
				<td><select id="selectbox" name="category">
      					<option value="Running">Running</option>
      					<option value="High Jump">High Jump</option>
      					<option value="Hurdles">Hurdles</option>
      					<option value="Relay">Relay</option>
      					<option value="Javelin Throw">Javelin Throw</option>
      					<option value="Shotput">Shotput</option>
    				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" id="email" name="emailId" />
				</td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" id="mobile" name="mobile" />
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit" value="submit">ADD</button>
					<button>CANCEL</button>
				</td>
				<td>
				</td>
			</tr>
		</form>

	</table>
	
	
</body>
</html>