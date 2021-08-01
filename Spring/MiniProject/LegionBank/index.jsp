<html>
<style>
	div{
		text-align: center;
		margin-top:100px;
	}
	form{
		margin:50px auto;
	}
	
	input{
		display: inline-block;
	}
</style>
<body>
	<div>
		<h1>Enter your Login Details</h1>
		
		<form action="login" method="post">
			<input type="text" name="username" placeholder="Enter your username">
			<input type="text" name="password" placeholder="Enter you password" >
			<input type="submit" value="submit">
		</form>
	</div>
</body>
</html>
