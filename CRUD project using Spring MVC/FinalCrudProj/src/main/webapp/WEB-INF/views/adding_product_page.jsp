<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title }</title>
<%@include file="base.jsp"%>
</head>
<body>
	<div class="container">
		<div class="container text-center">
			<h3>Product Details...</h3>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<form action="addingProductDetails" method="POST">
						<div class="mb-3">
							<label for="exampleInputEmail1" class="form-label">Product
								Name:</label> <input type="text" class="form-control"
								id="exampleInputEmail1" aria-describedby="emailHelp"
								name="prodName">

						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Product
								Discription:</label>
							<div class="form-floating">
								<textarea class="form-control"
									placeholder="Leave a comment here" id="floatingTextarea"
									rows="5" name="prodDis"></textarea>
								<label for="floatingTextarea">Write description here...</label>
							</div>
						</div>

						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Product
								Price:</label> <input type="text" class="form-control" name="prodPrice">
						</div>
						<div class="container text-center">
							<a href="${pageContext.request.contextPath}/"
								class="btn btn-primary">Back</a>
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>

					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>