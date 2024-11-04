<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%-- <%@ taglib uri="https://jakarta.ee/jsp/jstl/core" prefix="c" %> --%>


<%@ taglib uri="jakarta.tags.core" prefix="c" %>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Name : ${userFilledData.name }</p>
	<p>User Name : ${userFilledData.userName }</p>
	<p>Password : ${userFilledData.password }</p>
	<p>Country : ${userFilledData.country }</p>


	<p>Hobbies :
		<c:forEach var="item" items="${userFilledData.hobbies}">
            ${item} 
        </c:forEach>
	</p>

	<p>Gender : ${userFilledData.gender }</p>

</body>
</html>