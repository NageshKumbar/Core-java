<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #eef2f3;
            margin: 0;
            padding: 20px;
        }

        form {
            background-color: #fff;
            padding: 30px;
            max-width: 600px;
            margin: auto;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        }

        form input,
        form select {
            width: 100%;
            padding: 10px;
            margin-top: 6px;
            margin-bottom: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        form input[type="checkbox"] {
            width: auto;
            margin-right: 8px;
        }

        form input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        form input[type="submit"]:hover {
            background-color: #0056b3;
        }

        form label,
        form select,
        form input {
            display: block;
        }
    </style>
</head>
<body>
    <form action="submit" method="post">
        name:<input type="text" placeholder="Enter name" name="name">
        Product type:<select name="type" >
            <option value="Electronics">Electronics</option>
            <option value="Grocercy">Grocercy</option>
            <option value="Food">Food</option>
            <option value="Wearables">Wearables</option>
        </select>
        Incoming price:<input type="number" placeholder="Enter incoming price" name="Iprice">
        Selling Price:<input type="number" placeholder="Enter Selling Price" name="Sprice">
        MRP:<input type="number" placeholder="Enter MRP" name="mrp">
        Description:<input type="text" placeholder="Enter description" name="description">
        Brand:<input type="text" placeholder="Enter brand" name="brand">
        Quantity:<input type="number" placeholder="Enter Number of product" name="quantity">
        <select name="colour" >
            <option value="Green">Green</option>
            <option value="Yellow">Yellow</option>
            <option value="White">White</option>
            <option value="Blue">Blue</option>
        </select>
        Weight:<input type="number" placeholder="Enter Weight of the product" name="weight">
        Manuf Date:<input type="text" placeholder="Enter manuf date" name="mfd">
        Warranty:<select name="Warranty" >
            <option value="Yes">Yes</option>
            <option value="No">No</option>
        </select>
        Return Policy:<input type="checkbox" name="check">Accept Return Policy
        <input type="submit" value="Submit">
    </form>
</body>
</html>
