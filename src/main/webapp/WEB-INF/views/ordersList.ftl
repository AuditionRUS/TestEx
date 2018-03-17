<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Orders List</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Client</th>
            <th>Date</th>
            <th>Address</th>
        </tr>

    <#list orders as order>
        <tr>
            <td><a href="/order/${order.id}">${order.id}</a></td>
            <td>${order.client}</td>
            <td>${order.date}</td>
            <td>${order.address}</td>
            <td><a href="/delete/${order.id}">Delete</a></td>
            <td><a href="/update/${order.id}">Update</a></td>
        </tr>
    </#list>

    </table>

<a href="/addOrder">Create order</a>

</body>
</html>