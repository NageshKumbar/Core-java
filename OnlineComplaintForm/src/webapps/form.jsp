<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Complaint Form</title>
    <style>
        body {
          font-family: Arial, sans-serif;
          background: #f4f6f8;
          display: flex;
          justify-content: center;
          align-items: center;
          height: 100vh;
        }

        form {
          background: white;
          padding: 30px 40px;
          border-radius: 10px;
          box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
          width: 350px;
        }

        h1 {
          text-align: center;
          color: #333;
          margin-bottom: 25px;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"] {
          width: 100%;
          padding: 10px;
          margin-top: 6px;
          margin-bottom: 20px;
          border: 1px solid #ccc;
          border-radius: 5px;
          box-sizing: border-box;
        }

        input[type="submit"] {
          background-color: #4CAF50;
          color: white;
          padding: 12px;
          width: 100%;
          border: none;
          border-radius: 5px;
          cursor: pointer;
          font-size: 16px;
        }

        input[type="submit"]:hover {
          background-color: #45a049;
        }

        label {
          font-weight: bold;
          display: block;
          margin-bottom: 5px;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>


<form action="submit" method="post">
    <h1>Complaint Form</h1>

    <label for="username">Name:</label>
    <input type="text" placeholder="Enter your name" name="username" required>

    <label for="email">E-mail:</label>
    <input type="email" placeholder="Enter your email" name="email" required>

    <label for="contact">Contact:</label>
    <input type="tel" placeholder="Enter your contact" name="contact" required>

    <label for="complaint">Complaint:</label>
    <input type="text" placeholder="Type your complaint" name="complaint" required>

    <input type="submit" value="Submit">
</form>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</body>
</html>
