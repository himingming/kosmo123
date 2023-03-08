<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<article>
	<header>
		<h1>[ȸ��ã��]deptJsonDemo.jsp</h1>
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
			<div>��ǥ�� : Ƽ�ƶ�-�ѹ�����</div>
		</div>
	</div>
</article>
<script>
/*
	//jQuery ����
	$(function() {
		$('#listBtn').click(
				function() {
					$.ajaxSetup({//Ajax ĳ�ø� ����
						cache : false
					});
					$.ajax({
						url : "../memberListJson",
						success : function(jsonData) {
							$('#target').html(""); // ��� ������ �ʰ� ����ִ°�
							console.log(jsonData);
							console.log(Object.keys(jsonData));
							console.log(typeof (jsonData));
							//json�����͸� jQueery�ݺ��� ����ؼ� ���
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
							
							//target�� �ڽ��� p�±׸� �����ؼ�
							//jQuery�� css�Լ��� ����� �������� css�����ų �� �ִ�
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
					title : "���� ������ ���� �ͳ���?",
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