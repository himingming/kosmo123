<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>kosmo</title>
</head>
<body>


<script type="text/javascript">
//�Լ������ �̸�����
function deviceCheck() {
	//javascript ����
	//javascript : Ŭ���̾�Ʈ���� �ؼ��Ǵ� ���������� ����̰�, ��ü���� ����̴�.
	//���������� ������ �ٸ��� ������ �ణ�� �Ľ��� ���̰� ���� �� �ִ�.
	//HTML5�������� ǥ��ȭ�� ���� => ECMA5~7 �ø���
	//���������� var, let���� �Ѵ�.


	//alert(uerAgent);
	//console.log("userAgent :"+userAgent);
	var userAgent = navigator.userAgent.toLowerCase();
	//alert(userAgent);
	console.log("userAgent : "+ userAgent);
	//console.log("platform:"+platform);
	//indexOf() -> ã�� ���ϸ� -1
	console.log("indexOf() =>"+ userAgent.indexOf('android'))
	if (userAgent.indexOf('android') > -1 || userAgent.indexOf('iphone') > -1) {
	   console.log("mobile");
	   // location="�̵���url"
	   location="mobile/";
	} else {
	   console.log("PC");
	   location="web/";
	}
}
deviceCheck();
</script>
</body>
</html>