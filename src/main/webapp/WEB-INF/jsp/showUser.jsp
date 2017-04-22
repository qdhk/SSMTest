<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/04/22 0022
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    String path=request.getContextPath();
    String basepath=request.getScheme() + "://"
            +request.getServerName() + ":" + request.getServerPort() + path +"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>显示用户</title>
</head>
<body>
${user.username}
<br/>
</body>
</html>
