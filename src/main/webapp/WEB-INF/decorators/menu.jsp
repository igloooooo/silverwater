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
		<form action="/search">
			<input type="text" name="q" placeholder="Search" />
			<button type="submit"></button>
		</form>
	</div>
	<div id="navigation">
		<ul id="nav">
			<li class="selected"><a href="/home">Home</a></li>
			<li><a href="/howitworks">How it works</a>
			</li>
			<li><a href="/broker">Brokers</a></li>
			<li><a href="/aboutUs">About Us</a>
                <ul>
                    <li><a href="/company">Company</a></li>
                    <li><a href="/contact">Contact Us</a></li>
					<li><a href="/faq">FAQ</a></li>
				</ul>
            </li>
		</ul>
	</div>
</header>
<!--end header -->