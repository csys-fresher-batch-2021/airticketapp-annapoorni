<!DOCTYPE html>
<html lang="en">
  
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content=
        "width=device-width, initial-scale=1.0">
    <title>Airline reservation system</title>
    
  
    <style>
  
       #bg {
            background-image: url("image/bg4.jpg");
            background-size:cover;
            background-repeat: no-repeat;
			opacity: 0.8;
        }
        
       #Content{
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        opacity: 1;
        background-color: #E0FFFF;
        padding: 30px;  
        border-radius: 10%;
    }
  
  
        h2 {
            font-size: 5em;
            font-family: serif;
            color: transparent;
            text-align: center;
            animation: effect 2s linear infinite;
        }
  
        @keyframes effect {
            0% {
                background: linear-gradient(
                        #008000, #00FF00);
                -webkit-background-clip: text;
            }
  
            100% {
                background: linear-gradient(
                        #3CE7D7, #000FFF);
                -webkit-background-clip: text;
            }
        }
        h4{
        		color: #000;
        		font-family: serif;
        		text-align: center;
        		text-style:bold;
        		opacity: 1.0;		
        }
        
        
    </style>
</head>
  
<body id="bg" >
   	<jsp:include page="LoginHeader.jsp"></jsp:include>

	
    <div id="Content">
       <h2>AIR LINE RESERVATION SYSTEM</h2><br />
       <h4><b> Your Journey Begins </b></h4><br />
       <p style="color:#000;opacity: 1.0"> &nbsp &nbsp &nbsp Book Your Domestic Airline Tickets with this application. All the travelers around the world are
        traveling frequently for a vacation ,business trip , corporate meetings ,exploring variety of places , meeting relatives and various other things.
        and there are no extra charges for air flight reservation. Explore the world . Happy Journey...!!!</p><br />
        <a href="Login.jsp" class="btn btn-primary" style="margin-left:40%">Book Now</a>
    </div>
</body>
  
</html>