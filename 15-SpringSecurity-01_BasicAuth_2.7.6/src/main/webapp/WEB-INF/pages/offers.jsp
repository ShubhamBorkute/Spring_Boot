<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
   
    <title>Special Offers - MyBank</title>
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
            max-width: 900px;
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

        ul {
            text-align: left;
            list-style-type: disc;
            margin: 30px auto;
            padding: 0 40px;
            font-size: 20px;
            line-height: 1.8;
        }

        ul li {
            margin-bottom: 15px;
        }

        .offer-category {
            font-weight: bold;
            color: #004481;
            font-size: 22px;
            margin-top: 20px;
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

        .extra-info {
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

            ul {
                font-size: 18px;
            }

            .buttons a {
                font-size: 16px;
            }
        }
    </style>
</head>

<body>
    <div class="navbar">
        MyBank - Special Offers
    </div>

    <div class="user">
<p>Welcome  ${user}</p>

    </div>


    <div class="container">
        <h1>Exclusive Offers for You</h1>

        <div class="offer-category">Savings Account Offers:</div>
        <ul>
            <li>7.5% Interest on Savings Account Balance (Effective until 31st Dec 2024)</li>
            <li>Special Cashback of ₹500 on maintaining a minimum balance of ₹25,000</li>
        </ul>

        <div class="offer-category">Loan Offers:</div>
        <ul>
            <li>8.9% Lower Interest Rate on Personal Loans (Up to ₹5 Lakhs)</li>
            <li>Zero Processing Fee on Home Loans for first-time applicants</li>
        </ul>

        <div class="offer-category">Credit Card Offers:</div>
        <ul>
            <li>Up to 10% Cashback on International Transactions with MyBank Credit Card</li>
            <li>Reward Points on every ₹100 spent, redeemable for exciting gifts</li>
        </ul>

        <div class="buttons">
            <a href="./">Home</a>
            <a href="logout">Logout</a>
        </div>
    </div>

    <div class="extra-info">
        <p>These offers are personalized based on your banking profile. For more details, visit the nearest branch or call our 24/7 customer service.</p>
    </div>
</body>

</html>
