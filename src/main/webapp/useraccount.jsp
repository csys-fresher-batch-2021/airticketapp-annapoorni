<%@page import="in.poorni.Util.ConnectionUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Your Profile</title>
<style> 
    #header {
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
        font-family:arial;
        font-size: 40px;
        font-weight:bold;
        color:forestgreen;
        text-align:center;
        padding:50px;
        border: 1px solid ForestGreen;
        width: 1210;
    } 
    #nav {
        line-height:30px;
        background-color:#eeeeee;
        height:700px;
        width:200px;
        float:left;
        padding:5px;	
        font-family:arial;
        color: ForestGreen;
        font-size: 16px;
        font-weight: bold;
        border: 1px solid ForestGreen;
    }
    #section {
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
        width:948px;
        height:610px;
        float:left;
        padding:50px;	
        font-family:arial;
        color:black;
        font-size: 16px;
        font-weight:bold;
        border: 1px solid ForestGreen;
    }
    .textbox { 
        background: transparent url(http://html-generator.weebly.com/files/theme/input-text-8.png) repeat-x; 
        border: 1px solid #999; 
        outline:0; 
        height:25px; 
        width: 275px; 
    } 
    .box{
        background: transparent url(http://html-generator.weebly.com/files/theme/input-text-8.png) repeat-x;
        border: 1px solid #999; 
        outline:0; 
        height:25px; 
        width: 75px; 
        color:green;
    }
    #box {
        padding: 25px;
        border: 0px solid #999;
        width: 400px;
        height:400px;
        margin-right: 100px;
        margin-left: 300px;
    }
    .my-container {
        position: relative;
        overflow: hidden;
    }
    .my-container b1 {
        padding: 200px;
        position: relative;
        z-index: 2;
    } 
    .my-container img {
        position: absolute;
        left: 0;
        top: 0;
        width: 100%;
        height: auto%;
        opacity: 0.5;
    }
</style> 
</head>
<body>
<form action ="UseraccountServlet" method = "POST">
    <div class="my-container">
            <img src="http://crispme.com/wp-content/uploads/macbook-pro-17-clouds-wallpaper.jpg">
            <div id="header">
               <b1>MAKMLINER Airlines</b1>
            </div>
    </div>
    <div id="nav">
        Click <a href="user.jsp"> here</a> to go back to your account page <br><br>
        Click <a href="index.jsp"> here</a> to go to the MAKMLINER Airlines homepage
    </div>

		<div class="my-container">
		    <img height= 100% width=100% src="http://forwallpapers.com/wp-content/uploads/2014/01/Colorfull-Niagara-Falls-Beautiful-Night-Wallpaper-Desktop-1024x543.png">
    		<div id="section">
    		    <b1><center><font size= "6" color= "black" family="arial"> Edit Your Profile</font></center></b1>
        		<div id="box"> <b1>
            		First Name: <br><input type="text" class="textbox" id = "FirName" name = "FirName" ><br>
            		Last Name:<br><input type="text" class="textbox" id = "LasName" name ="LasName" ><br>
            		Date of Birth:<br><input type="date" class="textbox" name ="dob"><br>
            		Country:<br><input type="text" id ="Coun" class="textbox" name ="Coun" ><br>
            		Street Address:<br><input type="text" class="textbox" id ="StreAddr" name ="StreAddr"><br>
            		City:<br><input type="text" id ="City" class="textbox" name ="City"><br>
            		State:<br><input type="text" id ="Sta" class="textbox" name ="Sta" ><br>
            		Zip code:<br><input type="text" id ="Zip" class="textbox" name ="Zip"><br>
            		Email:<br><input type ="email" id = "Email" class="textbox" name="Email"><br>
        		
        		<br><input type= "submit" class="box" value="Save"></b1>
        	
        		</div>
        	</div>
		</form>

</body>
</html>
