<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create order page</title>
</head>
<body>

<form name="order" action="/updateOrder" method="post">
    <p>Id</p>
    <input title="Id" type="hidden" name="id" value="${order.id}">
    <p>Client</p>
    <input title="Client" type="text" name="client" value="${order.client}">
    <p>Date</p>
    <input title="Date" type="text" name="date" value="${order.date}">
    <p>Address</p>
    <input title="Address" type="text" name="address" value="${order.address}">
    <input type="submit" value="OK">
</form>

</body>
</html>