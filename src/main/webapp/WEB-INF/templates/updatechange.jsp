<%--
  Created by IntelliJ IDEA.
  User: BKComputer
  Date: 6/19/2020
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/">Back</a>
<h3 align="center">You have updated with following Info::::</h3>

<table align="center">
    <tr>
        <td>Languages:</td>
        <td>${emailSetting.language}</td>
    </tr>

    <tr>
        <td>Page size</td>
        <td>${emailSetting.page}</td>
    </tr>
    <tr>
        <td>Fiter Spam</td>
        <td>${emailSetting.filterSpam}</td>
    </tr>
    <tr>
        <td>Signal</td>
        <td>${emailSetting.signature}</td>
    </tr>

</table>
</body>
</html>
