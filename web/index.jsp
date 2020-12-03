<%--
  Created by IntelliJ IDEA.
  User: wangg
  Date: 2020/12/3
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<script src="js/jquery-2.1.0.min.js"></script>
<script>
    //页面加载，绑定单击事件

    $(function () {
        window.onload = function(){
    $.ajax({
        //编写json格式，设置属性和值
        url: "students",
        contentType: "application/json;charset=UTF-8",
        dataType: "json",
        type: "get",
        success: function (data) {//请求成功后的回调函数
            $("#tbody").empty();
            var str = "";
            for (var i = 0; i < data.length; i++) {
                str += "<tr>" +
                    "<td>" + data[i].id + "</td>" +
                    "<td>" + data[i].code + "</td>" +
                    "<td>" + data[i].name + "</td>" +
                    "<td>" + data[i].age + "</td>" +
                    "<td>" + data[i].cid + "</td>" +
                    "<td>" + data[i].sex + "</td>" +
                    "<td>" + "<a href='update.jsp'>更新</a><a href='delete?id="+data[i].id+"'>删除</a>" + "</td>"+
                    "</tr>";
            }
            $("#tbody").show().append(str);
        }
    });
};

        $("#FindAll").click(function () {
            //ajax请求
            var id=$("#id").val();
            var code=$("#code").val();
            var name=$("#name").val();
            var age=$("#age").val();
            var cid=$("#cid").val();
            var sex=$("#sex").val();
            console.info(sex);
            $.ajax({
                //编写json格式，设置属性和值
                url: "students",
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                data: {
                    "id":id,
                    "code":code,
                    "name":name,
                    "age":age,
                    "cid":cid,
                    "sex":sex
                },
                type: "get",
                success: function (data) {//请求成功后的回调函数
                    $("#tbody").empty();
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str += "<tr>" +
                            "<td>" + data[i].id + "</td>" +
                            "<td>" + data[i].code + "</td>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].cid + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "<td>" + "<a href='update.jsp'>更新</a><a href='delete?id="+data[i].id+"'>删除</a>" + "</td>"+
                            "</tr>";
                    }
                    $("#tbody").show().append(str);
                }
            });
        });
    });
</script>
<form action="Add">
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
    <input type="submit" value="新增">
</form>
id : <input type="text" name="id" id="id">
code : <input type="text" name="code" id="code">
name : <input type="text" name="name" id="name">
age : <input type="text" name="age" id="age">
cid : <input type="text" name="cid" id="cid">
ex : <select id="sex" name="sex">
    <option value="0">请选择</option>
    <option value="1">男</option>
    <option value="2">女</option>
</select>
<button id="FindAll">查询</button>
<table width="40%" border="1px" cellspacing="0">
    <tr>
        <td>id</td>
        <td>code</td>
        <td>name</td>
        <td>age</td>
        <td>cid</td>
        <td>sex</td>
        <td>操作</td>
    </tr>
    <tbody id="tbody">
    </tbody>
</table>
</body>
</html>
