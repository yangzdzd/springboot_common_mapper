<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>

</title>
<body>
<h2>Hello World!</h2>
<c:forEach items="${requestScope.list}" var="p">
    ${p.personId}-------${p.personName}------<c:if test="${p.sex==1}">男</c:if><c:if test="${p.sex==0}">女</c:if><br/>
</c:forEach>
</body>
</html>
