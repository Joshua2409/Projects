const toggleButton = document.getElementsByClassName('toggle-button')[0]
const navbarLinks = document.getElementsByClassName('navbar-links')[0]

toggleButton.addEventListener('click', () => {
    navbarLinks.classList.toggle('active')
});


function show(shown, hidden1, hidden2, hidden3) {
    document.getElementById(shown).style.display = "block";
    document.getElementById(hidden1).style.display = "none";
    document.getElementById(hidden2).style.display = "none";
    document.getElementById(hidden3).style.display = "none";
}