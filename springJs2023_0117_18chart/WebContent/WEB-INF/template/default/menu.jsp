<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand-sm mybgColor">
	<div class="container-fluid">
		<ul class="navbar-nav">
			<li class="nav-item"><a
				href="${pageContext.request.contextPath}/web/main"
				class="nav-link active">Home</a></li>
			<li class="nav-item"><a
				href="${pageContext.request.contextPath}/web/board/boardList"
				class="nav-link">Board(Paging Search)</a></li>
			<li class="nav-item"><a
				href="${pageContext.request.contextPath}/web/board/boardList1"
				class="nav-link">Board(No Paging)</a></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" role="button"
				data-bs-toggle="dropdown" aria-expanded="false"> Chart </a>
				<ul class="dropdown-menu">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/web/mychart/barchart">barChart</a></li>
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/web/mychart/donutchart">donutchart</a></li>
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/web/mychart/deptJsonDemo">deptJsonDemo</a></li>
							<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/web/mychart/memberListJsonDemo">memberListJsonDemo</a></li>
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/web/mychart/ajaxchart">ajaxChart</a></li>
							<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/web/mychart/ajaxchartTitle">ajaxChartTitle</a></li>
				</ul>
				</li>

			<li class="nav-item"><a
				href="${pageContext.request.contextPath}/web/upload/upform"
				class="nav-link">Upload</a></li>
			<li class="nav-item"><a
				href="${pageContext.request.contextPath}/web/survey/surveylist"
				class="nav-link">survey</a></li>
			<li class="nav-item"><a
				href="${pageContext.request.contextPath}/web/mail/emailForm"
				class="nav-link">Email</a></li>
		</ul>
		<form class="d-flex">
			<input class="form-control me-2" type="text" placeholder="Search"
				name="searchv" id="searchv">
			<button class="btn btn-primary" type="button">Search</button>
		</form>
	</div>
</nav>