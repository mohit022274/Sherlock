<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Person</title>
</head>
<body>

	<div>
		<h2>Enter ID</h2>
		<sf:form name="form1" method="POST" modelAttribute="citizen">
			<fieldset>
				<table cellspacing="0">
					<tr>
						<th><label for="UIN"> ID : </label></th>
						<td>
						<sf:input path="UIN"  id="UIN" /> <small id="UIN">No Space , please </small>
						</td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Register">
						</td>
					</tr>
				</table>
			</fieldset>
		</sf:form>
	</div>
</body>
</html>