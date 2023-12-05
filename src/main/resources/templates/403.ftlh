<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <title>Home Page</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous" defer></script>
</head>
<body>
<div class="navbar navbar-expand-lg bg-primary fs-5">
    <div class="container-fluid">
        <a href="#" class="navbar-brand m-3 fs-3 align-text-center">
            <img src="/static/img/logo.PNG" width="50px" height="50px" class="d-inline-block object-fit-cover"
                 alt="logo"/>
            MedCheck
        </a>
        <ul class="navbar-nav">
            <li class="nav-item m-3"><a href="http://localhost:8080/login" class="nav-link">Login</a></li>
            <li class="nav-item m-3"><a href="http://localhost:8080/signup" class="nav-link">Signup</a></li>
        </ul>
    </div>
</div>
<div style="height:80vh">
    <div class="row my-5 w-100">
        <div class="col-2"></div>
        <div class="col-8" style="height: 300px">
            <h2 class="mb-4">Error 403</h2>
            <p>
                Couldn't Access Page
            </p>
        </div>
        <div class="col-2"></div>
    </div>
</div>
<div class="row bg-secondary m-0 w-100 position-absolute bottom-0 start-50 translate-middle-x"
     style="height: 100px"></div>
</body>
</html>
