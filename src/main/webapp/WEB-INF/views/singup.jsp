<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ragister Page</title>
	<link rel="stylesheet" href="css/ragistation.css">
   
</head>
<body>
    <div class="login-container">
        <h2>Ragister</h2>
        <form action="register" method="post">
			<div class="form-group">
				<label for="password">Name</label>
				<input type="text" id="password" name="name" required>
				</div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
			
									
            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
        <div class="form-footer">
            <p>Alraday ragister click to  <a href="login">Log In</a></p>
        </div>
    </div>
</body>
</html>
