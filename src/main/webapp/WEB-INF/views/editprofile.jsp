<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Profile</title>
</head>
<body>
    <h2>Edit Profile</h2>

    <form action="${pageContext.request.contextPath}/updateProfile" method="post">
        <label>Email:</label>
        <input type="email" name="email" value="${user.email}" required /><br/><br/>
        <label>Address:</label>
        <input type="text" name="address" value="${user.address}" required /><br/><br/>
        <input type="submit" value="Update Profile" />
    </form>
</body>
</html>
