<?php
include 'config.php';
if ($_SERVER["REQUEST_METHOD"] == "POST") {
 $name = $_POST['name'];
 $email = $_POST['email'];
 $password = $_POST['password'];
 $sql = "INSERT INTO daftar (name, email, password) VALUES
('$name', '$email', '$password')";
 if ($conn->query($sql) === TRUE) {
 echo "Data berhasil disimpan.";
 } else {
 echo "Error: " . $sql . "<br>" . $conn->error;
 }
 $conn->close();
}
?>