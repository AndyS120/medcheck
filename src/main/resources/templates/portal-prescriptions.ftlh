<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link href="/css/bootstrap.css" rel="stylesheet">
        <title>Portal</title>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
                crossorigin="anonymous" defer></script>
    </head>
    <body>
        <div class="navbar navbar-expand-lg bg-primary fs-5">
            <div class="container-fluid">
                <a href="index" class="navbar-brand m-3 fs-3 align-text-center">
                    <img src="img/logo.PNG" width="50px" height="50px" class="d-inline-block object-fit-cover" />
                    MedCheck
                </a>
                <ul class="navbar-nav">
                    <li class="nav-item m-3"><a href="index" class="nav-link">Logout</a></li>
                </ul>
            </div>
        </div>
        <div class="row w-100 mb-5">
            <div class="col-1"></div>
            <div class="col-10">
                <h2 class="text-center m-5">Portal</h2>
                <div class="form-floating">
                    <input type="text" class="form-control" placeholder="Search Label" />
                    <label class="form-label">Search Label</label>
                </div>
                <div class="row g-0 mb-5">
                    <div class="col-3 border" style="height: 550px">
                        <div class="list-group">
                            <a href="main" class="list-group-item list-group-item-action">Home</a>
                            <a
                                href="inventory"
                                class="d-flex justify-content-between align-items-center list-group-item list-group-item-action">
                                Inventory
                                <span class="badge bg-danger rounded-pill">1</span>
                            </a>
                            <a
                                href="prescriptions"
                                class="d-flex justify-content-between align-items-center list-group-item list-group-item-action active">
                                Prescriptions
                                <span class="badge bg-primary rounded-pill">2</span>
                            </a>
                            <a
                                href="conflicts"
                                class="d-flex justify-content-between align-items-center list-group-item list-group-item-action">
                                Conflicts
                                <span class="badge bg-warning rounded-pill">2</span>
                            </a>
                        </div>
                    </div>
                    <div class="col-9 border p-5" style="height: 550px; overflow-y: scroll">
                        <div class="form-floating">
                            <input type="text" class="form-control" placeholder="Search Patient" />
                            <label class="form-label">Search Patient</label>
                        </div>
                        <div class="row">
                            <div class="col-4 p-3">
                                <p class="text-center my-3">Pending</p>
                                <div class="list-group">
                                    <button class="btn btn-primary list-group-item active">James Smith</button>
                                    <button class="btn btn-primary list-group-item">Maria Garcia</button>
                                </div>
                            </div>
                            <div class="col-8 p-3">
                                <p class="text-center my-3">Prescription</p>
                                <div class="list-group">
                                    <button class="btn btn-primary list-group-item">Atorvastatin (Lipitor)</button>
                                    <button class="btn btn-primary list-group-item">Lisinopril (Prinivil, Zestril)</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-1"></div>
        </div>
        <div class="row bg-secondary m-0 w-100" style="height: 100px"></div>
    </body>
</html>
