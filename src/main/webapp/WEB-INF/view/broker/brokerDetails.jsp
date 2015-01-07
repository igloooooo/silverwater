<%@include file="../globe.jsp" %>
<html>
<head>
    <meta name="description" content="${broker.name}">
    <title><spring:message code="home.title"/></title>
</head>
<body>
<style>
    body {
        font-size: 62.5%;
    }

    input.text {
        margin-bottom: 12px;
        width: 95%;
        padding: .4em;
    }

    fieldset {
        padding: 0;
        border: 0;
        margin-top: 25px;
    }

    h1 {
        font-size: 1.2em;
        margin: .6em 0;
    }

    div#users-contain {
        width: 350px;
        margin: 20px 0;
    }

    div#users-contain table {
        margin: 1em 0;
        border-collapse: collapse;
        width: 100%;
    }

    div#users-contain table td, div#users-contain table th {
        border: 1px solid #eee;
        padding: .6em 10px;
        text-align: left;
    }

    .ui-dialog .ui-state-error {
        padding: .3em;
    }

    .validateTips {
        border: 1px solid transparent;
        padding: 0.3em;
    }
</style>

<div class="subheader">
    <div class="left">
        <span class="page-title">Broker Details</span>
        <span class="page-desc">Find the details of <b>${broker.name}</b> </span>
    </div>
</div>
<!--subheader -->


<div id="content">

    <div class="post-item post-thumb-hor">
        <div class="image-place">
            <img src="${broker.imageFileName}" alt="image"/>
        </div>
        <div class="post-content">
            <h2 class="post-title">${broker.name}</h2>

            <p class="post-excerpt">${broker.title}</p>

            <p class="post-excerpt">${broker.bio}</p>
            <p align="right">
                <a class="button medium navy" id="enquireButton">Enquire</a>
            </p>
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

    <div class="one-third">


        <%@include file="left-search-bar.jsp" %>

        <div class="widget similiar-place">
            <div class="h3 widget-title">
                Similar Brokers
            </div>
            <div class="widget-content">
                <ul>
                    <c:forEach items="${similarBrokers}" var="similarBroker">
                    <li class="link-thumb">
                        <div class="link-image">
                            <a href="/broker/${broker.canonicalSlugId}"><img src="${broker.imageFileName}" alt="image"></a>
                        </div>
                        <div class="link-text">
                            <h5><a href="#">${broker.name}</a></h5>

                            <p>
                                <span class="place">${broker.title}</span><br/>
                                <strong class="price">30$</strong> <span class="sprite-stars star4">4 stars</span>
                            </p>
                        </div>
                    </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <!--widget -->
    </div>
    <!--one third -->

    <div class="two-third last">

        <div class="module-box">

            <div class="flexslider">
                <ul class="slides">
                    <li><a href=""><img src="images/uploads/116x87/auckland-city.jpg" alt="image"/></a></li>
                    <li><a href=""><img src="images/uploads/116x87/egypt.jpg" alt="image"/></a></li>
                    <li><a href=""><img src="images/uploads/116x87/kyoto.jpg" alt="image"/></a></li>
                    <li><a href=""><img src="images/uploads/116x87/liberty.jpg" alt="image"/></a></li>
                    <li><a href=""><img src="images/uploads/116x87/rome.jpg" alt="image"/></a></li>
                    <li><a href=""><img src="images/uploads/116x87/mount-rushmore.jpg" alt="image"/></a></li>
                </ul>
            </div>

            <h3>Lorem ipsum dolor</h3>

            <p><img class="left" src="images/uploads/220x135/kyoto.jpg" alt="image"/>Lorem ipsum dolor sit amet,
                consectetur adipiscing elit. Etiam faucibus placerat risus, ac vulputate enim facilisis eu. In sodales
                lacinia elit, ut rhoncus risus consequat sit amet. Suspendisse potenti. Nam imperdiet lacinia aliquet.
                Donec odio risus, dignissim id placerat et, molestie sed ligula. Phasellus aliquam sodales pharetra.
                Donec ornare felis quis quam volutpat ut venenatis dui scelerisque.</p>

            <br class="clear"/>

            <div id="gmap" class="widget side-map"></div>

            <div class="one-half">
                <h3>Consectetur adipiscing elit</h3>

                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam faucibus placerat risus, ac vulputate
                    enim facilisis eu. In sodales lacinia elit, ut rhoncus risus consequat sit amet. Suspendisse
                    potenti. Nam imperdiet lacinia aliquet. Donec odio risus, dignissim id placerat et, molestie sed
                    ligula.</p>
            </div>
            <!--one-third -->

            <div class="one-half last">
                <h3>Donec odio risus</h3>

                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam faucibus placerat risus, ac vulputate
                    enim facilisis eu. In sodales lacinia elit, ut rhoncus risus consequat sit amet. Suspendisse
                    potenti. Nam imperdiet lacinia aliquet. Donec odio risus, dignissim id placerat et, molestie sed
                    ligula.</p>
            </div>
            <!--one-third -->

            <br class="clear"/>
        </div>
        <!--module-box -->
    </div>
    <!--two third -->

    <br class="clear"/>
</div>
<div id="dialog-form" title="Create a new Enquire">
    <p class="validateTips">All form fields are required.</p>

    <form>
        <fieldset>
            <label for="enquireName">Your Name</label>
            <input type="text" name="enquireName" id="enquireName" placeholder="Your Name" class="text ui-widget-content ui-corner-all">
            <label for="enquireEmail">Your Email</label>
            <input type="text" name="enquireEmail" id="enquireEmail" placeholder="Your Email" class="text ui-widget-content ui-corner-all">
            <label for="enquireMobile">Your Mobile</label>
            <input type="text" name="enquireMobile" id="enquireMobile" placeholder="Your Mobile" class="text ui-widget-content ui-corner-all">
            <label for="enquireDescription">Enquire Description</label>
            <textarea type="text" name="enquireDescription" id="enquireDescription" class="text ui-widget-content ui-corner-all" style="margin-bottom: 12px;width: 95%;padding: .4em; height: 130px;">
            </textarea>

            <!-- Allow form submission with keyboard without duplicating the dialog button -->
            <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
            <input type="hidden" id="brokerKeyString" value="${broker.keyString}">
        </fieldset>
    </form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/broker/broker-details.js"></script>
</body>
</html>