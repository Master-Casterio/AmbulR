<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>






<ul class="flex-container4">
	<div class="sscont2">
		<img src="projetub.gif" width="500px" height="500px">
	</div>
	<div class="faischier">
		<form:form id="container10" action="inscription" method="get"
			modelAttribute="user">

			<table>

				<tr>
					<td><form:label path="nom">Nom :</form:label></td>
					<td><form:input path="nom" type="text" placeholder="Saisir le nom" /></td>
					<td><form:errors path="nom" /></td>
				</tr>
				<tr>
					<td><form:label path="prenom">Prénom :</form:label></td>
					<td><form:input type="text" placeholder="Saisir le prénom" path="prenom" /></td>
					<td><form:errors path="prenom" /></td>
				</tr>
					<td><form:label path="age">Age :</form:label></td>
					<td><form:input type="text" placeholder="Saisir le prénom"path="age" type="number"/></td>
					<td><form:errors path="age" type="number"/></td>
				</tr>
				<tr>
					<td><form:label path="sexe">Sexe :</form:label></td>
					<td><form:input type="text" placeholder="Saisir le sexe" path="sexe" /></td>
					<td><form:errors path="sexe" /></td>
				</tr>
				<tr>
					<td><form:label path="adresse">Adresse :</form:label></td>
					<td><form:input type="text" placeholder="Saisir l'adresse" path="adresse" /></td>
					<td><form:errors path="adresse" /></td>
				</tr>						
				<tr>
					<td><form:label path="tel">Numéro de telephone : </form:label></td>
					<td><form:input type="text" placeholder="Saisir le numéro de téléphone"path="tel" type="number"/></td>
					<td><form:errors path="tel" type="number"/></td>
				</tr>							
				<tr>
					<td><form:label path="nomU">Nom du contact d'urgence :</form:label></td>
					<td><form:input path="nomU" type="text" placeholder="Saisir le nom du contact d'urgenc" /></td>
					<td><form:errors path="nomU" /></td>
				</tr>
				<tr>
					<td><form:label path="prenomU">Prénom du contact d'urgence :</form:label></td>
					<td><form:input type="text" placeholder="Saisir le prénom du contact d'urgence" path="prenomU" /></td>
					<td><form:errors path="prenomU" /></td>
				</tr>
				<tr>
					<td><form:label path="telU">Numéro de telephone du contact d'urgence : </form:label></td>
					<td><form:input type="text" placeholder="Saisir le numéro de téléphone du contact d'urgence"path="telU" type="number"/></td>
					<td><form:errors path="telU" type="number"/></td>
				</tr>
				
					<td><form:label path="DMP">Dossier Medical Personnel :</form:label></td>
					<td><form:input type="text" placeholder="Saisir votre Dossier Medical Personnel" path="DMP" /></td>
					<td><form:errors path="DMP" /></td>
				</tr>
				<tr>
					<td><form:label path="numSecu">Numéro de Sécurité Sociale :</form:label></td>
					<td><form:input type="number" placeholder="Saisir le numéro de sécurité sociale :" path="numSecu"/></td>
					<td><form:errors path="numSecu" type="number"/></td>
				</tr>
				<tr>
					<td><form:label path="password">password :</form:label></td>
					<td><form:input type="number" placeholder="Saisir le mot de pass:"path="password" /></td>
					<td><form:errors path="password" type="number"/></td>
				</tr>
				<tr>
					<td><form:label path="password2">Confirmer le password :</form:label></td>
					<td><form:input type="number" placeholder="Saisir de nouveau votre password"path="password2"/></td>
					<td><form:errors path="password2" type="number"/></td>
				</tr>
				
								

				<div>
					<input type="submit" value="Valider">
				</div>
				</div>
				</form:form>
				</ul>