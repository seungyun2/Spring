<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.lang.Math" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<script type="text/javascript">
function reload(){
	
	
	location.href="/Spring/bye.do"
	
}






</script>
</head>
<body onload="reload()">
인사말:<strong>${greeting}</strong>
Time: ${time * time}<br>
Time: ${time + time  + time}<br>
Time: ${time *time *time* time}<br>
Time: ${time * time  * time  * time  * time}<br>

</body>
</html>