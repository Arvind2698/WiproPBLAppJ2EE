<!DOCTYPE html>
<%@page import="com.arvind.wipro.bean.Employee"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AP Auctions</title>
</head>

<style>
.container {
	max-width: 650px;
	margin: auto;
	text-align: center
}

.no-show {
	display: none;
}

.red {
	color: red;
	margin-right: 10px;
}

.input-group {
	padding: 10px;
}
</style>
<body>

	<div class="container">
		<h1>Enter Employee Details</h1>
		<hr>
		<h3 id="heading-err" class="no-show">
			<span class="red">Required Data missing!</span> Enter and resubmit
		</h3>

		<form action="saveEditEmp" method="post">

			<div class="input-group">
				<span id="name-err" class="no-show red">Required Field!!</span><label
					for="name">Name: </label><input type="text" id="name" name="name" value="<%Employee e=(Employee)request.getAttribute("emp");out.print(e.getName()); %>">
			</div>

			<div class="input-group">
				<span id="id-err" class="no-show red">Required Field!!</span><label
					for="id">Id: </label><input type="text" id="id" name="id" value="<% out.print(e.getId()); %>" >
			</div>

			<div class="input-group">
				<span id="gender-err" class="no-show red">Required Field!!</span><label
					for="gender">Gender: </label><input type="text" id="gender" value="<% out.print(e.getGender()); %>"
					name="gender">
			</div>

			<div class="input-group">
				<span id="designation-err" class="no-show red">Required Field!!</span><label
					for="designation">Designation: </label><input type="text" value="<% out.print(e.getDesignation()); %>"
					id="designation" name="designation">
			</div>

			<div class="input-group">
				<span id="salary-err" class="no-show red">Required Field!!</span><label
					for="salary">Salary: </label><input type="text" id="salary" value="<% out.print(e.getSalary()); %>"
					name="salary">
			</div>


			<div class="input-group">
				<span id="city-err" class="no-show red">Required Field!!</span><label
					for="city">City: </label><input type="text" id="city" value="<% out.print(e.getCity()); %>"
					name="city">
			</div>
			
			<div class="input-group">
				<span id="email-err" class="no-show red">Required Field!!</span><label
					for="email">Email: </label><input type="text" id="email" value="<% out.print(e.getEmail()); %>"
					name="email">
			</div>
			
			<div class="input-group">
				<span id="phone-err" class="no-show red">Required Field!!</span><label
					for="phone">Phone: </label><input type="text" id="phone" value="<% out.print(e.getMobile()); %>"
					name="phone">
			</div>

			<input type="submit" value="Submit Employee" class="btn"
				onClick="return validator()">

		</form>
	</div>

	<script>
	const validator=()=>{
		const name=document.getElementById("name").value;
		const id=document.getElementById("id").value;
		const gender=document.getElementById("gender").value;
		const designation=document.getElementById("designation").value;
		const salary=document.getElementById("salary").value;
		const city=document.getElementById("city").value;
		const email=document.getElementById("email").value;
		const phone=document.getElementById("phone").value;

        let error=0;

		if(!name){
			document.getElementById("name-err").style.display="inline";
		}else{
            document.getElementById("name-err").style.display="none";
            error++;

        }

        if(!id){
			document.getElementById("id-err").style.display="inline";
		}else{
            document.getElementById("id-err").style.display="none";
            error++;

        }

        if(!gender){
			document.getElementById("gender-err").style.display="inline";
		}else{
            document.getElementById("gender-err").style.display="none";
            error++;

        }
        
        if(!designation){
			document.getElementById("designation-err").style.display="inline";
		}else{
            document.getElementById("designation-err").style.display="none";
            error++;

        }

        if(!email){
			document.getElementById("email-err").style.display="inline";
		}else{
            document.getElementById("email-err").style.display="none";
            error++;

        }

        if(!salary){
			document.getElementById("salary-err").style.display="inline";
		}else{
            document.getElementById("salary-err").style.display="none";
            error++;
        }
        
        if(!city){
			document.getElementById("city-err").style.display="inline";
		}else{
            document.getElementById("city-err").style.display="none";
            error++;
        }

        if(!phone){
			document.getElementById("phone-err").style.display="inline";
		}else{
            document.getElementById("phone-err").style.display="none";
            error++;
        }
        
        if(error==8){
            return true;
        }else{
            document.getElementById("heading-err").style.display="block";
            return false;
        }

	}
</script>
</body>
</html>