<%@ page isELIgnored="false" import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">

<head>


    <title>Show Balance - MyBank</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #004481;
            color: white;
            text-align: center;
            padding: 20px;
            font-size: 26px;
            font-weight: bold;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .user {
            color: #004481;
            font-size: 20px;
            margin-top: 10px;
            text-align: center;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 40px;
            background-color: white;
            box-shadow: 0 6px 16px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }

        h1 {
            color: #004481;
            margin-bottom: 30px;
            font-size: 32px;
        }

        h3 {
            color: #333;
            font-size: 24px;
            margin-bottom: 40px;
        }

        .balance-details {
            font-size: 20px;
            color: #333;
            margin-bottom: 30px;
        }

        a {
            text-decoration: none;
            color: #007bff;
            font-size: 18px;
            margin: 20px;
        }

        a:hover {
            color: #0056b3;
        }

        .buttons {
            margin-top: 40px;
        }

        .buttons a {
            display: inline-block;
            margin: 10px;
            padding: 12px 30px;
            background-color: #007bff;
            color: white;
            border-radius: 6px;
            font-size: 18px;
            transition: background-color 0.3s ease;
        }

        .buttons a:hover {
            background-color: #0056b3;
        }

        .info-section {
            margin-top: 50px;
            font-size: 16px;
            color: #666;
            text-align: center;
        }

        @media (max-width: 768px) {
            .container {
                padding: 30px;
            }

            h1 {
                font-size: 28px;
            }

            h3 {
                font-size: 22px;
            }

            .buttons a {
                font-size: 16px;
            }
        }
    </style>
</head>

<body>
    <div class="navbar">
        MyBank - Account Balance
    </div>

    <div class="user">
        <p>Welcome ${user}</p>
    </div>

    <div class="container">
        <h1>Account Balance</h1>

        <div class="balance-details">
            <p>Your current balance is: ₹${amount}</p>
            <p><strong>Last Transaction:</strong> ₹${lastTransactionAmount} on ${lastTransactionDate}</p>
        </div>

        <div class="buttons">
            <a href="./">Home</a>
            <a href="logout">Logout</a>
        </div>
    </div>

    <div class="info-section">
        <p>Need assistance? Call our 24/7 helpline or visit the nearest MyBank branch.</p>
    </div>
</body>

</html>
