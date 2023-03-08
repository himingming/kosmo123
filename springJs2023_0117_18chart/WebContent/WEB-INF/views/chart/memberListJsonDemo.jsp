<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<article>
	<header>
		<h1>[회원찾기]deptJsonDemo.jsp</h1>
	</header>
	<ul class="list-unstyled">
		<li class="border-top my-3"></li>
	</ul>
	<div class="container">
		<div class="row">
			<button id="listBtn" style="width: auto;">Click</button>
			<div class="row justify-content-center">
			<table class="table">
			<thead>
			<tr>
			<td>num</td>
			<td>id</td>
			<td>name</td>
			<td>age</td>
			<td>gender</td>
			</tr>
			</thead>
			<tbody id="target">
		
			</tbody>
			</table>
			</div>
			<div>대표곡 : 티아라-넘버나인</div>
		</div>
	</div>
</article>
<script>
/*
	//jQuery 시작
	$(function() {
		$('#listBtn').click(
				function() {
					$.ajaxSetup({//Ajax 캐시를 삭제
						cache : false
					});
					$.ajax({
						url : "../memberListJson",
						success : function(jsonData) {
							$('#target').html(""); // 계속 쌓이지 않게 비워주는거
							console.log(jsonData);
							console.log(Object.keys(jsonData));
							console.log(typeof (jsonData));
							//json데이터를 jQueery반복자 사용해서 출력
							$.each(jsonData, function(k, v) {
								console.log(k + ":" + v);
								$('#target').append(
										"<tr>" + k + ":" + v + "</tr>");
						
							$.each(v, function(dk, dv) {
								if(dv !== null)

								$('#target').append(
										"<td>" + dv + "</td>")
							});
							});
							
							//target의 자식인 p태그를 선택해서
							//jQuery의 css함수를 사용해 동적으로 css적용시킬 수 있다
							$('#target>p').css("background", "pink").css(
									"text-align", "center").css("color",
									"#fffff");
						}
					})
				});
	});
	*/
	$.ajaxSetup({
		cache : false
	});
	$.ajax({
		url : "../surveyJsonObj?num=21",
		success : function(jsondata) {
			var chart = c3.generate({
				bindto : '#chart',
				data : {
					json : [ jsondata ],
					keys : {
						value : Object.keys(jsondata),
					},
					type : 'donut'
				},
				donut : {
					title : "어디로 여행을 가고 싶나요?",
				},
			});
			//----------------------
		},
		error : function(e) {
			console.log("error:" + e);
		}
	});
</script>

</body>
</html>