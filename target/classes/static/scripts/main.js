var postFormat = {
    method: 'POST',
    dataType: "json",
    contentType: "application/json"
};

var deleteFormat = {
    method: 'DELETE',
    dataType: "json",
    contentType: "application/json",
    success: function () {
        $('#messages').append("<div>Deleted Car 1 successfully! " + arguments + "</div>");

        $.post('/cars', postFormat, function () {
            $('#messages').append("<div>Created Car 1 again successfully!" + arguments + "</div>");
        });
    },
    error: function() {
        console.error("error on delete request");
        console.error(arguments);
    }
};

$(function () {
    $.post('/cars', postFormat, function () {
        $('#messages').append("<div>Created Car 1 successfully! " + arguments + "</div>");

        $.ajax('/cars/1', deleteFormat);
    });
});