<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous" defer></script>
    <title>Search</title>
</head>
<body>
<div class="navbar navbar-expand-lg bg-primary fs-5">
    <div class="container-fluid">
        <a href="/index" class="navbar-brand m-3 fs-3 align-text-center">
            <img src="/static/img/logo.PNG" width="50px" height="50px"
                 class="d-inline-block
            object-fit-cover" alt="logo"/>
            MedCheck
        </a>
        <ul class="navbar-nav">
            <li class="nav-item m-3"><a href="/index" class="nav-link">Logout</a></li>
        </ul>
    </div>
</div>
<div class="row w-100" style="height:80vh">
    <div class="col-1"></div>
    <div class="col-10">
        <h2 class="text-center m-5">Portal</h2>
        <div class="row g-0 mb-5 h-75">
            <div class="col-3 border">
                <div class="list-group">
                    <a
                            class="d-flex justify-content-between align-items-center list-group-item list-group-item-action "
                            href="./doctor-patient-info">
                        Patient Info
                    </a>
                </div>
                <div class="list-group">
                    <a
                            class="d-flex justify-content-between align-items-center list-group-item
                            active list-group-item-action"
                            href="http://localhost:8080/medcheck/portal-prescribe">
                        Prescribe Medication
                    </a>
                </div>
                <div class="list-group">
                    <a
                            class="d-flex justify-content-between align-items-center list-group-item list-group-item-action"
                            href="./portal-messages">
                        Messages
                    </a>
                </div>
            </div>
            <div class="col-9 border p-5" style="overflow-y: scroll">
                <h4 class="text-center m-3">Search</h4>
                <div class="row">
                    <form action="http://localhost:8080/medcheck/create-prescription" method="post">
                        <div class="col">
                            <h6>Select Patient</h6>
                            <select>
                                <#list patientList as patient>
                                    <option value="${patient.getId()}">${patient.getFullName()}</option>
                                </#list>
                            </select>
                        </div>
                        <div class="col">
                            <h6>Prescribe</h6>
                            <input type="text" name="medicationName">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="col-1"></div>
</div>
<div class="row bg-secondary m-0 w-100 position-fixed bottom-0 start-50 translate-middle-x" style="height: 100px"></div>
</body>
</html>