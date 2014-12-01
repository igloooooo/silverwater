<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize access="isAuthenticated()">
    <sec:authentication property='principal.isUser' var="isUser"/>
    <sec:authentication property='principal.isMerchant' var="isMerchant"/>
    <sec:authentication property='principal.isAdmin' var="isAdmin"/>
</sec:authorize>
<!--start header -->
<header id="header">
	<div id="logo">
		<a href="/home"><strong>Broker</strong>Map</a>
	</div>
	<div id="searchbox">
		<form action="#">
			<input type="text" id="search" placeholder="Search" />
			<button type="submit"></button>
		</form>
	</div>
	<div id="navigation">
		<ul id="nav">
			<li class="selected"><a href="index.html">Home</a></li>
			<li><a href="browse.html">Browse</a>
				<ul>
					<li><a href="browse-result.html">Browse Result</a></li>
					<li><a href="browse-detail.html">Browse Detail</a></li>
				</ul>
			</li>
			<li><a href="blog.html">Blog</a></li>
			<li><a href="contact.html">Contact</a></li>
			<li><a href="element.html">Element</a></li>
		</ul>
	</div>
</header>
<!--end header -->