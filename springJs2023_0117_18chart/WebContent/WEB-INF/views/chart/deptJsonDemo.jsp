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
			<input type="text" id="id" name="id" placeholder="���̵� �Է��ϼ���">
			<hr>
			<button id="jsonAjaxTest" style="width: auto;">Click</button>
			<div id="target" class="row justify-content-center">Target</div>
			<div>��ǥ�� : Ƽ�ƶ�-�ѹ�����</div>
		</div>
	</div>
</article>
<script>
	//jQuery ����
	$(function() {
		$('#jsonAjaxTest').click(
				function() {
					alert($('#id').val()+"�� �Է��ϼ̽��ϴ�");
					$.ajaxSetup({//Ajax ĳ�ø� ����
						cache : false
					});
					$.ajax({
						url : "../deptJsonView1?id="+$('#id').val(),
						success : function(jsonData) {
							$('#target').html(""); // ��� ������ �ʰ� ����ִ°�
							console.log("jsonData=>"+jsonData);
							console.log(Object.keys(jsonData));
							console.log(typeof (jsonData));
							//json�����͸� jQueery�ݺ��� ����ؼ� ���
							$.each(jsonData, function(k, v) {
								console.log(k + ":" + v);
								$('#target').append(
										"<p>" + k + ":" + v + "</p>");
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
</script>

</body>
</html>