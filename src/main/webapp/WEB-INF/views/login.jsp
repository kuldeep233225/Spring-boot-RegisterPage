<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>User Login</h1>
    <form action="/login" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>
    <p style="color:red;">${error}</p>
</body>
</html>