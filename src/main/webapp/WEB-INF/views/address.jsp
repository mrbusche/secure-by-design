<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Address</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Address page</h1>
        <form:form class="navbar-form navbar-left" action="saveAddress" method="post">
            <div class="row">
                <div class="form-group">
                    <input type="text" name="streetAddress1" class="form-control col-xs-4" placeholder="Address Line 1">
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <input type="text" name="streetAddress2" class="form-control col-xs-4" placeholder="Address Line 2">
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <input type="text" name="city" class="form-control col-xs-4" placeholder="City">
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <input type="text" name="state" class="form-control col-xs-4" placeholder="State">
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <input type="text" name="zip1" class="form-control col-xs-2" placeholder="Zip 5">
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <input type="text" name="zip2" class="form-control col-xs-2" placeholder="Zip 4">
                </div>
            </div>
            <div class="row">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </form:form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
