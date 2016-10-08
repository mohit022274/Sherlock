<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="js" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/table.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<h2 style="font-size: 18px;color: white;"><a href="/Sherlock/" style="color: white;">Back To Home</a></h2>
<h1>CREDIT HISTORY</h1>
<div id="wrapper">
		<table id="keywords" class="tbl1" cellspacing="0" cellpadding="0">
		<thead>
			<tr>
				<th>Credit History ID</th>
				<th>Bank Name</th>
				<th>Branch</th>
				<th>Loan Amount</th>
				<th>Guaranteer ID</th>
				<th>Credibility</th>
				<th>Customer ID</th>
			</tr>
		</thead>
		<js:forEach var="obj" items="${credit_history}">
		<tbody>
			<tr>
				<td class="lalign">${obj.getCreditHistoryID()}</td>
				<td>${obj.getBankName()}</td>
				<td>${obj.getBranch()}</td>
				<td>${obj.getLoanAmount()}</td>
				<td>${obj.getGuaranteerID()}</td>
				<td>${obj.getCredibility()}</td>
				<td>${obj.getCustomerID()}</td>
<%-- 				<a href="http://localhost:8080/bloodbank/${ obj.getName()}"><li>${obj.getName()}</li></a> --%>
			<tr>
		<tbody>
		</js:forEach>
		</table>
	</div>
</body>
</html>