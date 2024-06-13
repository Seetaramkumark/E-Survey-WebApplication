<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey Responses</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url("https://images.unsplash.com/photo-1485802007047-7774de7208e5?dpr=1&auto=compress,format&fit=crop&w=1800&h") no-repeat center center fixed;
            background-size: cover;
            font-family: 'Droid Serif', serif;
            margin: 0;
            padding: 20px;
            box-sizing: border-box;
        }

        .card-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }

        .card {
            position: relative; /* Added for positioning watermark */
            background-color: #D2B48C;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin: 10px;
            padding: 20px;
            width: 300px;
            text-align: left;
            transition: transform 0.2s;
        }

        .card:hover {
            transform: scale(1.05);
        }

        .card h2 {
            margin-top: 0;
        }

        .card p {
            margin-bottom: 0;
        }

        /* Background color for cards 1, 2, 3, 4 */
        .card1, .card2, .card3, .card4 {
            background-color: #333;
            color: #fff;
        }

        /* Watermark styling */
        .watermark {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            font-size: 1.5em;
            opacity: 0.5;
        }

        /* Watermark colors for cards 1, 2, 3, 4 */
        .card1 .watermark { color: #FFD54F; }
        .card2 .watermark { color: #81C784; }
        .card3 .watermark { color: #64B5F6; }
        .card4 .watermark { color: #E57373; }
    </style>
</head>
<body>

<div class="card-container">
    <!-- Original cards -->
    <div class="card">
        <h2>John Doe</h2>
        <p>Email: john@example.com</p>
        <p>Feedback: Great survey!</p>
    </div>
    <div class="card">
        <h2>Jane Smith</h2>
        <p>Email: jane@example.com</p>
        <p>Feedback: Enjoyed participating.</p>
    </div>
    <div class="card">
        <h2>Bob Johnson</h2>
        <p>Email: bob@example.com</p>
        <p>Feedback: Interesting questions.</p>
    </div>
    <div class="card">
        <h2>Alice Williams</h2>
        <p>Email: alice@example.com</p>
        <p>Feedback: Would love to see more surveys.</p>
    </div>
    <div class="card">
        <h2>John Doe</h2>
        <p>Email: john@example.com</p>
        <p>Feedback: Great survey!</p>
    </div>
    <div class="card">
        <h2>Jane Smith</h2>
        <p>Email: jane@example.com</p>
        <p>Feedback: Enjoyed participating.</p>
    </div>
    <div class="card">
        <h2>Bob Johnson</h2>
        <p>Email: bob@example.com</p>
        <p>Feedback: Interesting questions.</p>
    </div>
    <div class="card">
        <h2>Alice Williams</h2>
        <p>Email: alice@example.com</p>
        <p>Feedback: Would love to see more surveys.</p>
    </div>
    <!-- Original cards -->
    <div class="card">
        <h2>John Doe</h2>
        <p>Email: john@example.com</p>
        <p>Feedback: Great survey!</p>
    </div>
    <div class="card">
        <h2>Jane Smith</h2>
        <p>Email: jane@example.com</p>
        <p>Feedback: Enjoyed participating.</p>
    </div>
    <div class="card">
        <h2>Bob Johnson</h2>
        <p>Email: bob@example.com</p>
        <p>Feedback: Interesting questions.</p>
    </div>
    <div class="card">
        <h2>Alice Williams</h2>
        <p>Email: alice@example.com</p>
        <p>Feedback: Would love to see more surveys.</p>
    </div>
    <!-- Original cards -->
    <div class="card">
        <h2>John Doe</h2>
        <p>Email: john@example.com</p>
        <p>Feedback: Great survey!</p>
    </div>
    <div class="card">
        <h2>Jane Smith</h2>
        <p>Email: jane@example.com</p>
        <p>Feedback: Enjoyed participating.</p>
    </div>
    <div class="card">
        <h2>Bob Johnson</h2>
        <p>Email: bob@example.com</p>
        <p>Feedback: Interesting questions.</p>
    </div>
    <div class="card">
        <h2>Alice Williams</h2>
        <p>Email: alice@example.com</p>
        <p>Feedback: Would love to see more surveys.</p>
    </div>
    
</div>

</body>
</html>
