<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Order info</h1>
    <table>
        <tr>
            <td>Id</td>
            <td>${order.id}</td>
        </tr>
        <tr>
            <td>Client</td>
            <td>${order.client}</td>
        </tr>
        <tr>
            <td>Date</td>
            <td>${order.date}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${order.address}</td>
        </tr>
    </table>

<br>
<a href="/orders">Back</a>
</body>
</html>