<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payments Web App</title>
<!-- 
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .header {
            background-color: #f8f9fa;
            border: 2px solid red;
            padding: 10px;
            text-align: center;
        }
        .user-details {
            background-color: #e9ecef;
            border: 2px solid green;
            padding: 10px;
            margin-bottom: 10px;
        }
        .account-info {
            background-color: #e9ecef;
            border: 2px solid blue;
            padding: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .bank-accounts {
            background-color: #e9ecef;
            border: 2px solid purple;
            padding: 10px;
            display: flex;
            flex-wrap: wrap;
            gap: 10px;
        }
        .bank-account {
            background-color: #fff;
            border: 2px solid orange;
            padding: 10px;
            width: calc(25% - 20px);
        }
        .transactions {
            background-color: #e9ecef;
            border: 2px solid blue;
            padding: 10px;
        }
        .add-button, .edit-button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
        }
        .add-button:hover, .edit-button:hover {
            background-color: #0056b3;
        }
    </style>
    -->
	<style>
		body {
			font-family: 'Arial', sans-serif;
			margin: 0;
			padding: 0;
			background-color: #f0f4f8;
			color: #333;
		}
		
		.header {
			background-color: #007bff;
			color: white;
			padding: 20px;
			text-align: center;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
		}
		
		.header button {
			background-color: #ff4c4c;
			color: white;
			border: none;
			padding: 10px 20px;
			cursor: pointer;
			border-radius: 5px;
		}
		
		.header button:hover {
			background-color: #d43b3b;
		}
		
		.user-details, .account-info, .bank-accounts, .transactions {
			background-color: white;
			border-radius: 10px;
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
			padding: 20px;
			margin: 20px;
		}
		
		.account-info {
			display: flex;
			justify-content: space-between;
			align-items: center;
		}
		
		.bank-accounts {
			display: flex;
			flex-wrap: wrap;
			gap: 15px;
		}
		
		.bank-account {
			background-color: #f8f9fa;
			border: 1px solid #ddd;
			border-radius: 10px;
			padding: 15px;
			width: calc(25% - 15px);
			box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
		}
		
		.bank-account:hover {
			background-color: #e7f3ff;
			transform: scale(1.02);
			transition: all 0.3s ease;
		}
		
		table {
			width: 100%;
			border-collapse: collapse;
			border-radius: 10px;
			overflow: hidden;
			margin-top: 20px;
		}
		
		th, td {
			padding: 10px;
			text-align: center;
			border: 1px solid #ddd;
		}
		
		th {
			background-color: #007bff;
			color: white;
		}
		
		tr:nth-child(even) {
			background-color: #f9f9f9;
		}
		
		.add-button, .edit-button {
			background-color: #007bff;
			color: white;
			border: none;
			padding: 10px 15px;
			cursor: pointer;
			border-radius: 5px;
			transition: background-color 0.3s ease;
		}
		
		.add-button:hover, .edit-button:hover {
			background-color: #0056b3;
		}
		
		button {
			border-radius: 5px;
			padding: 10px 15px;
		}
		
		a {
			text-decoration: none;
		}
	</style>
</head>
<body>

	<!-- Header -->
	<div class="header">
		<h2>Payments WebApp</h2>
		<p>Welcome<User Full Name></p>
		
		<form action = "/logout" method ="post">
			<button type ="submit" class = "btn btn-primary " > Logout</button>
		</form>

	</div>
	<!-- User Details Section -->
	<%
	//int userId=(int)session.getAttribute("userId");
//	UserEntity user = (UserEntity) request.getAttribute("user");
	%>

	<div class="user-details">
		<h3>User Information</h3>
		<p><strong>Name:</strong></p>
		<p><strong>Email:</strong></p>
		<p><strong>Phone:</strong></p>
	</div>
	<!-- Account Information Section -->
	<div class="account-info">
		<div>
			<p>primary Bank Account No:<1234></p>
			<p>Account Balance: <90.00></p>
			<p>Wallet Balance: <77.00> <a href="addWalletBalance.jsp">[+]</a></p>
		</div>
		
		<form action = "/sendMoney" method ="post">
			<button type ="submit" class = "btn btn-primary " > Send Money</button>
		</form>
		
	</div>


		<div>
			<a href="${pageContext.request.contextPath}/add-bank-account"><button class="add-button">[+]</button></a>
		</div>
	</div>

	<!-- Recent Transactions Section -->
	<div class="transactions">
		<h3>Recent Transactions</h3>
		<table
			style='border: 1px solid black; border-collapse: collapse; width: 100%;'>
			<tr style='background-color: #f4f4f4;'>
				<th>Transaction ID</th>
				<th>Date</th>
				<th>Destination ID</th>
				<th>Source Type</th>
				<th>Destination Type</th>
				<th>Amount</th>
			</tr>
		
		
		</table>
		<a href="${pageContext.request.contextPath}/statement-req"><button>Detailed Stmt</button></a>
	</div>
</body>
</html>