<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="css/bootstrap.css" rel="stylesheet">
    <title>Login</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous" defer></script>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-primary fs-5">
    <div class="container-fluid">
        <a href="http://localhost:8080/index" class="navbar-brand m-3 fs-3 align-text-center">
            <img src="img/logo.PNG" width="50px" height="50px" class="d-inline-block  object-fit-cover" alt="logo"/>
            MedCheck
        </a>
    </div>
</nav>
<div class="row w-100">
    <div class="col"></div>
    <div class="col my-5 align-center">
        <h1 class="text-center m-3">Login</h1>
        <div class="m-3 form-floating">
            <input type="email" class="form-control" placeholder="Email"/>
            <label class="form-label">Email</label>
        </div>
        <div class="m-3 form-floating">
            <input type="password" class="form-control" placeholder="Password"/>
            <label class="form-label">Password</label>
        </div>
        <div class="d-flex justify-content-center">
            <a href="http://localhost:8080/portal">
                <button class="btn btn-primary">Login</button>
            </a>
        </div>
    </div>
    <div class="col"></div>
</div>
<div class="row bg-secondary position-absolute start-0 bottom-0 m-0 w-100" style="height: 100px"></div>
</body>
</html>
