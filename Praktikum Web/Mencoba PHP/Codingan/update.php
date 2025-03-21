<?php
include 'config.php';

if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
}

$sql = "UPDATE daftar SET email='update@example.com' WHERE name='Nca'";

if ($conn->query($sql) === TRUE) {
    echo "Data berhasil diperbarui";
} else {
    echo "Error: " . $conn->error;
}
$conn->close();
?>
