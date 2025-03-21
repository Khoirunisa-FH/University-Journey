<?php
include 'config.php';
if ($_SERVER["REQUEST_METHOD"] == "POST") {
 $email = $_POST['email'];
 $password = $_POST['password'];
 $sql = "INSERT INTO daftar_account (email, password) VALUES
('$email', '$password')";
 if ($conn->query($sql) === TRUE) {
 echo "Data berhasil disimpan.";
 } else {
 echo "Error: " . $sql . "<br>" . $conn->error;
 }
 $conn->close();
}
?>