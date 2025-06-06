<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Page</h2>

    <!-- Error Message -->
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>

    <!-- Login Form -->
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label>Username:</label>
        <input type="text" name="username" required /><br/><br/>

        <label>Password:</label>
        <input type="password" name="password" required /><br/><br/>

        <input type="submit" value="Login" />
         <a href="register">Register</a>
         
    </form>
</body>
</html>
