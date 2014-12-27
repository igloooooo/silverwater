<%@ include file="../view/globe.jsp" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8">

    <title><decorator:title default="Welcome to BrokerMap."></decorator:title></title>

    <decorator:head />

    <!-- Basic Page Needs
    ================================================== -->
    <link rel="icon" type="image/x-icon" href="favicon.ico">


    <!-- Mobile Specific
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
    ================================================== -->
    <link rel="stylesheet" href="/assets/css/style.css" />
    <link rel="stylesheet" href="/assets/css/responsive.css" />
    <link rel="stylesheet" href="/assets/css/select2.css" />
    <%--<link href="/assets/wro/basic-header.min.css" rel="stylesheet">--%>

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
    <!--<script type="text/javascript" src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key=AIzaSyB3tShW1hLlV2lYW8_sCVln6TLF2bWvgU8"></script>-->
    <script type="text/javascript" src="/assets/js/jquery.googlemaps.1.01.min.js"></script>
    <script type="text/javascript" src="/assets/js/theme.js"></script>

    <!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>

<body class="home">
<div id="slider-wrap">
	<div class="camera_wrap" id="camera-wrap">
		<div data-src="/assets/images/uploads/1280x800/st-basil.jpg">

			<div class="camera_caption moveFromBottom camera_text_center">
				<div class="caption_slider h2">
					30% Discount : 3 days travel to Moscow
				</div>
			</div>

		</div>
		<div data-src="/assets/images/uploads/1280x800/castle-schwerin.jpg">

        	<div class="camera_caption moveFromLeft camera_text_center">
				<div class="caption_slider h2">
					Luxurious holiday in Castle
				</div>
			</div>

        </div>
		<div data-src="/assets/images/uploads/1280x800/moscow.jpg">

            <div class="camera_caption fadeIn camera_text_center">
				<div class="caption_slider h2">
					30% Discount : 3 days travel to Moscow
				</div>
			</div>

        </div>
		<div data-src="/assets/images/uploads/1280x800/temple-kyoto.jpg">

        	<div class="camera_caption moveFromBottom camera_text_center">
				<div class="caption_slider h2">
					Japan most interesting spot
				</div>
			</div>

        </div>


	</div><!--camera-wrap -->
</div>

<div id="wrapper">
	<div id="container">

        <%@include file="menu.jsp"%>

        <decorator:body/>

	</div>
	<!--container -->

    <%@include file="footer.jsp"%>

</div>
<!--wrapper -->

<script src="/assets/wro/basic-footer.min.js"></script>

</body>

</html>