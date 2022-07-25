<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<h1 align="center" padding="5px">employee ease portal</h1>
<h2 align="center"><a href="employeeHomepage.html">Home</a> 
<a href="apply_leaves.jsp" padding="5px" margin-left="5px" margin-right="5px">Apply Leaves</a>
<a href="employee_leave.jsp" padding="5px" margin-left="5px" margin-right="5px">Employee leaves details</a>
<a href="index.html" padding="5px">logout</a>
</h2>

<h1 align="center" margin="30px">welcome to Motivitylabs</h1>
<h3>Employee Leaves portal</h3>

<div class="ml-10 w-75 h-70 rounded-3 border border-5 p-5" align="center">
<form class="w-50 h-70 rounded-3  border border-5 mt-5"  action="leave_apply.jsp" method="post" >
  <div class="mb-2 col-sm-7">
    <label for="exampleInputName" class="form-label">Name</label>
    <input type="text" class="form-control" name="ename" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputEmail" class="form-label">Email </label>
    <input type="email" class="form-control" name="eemail" id="exampleInputPassword1">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputPassword1" class="form-label">FromDate</label>
    <input type="date" class="form-control" name="fromdate" id="fdate">
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputPhone" class="form-label">ToDate</label>
    <input type="date" class="form-control" name="todate" id="tdate" onchange="countdays()">
  </div>
  
  <div class="mb-2 col-sm-8">
  <label>No of Days</label>
  <h1 id="days" name=" noOfDays"></h1>
  </div>
  
  <div class="col-md-7">
  <select class="form-select col-md-4" aria-label="Default select example" name="department">
  <option selected>Open this select menu</option>
 <option value="AssiocateSoftware">AssiocateSoftware</option>
<option value="ITServiceDesk">ITServiceDesk</option>
<option value="Administration">Administration</option>
<option value="HR">Hr</option> 
  
</select>
 </div>
<input type="submit" class= "btn btn-primary" onClick="countdays">
</form>

</div>

</body>

<script>
   const countdays=()=>{
	   var fd = document.getElementById("fdate").value;
	   var td = document.getElementById("tdate").value;
	   var d1 = new Date(fd);
	   var d2 = new Date(td);
	   var timediff = d2.getTime()-d1.getTime();
	   var result = timediff/(60000*60*24);
	   result = result+1;
	   document.getElementById("days").innerHTML = result;
   }
</script>
</html>