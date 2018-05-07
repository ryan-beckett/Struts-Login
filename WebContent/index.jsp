<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html:html>
<head>
<title>Struts Login</title>
</head>
<body>
	<h2>Struts Login</h2>
	<html:form action="/login" focus="username">
		<table>
			<tr>
				<td><bean:message key="label.username" /></td>
				<td><html:text property="username" /></td>
				<td><font color="red"><html:errors property="username" /></font></td>
			</tr>
			<tr>
				<td><bean:message key="label.password" /></td>
				<td><html:password property="password" /></td>
				<td><font color="red"><html:errors property="password" /></font></td>
			</tr>
			<tr>
				<td><html:submit /></td>
			</tr>
		</table>
	</html:form>
</body>
</html:html>