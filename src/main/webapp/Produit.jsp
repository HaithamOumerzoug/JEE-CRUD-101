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
		<h1 class="text-center text-warning mb-3">Gestions des produits</h1>
		<div class="col-md-12 col-xm-8  col-sm-8">
			<div class="card">
				<div class="card-header">Recherche des produits</div>
				<div class="card-body">
					<form action="recherche.p" method="get">
					<div class="form-group d-flex">
						<input class="form-control col-md-4 mr-3" name="motCle" type="text" placeholder="Rechercher" value="${model.motCle}">
						<button class="btn btn-primary">Rechecher</button>
					</div>
					</form>
					<table class="table">
					  <thead class="thead-light">
					    <tr>
					      <th scope="col">Id</th>
					      <th scope="col">Designation</th>
					      <th scope="col">Prix</th>
					      <th scope="col">Quantite</th>
					      <th></th>
					      <th></th>
					    </tr>
					  </thead>
					  <tbody>
					  <!-- Boucler sur les produits réquperer dans le model on utilisant jstl -->
					  <c:forEach items="${model.produits}" var="produit">
					  	<tr>
					      <th scope="row">${produit.id}</th>
					      <td>${produit.designation }</td>
					      <td>${produit.prix }</td>
					      <td>${produit.quantite }</td>
					      <td>
					      <a class="font-weight-bolder text-danger text-decoration-none" onclick="return confirm('Vous voulez vraiment supprimer se produit?')" href="supprimer.p?id=${produit.id}">Supprimer</a></td>
					      <td><a class="font-weight-bolder text-warning text-decoration-none" href="editer.p?id=${produit.id}">Editer</a></td>
					    </tr>
					  </c:forEach>
					    
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>