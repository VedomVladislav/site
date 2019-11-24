<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%--<c:if test="${not empty hotels}">--%>
<%--<c:forEach var="hotel" items="${hotels}">--%>
<%--<span> ${hotel.id} ${hotel.name} ${hotel.stars} ${hotel.cityId} <br/> </span>--%>
<%--</c:forEach>--%>
<%--</c:if>--%>

<head>
    <title>ListHotels</title>
</head>
<body>
<p><a href="/site" target="_top"> Return to main page </a></p>

<table>
    <colgroup>
        <col span="1" style="background:Khaki">
        <!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы (если span = 2)-->
        <col style="background-color:#4cffde">
        <col style="background-color:#ff564f">
        <col style="background-color:#33d1ff">
        <col style="background-color:#2cff23">
        <col style="background-color:#d94cff">
    </colgroup>
    <tr>
        <th>ID</th>
        <th>NAME
        </td>
        <th>STARS
        </td>
        <th>CITYID
        </td>
    </tr>
    <c:if test="${not empty hotels}">
        <c:forEach items="${hotels}" var="hotel">
            <tr>
                <td>${hotel.id}</td>
                <td>${hotel.name}</td>
                <td>${hotel.stars}</td>
                <td>${hotel.cityId}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>