<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Application</title>

        <script>
        	function showRichestUser() {
        		richestUserInput.hidden =  false;
        	}

        	function showAccountSum() {
        		accountSumInput.hidden =  false;
        	}
		</script> 

    </head>

    <body>

    	<p>
    		<button name="richestUserButton" onclick="showRichestUser()"> get richest user </button>
	        <input id="richestUserInput" type="text" value="${richestUser}" hidden = true disabled=true size=60>
        </p>

  		<p>
  			<button name="accountSumButton" onclick="showAccountSum()" >get account sum </button>
  			<input id="accountSumInput"type="text" value="${accountSum}" hidden = true disabled=true>
  		</p>
        

    </body>
</html>