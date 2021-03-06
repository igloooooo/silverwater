<%@ include file="../view/globe.jsp" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<!--[if IE 7 ]><html class="ie ie7" lang="en"><![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"><![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"><!--<![endif]-->
<head>

<!-- Basic Page Needs
================================================== -->
<meta charset="utf-8">
<title>TravelSite Theme</title>
<link rel="icon" type="image/x-icon" href="favicon.ico">


<!-- Mobile Specific
================================================== -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS
================================================== -->
<link rel="stylesheet" href="/assets/css/style.css" />
<link rel="stylesheet" href="/assets/css/responsive.css" />
<link rel="stylesheet" href="/assets/css/select2.css" />

<!-- Java Script
================================================== -->
<script type="text/javascript" src="/assets/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery-ui-1.8.24.custom.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.mobile.customized.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="/assets/js/camera.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.isotope.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="/assets/js/selectnav.min.js"></script>
<!--
<script type="text/javascript" src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key=AIzaSyB3tShW1hLlV2lYW8_sCVln6TLF2bWvgU8"></script>-->
<script type="text/javascript" src="/assets/js/jquery.googlemaps.1.01.min.js"></script>
<script type="text/javascript" src="/assets/js/theme.js"></script>

<!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
</head>

<body class="blog">

<div id="slider-wrap">
	<div class="camera_overlayer"></div>
</div>

<div id="wrapper">
	<div id="container">
		
        <%@include file="menu.jsp"%>

        <decorator:body/>

		<!--content -->
	
	</div>
	<!--container -->
	
    <%@include file="footer.jsp"%>
	
</div>
<!--wrapper -->
<script src="${pageContext.request.contextPath}/assets/js/handlebars-v2.0.0.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.raty.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/prettify.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/select2.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/silverwater.js"></script>
</body>
</html>