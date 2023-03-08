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
			<input type="text" id="id" name="id" placeholder="아이디를 입력하세요">
			<hr>
			<button id="jsonAjaxTest" style="width: auto;">Click</button>
			<div id="target" class="row justify-content-center">Target</div>
			<div>대표곡 : 티아라-넘버나인</div>
		</div>
	</div>
</article>
<script>
	//jQuery 시작
	$(function() {
		$('#jsonAjaxTest').click(
				function() {
					alert($('#id').val()+"을 입력하셨습니다");
					$.ajaxSetup({//Ajax 캐시를 삭제
						cache : false
					});
					$.ajax({
						url : "../deptJsonView1?id="+$('#id').val(),
						success : function(jsonData) {
							$('#target').html(""); // 계속 쌓이지 않게 비워주는거
							console.log("jsonData=>"+jsonData);
							console.log(Object.keys(jsonData));
							console.log(typeof (jsonData));
							//json데이터를 jQueery반복자 사용해서 출력
							$.each(jsonData, function(k, v) {
								console.log(k + ":" + v);
								$('#target').append(
										"<p>" + k + ":" + v + "</p>");
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
</script>

</body>
</html>