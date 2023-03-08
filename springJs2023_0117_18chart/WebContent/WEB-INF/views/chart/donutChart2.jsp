<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--2023. 1. 17. / Kosmo --%>

<!--file_name -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
<%--load c3.css --%>
<link href="${pageContext.request.contextPath}/resources/css/c3.css"
	rel="stylesheet">
<style></style>
<script
	src="${pageContext.request.contextPath}/resources/js/d3-5.8.2.min.js"
	charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/resources/js/c3.min.js"></script>
</head>
<body>
	<article>
		<ul class="list-unstyled">
			<li class="border-top my-3"></li>
		</ul>
		<div class="container">
			<div id="chart"></div>
		</div>
	</article>
	<script>
		//������ json�� �Ľ��� ������
		let jsondata = {

			���ɾ��� : 120,
			�𸨴ϴ� : 666,
			�񰡿ɴϴ� : 500,
			�ȿɴϴ� : 200,
			��ǳ�̿ɴϴ� : 54
		};
		
		console.log(jsondata[0]);

		//bar��Ʈ: �����Ϳ��� ������� �̸��� axis.x.category
		var chart = c3.generate({
			bindto : '#chart',
			data : {
				json : jsondata,
				
				type : 'donut'
			},
			donut : {
				title : "���� �������� ����"
			},

		});
	</script>

</body>
</html>