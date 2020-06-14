
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Vendor Details</title>
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
        p{
            color:white;
            font-size:32px;
        }
        table{
            width:80%;
            background-color: azure;
        }
        td{
            height:5%
        }
        form{
            margin-top:4%;
            display:block;
        }

        table{
            margin-top:10px;
        }
        input[type=submit] {
            width: 100px;
            height: 40px;
            border-radius: 5px;
            background: black;
            color: white;
            font-size:18px;
        }
        input[type=text]{
            border-top-style: hidden;
            border-right-style: hidden;
            border-left-style: hidden;
            border-bottom-style: groove;
            border-color:lightblue;
            outline:none;
        }
        input[type=text]:focus{
            border:dodgerblue;
        }
        select {
            appearance: none;
            outline: 0;
            background:#eee;
            color: black;
            cursor: pointer;
            border:2px solid lightblue;
            border-radius:3px;
            font-size:18px;
        }
        select {
            border-radius: .25em;
            padding-bottom:10px;
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
        a{
            text-decoration: none;
            font-size: 20px;
        }


    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>Vendor Details<br></p>
</header>
<a style="margin-left:95%;color:black;font-size:20px;" href="home">Home</a>
<nav>
    <ul>
        <li class="active">Vendor</li>
        <a href="ven"><li class="a">New Vendor</li></a>
        <a href="vendet"><li class="a">Vendor Details</li></a>
    </ul>
</nav>
<form action="purd" method="post">
    <center><label>Choose Specific </label><select name="drop">
        <option value="all">All</option>
        <option value="purchaseid">Purchase ID</option>
        <option value="invoice">Invoice No</option>
        <option value="date">Date</option>
    </select></center><br>
    <center><label>Enter Credentials :- </label><input type="text" name="cred"></center><br>
    <center><input type="submit" value="Submit"></center>
    <div class="container">
        <table border="2px"><tr>
            <th>Vendor ID</th>
            <th>Vendor Name</th>
            <th>Phone Number</th>
            <th>Address</th></tr>
            <c:forEach var="listPurchase" items="${purchase}">
                <tr><td>${listPurchase.id}</td>
                    <td>${listPurchase.invoice}</td>
                    <td>${listPurchase.date}</td>
                    <td>${listPurchase.purchaseFrom}</td></tr>
            </c:forEach>   </table>
    </div>
</form>
</body>
</html>