// Setting up the Variables
var bars = document.getElementById("nav-action");
var nav = document.getElementById("nav");
var navShowing = false;

$(document).click(function (event) {
    var target = $(event.target);
    if (!(target.closest('#nav-list').length) && navShowing || target.closest('#nav-action').length) {
        barClicked();
    }
});

//setting up the clicked Effect
function barClicked() {
  bars.classList.toggle('active');
  nav.classList.toggle('visible');
  navShowing = !navShowing;
}