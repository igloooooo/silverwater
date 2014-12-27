<%@include file="../globe.jsp" %>
<html>
<head>
    <meta name="description" content="service job search">
    <title><spring:message code="home.title"/></title>
</head>
<body>
    <div class="subheader">
        <div class="left">
            <span class="page-title">Browse</span>
            <span class="page-desc">Browse All Brokers</span></div>
    </div>
    <!--subheader -->


    <div id="content">
        <div class="tag-filter">
            <ul>
                <li><a class="selected" data-filter="*">All</a></li>
                <li><a data-filter=".new-broker">New</a></li>
                <li><a data-filter=".most-popular">Most Popular</a></li>
                <li><a data-filter=".latest-update">Latest Update</a></li>
            </ul>
        </div>

        <c:forEach items="${brokerList}" var="brokerVO">
        <div class="tag-filter-container">
            <div class="one-fourth ${brokerVO.category}">
                <div class="post-item">
                    <div class="image-place">
                        <img src="images/uploads/220x135/auckland-city.jpg" alt="image"/></div>
                    <div class="post-content">
                        <h2 class="post-title"><a href="browse-detail.html">${brokerVO.broker.name}</a></h2>

                        <p class="post-excerpt">${brokerVO.broker.title}</p>
                    </div>
                    <div class="post-meta">
                        <span class="comment-count">12 Comments</span>
                        <a class="read-more" href="/broker/${brokerVO.broker.canonicalSlugId}">Read More</a></div>
                </div>
            </div>

        </div>
        </c:forEach>
        <!--tag container -->

        <br class="clear"/>
    </div>
</body>
</html>