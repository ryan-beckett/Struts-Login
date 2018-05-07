<%@ page language="java"%>
<html>
<head>
<title>Welcome</title>
</head>
<body>
<body>
	<%
	     String username = (String) request.getAttribute("username");
	     String password = (String) request.getAttribute("password");
	%>
	<h2>
		Welcome
		<%=username%>!
	</h2>
	<br />
	<p>
		Your password is:
		<%=password%></p>
</body>
</body>
</html>