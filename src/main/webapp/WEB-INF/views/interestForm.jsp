
<!DOCTYPE html>
<html>
<head>
    <title>Select Interests</title>
</head>
<body>
    <h1>Select Your Interests</h1>
    <form action="${pageContext.request.contextPath}/select-interests" method="post">
        <input type="checkbox" name="interests" value="tech"> Tech
        <input type="checkbox" name="interests" value="sports"> Sports
        <input type="checkbox" name="interests" value="health"> Health
        <button type="submit">Submit</button>
    </form>
</body>
</html>