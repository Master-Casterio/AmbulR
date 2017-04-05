<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<link type="text/css" rel="stylesheet" href="../css/main.css"
	media="screen,projection">


<title><tiles:insertAttribute name="title" /></title>

</head>

<body>


	<tiles:insertAttribute name="body" />

</body>

</html>