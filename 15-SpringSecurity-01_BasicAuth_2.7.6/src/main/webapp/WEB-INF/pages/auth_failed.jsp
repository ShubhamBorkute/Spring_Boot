<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Authorization Failed - MyBank</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        .navbar {
            background-color: #004481;
            color: white;
            padding: 20px;
            font-size: 26px;
            font-weight: bold;
        }

        .container {
            max-width: 600px;
            margin: 80px auto;
            padding: 40px;
            background-color: white;
            box-shadow: 0 6px 16px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }

        h1 {
            color: red;
            font-size: 34px;
            margin-bottom: 30px;
        }

        p {
            color: #555;
            font-size: 18px;
            margin-bottom: 40px;
        }

        a {
            text-decoration: none;
            color: #007bff;
            font-size: 18px;
            padding: 10px 20px;
            border-radius: 5px;
            background-color: #007bff;
            color: white;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
        }

        .retry {
            display: block;
            margin-bottom: 20px;
        }

        .info-section {
            margin-top: 40px;
            color: #666;
            font-size: 16px;
        }
    </style>
</head>

<body>
    <div class="navbar">
        MyBank
    </div>

    <div class="container">
        <h1>Authorization Failed</h1>
        <p>It seems like you don't have the necessary permissions to access this page.</p>

        <a href="./" class="retry">Go to Home</a>
        <a href="logout">Logout</a>
    </div>

    <div class="info-section">
        <p>If you believe this is a mistake, please contact support at <a href="mailto:support@mybank.com">support@mybank.com</a></p>
    </div>
</body>

</html>
