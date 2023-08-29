<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Studentdetails</title>
</head>
<body>
<form action="saveStudentData" method="post">
  <label for="name">Name:</label>
  <input type="text"  name="name"><br>
  <label for="sid">Sid:</label>
  <input type="number"  name="sid"><br>
  <label for="address">Address:</label>
  <input type="text"  name="address"><br>
  <label for="mobile number">Mobile Number:</label>
  <input type="number"  name="mobilenumber"><br>
  <label for="Email">E-Mail:</label>
  <input type="text"  name="email"><br>
  <label for="select country">Country:</label>
  <select name="country">
  <option value="india">India</option>
  <option value="japan">Japan</option>
  <option value="china">China</option>
  <option value="usa">USA</option>
  </select><br>
  <label for="gender">Gender</label>
  <input type="radio" name="gender" value="male"/>Male<input type="radio" name="gender" value="female"/>Female<br>
   <button type="submit">Sign up</button>
</form>
</body>
</html>