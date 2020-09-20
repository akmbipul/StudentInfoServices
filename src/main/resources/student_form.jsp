<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Registration Form</title>
</head>
<body>
<div align="center">
    <h2>Adding New Student with post </h2>
    <form:form action="register" method="post" modelAttribute="student">

        <form:label path="id">Id</form:label>
        <form:input path="id"/><br/>

        <form:label path="name">Name:</form:label>
        <form:input path="name"/><br/>

        <form:label path="dob">Birthday (mm-dd-yyyy):</form:label>
        <form:input path="dob"/><br/>

        <form:button>Register</form:button>
    </form:form>
</div>
</body>
</html>


<%--<form:label path="email">E-mail:</form:label>--%>
<%--<form:input path="email"/><br/>--%>

<%--<form:label path="password">Password:</form:label>--%>
<%--<form:password path="password"/><br/>--%>

<%--<form:label path="gender">Gender:</form:label>--%>
<%--<form:radiobutton path="gender" value="Male"/>Male--%>
<%--<form:radiobutton path="gender" value="Female"/>Female<br/>--%>

<%--<form:label path="profession">Profession:</form:label>--%>
<%--<form:select path="profession" items="${professionList}" /><br/>--%>

<%--<form:label path="married">Married?</form:label>--%>
<%--<form:checkbox path="married"/><br/>--%>

<%--<form:label path="note">Note:</form:label>--%>
<%--<form:textarea path="note" cols="25" rows="5"/><br/>--%>