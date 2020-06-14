<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Sale</title>
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
            margin-top:4%;
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
        select{
            width:150px;
        }
        input[type=text]{
            border-radius:5px;
            outline: none;
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
        }
        input[type=submit] {
            width: 100px;
            height: 40px;
            border-radius: 5px;
            background: black;
            color: white;
            font-size:18px;
        }



    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>New Sales<br></p>
</header>
<a style="margin-left:95%;size:28px" href="home">Home</a>
<form method="post" action="sal">
    <ol>
        <li><label class="lab">Sale ID : </label><input type="text" name="sid" value="${id}" readonly></li>
        <li><label class="lab">Invoice NO : </label><input type="text" name="iid"></li>
        <li><label class="lab">Sold To : </label>
            <select name="com">
                <c:forEach items="${listCompany}" var="company">
                    <option value="${company.id}">${company.name}</option>
                </c:forEach>
            </select>
        </li>
        <li><label class="lab">Date : </label><input type="text" name="date"></li>
        <li><label class="lab">Goods Type : </label><input type="text" name="goods"></li>
        <li><label class="lab">Total Amount : </label><input type="text" name="amt"></li>
        <li><center><input type="submit" value="Submit"></center></li>
    </ol>
</form>
</body>
</html>