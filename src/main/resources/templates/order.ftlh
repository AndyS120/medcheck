<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous" defer></script>
    <title>Order</title>
</head>
<body>
<div class="navbar navbar-expand-lg bg-primary fs-5">
    <div class="container-fluid">
        <a href="<#if isUpdate>../../index<#else>../index</#if>" class="navbar-brand m-3 fs-3 align-text-center">
            <img src="<#if isUpdate>../../img/logo.PNG<#else>../img/logo.PNG</#if>" width="50px" height="50px"
                 class="d-inline-block
            object-fit-cover" alt="logo"/>
            MedCheck
        </a>
        <ul class="navbar-nav">
            <li class="nav-item m-3"><a href="<#if isUpdate>../../index<#else>../index</#if>"
                                        class="nav-link">Logout</a></li>
        </ul>
    </div>
</div>
<div class="row w-100 mb-5">
    <div class="col-3"></div>
    <div class="col-6">
        <h1 class="text-center m-3"><#if isUpdate>Edit <#else>Create </#if>Order</h1>
        <form action="<#if isUpdate>/inventory/edit/id=${item.itemID}<#else>/inventory/create</#if>" name="item"
              method="post">
            <div class="m-3 form-floating">
                <input type="text" id="form" class="form-control" list="medication-list" name="itemName"
                       placeholder="Medication" value="<#if isUpdate>${item.itemName}</#if>"/>
                <label class="form-label">Medication</label>
                <datalist class="position-absolute bottom-0" id="medication-list">
                    <option value="Vitamin D"></option>
                    <option value="Amoxicillin"></option>
                    <option value="Levothyroxine"></option>
                    <option value="Lisinopril"></option>
                    <option value="Ibuprofen"></option>
                    <option value="Amphetamine"></option>
                    <option value="Amlodipine"></option>
                    <option value="Albuterol HFA"></option>
                    <option value="Prednisone"></option>
                    <option value="Gabapentin"></option>
                    <option value="Benzonatate"></option>
                    <option value="Alprazolam"></option>
                    <option value="Cyclobenzaprine"></option>
                    <option value="Azithromycin"></option>
                    <option value="Atorvastatin"></option>
                    <option value="Cetirizine"></option>
                    <option value="Losartan"></option>
                    <option value="Amoxicillin"></option>
                    <option value="Cephalexin"></option>
                    <option value="Metformin"></option>
                    <option value="Metoprolol succinate ER"></option>
                    <option value="Folic acid"></option>
                    <option value="Hydrochlorothiazide"></option>
                    <option value="Sildenafil citrate"></option>
                    <option value="Trazodone"></option>
                    <option value="Zolpidem tartrate"></option>
                    <option value="Escitalopram oxalate"></option>
                    <option value="Clonazepam"></option>
                    <option value="Methylprednisolone"></option>
                    <option value="Tadalafil"></option>
                    <option value="Methocarbamol"></option>
                    <option value="Fluconazole"></option>
                    <option value="Sertraline"></option>
                    <option value="Doxycycline hyclate"></option>
                    <option value="Furosemide"></option>
                    <option value="Fluoxetine"></option>
                    <option value="Metronidazole"></option>
                    <option value="Freestyle Libre"></option>
                    <option value="Omeprazole"></option>
                    <option value="FeroSul"></option>
                    <option value="Sulfamethoxazole"></option>
                    <option value="Phenobarbital"></option>
                    <option value="Armour Thyroid"></option>
                    <option value="Bromphen"></option>
                    <option value="Metoprolol tartrate"></option>
                    <option value="Meloxicam"></option>
                    <option value="Pantoprazole sodium"></option>
                    <option value="Estradiol"></option>
                    <option value="Famotidine"></option>
                </datalist>
            </div>
            <div class="m-3 form-floating">
                <input type="number" class="form-control" name="amount" placeholder="Amount" value="<#if
                isUpdate>${item.amount}</#if>"/>
                <label class="form-label">Amount</label>
            </div>
            <div class="m-3 form-floating">
                <input type="text" class="form-control" name="details" placeholder="Details (Optional)" value="<#if
                isUpdate>${item.details}</#if>"/>
                <label class="form-label">Details (Optional)</label>
            </div>
            <div class="d-flex justify-content-center">
                <a class="btn btn-danger" href="/inventory">Cancel</a>
                <button class="btn btn-primary" type="submit">Submit</button>
            </div>
        </form>
    </div>
    <div class="col-3"></div>
</div>
<div class="row bg-secondary m-0 w-100" style="height: 100px"></div>
</body>
</html>