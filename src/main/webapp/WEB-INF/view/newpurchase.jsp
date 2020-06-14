
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>New Purchase</title>
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
            margin-top:20px;
            margin-left:35%;
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
        input[type=submit] {
            width: 100px;
            height: 40px;
            border-radius: 5px;
            background: black;
            color: white;
        }
        input[type=text]{
            border-radius: 3px;
            width:150px;
        }
        td{
            text-align: center;
        }
        p{
            color:white;
            font-size:32px;
        }
        a{
            decoration:none;
        }
        select{
            width:150px;
            border-radius: 3px;
        }
    </style>
</head>
<body>
    <header>
        <h1>FINSERV</h1>
        <hr><hr><hr><hr>
        <p>New Purchase<br></p>
        <a style="margin-left:95%;color:white;size:28px" href="home">Home</a>
    </header>
    <form method="post" action="pur">
        <ol>
            <li><label class="lab">Purchase ID : </label><input type="text" name="pid" value="${purchaseId}"readonly></li>
            <li><label class="lab">Invoice NO : </label><input type="text" name="iid"required></li>
            <li><label class="lab">Purchased From : </label>
            <select name="buyer">
                <c:forEach items="${listCompany}" var="company">
                    <option value="${company.id}">${company.name}</option>
                </c:forEach>
            </select>
            </li>
            <li><label class="lab">Date : </label><input type="text" name="date"required></li>
            <li><label class="lab">Goods Type : </label><input type="text" name="goods"required></li>
            <li><label class="lab">Total Amount : </label><input type="text" name="amt"required></li>
            <li><center><input type="submit" value="Submit"></center></li>
        </ol>
    </form>
</body>
</html>