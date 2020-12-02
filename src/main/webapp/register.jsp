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
    <jsp:param name="activePage" value="register"/>
</jsp:include>

<div class="container">
    <main>
        <form method="post" action="Controller?command=Register">
            <p>
                <label for="ssn">SSN</label>
                <input type="text" id="ssn" name="ssn">
            </p>
            <p>
                <label for="gender">Gender</label>
                <input type="text" id="gender" name="gender">
            </p>
            <p>
                <label for="length">Length</label>
                <input type="number" id="length"  name="length">
            </p>
            <p>
                <label for="weight">Weight</label>
                <input type="number" id="weight" name="weight">
            </p>
            <p>
                <input type="submit" id="register" value="Register">
            </p>
        </form>
    </main>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>