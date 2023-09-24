function printError(elemId, hintMsg) {
  document.getElementById(elemId).innerHTML = hintMsg;
}

var form = document.getElementById("contact-form");
function handleForm(event) {
    event.preventDefault();
}
form.addEventListener('submit', handleForm);

function validateForm() {
  var name = document.contactForm.name.value;
  var email = document.contactForm.email.value;
  var country = document.contactForm.country.value;
  var gender = document.contactForm.gender.value;

  var nameErr = emailErr = countryErr = genderErr = true;

  if (name == "") {
    printError("nameErr", "Please Enter your Name");
  } else {
    var regex = /^[a-zA-Z\s]+$/;
    if (regex.test(name) === false) {
      printError("nameErr", "Please Enter the right name");
    } else {
      nameErr = false;
    }
  }

  if (email == "") {
    printError("emailErr", "Please Enter your Email");
  } else {
    var regex = /^\S+@\S+\.\S+$/;
    if (regex.test(email) === false) {
      printError("emailErr", "Please enter a valid email address");
    } else {
      emailErr = false;
    }
  }

  if (country == "Select") {
    printError("countryErr", "Please Enter your Country");
  } else {
    countryErr = false;
  }

  if (gender == "") {
    printError("nameErr", "Please Select your Gender");
  } else {
    genderErr = false;
  }


  if ((nameErr || emailErr || countryErr || genderErr) == true) {
    return false;
  } else if ((nameErr && emailErr && countryErr && genderErr) == false) {
    var dataPreview = "You've entered the following details: \n\n" + "Full Name: " + name + "\n" + "Email Address: " + email + "\n" + "Country: " + country + "\n" + "Gender: " + gender + "\n";
    alert(dataPreview);
    location.href = "home.html";
  } else {
    return false;
  }
}