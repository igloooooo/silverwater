<%@include file="globe.jsp" %>
<html>
<head>
    <meta name="description" content="service job search">
    <title><spring:message code="home.title"/></title>
</head>
<body>
<!--start content -->
<section id="content">
    <div class="two-third">
        <div id="searchmodule" class="tabs">
            <ul class="tab-control">
                <li><a href="#quick-search">Quick Search</a></li>
                <li><a href="#local-search">Find Nearest</a></li>
                <li><a href="#advance-search">Advance</a></li>
            </ul>
            <div id="quick-search" class="tab-content">
                <form action="#">
                    <div class="field">
                        <label for="flight-from">From:</label>
                        <input type="text" id="flight-from" class="input-text" placeholder="Origin" autocomplete="off"/>
                    </div>
                    <div class="field">
                        <label for="flight-to">To:</label>
                        <input type="text" id="flight-to" class="input-text" placeholder="Destination"
                               autocomplete="off"/>
                    </div>
                    <div class="field half">
                        <label for="flight-depart">Depart:</label>
                        <input type="text" id="flight-depart" class="input-text input-cal" placeholder="2012-10-01"
                               autocomplete="off"/>
                    </div>
                    <div class="field half even">
                        <label for="flight-return">Return:</label>
                        <input type="text" id="flight-return" class="input-text input-cal" placeholder="2012-10-01"
                               autocomplete="off"/>
                    </div>
                    <div class="field half">
                        <label for="flight-class">Class:</label>
                        <select id="flight-class">
                            <option>Any</option>
                            <option>VIP</option>
                            <option>Business</option>
                        </select>
                    </div>
                    <div class="field half even">
                        <label for="flight-person">Person:</label>
                        <select id="flight-person">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                        </select>
                    </div>
                    <button type="submit" class="submit">Search</button>
                    <br class="clear"/>
                </form>
            </div>
            <!--flight search -->

            <div id="local-search" class="tab-content">
                <form action="#">
                    <div class="field">
                        <label for="hotel-to">City:</label>
                        <input type="text" id="hotel-to" class="input-text" placeholder="Destination"
                               autocomplete="off"/>
                    </div>
                    <div class="field half">
                        <label for="hotel-depart">Check-In:</label>
                        <input type="text" id="hotel-depart" class="input-text input-cal" placeholder="2012-10-01"
                               autocomplete="off"/>
                    </div>
                    <div class="field half even">
                        <label for="hotel-return">Check-Out:</label>
                        <input type="text" id="hotel-return" class="input-text input-cal" placeholder="2012-10-01"
                               autocomplete="off"/>
                    </div>
                    <div class="field half">
                        <label for="hotel-class">Class:</label>
                        <input type="text" id="hotel-class" class="input-text" autocomplete="off"/>
                    </div>
                    <div class="field half even">
                        <label for="hotel-room">Person:</label>
                        <select id="hotel-room">
                            <option>1</option>
                        </select>
                    </div>
                    <button type="submit" class="submit">Search</button>
                    <br class="clear"/>
                </form>
            </div>
            <!--hotel search -->

            <div id="advance-search" class="tab-content">
                <form action="#">
                    <div class="field">
                        <label for="travel-from">From:</label>
                        <input type="text" id="travel-from" class="input-text" placeholder="Origin" autocomplete="off"/>
                    </div>
                    <div class="field">
                        <label for="travel-to">To:</label>
                        <input type="text" id="travel-to" class="input-text" placeholder="Destination"
                               autocomplete="off"/>
                    </div>
                    <div class="field half">
                        <label for="travel-depart">Depart:</label>
                        <input type="text" id="travel-depart" class="input-text input-cal" placeholder="2012-10-01"
                               autocomplete="off"/>
                    </div>
                    <div class="field half even">
                        <label for="travel-return">Return:</label>
                        <input type="text" id="travel-return" class="input-text input-cal" placeholder="2012-10-01"
                               autocomplete="off"/>
                    </div>
                    <div class="field half">
                        <label for="travel-class">Class:</label>
                        <input type="text" id="travel-class" class="input-text" autocomplete="off"/>
                    </div>
                    <div class="field half even">
                        <label for="travel-person">Person:</label>
                        <select id="travel-person">
                            <option>1</option>
                        </select>
                    </div>
                    <button type="submit" class="submit">Search</button>
                    <br class="clear"/>
                </form>
            </div>
            <!--travel search -->
        </div>
    </div>
    <!--searchmodule -->

    <div class="one-third last">
        <div id="newsletter" class="module">
            <div class="module-content">
                <div class="module-content-wrap">
                    <div class="h3">Newsletter</div>
                    <p>Subscribe to get travel deals sent to your email each week!</p>

                    <p>
                        <label for="newsletter-email">Your Email :</label>
                        <input type="text" id="newsletter-email" class="input-text"/>
                    </p>

                    <div>
                        <button type="submit">Subscribe</button>
                    </div>

                    <br class="clear"/>
                </div>
            </div>
        </div>
    </div>
    <!--newsletter -->
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" title="网站模板">网站模板</a></div>
    <div class="hr">
        <hr/>
    </div>

    <div class="one-third">
        <h3 class="icon32 icon-tick thin">Smart Search</h3>

        <p>Your can search broker as any keyword as you like. BrokerMap will try to match as many broker as it can.</p>
    </div>

    <div class="one-third">
        <h3 class="icon32 icon-tick thin">Easy Enquire</h3>

        <p>You can send simple enquire to the broker which you like easily.</p>
    </div>

    <div class="one-third last">
        <h3 class="icon32 icon-tick thin">Quick Contact</h3>

        <p>You can quick contact broker by your email or phone number.</p>
    </div>

    <div class="hr">
        <hr/>
    </div>

    <!--newsection -->
    <div class="section-title">
        <span class="h3">Popular Brokers</span>
        <a class="right" href="/brokers">See all brokers</a>
    </div>
    <c:forEach items="${popularBrokers}" var="broker">
        <div class="one-fourth">
            <div class="post-item">
                <div class="image-place">
                    <img src="${broker.imageFileName}" alt="broker image"/>
                </div>
                <div class="post-content">
                    <h4 class="post-title">${broker.name}</h4>

                    <p class="post-excerpt">${broker.title}</p>
                </div>
                <div class="post-meta">
                    <span class="comment-count">12 Comments</span>
                    <a class="read-more" href="#">Read More</a>
                </div>
            </div>
        </div>
    </c:forEach>


    <br class="clear"/>

    <div class="action-box">
        <div class="left">
            <div class="action-title">Find your brokers</div>
            <div class="action-desc">There are thousand brokers in the BrokerMap and you can send enquire to them.
            </div>
        </div>
        <div class="right">
            <a class="button">
                Start to Find Brokers
            </a>
        </div>
    </div>
    <!--action-box -->


    <br class="clear"/>
</section>
<!--end content -->
</body>
</html>