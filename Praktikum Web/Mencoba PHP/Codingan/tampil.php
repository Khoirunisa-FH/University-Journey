<?php
include 'koneksi.php';

$sql = "SELECT * FROM tbl_users";
$result = $conn->query($sql);

echo "<div class='container'>";
echo "<h2>Daftar Akun</h2>";
echo "<table>";
echo "<tr>";
echo "<th>Full Name</th>";
echo "<th>Username</th>";
echo "<th>Phone Number</th>";
echo "<th>Email</th>";
echo "<th>Password</th>";
echo "</tr>";

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        echo "<tr>";
        echo "<td>" . $row["fullname"] . "</td>";
        echo "<td>" . $row["username"] . "</td>";
        echo "<td>" . $row["phonenumber"] . "</td>";
        echo "<td>" . $row["email"] . "</td>";
        echo "<td>" . $row["password"] . "</td>";
        echo "</tr>";
    }
} else {
    echo "<tr><td colspan='5' class='no-data'>Tidak ada data.</td></tr>";
}

echo "</table>";
echo "</div>";

$conn->close();
?>

<style>
    body {
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        background-color: rgba(158, 203, 230, 0.9);
        color: white; 
    }
    .container {
        background: rgba(147, 195, 224, 0.9);
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(255, 255, 255, 0.9);
        text-align: center;
        width: 80%;
    }
    h2 {
        color: white; 
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 10px;
        color: white; 
    }
    th, td {
        border: 1px solid white;
        padding: 10px;
        text-align: left;
    }
    th {
        background-color: rgb(77, 138, 179);
    }
    .no-data {
        text-align: center;
        font-style: italic;
    }
</style>
