<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Doctor Appointment Form</title>
	<link href="css/appointment.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2>Doctor Appointment Form</h2>
        <form action="/submit-appointment" method="post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your full name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="aadhar">Aadhar Number:</label>
            <input type="text" id="aadhar" name="aadhar" placeholder="Enter your Aadhar number" maxlength="12" pattern="\d{12}" title="Please enter a valid 12-digit Aadhar number" required>

            <label for="date">Appointment Date:</label>
            <input type="date" id="date" name="date" required>

            <label for="time">Appointment Time:</label>
            <input type="time" id="time" name="time" required>

            <label for="doctor">Select Doctor:</label>
            <select id="doctor" name="doctor" required>
                <option value="">-- Select Doctor --</option>
                <option value="dr_smith">Dr. Smith (Cardiologist)</option>
                <option value="dr_johnson">Dr. Johnson (Dermatologist)</option>
                <option value="dr_williams">Dr. Williams (General Physician)</option>
                <option value="dr_brown">Dr. Brown (Pediatrician)</option>
            </select>

            <label for="notes">Additional Notes:</label>
            <textarea id="notes" name="notes" rows="4" placeholder="Enter any additional information"></textarea>

            <input type="submit" value="Book Appointment">
        </form>
    </div>
</body>
</html>
