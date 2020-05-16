function checkBillingAddress() {
    if ($("#theSameAsShippingAddress")) {
        $(".billingAddress").prop("disabled", true);
    } else {
        $(".billingAddress").prop("disabled", false);
    }
}

function checkPasswordMatch() {
    var password = $("#txtNewPassword").val();
    var confirmPassword = $("#txtConfirmPassword").val();

    if (password == "" && confirmPassword == "") {
        $("#checkPasswordMatch").html("");
        $("#updateUserInfoButton").prop("disabled", false);
    } else {
        if (password != confirmPassword) {
            $("#checkPasswordMatch").html("Passwords do not match!");
            $("#updateUserInfoButton").prop("disabled", true);
        } else if (password == confirmPassword && password.length > 8 && password.match(/[A-z]/) && password.match(/[A-Z]/) && password.match(/\d/)) {
            $("#checkPasswordMatch").html("Passwords match");
            $("#updateUserInfoButton").prop("disabled", false);
        } else {
            $("#checkPasswordMatch").html("The password should be longer than 8 charcters, contains at least one capital letter and one number");
            $("#updateUserInfoButton").prop("disabled", true);
        }
    }
}

$(document).ready(function () {
    $('.cartItemQty').on('change', function () {
        var id = this.id;
        $('#update-item-' + id).css('display', 'inline-block');
    });

    $("#theSameAsShippingAddress").on("click", checkBillingAddress);
    $("#txtNewPassword").keyup(checkPasswordMatch);
    $("#txtConfirmPassword").keyup(checkPasswordMatch);

});