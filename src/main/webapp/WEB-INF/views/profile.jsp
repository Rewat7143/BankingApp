<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h2>Profile of ${user.username}</h2>
    <p>Email: ${user.email}</p>
    <p>Address: ${user.address}</p>

    <a href="/editprofile">Edit Profile</a>
    <a href="/bankAccounts">View Bank Accounts</a>
    <a href="/transactions">View Transactions</a>
</body>
</html>
