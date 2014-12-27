<%@include file="../globe.jsp" %>
<html>
    <head>
        <meta name="description" content="${broker.name}">
        <title><spring:message code="home.title"/></title>
    </head>
    <body>
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

            <div class="one-third">


                <%@include file="left-search-bar.jsp"%>

                <div class="widget similiar-place">
                    <div class="h3 widget-title">
                        Similiar Place
                    </div>
                    <div class="widget-content">
                        <ul>
                            <li class="link-thumb">
                                <div class="link-image">
                                    <a href="#"><img src="images/uploads/50x50/mount-rushmore.jpg" alt="image"></a>
                                </div>
                                <div class="link-text">
                                    <h5><a href="#">Vivamus Place</a></h5>

                                    <p>
                                        <span class="place">Rushmore, USA</span><br/>
                                        <strong class="price">30$</strong> <span class="sprite-stars star4">4 stars</span>
                                    </p>
                                </div>
                            </li>
                            <li class="link-thumb">
                                <div class="link-image">
                                    <a href="#"><img src="images/uploads/50x50/rome.jpg" alt="image"></a>
                                </div>
                                <div class="link-text">
                                    <h5><a href="#">Maecenas Hotel</a></h5>

                                    <p>
                                        <span class="place">Rome, Italy</span><br/>
                                        <strong class="price">30$</strong> <span class="sprite-stars star4">4 stars</span>
                                    </p>
                                </div>
                            </li>
                            <li class="link-thumb">
                                <div class="link-image">
                                    <a href="#"><img src="images/uploads/50x50/royal-versailes.jpg" alt="image"></a>
                                </div>
                                <div class="link-text">
                                    <h5><a href="#">Nulla Place</a></h5>

                                    <p>
                                        <span class="place">Versailles, France</span><br/>
                                        <strong class="price">30$</strong> <span class="sprite-stars star4">4 stars</span>
                                    </p>
                                </div>
                            </li>
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
    </body>
</html>