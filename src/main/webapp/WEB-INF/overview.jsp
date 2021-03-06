<%-- 
    Document   : overview
    Created on : 19.02.2019, 16:34:22
    Author     : Fabian Hupe
    Content    : shows overview over one hotel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/templates" prefix="template"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<template:base>
   <jsp:attribute name="main">
        <form method="POST" name="select">
            <div>
                <label>
                    Hotelname: <c:out value="${hotel.hotelname}"></c:out>
                </label>
                </br>
                <label>
                    Ausstattung: 
                </label>
                </br>
                <ul style="text-align: center">
                    <c:forEach items="${hotelaus}" var="hotelausstattung">
                        <li style="display: inline">
                            • <c:out value="${hotelausstattung.ausstattung}"></c:out> (<c:out value="${hotelausstattung.anzahl}"></c:out>x)
                        </li>
                    </c:forEach>
                </ul>
                <label>
                    Ort: <c:out value="${hotel.ort}"></c:out>
                </label>
                </br>
                <label>
                    Sterne: <c:out value="${hotel.sterne}"></c:out>
                </label>
                </br>
                <label>
                    Entfernung zum Zentrum: <c:out value="${hotel.entfernung}"></c:out>km
                </label>
                </br>
                <label>
                    Preis / Nacht: <c:out value="${hotel.preisProNacht}"></c:out>€
                </label>
                </br>
                <button id="book" name="buttonBooking" value="buttonBooking">
                    Buchen
                </button>
            </div>
            </br>
        </form>
    </jsp:attribute>
</template:base>
