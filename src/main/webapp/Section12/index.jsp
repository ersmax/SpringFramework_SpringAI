<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Section12/style.css">
    </head>
    <body>
        <h2>Calculator</h2>

        <form action="add">
            <label for="num1">Enter 1st number:</label>
            <!-- textbox -->
            <input type="text" id="num1" name="num1"><br>
            <label for="num2">Enter 2nd number:</label>
            <input type="text" id="num2" name="num2"><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>