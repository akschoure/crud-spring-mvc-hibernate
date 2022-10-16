<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${forms}</h1>

	<div>
		<h2 class="text-center">Add Customer Information</h2>
		<form action ="/processform" method="post">
			
			<div class="form-group">
				<label>First Name:</label> <input type="text" placeholder="First Name"
					name="name" class="form-control"
					value={this.state.name} onChange={this.onChange} />
			</div>

			<div class="form-group">
				<label>Last Name:</label> <input placeholder="Last name"
					name="lastName" class="form-control"
					value={this.state.lastName} onChange={this.onChange} />
			</div>

			<div class="form-group">
				<label>Mobile Number:</label> <input type="number" placeholder="mobile number"
					name="mobileNumber" class="form-control" value={this.state.mobileNumber}
					onChange={this.onChange} />
			</div>

			<div class="form-group">
				<label>Email:</label> <input type="email" placeholder="email id"
					name="emailId" class="form-control" value={this.state.emailId}
					onChange={this.onChange} />
			</div>
			
			
			<div class="form-group">
				<label>Home Town:</label> <input type="text" placeholder="Home Town"
					name="homeTown" class="form-control"
					value={this.state.homeTown} onChange={this.onChange} />
			</div>
			

			<button class="btn btn-success" onClick={this.saveCustomer}>Save</button>
		</form>
	</div>


</body>
</html>