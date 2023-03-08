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
//함수만들기 미리보기
function deviceCheck() {
	//javascript 영역
	//javascript : 클라이언트에서 해석되는 인터프리터 언어이고, 객체지향 언어이다.
	//브라우저마다 엔진이 다르기 때문에 약간의 파싱의 차이가 있을 수 있다.
	//HTML5에서부터 표준화된 버전 => ECMA5~7 시리즈
	//변수선언은 var, let으로 한다.


	//alert(uerAgent);
	//console.log("userAgent :"+userAgent);
	var userAgent = navigator.userAgent.toLowerCase();
	//alert(userAgent);
	console.log("userAgent : "+ userAgent);
	//console.log("platform:"+platform);
	//indexOf() -> 찾지 못하면 -1
	console.log("indexOf() =>"+ userAgent.indexOf('android'))
	if (userAgent.indexOf('android') > -1 || userAgent.indexOf('iphone') > -1) {
	   console.log("mobile");
	   // location="이동할url"
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