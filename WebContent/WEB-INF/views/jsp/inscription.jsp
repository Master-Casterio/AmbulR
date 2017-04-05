<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>

<!--  <h1> <spring:message code="page.index.welcome" /> </h1> -->

<body>


        <ul id="menu-bar">
            <li><a href="pageaccueil.html">Home</a></li>
            <li><a class="active">Profil</a>
                <ul>
                    <li><a href="#">Voir</a></li>
                    <li><a href="#">Modifier</a></li>
                </ul>
            </li>
            <li><a href="#">Informations</a>
                <ul>
                    <li><a href="commercial.html">Les formules</a></li>
                    <li><a href="module.html">Les modules</a></li>
                    <li><a href="Temoignage.html">Ils l'utilisent</a></li>
                </ul>
            </li>
            <li><a href="Nous.html">Qui sommes nous?</a></li>
            <li><a href="Contact_Us">Nous contacter</a></li>


            <div class="logo">
                <img src="image.png" width="50px" height="50px" align="right">
            </div>

        </ul>


        <ul class="flex-container4">
              <div class="sscont2">
                <img src="projetub.gif" width="500px" height="500px">
              </div>
            <div class="faischier">
                <form id="container10" action="inscription" method="post">

                    <div>
                        <label for="nom">Nom : </label>
                        <input id="nom" type="text" placeholder="Saisir votre nom" name="nom">
                    </div>

                    <div>
                        <label for="prenom">Prénom : </label>
                        <input id="prenom" type="text" placeholder="Saisir votre prénom" name="prenom">
                    </div>

                    <div>
                        <label for="age">Age : </label>
                        <input id="age" type="number" placeholder="Saisir votre age" name="age">
                    </div>

                    <div>
                        <label for="sexe">Sexe : </label>
                        <input id="sexe" type="text" placeholder="Saisir votre sexe" name="sexe">
                    </div>

                    <div>
                        <label for="adresse">Adresse : </label>
                        <input id="adresse" type="text" placeholder="Saisir votre adresse" name="adresse">
                    </div>

                    <div>
                        <label for="tel">Numéro de Sécurité Sociale : </label>
                        <input id="tel" type="number" placeholder="Saisir votre numéro de téléphone" name="tel">
                    </div>

                    <div>
                        <label for="nomU">Nom du contact d'urgence : </label>
                        <input id="nomU" type="text" placeholder="Saisir le nom du contact d'urgence" name="nomU">
                    </div>

                    <div>
                        <label for="prenomU">Prénom du contact d'urgence :</label>
                        <input id="prenomU" type="text" placeholder="Saisir le prénom du contact d'urgence" name="prenomU">
                    </div>

                    <div>
                        <label for="telU">Numéro de telephone du contact d'urgence : </label>
                        <input id="telU" type="number" placeholder="Saisir le numéro de téléphone du contact d'urgence" name="telU">
                    </div>

                    <div>
                        <label for="DMP">Dossier Medical Personnel : </label>
                        <input id="DMP" type="text" placeholder="Saisir votre Dossier Medical Personnel" name="DMP">
                    </div>

                    <div>
                        <label for="numSecu">Numéro de Sécurité Sociale : </label>
                        <input id="numSecu" type="number" placeholder="Saisir votre numéro de Sécurité Sociale" name="numSecu">
                    </div>
                    
                    <div>
                        <label for="identifiant">Nom Utilisateur: </label>
                        <input id="identifiant" type="text" placeholder="Saisir votre identifiant" name="identifiant">
                    </div>

                    <div>
                        <label for="password">password : </label>
                        <input id="password" type="password" placeholder="saisir votre password" name="password">
                    </div>

                    <div>
                        <label for="password2"> Confirmer le password : </label>
                        <input id="password2" type="password" placeholder="saisir de nouveau votre password" name="password2">
                    </div>
                    <div>
                        <input type="submit" value="Valider">
                    </div>
            </div>
            </form>
</ul>


</body>
</html>