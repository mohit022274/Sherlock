<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Citizen Details:</h2>
	<sf:form>
		<table border="1px">
			<tr>
				<th>UIN</th>
				<th>Name</th>
				<th>Country</th>
				<th>DOB</th>
				<th>Height</th>
				<th>Weight</th>
				<th>Skin Color</th>
				<th>Email</th>
				<th>Photo</th>
			</tr>
			<tr>
				<td>${citizen.getUIN()}</td>
				<td>${citizen.getF_name()}</td>
				<td>${citizen.getCountry()}</td>
				<td>${citizen.getDob()}</td>
				<td>${citizen.getHeight()}</td>
				<td>${citizen.getWeight()}</td>
				<td>${citizen.getSkin_color()}</td>
				<td>${citizen.getEmail()}</td>
				<td><img alt="" src="data:image/gif;base64,${imgDataBase64}" width="250" height="250"></td>

			</tr>
		</table>	
	</sf:form>
</body>
</html>