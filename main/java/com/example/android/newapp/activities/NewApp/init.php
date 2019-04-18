<?php
$server_name = "localhost";
$user_name="root";
$user_pass="";
$db_name="webappdb";

$con = mysqli_connect($server_name,$user_name,$user_pass,$db_name);

if($con){
//echo "Connection success ... ";
}
else{
//echo "Connection failed ... "
}
?>