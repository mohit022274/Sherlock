<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/table.css" rel="stylesheet">
</head>	

<body id="b">
	<h2 style="font-size: 18px;color: white;"><a href="/Sherlock/" style="color: #00FFFF;">Back To Home</a></h2>
	<sf:form>
		<h1 class="font-effect-3d">Citizen Details</h1>
		<div id="wrapper">
			<table id="keywords" class="tbl1" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th>Citizen ID</th>
						<th>Name</th>
						<th>Country</th>
						<th>DOB</th>
						<th>Height</th>
						<th>Weight</th>
						<th>Skin Color</th>
						<th>Email</th>
						
					</tr>
				</thead>
			<tbody>
				<tr>
					<td class="lalign">${citizen.getUIN()}</td>
					<td>${citizen.getF_name()}  ${citizen.getL_name()}</td>
					<td>${citizen.getCountry()}</td>
					<td>${citizen.getDob()}</td>
					<td>${citizen.getHeight()}</td>
					<td>${citizen.getWeight()}</td>
					<td>${citizen.getSkin_color()}</td>
					<td>${citizen.getEmail()}</td>
				</tr>
			</tbody>
		</table>	
		
		</div>
		<div id="wrapper1">
			<table id="keywords" class="tbl2" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th>Photo</th>
					</tr>
				</thead>
				<tr>
					<td><img alt="" src="data:image/gif;base64,${imgDataBase64}" width="170px" height="130px"></td>
				</tr>
			</table>
		</div>
		
	</sf:form>
</body>
</html>