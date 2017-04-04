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
    <li><a href="#">Profil</a>
        <ul>
            <li><a href="#">Voir</a></li>
            <li><a href="#">Modifier</a></li>
        </ul>
    </li>
    <li><a href="#">Informations</a>
        <ul>
            <li><a href="commercial.html">Les formules</a></li>
            <li><a href="module.html">Les modules</a></li>
            <li><a href="Temoignage.html">Temoignages</a></li>
        </ul>
    </li>
    <li><a href="Nous.html">Qui sommes nous?</a></li>
    <li><a href="#">Nous contacter</a></li>
    <li class="active"><a href="#">Urgences</a>
</ul>

<div class="bandeausup">
    <h1>Ambul'R</h1>
    <div class="titre">
        <h2>Urgence</h2>
    </div>
</div>
<div id="typeaccident">
<form id="pagemalaise" action="#" method="post">
    <div>
        <button class="malaise">Malaise</button>
    </div>
</form>
    <form id="pageaccident" action="pageurgences.html" method="post">
    <div class="accident">
        <button class="accidentcorp">Accident corporelle</button>
    </div>
</form>
</div>
<div class="etat">
    <div class="texte">
    <p7>La personne est :</p7>
    </div>
        <div>
    <label for="consciente">Consciente</label>
    <input id="consciente" type="checkbox" value="html" name="consciente">
    </div>
    <div>
    <label for="respire">Respire</label>
    <input id="respire" type="checkbox" value="html" name="respire">
    </div>
</div>
<div>
    <input id="valider" type="submit" value="Valider">
</div>
</body>
</html>