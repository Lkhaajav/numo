$(document).ready(function(){

	headerApp.init();

});


const headerApp = {

	init : function() {

		console.log("headerApp")
		
	},

	menuClickEvent: function() {

        $(".depth1 li a, .depth2 li a, .userArea a").click(function() {

            const link = $(this);
            const url = $(link).attr("url");

            if(url) {

                let tabContentHtml = "";
                $.ajax({
                    type: "POST",
                    url: comm.getContextPath() + "/" + url + ".do",
                    async: false,
                    dataType: "html",
                    success: function(data) {
                        tabContentHtml = data;
                    }
                });

                $("#mainPage").html(tabContentHtml);

            }
        });
    },
}
