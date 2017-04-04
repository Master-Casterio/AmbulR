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

<h1>Nous contacter</h1>

<ul class="flex-Crea">
    <li class="flex-Crea2">
        <form class="form-horizontal" method="">

            <div class="FormeGoupe">
                <label for="lastname" class="col control-label">Nom <span>*</span></label>
                <div class="col">
                    <input type="text" class="FormControl" id="lastname" name="lastname" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="firstname" class="col control-label">Prénom <span>*</span></label>
                <div class="col">
                    <input type="text" class="FormControl" id="firstname" name="firstname" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="address" class="col control-label">Adresse</label>
                <div class="col">
                    <input type="text" class="FormControl" id="address" name="address" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="post_code" class="col control-label">Code postal</label>
                <div class="col">
                    <input type="text" class="FormControl" id="post_code" name="post_code" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="city" class="col control-label">Ville</label>
                <div class="col">
                    <input type="text" class="FormControl" id="city" name="city" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="country" class="col control-label">Pays</label>
                <div class="col">
                    <input type="text" class="FormControl" id="country" name="country" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="mail" class="col control-label">E-mail <span>*</span></label>
                <div class="col">
                    <input type="mail" class="FormControl" id="mail" name="mail" value="" placeholder=""
                           style="width: 500px; height: 20px;"/>
                </div>
            </div>
            <div class="FormeGoupe">
                <label for="message" class="col control-label">Votre message <span>*</span></label>
                <div class="col">
                <textarea class="FormControl" id="message" rows="3" name="message" placeholder=""
                          style="width: 500px; height: 250px;"></textarea>
                </div>
            </div>
            <div class="FormeGoupe text-center">
                <button type="submit" name="envoyer" value="ok" class="btn btn-default">Envoyer</button>
                &nbsp;&nbsp;&nbsp;
                <small>* Champ obligatoire</small>
            </div>


        </form>
    </li>
</ul>
</body>
</html>