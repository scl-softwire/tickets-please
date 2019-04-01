$(document).ready(function () {

    // Variables
    var clickedTab = $(".tabs > .active");
    var tabWrapper = $(".game-area");

    // Show tab on page load
     $.ajax("/game/dvd", {
            success: function(response) {
                tabWrapper.html(response);
            }
        });

    $(".tabs > li").on("click", function () {

        // Remove class from active tab
        $(".tabs > li").removeClass("active");

        // Add class active to clicked tab
        $(this).addClass("active");

        // Update clickedTab variable
        clickedTab = $(".tabs .active");

        // fade out active tab
        tabWrapper.fadeOut(250, function () {

            // Refresh div content
            refreshContent(clickedTab);
            // Fade in active tab
            tabWrapper.delay(50).fadeIn(250);

        });
    });
});

function refreshContent(clickedTab) {
    var gameArea = $(".game-area");
    var url = "";
    if (clickedTab.html()==="DVD") {
        console.log("Switching to DVD");
        url = "/game/dvd";
    } else if (clickedTab.html()==="Dino") {
        console.log("Switching to Dino");
        url = "/game/dino";
    } else if (clickedTab.html()==="Tetris") {
         console.log("Switching to Tetris");
         url = "/game/tetris";
    } else if (clickedTab.html()==="Snake") {
             console.log("Switching to Snake");
             url = "/game/snake";
    } else if (clickedTab.html()==="Pac-man") {
        console.log("Switching to Pac-man");
        url = "/game/pacman";
    } else {
        console.log("Failed");
    }

    $.ajax(url, {
        success: function(response) {
            gameArea.html(response);
        }
    });
}

