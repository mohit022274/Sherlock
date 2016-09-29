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
Welcome to credit history!!!!

		<table border="1px">
		<tr>
			<th>Credit History ID</th>
			<th>Bank Name</th>
			<th>Branch</th>
			<th>Loan Amount</th>
			<th>Guaranteer ID</th>
			<th>Credibility</th>
			<th>Customer ID</th>
		</tr>	
			<js:forEach var="obj" items="${credit_history}">
				<tr>
				<td>${obj.getCreditHistoryID()}</td>
				<td>${obj.getBankName()}</td>
				<td>${obj.getBranch()}</td>
				<td>${obj.getLoanAmount()}</td>
				<td>${obj.getGuaranteerID()}</td>
				<td>${obj.getCredibility()}</td>
				<td>${obj.getCustomerID()}</td>
<%-- 				<a href="http://localhost:8080/bloodbank/${ obj.getName()}"><li>${obj.getName()}</li></a> --%>
				<tr>
			</js:forEach>
		</table>
</body>
</html>