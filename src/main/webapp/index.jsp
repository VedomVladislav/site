<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Getting Started: Serving Web Content</title>
</head>
<body>

<p>Click to get all cities
    <form action="<c:url value="/cities" />" method="get" style="display: inline-block">
        <input type="submit" name="action" value="All cities">
    </form>
</p>
<p>Click to get all hotels
    <form action="<c:url value="/hotels" />" method="get" style="display: inline-block">
        <input type="submit" name="action" value="All hotels">
    </form>
</p>

<p>Enter ID to search city
<form action="<c:url value="/cities/${idCity}" />" method="get" style="display: inline-block">
    <input type="text" placeholder="City ID">
    <input type="submit" name = "action" value = "search">
</form>
</p>

<%--<form>--%>
<%--<p>Click to get all cities--%>
<%--<input type="button" value="All cities" onClick='location.href="cities/"'>--%>
<%--</p>--%>

<%--<p>Click to get all hotels--%>
<%--<input type="button" value="All hotels" onClick='location.href="hotels/"'>--%>
<%--</p>--%>
<%--</form>--%>

<%--<td>--%>
    <%--<p>Search city by ID--%>
        <%--<input type="text" placeholder="City ID" id="cityId">--%>
        <%--<input type="button" value="select" onClick='location.href="cities/"+document.getElementById("cityId").value'>--%>
    <%--</p>--%>
    <%--<p>Search hotel by ID--%>
        <%--<input type="text" placeholder="Hotel ID" id="hotelId">--%>
        <%--<input type="button" value="select" onClick='location.href="hotels/"+document.getElementById("hotelId").value'>--%>
    <%--</p>--%>
<%--</td>--%>

</body>
</html>