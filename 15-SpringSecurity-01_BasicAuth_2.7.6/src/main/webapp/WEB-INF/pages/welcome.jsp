<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <title>Bank Application Home</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #004481;
            color: white;
            text-align: center;
            padding: 15px;
            font-size: 26px;
            font-weight: bold;
        }

        .container {
            max-width: 900px;
            margin: 60px auto;
            background-color: #ffffff;
            padding: 30px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }

        h1 {
            color: #004481;
            margin-bottom: 40px;
            font-size: 32px;
        }

        .links a {
            display: block;
            margin: 20px auto;
            padding: 15px;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            border-radius: 8px;
            font-size: 18px;
            width: 250px;
            transition: background-color 0.3s ease;
        }

        .links a:hover {
            background-color: #0056b3;
        }

        .links h3 {
            margin: 0;
        }
    </style>
</head>

<body>
    <div class="navbar">
        MyBank - Secure Portal
    </div>

    <div class="container">
        <h1>Home Page Security</h1>

        <div class="links">
            <h3><a href="offers">Offers</a></h3>
            <h3><a href="loanApprove">Loan Approval</a></h3>
            <h3><a href="balance">Check Balance</a></h3>
        </div>
    </div>
</body>

</html>
