<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Homepage</title>
    <style>
        *{
            padding:0px;
            margin:0px;
            font-family:sans-serif;
        }
        body{
            height:100%;
            width:100%;

            box-sizing:border-box;
            font-family:sans-serif;
        }
        header{
            text-align:center;
            background-color:black;
        }
        header ul{
            display:inline-flex;
            list-style:none;
            color:white;
        }
        header ul li{
            width:150px;
            margin:15px;
            padding:15px;
        }
        header ul li a{
            color:white;
            text-decoration:none;
        }
        header ul li:hover{
            background:#2bab0d;
            border-radius:2px;
        }
        section{
            display:none;
        }

        header ul li:hover section{
            display:block;
            position:absolute;
            background:black;
            margin-top:15px;
            margin-left:-15px;
        }
        header ul li:hover section ul{
            display:block;
            margin:10px;

        }
        header ul li:hover section ul li{
            width:150px;
            padding:10px;
            border-bottom:1px solid white;
            background:transparent;
            border-radius:0px;
            text-align:left;
        }
        header ul li:hover section ul li:hover{
            color:dodgerblue;
        }

        h1{
            color:white;
            padding:20px;
            font-size:40px;
        }
        hr{
            color:orange;
        }
        li:hover{
            font-color:dodgerblue;
        }


    </style>
</head>
<body>
<header>
    <h1>FINSERV</h1>
    <hr><hr>
    <ul>
        <li><a href="#">Shares</a>
            <section>
                <ul>
                    <li><a href="shar">New Share</a></li>
                    <li><a href="shardet">Shares Details</a></li>
                </ul>
            </section>
        </li>
        <li><a href="#">Debenture</a>
            <section>
                <ul>
                    <li><a href="debenture">New Debenture</a></li>
                    <li><a href="debdet">Debenture Details</a></li>
                </ul>
            </section>
        </li>
        <li><a href="#">Partner</a>
            <section>
                <ul>
                    <li><a href="partn">New Partner</a></li>
                    <li><a href="partndet">Partners Details</a></li>
                </ul>
            </section>
        </li>
        <li><a href="#">Company</a>
            <section>
                <ul>
                    <li><a href="newcom">New Company</a></li>
                    <li><a href="comdet">Company Details</a></li>

                </ul>
            </section>
        </li>
        <li><a href="#">Vendor</a>
            <section>
                <ul>
                    <li><a href="ven">New Vendor</a></li>
                    <li><a href="vendet">Vendor Details</a></li>
                </ul>
            </section>
        </li>
        <li style="width: 80px;"><a href="#">PL</a></li>
        <li><a href="home">Home</a></li>
    </ul>
</header>
</body>
</html>