<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Find Person</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
    $(window).load(function(){
        $('#myModal').modal('show');
    });
</script>
</head>
<body>
<div class="container">
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
      
      <sf:form name="form1" method="POST" modelAttribute="citizen">
      
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" onclick="location.href = '/Sherlock'">&times;</button>
          <h4 class="modal-title">Enter ID to Search</h4>
        </div>
        <div class="modal-body">
          <sf:input path="UIN"  id="UIN" type="search" value="" placeholder="type ID here" style="border:0px;" />
           <button type="submit" class="btn btn-primary">Search</button>
        </div>
        
        </sf:form>
        
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal" onclick="location.href = '/Sherlock'">Close</button>
        </div>
      </div>
    </div>
  </div>
  </div>
</body>
</html>