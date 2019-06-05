<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--Import materialize.css-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link rel="stylesheet" href="CSS/index.css" />
<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Splash</title>
</head>
<header>
	<nav>
		<ul>
			<li><a href="index.html">Home</a></li>
		</ul>
	</nav>
</header>
<body bgcolor="#293133">
	<div class="container">
		<div class="row">
			<div class="padd">

				<div class="col s4">
					<div class="card">
						<div class="card-image">
							<a href="mele.jsp"><img src="Images/mele.jpg"><span
								class="card-title-m">Mele</span></a> <span></span>
						</div>
						<div class="card-content">
							<ul>
								<li>Fornitore: Federico Fitness</li>
								<li data-id="89">Centrifugato</li>
								<li data-id="85">Estratti</li>
								<li data-id="71">Succhi</li>
								<li data-id="82">Guarnizione</li>
							</ul>
						</div>
					</div>
				</div>

				<div class="col s4">
					<div class="card">
						<div class="card-image">
							<a href="pere.jsp"><img src="Images/pere.jpg"><span
								class="card-title-m">Pere</span></a> <span></span>
						</div>
						<div class="card-content">
							<ul>
								<li>Fornitore: Andrea Mazinga</li>
								<li data-id="89">Centrifugato</li>
								<li data-id="85">Estratti</li>
								<li data-id="71">Succhi</li>
								<li data-id="82">Guarnizione</li>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<div class="col s4">
				<div class="card">
					<div class="card-image">
						<a href="arance.jsp"><img src="Images/arance.jpg"><span
							class="card-title-m">Arance</span></a> <span></span>
					</div>
					<div class="card-content">
						<ul>
							<li>Fornitore: Daniele Software</li>
							<li data-id="89">Centrifugato</li>
							<li data-id="85">Estratti</li>
							<li data-id="71">Succhi</li>
							<li data-id="82">Guarnizione</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>