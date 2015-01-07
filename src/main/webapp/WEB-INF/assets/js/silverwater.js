/**
 * Created with IntelliJ IDEA.
 * User: zhuhome
 * Date: 14-11-26
 * Time: 下午10:43
 * To change this template use File | Settings | File Templates.
 */

var BROKERMAP = BROKERMAP || {
    $addEnquire: function (enquireData) {
        $.ajax({
            type: "POST",
            url: "/ws/enquire",
            data: enquireData,
            contentType: 'application/json',
            success: function (data) {
                if (data.status == 'OK') alert('Your Enquire Has Been Created.');
                else alert('Failed to create enquire: ' + data.status + ', ' + data.errorMessage);
            }
        });
    }
}
