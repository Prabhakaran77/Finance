
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Purchases Details</title>
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
            font-color:white;
            background-color: azure;
        }
        tr{
            height:30px;
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
            height: 2em;
            line-height: 3;
            border-radius: .25em;
            padding-bottom:10px;
        }
        input[type=text] {
            border-top-style: hidden;
            border-right-style: hidden;
            border-left-style: hidden;
            border-bottom-style: groove;
            border-color: lightblue;
            outline: none;
        }
        table {
            border-collapse: collapse;
        }
        tr:hover {background-color: lightblue;}
        tr{
            text-align: center;
        }
        input[type=submit]{
            color:white;
            background-color: black;
            font-size: 18px;
            width:80px;
            height: 40px;
            border-radius: 5px;
        }
        h2{
            margin-top:15px;
        }
        h3{
            color:red;
        }
    </style>
    <script>

    </script>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>Purchase Details<br></p>
</header>
<a style="margin-left:95%;color:black;font-size:20px;text-decoration:none;" href="home">Home</a>

<form action="purd" method="post">
    <center><label>Choose Specific </label><select name="drop" onselect="valid()">
        <option value="all">All</option>
        <option value="purchaseid">Purchase ID</option>
        <option value="company">Company ID</option>
        <option value="date">Date</option>
    </select></center><br>
    <center><label>Enter Credentials :- </label><input type="text" name="cred"></center><br>
    <center><input type="submit" value="Submit"></center><br>
</form>
<center><h3>${msg}</h3></center>
<div class="container">
    <table border="2px"><tr>
        <th>Purchase ID</th>
        <th>Invoice NO</th>
        <th>Date</th>
        <th>Purchased From</th>
        <th>Goods Type</th>
        <th>Total</th></tr>
    <c:forEach var="listPurchase" items="${purchase}">
        <tr><td>${listPurchase.id}</td>
        <td>${listPurchase.invoice}</td>
        <td>${listPurchase.date}</td>
        <td>${listPurchase.purchaseFrom}</td>
        <td>${listPurchase.goods}</td>
            <td>${listPurchase.amt}</td></tr>
    </c:forEach>   </table>
    <c:if test="${purchase.size() < 1}">
        <center><h2>No Records Found</h2></center>
    </c:if>
</div>
</body>
</html>