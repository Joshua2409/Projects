<?php
    $conn = new mysqli('localhost', 'root','','mealkia2');
    $name=$_POST['name'];
    $email=$_POST['email'];
    $pass=$_POST['pass'];
    $phone=$_POST['phone'];
    // $birthday=$_POST['birthday'];
    $gender=$_POST['gender'];

       $sql = "INSERT INTO 'tbl_mealkia2' {"
?>