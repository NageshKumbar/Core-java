<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hospital Appointment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background-color: #121212;
          color: #e0e0e0;
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .navbar {
          background-color: #212121 !important;
          box-shadow: 0 4px 6px rgba(0, 0, 0, 0.3);
        }

        .nav-link {
          font-weight: 600;
          color: #ffffff !important;
        }

        .nav-link.active {
          background-color: #0d6efd;
          border-radius: 5px;
        }

        .container {
          margin-top: 50px;
        }

        h1 {
          color: #bb86fc;
          font-weight: bold;
          text-align: center;
          margin-bottom: 30px;
        }

        .card {
          background-color: #1e1e1e;
          color: #e0e0e0;
          border: none;
          box-shadow: 0 0 10px rgba(255, 255, 255, 0.05);
        }

        footer {
          background-color: #0d6efd;
          color: white;
          padding: 15px 0;
          text-align: center;
          position: fixed;
          bottom: 0;
          width: 100%;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-sm navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="appointment.jsp">APPOINTMENT</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="contact.jsp">CONTACT</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container">
    <h1>Hospital Appointment Management System</h1>
    <div class="card">
        <div class="card-body">
            <p>Please use the navigation menu to book an appointment or contact us.</p>
        </div>
    </div>
</div>

<footer>
    © 2025 Hospital Appointment System. All rights reserved.
</footer>

</body>
</html>