function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
  }
  
  var form = document.getElementById("signIn-form");
  function handleForm(event) {
      event.preventDefault();
  }
  form.addEventListener('submit', handleForm);

function validateForm(){
    var email = document.signInForm.email.value;
    var password = document.signInForm.password.value;

    var emailErr = passwordErr = true;
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
    if((emailErr || passwordErr) == true){
        return false;
    } else if((emailErr && passwordErr) == false){
        var dataPreview = "Welcome to Mealkia" + email;
        alert(dataPreview);
        location.href = "main.html";
    } else{
        return false;
    }
}

let popup = document.getElementById("popup");

function openPopup(){
    popup.classList.add("open-popup");
}

function closePopup(){
    popup.classList.remove("open-popup");
}

function myFunction() {
    var x = document.getElementById("myInput");
    if (x.type === "password") {
      x.type = "text";
    } else {
      x.type = "password";
    }
}