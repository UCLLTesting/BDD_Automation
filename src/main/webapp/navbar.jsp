<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
        <a class="navbar-brand" href="Controller">BMI app</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
            <ul class="navbar-nav mr-auto">
                    <li class="nav-item<c:if test="${param.activePage eq 'persons'}"> active</c:if>">
                        <a class="nav-link" href="${pageContext.request.contextPath }/Controller?command=Overview">Registered patients</a>
                    </li>
            </ul>
        </div>
    </nav>
</header>