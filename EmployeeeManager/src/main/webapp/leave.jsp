<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
    <form action="EmployeeLeaves" method="post">

    <center>

    <h1> Leave Application Form</h1>

    <table>

    <tr>

    <td>employee Name</td>

    <td><input type="text" name="ename" required/></td>

    </tr>

    <tr>

    <td>Employee Id</td>

    <td><input type="text" name="empid" title="Please Enter 5 Digit" ></td>

    </tr>

    <tr>

    <td>Degisnation</td>

    <td><input type="text" name="designation" ></td>

    </tr>
    <tr>

    <td>From</td>

    <td><input type="date" name="fromdate"  id ="fromdate"></td>

    </tr>

    <tr>

    <td>To</td>

    <td><input type="date" name="todate" id = "todate"  onchange="countdays()"></td>

    </tr>
    <tr><td><label>no of     days</label><input type="text" name="days" id ="days" >i</td></tr>
    <td><p id ="err"  style=" color: red"></p></td>
    <tr>

    <td>Reason</td>

    <td>

    <textarea name="reason" cols="15" rows="5" required></textarea>

    </td>

    </tr>

    <tr>

    <td>Manager Name</td>

    <td><input type="text" name="mname" /></td>

    </tr>

    <tr>

    <td></td>

    <td><input type="submit" value="leaveApply"  id = "apply" disabled="disabled">



    </td>
    </tr>
    </table>
    </center>
    </form>
    <script>
function countdays(){
var fd = document.getElementById("fromdate").value;
var td = document.getElementById("todate").value;
var d1 = new Date(fd);
var d2 = new Date(td);
var timediff = d2.getTime()-d1.getTime();
var result = timediff/(60000*60*24);
result = result+1;
document.getElementById("days").value = result;


if(result<3)
{
document.getElementById("apply").disabled = false;
}
else
{
document.getElementById("err").innerHTML = "you cant take more then 2 days at a time"
}


}
</script>
</body>
</html>