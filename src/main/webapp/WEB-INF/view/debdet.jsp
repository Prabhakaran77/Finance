<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Debenture Details</title>
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
            width:100%;
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
            border-color:dodger-blue;
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


            height: 2em;
            line-height: 3;
            border-radius: .25em;
            padding-bottom:10px;

        }
        a{
            margin-left:95%;
            color:black;
            font-size:20px;
            text-decoration:none;
        }

    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>Debenture Details<br></p>
</header>
<a href="home">Home</a>
<form action="purd" method="post">
    <center><label>Choose Specific </label><select name="drop">
        <option value="all">All</option>
        <option value="purchaseid">Purchase ID</option>
        <option value="invoice">Invoice No</option>
        <option value="date">Date</option>
    </select></center><br>
    <center><label>Enter Credentials :- </label><input type="text" name="cred"></center><br>
    <center><input type="submit" value="Submit"></center>
</form>

<div class="container">
    <table border="2px"><tr>
        <th>Debenture ID</th>
        <th>Debenture Amount</th>
        <th>Percentage</th>
        <th>Type</th>
        <th>Partner ID</th></tr>
        <c:forEach var="listPurchase" items="${purchase}">
            <tr><td>${listPurchase.id}</td>
                <td>${listPurchase.invoice}</td>
                <td>${listPurchase.date}</td>
                <td>${listPurchase.purchaseFrom}</td>
                <td>${listPurchase.goods}</td></tr>
        </c:forEach>   </table>
</div>
</body>
</html>