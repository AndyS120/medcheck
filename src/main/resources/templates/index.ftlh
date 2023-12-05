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
    <div class="row w-100 m-0">
        <figure class="figure p-0 m-0 position-relative">
            <img src="/static/img/pharmacy_bg.jpg" style="height: 440px; width: 100%" class="img-fluid
            object-fit-cover p-0" alt="pharmacy"/>
            <figcaption class="figure-caption position-absolute bottom-0 end-0 text-light pe-3">
                Image by
                <a href="https://pixabay.com/users/moakets-99876/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=218692"
                   class="link-light">moakets</a>
                from
                <a href="https://pixabay.com//?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=218692"
                   class="link-light">Pixabay</a>
            </figcaption>
            <div class="container-fluid position-absolute top-50 start-0 translate-middle-y">
                <div class="row">
                    <div class="col"></div>
                    <div class="col bg-dark opacity-75">
                        <h1 class="text-center p-5 text-light">Welcome to MedCheck!</h1>
                    </div>
                    <div class="col"></div>
                </div>
            </div>
        </figure>
    </div>
    <div class="row my-5 w-100">
        <div class="col-2"></div>
        <div class="col-8" style="height: 300px">
            <h2 class="mb-4">About Us</h2>
            <p>
                We created this web app to help pharmacies manage distribution of medications in an easy way.
            </p>
            <p>
                To get started, signup or login.
            </p>
        </div>
        <div class="col-2"></div>
    </div>
</div>
<div class="row bg-secondary start-0 bottom-0 m-0 w-100 position-fixed"
     style="height: 100px"></div>
</body>
</html>
