<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>New Partner</title>
    <style>
        *{
            padding:0px;
            margin:0px;
            font-family:sans-serif;
        }
        header{
            text-align:center;
            background-color:black;
        }
        h1{
            color:white;
            padding:20px;
            font-size:40px;
        }
        hr{
            color:red;
        }
        form{
            height:auto;
            width:auto;
            background:lightblue;
            position:absolute;
            margin-top:5%;
            margin-left:40%;
            border-radius:5px;
        }
        ol{
            list-style:none;
        }
        ol li{
            text-align:right;
            padding:20px;
        }
        .lab{
            text-align:left;
        }

        input[type=text]{
            border-radius:5px;
            outline: none;
        }
        input[type=submit]{
            color:white;
            background-color: black;
            font-size: 18px;
            width:80px;
            height: 40px;
            border-radius: 5px;
        }
        input[type=text]:hover,input[type=submit]:hover{
            border-color:dodgerblue;
            outline: none;
        }
        p{
            color:white;
            font-size:32px;
        }
        a{
            text-decoration:none;
            font-size:20px;
        }
        nav{
            height: 85%;
            width:20%;
            background-color: black;
            float:left;
            margin-top:-2%;
        }
        ul li{
            color:white;
            padding:10px;
            margin-left:auto;
            margin-right: auto;
            border-radius: 5px;

        }
        .active{
            margin-top:4px;
            background-color:black;
            font-size:32px;
            border-bottom:1px solid blue;
            background-color: green;

        }
        ul{
            text-align:center;
        }
        .a:hover{
            margin-top:0px;
            background-color: green;
            border:1px solid blue;
        }


    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>New Partner<br></p>
</header>
<a style="margin-left:95%;color:black;" href="home">Home</a>
<nav>
    <ul>
        <li class="active">Partner</li>
        <a href="partn"><li class="a">New Partner</li></a>
        <a href="partndet"><li class="a">Partner Details</li></a>
    </ul>
</nav>
<form method="post" action="addpartner">
    <ol>
        <li><label class="lab">Partner ID : </label><input type="text" name="pid" value="${id}" readonly></li>
        <li><label class="lab">Name : </label><input type="text" name="name"></li>
        <li><label class="lab">DOB : </label><input type="text" name="dob"></li>
        <li><label class="lab">Phone Number : </label><input type="text" name="ph_number"></li>
        <li><label class="lab">Address : </label><input type="text" name="add"></li>
        <li><center><input type="submit" value="Submit"></center></li>
    </ol>
</form>
</body>
</html>