<%--
  Created by IntelliJ IDEA.
  User: wangg
  Date: 2020/12/3
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
</head>
<body>
<form action="update">
    id : <input type="text" name="id">
    code : <input type="text" name="code" >
    name : <input type="text" name="name" >
    age : <input type="text" name="age" >
    cid : <input type="text" name="cid" >
    sex : <select  name="sex">
    <option value="0">请选择</option>
    <option value="1">男</option>
    <option value="2">女</option>
</select>
    <input type="submit" value="修改">
</form>
</body>
</html>
