/**
 * Created by nicholaszhu on 26/12/2014.
 */
jQuery(document).ready(function ($) {
    var size = 10;
    var from = 0;
    var suburb = $('#suburb_value').val();
    var q = $('#key_value').val();
    var source = $("#broker-template").html();
    var template = Handlebars.compile(source);
    $('#moreButton').click(function () {
        from = size + from;
        $.ajax({
            type: "GET",
            url: "/ws/search?q=" + q + "&suburb=" + suburb + "&from=" + from + "&size=10",
            contentType: 'application/json',
            success: function (data) {
                if (data && data.length > 0) {
                    $('.pagination').before(template({brokers: data}));
                }
                else {

                }
            }
        });
    })
});

