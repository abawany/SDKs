<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adaptive Payments</title>
</head>
<body>
	<h2>ConvertCurrency API Test Page</h2>
	<form method="POST">
		<div class="params">
			<div class="param_name">Code</div>
			<div class="param_value">
				<input type="text" name="code" value="USD" size="50" maxlength="260" />
			</div>
			<div class="param_name">Amount</div>
			<div class="param_value">
				<input type="text" name="amount" value="2.00" size="
					50"
					maxlength="260" />
			</div>
			<div class="param_name">ConvertTo</div>
			<div class="param_value">
				<input type="text" name="convertTo" value="GBP" size="50"
					maxlength="260" />
			</div>
		</div>
		<input type="submit" name="ConvertBtn" value="Convert" />
	</form>
	<a href="index.html">Home</a>
</body>
</html>