<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Manager</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body>
	<%@include file="Header.jsp" %>
	<div class="container">
		<div class="col-md-10 offset-1 col-xm-8  col-sm-8">
			<div class="card my-5">
				<div class="card-header">Confirmation !</div>
				<div class="card-body">
					<div class="form-group">
						<label class="label-control"><b>ID :</b></label>
						<label class="label-control">${produit.id}</label>
					</div>
					<div class="form-group">
						<label class="label-control"><b>Designation :</b></label>
						<label class="label-control">${produit.designation }</label>
					</div>
					<div class="form-group">
						<label class="label-control"><b>Prix :</b></label>
						<label class="label-control">${produit.prix }</label>
					</div>
					<div class="form-group">
						<label class="label-control"><b>Quantite :</b></label>
						<label class="label-control">${produit.quantite }</label>
					</div>
				</div>
				<div class="card-footer">
	            	<a href="index.p" class="btn btn-danger">Retour</a>
	            </div>
			</div>
		</div>
	</div>
</body>
</html>