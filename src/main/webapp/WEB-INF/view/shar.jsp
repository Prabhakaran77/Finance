<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>New Share</title>
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
        input[type=text]:hover,input[type=button]:hover{
            border-color:dodgerblue;
            outline: none;
        }
        p{
            color:white;
            font-size:32px;
        }
        select{
            width:150px;
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


    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr><hr><hr>
    <p>New Share<br></p>
</header>
<a style="margin-left:95%;" href="home">Home</a>
<form>
    <ol>
        <li><label class="lab">Share ID : </label><input type="text" id="sid" value="${id}" readonly></li>
        <li><label class="lab">Share Amount : </label><input type="text" id="Iid"></li>
        <li><label class="lab">Percentage : </label><input type="text" id="sold"></li>
        <li><label class="lab">Type : </label><input type="text" id="date"></li>
        <li><label class="lab">No of Shares : </label><input type="text" id="goods"></li>
        <li><label class="lab">Customer ID : </label>
            <select name="buyer">
                <c:forEach items="${listPartner}" var="partner">
                    <option value="${partner.id}">${partner.name}</option>
                </c:forEach>
            </select>
        </li>
        <li><center><input type="submit" value="Submit"></center></li>
    </ol>
</form>
</body>
</html>