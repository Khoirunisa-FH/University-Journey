<?php
$host = "localhost";
$email = "root";
$password = "";
$database = "account";
$conn = new mysqli($host, $email , $password, $database);
if ($conn->connect_error) {
 die("Koneksi gagal: " . $conn->connect_error);
}
?>
