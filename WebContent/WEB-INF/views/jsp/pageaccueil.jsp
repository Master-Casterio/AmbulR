<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul id="menu-bar">
    <li class="active"><a href="pageaccueil.html">Home</a></li>
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

    <div class="logo">
        <img src="image.png" width="50px" height="50px" align="right">
    </div>

</ul>



<div class="titre">
<h1>Ambul'R</h1>
</div>
<div>
<p2>Une seule minute peut-être décisive pour sauver une vie..
    N'attendez pas, faites le bon choix. Ambul'R..
    On respecte l'heure d'or, on respecte votre vie.</p2>
</div>
<ul class="ﬂex-container">
    <div class="sscont">
    <img src="projetub.gif">
    </div>
<form id="connexion" action="#" method=« post">
    <p>Connection</p>
    <div>
    <label for="identifiant">Identifiant</label>
    <input id="identifiant" type="text" placeholder="saisir votre identifiant" name="identifiant">
    </div>
    <div>
    <label for="password">Mot de passe</label>
    <input id="password" type="password" placeholder="saisir votre mot de passe" name="password">
    </div>
    <div class="valider">
    <input id="valider" type="submit" value="Valider">
    </div>
    <div class="bordure"></div>
    <p>Pas encore membre?</p>
    <div class = inscription>
    <input type="submit" value="Inscription">
    </div>


</form>

</ul>
</body>
</html>