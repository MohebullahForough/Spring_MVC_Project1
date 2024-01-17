<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
<%@include file="base.jsp"%>
</head>
<body>
	<div class="container">
		<div class="container text-center">
			<h1>welcome to product home page</h1>
		</div>

		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>Serial Number</th>
					<th>Product Name</th>
					<th>Product Discription</th>
					<th>Product Price</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${products}" var = "pr">
				<tr>
					<td>PROD-${pr.prodId}</td>
					<td>${pr.prodName}</td>
					<td>${pr.prodDis}</td>
					<td>${pr.prodPrice} <i class="fa-solid fa-euro-sign"></i></td>
					<td>
					<a href="deletingProduct/${pr.prodId}"><i class="fa fa-trash"></i></a> &nbsp;|&nbsp; 
					<a href="editingProduct/${pr.prodId}"><i class="fa-solid fa-pen-nib"></i></a></td>
				</tr>
			</c:forEach>
			
			</tbody>
		</table>
		<div class="container text-center"">
			<a href="addingProduct"  class="btn btn-primary ">Add
				Product</a>
		</div>
	</div>
</body>
</html>