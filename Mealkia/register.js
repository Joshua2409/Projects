function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
  }
  
  var form = document.getElementById("signIn-form");
  function handleForm(event) {
      event.preventDefault();
  }
  form.addEventListener('submit', handleForm);

function validateForm(){
    var name = document.signInForm.name.value;
    var email = document.signInForm.email.value;
    var password = document.signInForm.password.value;
    var phone = document.signInForm.phone.value;
    var gender = document.signInForm.gender.value;


    var nameErr = emailErr = passwordErr = phoneErr = genderErr = true;
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
    if (email == ""){
        printError("emailErr", "Please Enter your Email");
    }
    else {
        var regex = /^\S+@\S+\.\S+$/;
        if (regex.test(email) === false) {
          printError("emailErr", "Please enter a valid email address");
        } else {
          emailErr = false;
        }
    }
    if(password = ""){
        printError("passwordErr", "Require Password");
    } else {
        var regex = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;
        if (regex.test(password) == false){
            printError("passwordErr", "Password Required!");
        }
        else{
            nameErr = false;
        }
    }
    if (phone == "") {
        printError("nameErr", "Please Enter your Phone Number");
      } else {
        var regex = /^\(?(\d{3})\)?[- ]?(\d{3})[- ]?(\d{4})$/;
        if (regex.test(name) === false) {
          printError("nameErr", "Please Enter your Phone Number");
        } else {
          nameErr = false;
        }
      }
    if (gender == "") {
        printError("nameErr", "Please Select your Gender");
      } else {
        genderErr = false;
      }
    if((nameErr || emailErr || passwordErr || phoneErr || genderErr) == true){
        return false;
    } else if((nameErr && emailErr && passwordErr && phoneErr && genderErr) == false){
        var dataPreview = "You've entered the following details: \n\n" + "Full Name: " + name + "\n" + "Email Address: " + email + "\n" + "Phone Number: " + phone + "\n" + "Gender: " + gender + "\n";
        alert(dataPreview);
        location.href = "profile.html";
    } else{
        return false;
    }
}

