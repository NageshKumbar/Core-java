<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Appointment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #121212;
          color: #e0e0e0;
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .appointment-container {
          max-width: 700px;
          margin: 60px auto;
          background: #1e1e1e;
          padding: 35px;
          border-radius: 10px;
          box-shadow: 0 8px 20px rgba(255, 255, 255, 0.05);
        }

        h2 {
          text-align: center;
          color: #bb86fc;
          margin-bottom: 30px;
          font-weight: bold;
        }

        .form-label {
          font-weight: 600;
          color: #ffffff;
        }

        .form-control {
          background-color: #2c2c2c;
          color: #ffffff;
          border: 1px solid #444;
        }

        .radio-inline {
          margin-right: 20px;
          margin-left: 10px;
          font-weight: 500;
        }

        .btn-primary {
          width: 100%;
          background-color: #0d6efd;
          border: none;
        }

        footer {
          background-color: #0d6efd;
          color: white;
          text-align: center;
          padding: 15px 0;
          margin-top: 60px;
        }
    </style>
</head>
<body>

<div class="container appointment-container">
    <h2>Book an Appointment</h2>
    <form action="appointment" method="post">
        <div class="mb-3">
            <label class="form-label">First Name:</label>
            <input type="text" class="form-control" placeholder="Enter First Name" name="fname" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Last Name:</label>
            <input type="text" class="form-control" placeholder="Enter Last Name" name="lname" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email:</label>
            <input type="email" class="form-control" placeholder="Enter Email" name="email" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Age:</label>
            <input type="number" class="form-control" placeholder="Enter your Age" name="age" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Address:</label>
            <input type="text" class="form-control" placeholder="Enter Address" name="address" required>
        </div>
        <div class="mb-3">
            <label class="form-label d-block">Gender:</label>
            <label class="radio-inline"><input type="radio" name="gender" value="Female" required> Female</label>
            <label class="radio-inline"><input type="radio" name="gender" value="Male"> Male</label>
        </div>
        <div class="mb-3">
            <label class="form-label">Sickness:</label>
            <input type="text" class="form-control" placeholder="Describe your symptoms" name="sick" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Contact Number:</label>
            <input type="tel" class="form-control" placeholder="Enter phone number" name="number" required pattern="[0-9]{10}">
        </div>
        <button type="submit" class="btn btn-primary">Get Appointment</button>
    </form>
</div>

<footer>
    © 2025 Hospital Appointment System. All rights reserved.
</footer>

</body>
</html>