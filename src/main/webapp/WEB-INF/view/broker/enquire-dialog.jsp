<%@ include file="../globe.jsp" %>
<div id="dialog-form" title="Create a new Enquire">
    <p class="validateTips">All form fields are required.</p>

    <form>
        <fieldset>
            <label for="enquireName">Your Name</label>
            <input type="text" name="enquireName" id="enquireName" value="Jane Smith" class="text ui-widget-content ui-corner-all">
            <label for="enquireEmail">Your Email</label>
            <input type="text" name="enquireEmail" id="enquireEmail" value="jane@smith.com" class="text ui-widget-content ui-corner-all">
            <label for="enquireMobile">Your Mobile</label>
            <input type="text" name="enquireMobile" id="enquireMobile" value="Jane Smith" class="text ui-widget-content ui-corner-all">
            <label for="enquireDescription">Enquire Description</label>
            <textarea type="text" name="enquireDescription" id="enquireDescription" value="Jane Smith" class="text ui-widget-content ui-corner-all">
            </textarea>

            <!-- Allow form submission with keyboard without duplicating the dialog button -->
            <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
            <input type="hidden" id="brokerKeyString" >
        </fieldset>
    </form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/enquire/enquire-dialog.js"></script>
