<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 03/12/2024
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Employee</title>
</head>
<body>
<form:form modelAttribute="emp" action="${pageContext.request.contextPath}/employeeController/create" method="post" enctype="multipart/form-data">
    <form:input path="empId"/><br>
    <form:input path="empName"/><br>
    <input type="file" id="avatar" name="avatar"/><br>
    <input type="submit" value="Create"/>
</form:form>
</body>
</html>
