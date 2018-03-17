<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create order page</title>
</head>
<body>

<form name="order" action="/addOrder" method="post">
    <p>Client</p>
    <input title="Client" type="text" name="client">
    <p>Date</p>
    <input title="Date" type="text" name="date">
    <p>Address</p>
    <input title="Address" type="text" name="address">
    <br>
    <input type="submit" value="OK">
</form>

</body>
</html>