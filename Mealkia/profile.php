

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=<device-width>, initial-scale=0.1">
    <meta name="google-signin-client_id" content="YOUR_CLIENT_ID.apps.googleusercontent.com">
    <script src="profile.js" defer></script>
    <link rel="stylesheet" href="profile.css">
    <title>Mealkia</title>
</head>
<body>
    <div class="navbar">
        <a class ="logo" href="main.html">
            <img src="ASSETS/logo.png">
        </a>
        <div class="navbar-links">
            <ul>
                <li><a href="mealplan.html">Meal Plan</a></li>
                <li><a href="menu.html">Menus</a></li>
                <li><a href="aboutus.html">About Us</a></li>
            </ul>
        </div>
        <div class="navbar-right">
            <a class="profile" href="profile.html">
                <img src="ASSETS/301-3012711_png-file-profile-white-icon-png-removebg-preview.png" alt="" class="float-end" >
            </a>
        </div>
    </div>
    <div>
        
    </div>
    <div class="containerprofile">
        <div class="bgbox">
            <img class="pic-1" src="ASSETS/asd.png">
            <img class="pic-2" src="ASSETS/image.png">
            <div class="welcoming">
                <h2>Welcome to Mealkia,</h2>
                <p>The World of Flavors Awaits!</p>
            </div>
        </div>
        <div class="formsign">
            <form class="formss" id="signin-form" name="signinForm" onsubmit="validateForm()">
                <h2>Sign In</h2>
                <div class="row">
                    <!-- <label>Email Address</label> -->
                    <input type="email" name="email" placeholder="Email" required>
                    <div class="error" id="emailErr"></div>
                    
                </div>
                <div class="row">
                    <!-- <label>Password</label> -->
                    <input type="password" name="password" placeholder="Password" minlength="8" required>
                    <div class="error" id="passwordErr"></div>
                </div>
    
                <div class="login-btn">
                    <a href="main.html">
                        <input type="submit" value="Sign In" >
                    </a>
                    <a href="register.html">
                        <input type="button" value="Create an Account">
                    </a>
                </form>
                
    
                <script>
                    function onSuccess(googleUser) {
                      console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
                    }
                    function onFailure(error) {
                          console.log(error);
                    }
                    function renderButton() {
                        gapi.signin2.render('my-signin2', {
                            'scope': 'profile email',
                            'width': 290,
                            'height': 48,
                            'longtitle': true,
                            'theme': 'dark',
                            'onsuccess': onSuccess,
                            'onfailure': onFailure
                          });
                        }
                </script>
                <div class="sign" id="my-signin2">          
                </div>    
                <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
            </div>
            
    
        </div>
    </div>

    

</body>
<script src="profile.js" type="text/javascript"></script>
<footer>
    <div class="foot">
        <div class="col1">
            <h3>OUR COMPANY</h3>
            <p>Blog</p>
            <p>Careers</p>
            <p>Offices</p>
        </div>

        <div class="col2">
            <h3>BUSINESS</h3>
            <p>Become a Partner</p>
            <p>Influencers</p>
        </div>

        <div class="col3">
            <h3>CONTACT US</h3>
            <p>Mealkia Help Center</p>
            <p><a href="T&C.html"> Terms & Conditions</a></p>
        </div>

        <div class="col4">
            <h3>PAYMENT METHOD</h3>
            <img src="ASSETS/logo-gopay-vector.png">
            <img src="ASSETS/mastercard.png"><br>
            <img src="ASSETS/Visa_logo.png">
            <img src="ASSETS/Symbol-Paypal.png">
        </div>

        <div class="col5">
            <h3>SOCIAL MEDIA</h3>
        <div class="igsection">
            <a href="https://www.instagram.com/">
            <img src="ASSETS/instagram-logo-removebg-preview.png">
            <p>MealkiaID</p>
            </a>
        </div>
    </div>
    </div>

    
    <div class="footertext">
        <h1>©2023 PT MealkiaID Group . All right reserved.</h1>
    </div>
</footer>
</html>