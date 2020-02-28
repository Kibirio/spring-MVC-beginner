<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${webTitle}</title>
</head>
<body>
	<div align="center">
		<form action="processOrder">
			<h1 align="center">Palms cafe</h1>
			<hr>

			<label for="itemName">Item Name:</label> <input type="text"
				name="foodType" placeholder="food type" id="itemName"> <input
				type="submit" value="order now">
		</form>

	</div>

</body>
</html>