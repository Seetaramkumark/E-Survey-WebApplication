<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Satisfaction Survey</title>
    
    <style>
		body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    text-align: center;
}

.container {
    max-width: 500px;
    margin: 50px auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
    margin-bottom: 20px;
}

form {
    text-align: left;
}

label, input, select, textarea {
    display: block;
    margin-bottom: 10px;
    width: 100%;
}

input, select, textarea {
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

textarea {
    height: 100px;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
}

input[type="submit"]:hover {
    background-color: #45a049;
}

	</style>
</head>
<body>
    <div class="container">
        <h1>Customer Satisfaction Survey</h1>
        <form action="/api/insertCustomerSatisfaction" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="satisfaction">Overall Satisfaction:</label>
            <select id="satisfaction" name="satisfaction" required>
                <option value="very-satisfied">Very Satisfied</option>
                <option value="satisfied">Satisfied</option>
                <option value="neutral">Neutral</option>
                <option value="dissatisfied">Dissatisfied</option>
                <option value="very-dissatisfied">Very Dissatisfied</option>
            </select>

            <label for="comments">Comments:</label>
            <textarea id="comments" name="comment" rows="4"></textarea>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
