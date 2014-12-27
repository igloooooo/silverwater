<%@ include file="../globe.jsp" %>
<div id="searchmodule">
    <ul class="tab-control">
        <li class="ui-tabs-selected"><a href="#hotel-search">Find Broker</a></li>
    </ul>
    <div id="hotel-search" class="tab-content">
        <form action="#" id="searchForm">
            <div class="field">
                <label for="keyword-text">Name, title or keywords:</label>
                <input type="text" id="keyword-text" class="input-text" placeholder="Name, title or keywords"
                       autocomplete="off"/>
            </div>
            <div class="field">
                <label for="filterSuburb">Suburb:</label>
                <input type='hidden' name="suburb" size="30" id="filterSuburb"
                       class="input-text populate placeholder select2-offscreen">
                </input>

            </div>

            <button type="submit" class="submit">Search</button>
            <br class="clear"/>
        </form>
    </div>
    <!--hotel search -->
</div>
<!--searchmodule -->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/broker/left-search-bar.js"></script>