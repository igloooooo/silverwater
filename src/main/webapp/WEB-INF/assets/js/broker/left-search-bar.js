/**
 * Created by nicholaszhu on 25/12/2014.
 */
jQuery(document).ready(function ($) {
    $('#filterSuburb').select2({
        placeholder:"Suburb Select",
        allowClear: true,
        minimumInputLength: 3,
        ajax: { // instead of writing the function to execute the request we use Select2's convenient helper
            url: "/ws/geo/suburb",
            dataType: 'json',
            data: function (term, page) {
                return {
                    q: term,
                    page:page
                };
            },
            results: function (data, page) { // parse the results into the format expected by Select2.
                // since we are using custom formatting functions we do not need to alter remote JSON data
                return {results: data.suburbVOList};
            }
        }
    });
    $('#searchForm').submit(function(e){
        e.preventDefault();
        window.location.href = "/search?q=" + generateKeyword() + "&suburb=" + generateSuburb();
    });

    function generateKeyword(){
        return $('#keyword-text').val().replace(" ", "-");
    }

    function generateSuburb(){
        return $('#filterSuburb').val().replace(" ", "-");
    }
});
