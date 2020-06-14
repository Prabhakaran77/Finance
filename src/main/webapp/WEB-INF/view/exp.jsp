<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Expenses</title>
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
            margin-top:3%;
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
        select{
            width:150px;
        }
        p{
            color:white;
            font-size:32px;
        }
        a{
            text-decoration:none;
            font-size:20px;
            margin-left:95%;
            color:black;
        }
    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>Expenses<br></p>
</header>
<a href="home">Home</a>
<form>
    <ol>
        <li><label class="lab">Expense ID : </label><input type="text" id="sid" value="${purchaseId}" readonly></li>
        <li><label class="lab">Bill NO : </label><input type="text" id="Iid"></li>
        <li><label class="lab">Vendor Name : </label>
            <select name="vendor">
                <c:forEach items="${listVendor}" var="vendor">
                    <option value="${vendor.id}">${vendor.name}</option>
                </c:forEach>
            </select>
        </li>
        <li><label class="lab">Date : </label><input type="text" id="date"></li>
        <li><label class="lab">Description : </label><input type="text" id="goods"></li>
        <li><label class="lab">Cost : </label><input type="text" id="amt"></li>
        <li><center><input type="submit" value="Submit"></center></li>
    </ol>
</form>
</body>
</html>