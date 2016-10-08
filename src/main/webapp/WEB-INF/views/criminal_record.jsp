<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="js" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="font-size: 18px;color: white;"><a href="/Sherlock/" style="color: white;">Back To Home</a></h2>
	<h1>CRIMINAL RECORD</h1>
	<div id="wrapper">
		<table id="keywords" class="tbl1" cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<th>Crime ID</th>
					<th>Date and Time</th>
					<th>State</th>
					<th>District</th>
					<th>Nature Of Crime</th>
					<th>Description</th>
					<th>Witness ID</th>
					<th>Criminal ID</th>
				</tr>
			</thead>
			<js:forEach var="obj" items="${criminal}">
			<tbody>
				<tr>
					<td>${obj.getCrimeId()}</td>
					<td>${obj.getDateAndTime()}</td>
					<td>${obj.getState()}</td>
					<td>${obj.getDistrict()}</td>
					<td>${obj.getNatureOfCrime()}</td>
					<td>${obj.getDescription()}</td>
					<td>${obj.getWitnessId()}</td>
					<td>${obj.getCriminalId()}</td>
				<tr>
			</tbody>
			</js:forEach>
		</table>
	</div>
</body>
</html>