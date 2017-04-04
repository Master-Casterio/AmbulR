<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul id="menu-bar">
    <li><a href="pageaccueil.html">Home</a></li>
    <li><a href="index.html">Profil</a>
        <ul>
            <li><a href="#">Voir</a></li>
            <li><a href="#">Modifier</a></li>
        </ul>
    </li>
    <li><a href="#">Informations</a>
        <ul>
            <li><a href="commercial.html">Les formules</a></li>
            <li><a href="module.html">Les modules</a></li>
            <li><a href="Temoignage.html">Témoignages</a></li>
        </ul>
    </li>
    <li><a href="Nous.html">Qui sommes nous?</a></li>
    <li><a href="contact_us">Nous contacter</a></li>
    <li class="active"><a href="#">Urgences</a>


        <li class="logo">
            <img src="image.png" width="50px" height="50px" align="right">
        </li>


</ul>

<div class="bandeausup">
<h1>Ambul'R</h1>
<div class="titre">
<h2>Urgence</h2>
</div>
</div>
<div id="typeaccident">
<form id="pagemalaise" action="pagemalaise.html" method="post">
<div>
<input id="malaise" type="submit" value="Malaise">
</div>
</form>
    <form id="pageaccident" action="#" method="post">
<div class="accident">
    <button class="accidentcorp">Accident corporelle</button>
</div>
</form>
</div>
<div class="choixaccident">
    <Select class="choix" name="choix[]" multiple>
        <optgroup label="Haut du corps">
            <option value="tete">tête</option>
            <option value="ventre">ventre</option>
            <option value="dos">dos</option>
            <option value="bras">bras</option>
            <option value="mains">mains</option>
        </optgroup>
        <optgroup label="Bas du corps">
            <option value="Jambes">Jambes</option>
            <option value="pieds">pieds</option>
            <option value="cheville">cheville</option>
        </optgroup>
    </Select>
</div>
<div>
    <input id="valider" type="submit" value="Valider">
</div>
<script src="pageurgences.js"></script>
</body>
</html>