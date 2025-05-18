<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #121212;
          color: #e0e0e0;
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .contact-container {
          max-width: 600px;
          margin: 80px auto;
          background-color: #1e1e1e;
          padding: 30px;
          border-radius: 10px;
          box-shadow: 0 8px 20px rgba(255, 255, 255, 0.05);
        }

        h2 {
          text-align: center;
          margin-bottom: 25px;
          color: #bb86fc;
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

        .form-control:focus {
          background-color: #2c2c2c;
          color: #ffffff;
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
          position: fixed;
          bottom: 0;
          width: 100%;
        }
    </style>
</head>
<body>

<div class="container contact-container">
    <h2>Contact Us</h2>
    <form action="contact">
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
            <label class="form-label">Message:</label>
            <textarea class="form-control" rows="4" placeholder="Enter Message" name="message" required></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Submit Message</button>
    </form>
</div>

<footer>
    © 2025 Hospital Appointment System. All rights reserved.
</footer>

</body>
</html>