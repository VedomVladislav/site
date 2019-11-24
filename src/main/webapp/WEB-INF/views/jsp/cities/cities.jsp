<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%--<c:if test="${not empty cities}">--%>
    <%--<c:forEach var="city" items="${cities}">--%>
        <%--<span>${city.id} ${city.name}</span>--%>
    <%--</c:forEach>--%>
<%--</c:if>--%>

<head>
    <title>ListCities</title>
</head>
<body>
<p><a href="/site" target="_top"> Return to main page </a></p>

<table>
    <colgroup>
        <%--<col style="background-color:#4cffde">--%>
        <%--<col style="background-color:#ff564f">--%>
        <%--<col style="background-color:#33d1ff">--%>
        <col style="background-color:#2cff23">
        <col style="background-color:#d94cff">
    </colgroup>
    <tr>
        <th>ID</th>
        <th>NAME</td>
    </tr>
    <c:if test="${not empty cities}">
        <c:forEach items="${cities}" var="city">
            <tr>
                <td>${city.id}</td>
                <td>${city.name}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>