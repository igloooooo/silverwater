<%@include file="../globe.jsp" %>
<html>
<head>
    <meta name="description" content="service job search">
    <title><spring:message code="home.title"/></title>
</head>
<body>
<div class="subheader">
    <div class="left">
        <span class="page-title">Search</span>
        <span class="page-desc">Find your broker</span></div>
</div>
<!--subheader -->

<input type="hidden" id="suburb_value" value="${param.suburb}">
<input type="hidden" id="key_value" value="${param.q}">
<div id="content">
    <div class="one-third">


        <%@include file="left-search-bar.jsp"%>

        <div class="widget refine-search">
            <div class="h3 widget-title">
                Refine Your Search
            </div>
            <div class="widget-content">
                <h5>Stars</h5>
                <ul class="pointer">
                    <li>
                        <a href="#" class="sprite-stars star1">1 Star</a>
                        <small>12 Places</small>
                    </li>
                    <li>
                        <a href="#" class="sprite-stars star2">2 Star</a>
                        <small>12 Places</small>
                    </li>
                    <li>
                        <a href="#" class="sprite-stars star3">3 Star</a>
                        <small>12 Places</small>
                    </li>
                    <li>
                        <a href="#" class="sprite-stars star4">4 Star</a>
                        <small>12 Places</small>
                    </li>
                    <li>
                        <a href="#" class="sprite-stars star5">5 Star</a>
                        <small>12 Places</small>
                    </li>
                </ul>

                <h5>Price Range ($)</h5>
                <ul class="pointer">
                    <li>
                        <a href="#">10 - 20</a>
                        <small>23 Places</small>
                    </li>
                    <li>
                        <a href="#">20 - 30</a>
                        <small>12 Places</small>
                    </li>
                    <li>
                        <a href="#">30 - 40</a>
                        <small>19 Places</small>
                    </li>
                    <li>
                        <a href="#">40 - 50</a>
                        <small>11 Places</small>
                    </li>
                    <li>
                        <a href="#">&gt; 50</a>
                        <small>15 Places</small>
                    </li>
                </ul>

                <h5>Offer Type</h5>
                <ul class="pointer">
                    <li>
                        <a href="#">Late Deals</a>
                        <small>23 Places</small>
                    </li>
                    <li>
                        <a href="#">Half Terms</a>
                        <small>12 Places</small>
                    </li>
                    <li>
                        <a href="#">All Inclusive</a>
                        <small>19 Places</small>
                    </li>
                    <li>
                        <a href="#">Family Offers</a>
                        <small>11 Places</small>
                    </li>
                </ul>
            </div>
        </div>
        <!--widget -->
    </div>
    <!--one third -->

    <div class="two-third last">
        <c:forEach items="${brokerList}" var="broker">
            <div class="post-item post-thumb-hor">
                <div class="image-place">
                    <img src="${broker.imageFileName}" alt="image"/>
                </div>
                <div class="post-content">
                    <h2 class="post-title">${broker.name}</h2>
                    <p class="post-excerpt">${broker.title}</p>
                    <p class="post-excerpt">${broker.bio}</p>
                    <ul class="post-content-detail">
                        <li>
                            <span>Rating</span>
                            <strong class="sprite-stars star4">4 Stars</strong></li>
                        <li>
                            <span>Contact Number:</span>
                            <strong class="price">${broker.mobile}</strong></li>
                    </ul>
                </div>
                <div class="post-meta">
                    <span class="icon-place">
                        <c:forEach items="${broker.suburbList}" var="suburb">
                            ${suburb},
                        </c:forEach>
                    </span>
                    <span class="offer-type">All Inclusive</span>
                    <a class="read-more" href="/broker/${broker.canonicalSlugId}">Read More</a></div>
            </div>
            <!--post item -->
        </c:forEach>

        <p class="pagination">
            <a class="current" id="moreButton"><b>Load More Brokers</b></a>
        </p>
    </div>
    <!--two third -->

    <br class="clear"/>
</div>
<script id="broker-template" type="text/x-handlebars-template">
    {{#each brokers}}
    <div class="post-item post-thumb-hor">
        <div class="image-place">
            <img src="{{imageFileName}}" alt="image"/>
        </div>
        <div class="post-content">
            <h2 class="post-title">{{name}}</h2>
            <p class="post-excerpt">{{title}}</p>
            <p class="post-excerpt">{{bio}}</p>
            <ul class="post-content-detail">
                <li>
                    <span>Rating</span>
                    <strong class="sprite-stars star4">4 Stars</strong></li>
                <li>
                    <span>Contact Number</span>
                    <strong class="price">{{mobile}}</strong></li>
            </ul>
        </div>
        <div class="post-meta">
                    <span class="icon-place">
                        {{#each suburbList}}
                            {{suburb}},
                        {{/each}}
                    </span>
            <span class="offer-type">All Inclusive</span>
            <a class="read-more" href="/broker/{{broker.canonicalSlugId}}">Read More</a></div>
    </div>
    {{/each}}
</script>
<!--content -->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/broker/brokerSearch.js"></script>
</body>
</html>