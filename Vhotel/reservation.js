document.getElementById("form").addEventListener
("submit",()=>{
  let username=document.getElementById("username").value;
  let email=document.getElementById("email").value;
  let gender=document.getElementById("gender");
  let password=document.getElementById("password").value;
  let confirm=document.getElementById("confirmpassword").value;
  let termm=document.getElementById("term").checked;
  
  if(username.length<5)
  {
   alert("Username must be more than 5")
  }
  if(!email.endsWith(".com"))
  {
  alert("Password must be end with .com")
  }
  if(!gender[0].checked && !gender[1].checked)
  {
    alert("gender must be selected")
  }
  if(date == "")
  {
  alert("please enter date of reservation")
  }
  if(dateout=="")
  {
  alert("please enter checkout date")
  }
  if(rooms=="")
  {
    alert("please select a room type")
  }
  if(!term)
  {
  alert("Terms must be agreed")
  }
})