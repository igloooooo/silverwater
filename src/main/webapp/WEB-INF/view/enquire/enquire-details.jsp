<%@include file="../globe.jsp"%><html>
<head>
    <meta name="description" content="Enquire Details">
    <title><spring:message code="enquire.title"/></title>
</head>
<body>
<div class="subheader">
    <div class="left">
        <span class="page-title">Enquire Details</span>
        <span class="page-desc">Enquire NO. is <b>${enquire.keyString}</b> </span>
    </div>
</div>
<!--subheader -->


<div id="content">

    <div class="post-item post-thumb-hor">
        <div class="image-place">
            <img src="images/uploads/620x220/temple-kyoto.jpg" alt="image"/>
        </div>
        <div class="post-content">
            <h2 class="post-title">${broker.name}</h2>

            <p class="post-excerpt">${broker.title}</p>
            <p class="post-excerpt">${broker.bio}</p>
            <ul class="post-content-detail">
                <li>
                    <span>Rating</span>
                    <strong class="sprite-stars star4">4 Stars</strong>
                </li>
                <li>
                    <span>Start From</span>
                    <strong class="price">$ 30</strong>
                </li>
            </ul>
        </div>
        <div class="post-meta">
            <span class="icon-place">${broker.phone}</span>
            <span class="offer-type">${broker.mobile}</span>
        </div>
    </div>
    <!--post item -->

    <br class="clear"/>
</div>
</body>
</html>