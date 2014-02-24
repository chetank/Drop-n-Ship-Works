<%@ include file="jsp-tag.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<tiles:insertAttribute name="styles-script" />

</head>

<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="nav-bar">
		<tiles:insertAttribute name="nav-bar" />
	</div>
	<div id="main">
		<div id="status">
			<tiles:insertAttribute name="status" ignore="true" />
		</div>
		<tiles:insertAttribute name="main" />
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
