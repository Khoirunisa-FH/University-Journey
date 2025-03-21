<?php
include 'config.php';
$sql = "SELECT * FROM daftar";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
 while ($row = $result->fetch_assoc()) {
    echo "name: " . $row["name"] . " - email: " .
$row["email"] . " - password: " . $row["password"] . "<br>";
 }
} else {
 echo "Tidak ada data.";
}
$conn->close();
?>