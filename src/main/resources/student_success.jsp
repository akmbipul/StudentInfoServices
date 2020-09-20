<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration Success</title>
    <style type="text/css">
        span {
            display: inline-block;
            width: 200px;
            text-align: left;
        }
    </style>
</head>
<body>
<div align="center">
    <h2>Successfully Added New Profile</h2>

    <span>Id:</span><span>${student.Id}</span><br/>
    <span>Name:</span><span>${student.name}</span><br/>
    <span>Birthday:</span><span>${student.dob}</span><br/>
</div>
</body>
</html>