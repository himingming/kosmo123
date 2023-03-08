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
			<div id="chart"></div></div>
	</article>
	<script>
		//서버측 json을 파싱한 데이터
		const students = [];
		students.push({
			name : '구름',
			kor : 87,
			eng : 98,
			math : 88,
			scien : 90
		});
		students.push({
			name : '별이',
			kor : 92,
			eng : 98,
			math : 96,
			scien : 88
		});
		students.push({
			name : '겨울',
			kor : 76,
			eng : 96,
			math : 94,
			scien : 86
		});
		students.push({
			name : '바다',
			kor : 98,
			eng : 52,
			math : 98,
			scien : 92
		});
		console.log(students);

		//bar차트: 데이터에서 사용자의 이름을 axis.x.category
		var chart = c3.generate({
			bindto : '#chart',
			data : {
				json : students,
				keys : {
					// x: 'name', // it's possible to specify 'x' when category axis
					value : [ 'kor', 'eng', 'math', 'scien' ]
				},
				//data, type
				type : 'bar'
			},
			//
			axis : {
				x : {
					type : 'category',
					categories : [ students[0].name, students[1].name,
							students[2].name, students[3].name ]
				}
			}
		});
	</script>

</body>
</html>