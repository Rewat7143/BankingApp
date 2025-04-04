<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <form action="/register" method="post">
        Name: <input type="text" name="name"/><br/>
        Email: <input type="email" name="email"/><br/>
        Password: <input type="password" name="password"/><br/>
        <button type="submit">Register</button>
    </form>
</body>
</html>
