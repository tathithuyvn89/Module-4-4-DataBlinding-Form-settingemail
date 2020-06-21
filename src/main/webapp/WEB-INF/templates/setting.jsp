<%--
  Created by IntelliJ IDEA.
  User: BKComputer
  Date: 6/19/2020
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Setting Email</title>
</head>
<body>
<form:errors path="emailSetting.*"></form:errors>
<h1>Setting Email</h1>
<form:form action="settingSuccess" commandName="emailSetting" method="post">
    <table align="center">
        <tr>
            <td>Languages</td>
            <td>
                <form:select path="language" items="${languageList}">
                    <form:options items="${languageList}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page size</td>
            <td>
                <form:select path="page" items="${pageList}">
                    <form:options items="${pageList}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Spam Filter</td>
            <td>
                <form:checkbox path="filterSpam"></form:checkbox>
                Yes</td>
        </tr>
        <tr>
            <td>Signature</td>
            <td>
                <form:textarea path="signature" cols="3">
                </form:textarea>
            </td>
        </tr>
    </table>

</form:form>


</body>
</html>
