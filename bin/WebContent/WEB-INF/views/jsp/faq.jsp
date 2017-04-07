<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>faq</title>
</head>
<body>
	<a href="#" onmouseover="over(question1)" onmouseout="out(question1)">1)
		Première Question</a>
	<div id="question1" style="display: none;">
		<ul>
			<li>réponse 1....</li>
			<li>réponse 1....</li>
			<li>réponse 1....</li>
		</ul>
	</div>
	<br />
	<br />
	<a href="#" onmouseover="over(question2)" onmouseout="out(question2)">2)
		Deuxième Question</a>
	<div id="question2" style="display: none;">
		<ul>
			<li>réponse 2...</li>
			<li>réponse 2...</li>
			<li>réponse 2...</li>
		</ul>
	</div>
	<br />
	<br />
	<a href="#" onmouseover="over(question3)" onmouseout="out(question3)">3)
		Troisième Question</a>
	<div id="ans3" style="display: none;">
		<ul>
			<li>réponse 3...</li>
			<li>réponse 3...</li>
			<li>réponse 3...</li>
		</ul>
	</div>
</body>
</html>