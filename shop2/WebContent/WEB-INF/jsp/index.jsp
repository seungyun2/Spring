<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ include file="/WEB-INF/jsp/jsp_header.jsp"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping3-1.css">

</head>
<body>

<div align="center" class="body">
<h2>��ǰ ��� ȭ��</h2>
<table border="1">
	<tr class="header">
		<th align="center" width="80">��ǰID</th>
		<th align="center" width="320">��ǰ��</th>
		<th align="center" width="100">����</th>
	</tr>
	
	
	<c:forEach items="${itemList}" var="item">
		<tr class="record">
			<td align="center">${item.itemId}</td>
			<td align="left"><a href="detail.html?itemId=${item.itemId}">${item.itemName}</a></td>
			<td align="right">${item.price}��</td>
		</tr>
	</c:forEach>
	
</table>
</div>
	
	
	

</body>
</html>