<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Job management</h1>
	<h2>
		<a href="new">Add New JOB</a> &nbsp;&nbsp;&nbsp; <a href="list">
			List All JOBS</a>
	</h2>
	<div align="center">
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Company Name</th>
				<th>Appointmentday</th>
				<th>ConsultPerson</th>
				<th>Requirements</th>
				<th>Comments</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${listjob}" var="job" >
				<tr>
					<td>${job.id}</td>
					<td>${job.companyName}</td>		
					<td>${job.appointmentday}</td>
					<td>${job.consultPerson}</td>
					<td>${job.requirments}</td>
					<td>${job.comments}</td>
					<td><a href="DeleteJobServlet?id=<c:out value='${job.id}'/>">delete</a></td>
		 
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>