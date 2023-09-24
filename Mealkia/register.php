<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="google-signin-client_id" content="YOUR_CLIENT_ID.apps.googleusercontent.com">
    <script src="profile.js" defer></script>
    <link rel="stylesheet" href="register.css">
    <title>Mealkia</title>
</head>
<body>
    <div class="navbar">
        <a class ="logo" href="main.html">
            <img src="ASSETS/image-removebg-preview.png">
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
    </div>

    <section>
        <form action="databaseProfile.php" method="post" class="formss" id="signin-form" name="signinForm"">
            <h2>Register</h2>
            <div class="row">
                <input type="text" name="name" placeholder="Name" >
                <div class="error" id="nameErr"></div>
                
            </div>
            <div class="row">
                <!-- <label>Email Address</label> -->
                <input type="email" name="email" placeholder="Email" >
                <div class="error" id="emailErr"></div>
                
            </div>
            <div class="row">
                <!-- <label>Password</label> -->
                <input type="pass" name="pass" placeholder="password" minlength="8" required>
                <div class="error" id="passwordErr"></div>
            </div>

            <div class="row">
                <input type="text" name="phone" placeholder="Phone Number" >
                <div class="error" id="phoneErr"></div>
                
            </div>

            <!-- <input type="date" id="birthday" name="birthday"> -->
            
            <div class="gen">
                <!-- <label>Gender</label> -->
                <div class="form-inline">
                    <label><input type="radio" name="gender" value="Male">Male</label>
                    <label><input type="radio" name="gender" value="Female">Female</label>
                </div>
                <div class="error" id="genderErr"></div>
            </div>

            <div class="login-btn">
                <a href="profile.html">
                    <!-- <input type="submit" value="Register" > -->
                    <button><a href="profile.html">Register</a></button>
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
        

    </section>

</body>
<script src="profile.js" type="text/javascript"></script>
<footer>
    <div class="foot">
        <div class="col1">
            <h4>OUR COMPANY</h4>
            <p>Blog</p>
            <p>Careers</p>
            <p>Offices</p>
        </div>

        <div class="col2">
            <h4>BUSINESS</h4>
            <p>Become a Partner</p>
            <p>Influencers</p>
        </div>

        <div class="col3">
            <h4>CONTACT US</h4>
            <p>Mealkia Help Center</p>
            <p><a href="T&C.html"> Terms & Conditions</a></p>
        </div>

        <div class="col4">
            <h4>PAYMENT METHOD</h4>
            <img src="ASSETS/shope.png">
            <img src="ASSETS/logo-gopay-vector.png"><br>
            <img src="ASSETS/mastercard.png">
            <img src="ASSETS/qris.png">
        </div>
        
        

        <div class="col5">
            <h4>SOCIAL MEDIA</h4>
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