<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <title>Login</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous" defer></script>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-primary fs-5">
    <div class="container-fluid">
        <a href="http://localhost:8080/index" class="navbar-brand m-3 fs-3 align-text-center">
            <img src="/static/img/logo.PNG" width="50px" height="50px" class="d-inline-block  object-fit-cover"
                 alt="logo"/>
            MedCheck
        </a>
    </div>
</nav>
<div class="row w-100" style="height:80vh">
    <div class="col"></div>
    <div class="col my-5 align-center">
        <h1 class="text-center m-3">Login</h1>
        <form action="http://localhost:8080/medcheck/portal-messages" method="get">
            <div class="m-3 form-floating">
                <input type="email" class="form-control" name="username" placeholder="Email"/>
                <label class="form-label">Email</label>
            </div>
            <div class="m-3 form-floating">
                <input type="password" class="form-control" name="password" placeholder="Password"/>
                <label class="form-label">Password</label>
            </div>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Login</button>
            </div>
        </form>
    </div>
    <div class="col"></div>
</div>
<div class="row bg-secondary m-0 w-100 position-fixed bottom-0 start-50 translate-middle-x" style="height: 100px"></div>
</body>
</html>
