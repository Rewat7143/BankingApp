<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Bank Accounts</title>
</head>
<body>
    <h2>Your Bank Accounts</h2>

    <ul>
        <c:forEach var="account" items="${accounts}">
            <li>Account Name: ${account.accountName}, Balance: ${account.balance}</li>
        </c:forEach>
    </ul>

    <a href="/addBankAccount">Add New Bank Account</a>
</body>
</html>
