<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
    <title>Portal</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous" defer></script>
</head>
<body>
<div class="navbar navbar-expand-lg bg-primary fs-5">
    <div class="container-fluid">
        <a href="http://localhost:8080/index" class="navbar-brand m-3 fs-3 align-text-center">
            <img src="/static/img/logo.PNG" width="50px" height="50px" class="d-inline-block object-fit-cover"/>
            MedCheck
        </a>
        <ul class="navbar-nav">
            <li class="nav-item m-3"><a href="http://localhost:8080/index" class="nav-link">Logout</a></li>
        </ul>
    </div>
</div>
<div class="row w-100" style="height:80vh">
    <div class="col-1"></div>
    <div class="col-10 mb-5">
        <h2 class="text-center m-5">Portal</h2>
        <form action="http://localhost:8080/search">
            <div class="form-floating">
                <input type="text" class="form-control" placeholder="Search Label" name="term"/>
                <label class="form-label">Search Label</label>
            </div>
        </form>
        <div class="row g-0 mb-5 h-75">
            <div class="col-3 border">
                <div class="list-group">
                    <a
                            href="http://localhost:8080/inventory"
                            class="d-flex justify-content-between align-items-center list-group-item list-group-item-action active">
                        Inventory
                        <#--                                <span class="badge bg-danger rounded-pill">1</span>-->
                    </a>
                    <a
                            href="http://localhost:8080/prescriptions"
                            class="d-flex justify-content-between align-items-center list-group-item list-group-item-action">
                        Prescriptions
                        <#--                                <span class="badge bg-primary rounded-pill">2</span>-->
                    </a>
                </div>
            </div>
            <div class="col-9 border p-5" style="overflow-y: scroll">
                <#--                        <div class="form-floating">-->
                <#--                            <input type="text" class="form-control" placeholder="Search Item" />-->
                <#--                            <label class="form-label">Search Item</label>-->
                <#--                        </div>-->
                <div class="row">
                    <div class="col-8 p-3">
                        <p class="text-center my-3">In Stock</p>
                        <ul class="list-group">
                            <#list itemList as item>
                                <li class="d-flex align-items-center list-group-item">
                                    ${item.itemName}
                                    <span class="badge rounded-pill ms-2 me-auto <#if item.amount <
                                    10>bg-danger<#elseif item.amount < 50
                                    >bg-warning<#else>bg-primary</#if>">${item
                                        .amount}</span>
                                    <a href="http://localhost:8080/inventory/edit/id=${item.itemID}" class="btn
                                            btn-outline-primary me-2">Edit</a>
                                    <a href="http://localhost:8080/inventory/delete/id=${item.itemID}" class="btn
                                            btn-outline-danger">Remove</a>
                                </li>
                            </#list>
                        </ul>
                    </div>
                    <div class="col-4 p-3">
                        <p class="text-center my-3">Order</p>
                        <div class="d-flex justify-content-center m-5">
                            <a href="http://localhost:8080/inventory/order" class="btn btn-primary">Create Order</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-1"></div>
</div>
<div class="row bg-secondary m-0 w-100 position-fixed bottom-0 start-50 translate-middle-x" style="height: 100px"></div>

</body>
</html>
