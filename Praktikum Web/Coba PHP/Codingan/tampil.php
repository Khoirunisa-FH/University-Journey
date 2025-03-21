<?php
include 'config.php';
$sql = "SELECT * FROM daftar_account";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
 while ($row = $result->fetch_assoc()) {
 echo "email: " . $row["email"] . " - password: " .
$row["password"] . "<br>";
 }
} else {
 echo "Tidak ada data.";
}
$conn->close();
?>