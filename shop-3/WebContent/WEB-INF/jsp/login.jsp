<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ include file="/WEB-INF/jsp/jsp_header.jsp"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div align="center" class="body">
<h2>�α��� ȭ��	</h2>
<form:form modelAttribute="user" method="post" action="login.html">
	<spring:hasBindErrors name="user">
		<font color="red"><c:forEach items="${errors.globalErrors}" var="error">
		<spring:message code="${error.code}" />
		</c:forEach></font>
	</spring:hasBindErrors>
	
	<table>
		<tr height="40px">
			<td>���� ID</td>
			<td><form:input path="userId" cssClass="userId"/><font color="red"><form:errors path="userId"/></font></td>
		</tr>
		<tr height ="40px">
			<td>�н�����</td>
			<td><form:password path="password" cssClass="password"/><font color="red"><form:errors path="password"/></font></td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td align="center"><input type="submit" value="LOGIN"></td>
			<td align="center"><input type="reset" value="RESET"></td>
		</tr>
	</table>

</form:form>


</div>



</body>
</html>