<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>New Debenture</title>
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
            margin-top:2%;
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
            width:150px;
        }
        select{
            width:150px;
        }
        input[type=text]:hover,input[type=button]:hover{
            border-color:dodgerblue;
            outline: none;
        }
        p{
            color:white;
            font-size:32px;
        }
        a{
            text-decoration:none;
            color:black;
            font-size:20px;
        }
        input[type=submit]{
            color:white;
            background-color: black;
            font-size: 18px;
            width:80px;
            height: 40px;
            border-radius: 5px;
        }
        a{
            text-decoration: none;
            margin-left:95%;
            font-size: 20px;
            color:black;
        }


    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>New Debenture<br></p>
</header>
<a href="home">Home</a>
<form>
    <ol>
        <li><label class="lab">Debenture ID : </label><input type="text" id="sid" value="${purchaseId}" readonly></li>
        <li><label class="lab">Debenture Amount : </label><input type="text" id="Iid"></li>
        <li><label class="lab">Percentage : </label><input type="text" id="sold"></li>
        <li><label class="lab">Type : </label><input type="text" id="date"></li>
        <li><label class="lab">Customer ID : </label><input type="text" id="sender"></li>
        <li><center><input type="submit" value="Submit"></center></li>
    </ol>
</form>
</body>
</html>