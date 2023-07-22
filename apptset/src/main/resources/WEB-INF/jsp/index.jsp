<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生登录</title>
</head>
<body>
<h1>学生登录页面</h1>
<form action="/student/login" method="post">
    <label for="id">学号：</label>
    <input type="text" id="id" name="id" required><br><br>
    <label for="password">密码：</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="登录">
</form>
</body>
</html>