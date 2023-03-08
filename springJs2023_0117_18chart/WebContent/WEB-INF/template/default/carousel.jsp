<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.card {
	margin-bottom: 5%;
	min-height: 200px;
}

.card-caption h4 {
	margin-bottom: 8px;
	font-style: bold;
}

.card button {
	margin-top: 16px;
}

.card-text {
	margin: 8px 0;
	color: #232323;
}

#map {
	display: flex;
	width: 100%;
	min-height: 300px;
	height: 100%;
}
</style>


<div id="demo" class="carousel slide" data-bs-ride="carousel">
	<!-- Indicators/dots -->
	<div class="carousel-indicators">
		<button type="button" data-bs-target="#demo" data-bs-slide-to="0"
			class="active"></button>
		<button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
		<button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
		<button type="button" data-bs-target="#demo" data-bs-slide-to="3"></button>
		<button type="button" data-bs-target="#demo" data-bs-slide-to="4"></button>
		<button type="button" data-bs-target="#demo" data-bs-slide-to="5"></button>
	</div>

	<!-- The slideshow/carousel -->
	<div class="carousel-inner">
		<div class="carousel-item active">
			<c:choose>
				<c:when test="${sessionScope.sessionName != null }">
					<c:set var="imgv3" value="gsmj5.jpg" scope="page" />
				</c:when>
				<c:otherwise>
					<c:set var="imgv3" value="love6.png" scope="page" />
				</c:otherwise>
			</c:choose>

			<img
				src="${pageContext.request.contextPath}/resources/image/${imgv3}"
				alt="JSP" class="d-block" style="width: 100%">
			<h3>오프라인 jQuery 스터디 모임</h3>
			<p>
				<c:choose>
					<c:when test="${sessionScope.sessionName != null }">
				♥${sessionScope.sessionName }♥
				반가워요
				  <div class="card">
							<div class="row no-gutters">
								<div class="col-8">
									<div id="map"></div>
								</div>
								<div class="col-4">
									<div class="card-body">
										<h4 class="card-text">jQuery스터디 모임</h4>
										<p class="card-text">서울 금천구 가산디지털1로 151 2층 B강의실</p>
										<button type="button" class="btn btn-dark"
											onclick="alert('Open 준비중!')">jQuery스터디 모임 확인</button>
									</div>
								</div>
							</div>
						</div>
					</c:when>
					<c:otherwise>
				jQuery를 이용하여 제공받은 샘플파일에서 아래 요구사항대로 구현합니다
				
				로그인을 하면 장소를 확인할 수 있음
				</c:otherwise>
				</c:choose>
		</div>
		<div class="carousel-item">
			<c:choose>
				<c:when test="${sessionScope.sessionName != null }">
					<c:set var="imgv3" value="gsmj9.jpg" scope="page" />
				</c:when>
				<c:otherwise>
					<c:set var="imgv3" value="luvluv.png" scope="page" />
				</c:otherwise>
			</c:choose>

			<img
				src="${pageContext.request.contextPath}/resources/image/${imgv3}"
				alt="JSP" class="d-block" style="width: 100%">
			<div class="carousel-caption">
				<h3>조규성 강민지 백년해로</h3>
				<p>
					<c:choose>
						<c:when test="${sessionScope.sessionName != null }">
				♥${sessionScope.sessionName }♥
				</c:when>
						<c:otherwise>

						</c:otherwise>
					</c:choose>
			</div>
		</div>
		<div class="carousel-item">
			<c:choose>
				<c:when test="${sessionScope.sessionName != null }">
					<c:set var="imgv3" value="gsmj2.jpg" scope="page" />
				</c:when>
				<c:otherwise>
					<c:set var="imgv3" value="mylovegs.jpg" scope="page" />
				</c:otherwise>
			</c:choose>

			<img
				src="${pageContext.request.contextPath}/resources/image/${imgv3}"
				alt="JSP" class="d-block" style="width: 100%">
			<div class="carousel-caption">
				<h3>조규성 강민지 백년해로</h3>
				<p>
					<c:choose>
						<c:when test="${sessionScope.sessionName != null }">
				♥${sessionScope.sessionName }♥
				</c:when>
						<c:otherwise>

						</c:otherwise>
					</c:choose>
			</div>
		</div>
		<div class="carousel-item">
			<c:choose>
				<c:when test="${sessionScope.sessionName != null }">
					<c:set var="imgv3" value="gsmj6.jpg" scope="page" />
				</c:when>
				<c:otherwise>
					<c:set var="imgv3" value="love5.jpg" scope="page" />
				</c:otherwise>
			</c:choose>

			<img
				src="${pageContext.request.contextPath}/resources/image/${imgv3}"
				alt="JSP" class="d-block" style="width: 100%">
			<div class="carousel-caption">
				<h3>조규성 강민지 백년해로</h3>
				<p>
					<c:choose>
						<c:when test="${sessionScope.sessionName != null }">
				♥${sessionScope.sessionName }♥
				</c:when>
						<c:otherwise>

						</c:otherwise>
					</c:choose>
			</div>
		</div>
		<div class="carousel-item">
			<c:choose>
				<c:when test="${sessionScope.sessionName != null }">
					<c:set var="imgv3" value="gsmj7.jpg" scope="page" />
				</c:when>
				<c:otherwise>
					<c:set var="imgv3" value="aaa.jpg" scope="page" />
				</c:otherwise>
			</c:choose>

			<img
				src="${pageContext.request.contextPath}/resources/image/${imgv3}"
				alt="JSP" class="d-block" style="width: 100%">
			<div class="carousel-caption">
				<h3>조규성 강민지 백년해로</h3>
				<p>
					<c:choose>
						<c:when test="${sessionScope.sessionName != null }">
				♥${sessionScope.sessionName }♥
				</c:when>
						<c:otherwise>

						</c:otherwise>
					</c:choose>
			</div>
		</div>
	</div>

	<!-- Left and right controls/icons -->
	<button class="carousel-control-prev" type="button"
		data-bs-target="#demo" data-bs-slide="prev">
		<span class="carousel-control-prev-icon"></span>
	</button>
	<button class="carousel-control-next" type="button"
		data-bs-target="#demo" data-bs-slide="next">
		<span class="carousel-control-next-icon"></span>
	</button>
</div>
<!--카카오맵-->
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=76d9747761892c06621ff7e0fc700272&libraries=services"></script>
<script>
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	mapOption = {
		center : new kakao.maps.LatLng(37.477011, 126.879982), // 지도의 중심좌표
		level : 5
	// 지도의 확대 레벨
	};
	var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

	// 마커를 표시할 위치입니다 
	var position = new kakao.maps.LatLng(37.477011, 126.879982);

	// 마커를 생성합니다
	var marker = new kakao.maps.Marker({
		position : position,
		clickable : true
	// 마커를 클릭했을 때 지도의 클릭 이벤트가 발생하지 않도록 설정합니다
	});

	// 아래 코드는 위의 마커를 생성하는 코드에서 clickable: true 와 같이
	// 마커를 클릭했을 때 지도의 클릭 이벤트가 발생하지 않도록 설정합니다
	// marker.setClickable(true);

	// 마커를 지도에 표시합니다.
	marker.setMap(map);

	// 마커를 클릭했을 때 마커 위에 표시할 인포윈도우를 생성합니다
	var iwContent = '<div style="padding:5px; color: black">♥규성아 사랑해♥</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
	iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

	// 인포윈도우를 생성합니다
	var infowindow = new kakao.maps.InfoWindow({
		content : iwContent,
		removable : iwRemoveable
	});

	// 마커에 클릭이벤트를 등록합니다
	kakao.maps.event.addListener(marker, 'click', function() {
		// 마커 위에 인포윈도우를 표시합니다
		infowindow.open(map, marker);
	});
</script>