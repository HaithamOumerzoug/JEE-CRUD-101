<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajoute d'un produit</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<%@include file="Header.jsp" %>
	<div class="container">		
		<div class="col-md-8 offset-2 col-xm-8 col-sm-8 ">
			<div class="card my-5">
				<div class="card-header">
					<span>Ajoute d'un produit</span>
					<a type="button" class="btn btn-danger float-right" href="index.p">Annuler</a> 
				</div>
				<div class="card-body">
					<form action="add.p" method="post">
						<div class="form-group">
							<label class="label-control">Designation :</label> 
							<input
								class="form-control" name="designation" placeholder="Enter une désignaton" value=${produit.designation }>
						</div>
						<div class="form-group">
							<label class="label-control">Prix :</label> 
							<input
								class="form-control" name="prix" placeholder="Entrer un prix" value=${produit.prix }>
						</div>
						<div class="form-group">
							<label class="label-control">Quantite :</label> 
							<input
								class="form-control" name="quantite" placeholder="Entrer la quantite" value=${produit.quantite }>
						</div>
						<button class="btn btn-success btn-block" type="submit">Ajouter</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>