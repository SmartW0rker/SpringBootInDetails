<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>List Todos Page</title>
    </head>
    <body>
        <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet" >
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    <div>
        <h1>Your Todos</h1>
        <table class="table">
            <thead>
            <tr>
                <th>id</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.target}</td>
                    <td>${todo.done}</td>
                    <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a>   </td>
                    <td> <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a>   </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>

    </body>
</html>