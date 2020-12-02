<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<jsp:include page="head-default.jsp">
    <jsp:param name="title" value="Patient Details"/>
</jsp:include>

<body>

<jsp:include page="navbar.jsp">
    <jsp:param name="activePage" value="persondetails"/>
</jsp:include>

<div class="container">
    <main>
        <h1>Patient Details</h1>
            <table class="table table-striped">
                <thead class="thead-light">
                    <tr>
                        <th scope="row">SSN</th>
                        <td><c:out value='${patient.SSN}'/></td>
                    </tr>
                    <tr>
                        <th scope="row">Birth Date</th>
                        <td><c:out value='${patient.birthDate}'/></td>
                    </tr>
                    <tr>
                        <th scope="row">Gender</th>
                        <td><c:out value='${patient.gender}'/></td>
                    </tr>
                </thead>
            </table>
        <table class="table table-striped">
            <thead class="thead-light">
            <tr>
                <th scope="row">Length</th>
                <td><c:out value='${patient.length}'/></td>
            </tr>
            <tr>
                <th scope="row">Weight</th>
                <td><c:out value='${patient.weight}'/></td>
            </tr>
            <tr>
                <th scope="row">Last Examination Date</th>
                <td><c:out value='${lastExaminationDate}'/></td>
            </tr>
            </thead>
        </table>
        <table class="table table-striped">
            <thead class="thead-light">
            <tr>
                <th scope="row">BMI</th>
                <td><c:out value='${bmi}'/></td>
            </tr>
            </thead>
        </table>
    </main>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>