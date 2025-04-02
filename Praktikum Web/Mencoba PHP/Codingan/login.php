<?php
require 'koneksi.php';
$email = $_POST["email"];
$password = $_POST["password"];

$query_sql = "SELECT * FROM tbl_users 
            WHERE email = '$email' AND password = '$password'";

$result = mysqli_query($conn, $query_sql);

if (mysqli_num_rows($result) > 0) {
    header("Location: dashboard.html");
} else {
    echo "<!DOCTYPE html>
<html lang='id'>
  <head>
    <meta charset='UTF-8' />
    <meta name='viewport' content='width=device-width, initial-scale=1.0' />
    <title>Login Gagal</title>
    <style>
      body {
        margin: 0;
        padding: 0;
        background: rgba(158, 203, 230, 0.9);
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        background-attachment: fixed;
        font-family: sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }

      .input {
        background: rgba(158, 203, 230, 0.9);
        padding: 40px;
        width: 350px;
        text-align: center;
        box-shadow: 0px 0px 25px 10px rgb(204, 232, 241);
        border-radius: 15px;
      }

      h1 {
        color: #fffcfc;
        margin-bottom: 10px;
        font-weight: bold; /* Membuat teks bold */
      }

      p {
        color: #ffffff;
        margin-bottom: 20px;
      }

      .login {
        display: inline-block;
        padding: 10px 20px;
        text-decoration: none;
        color: white;
        background-color: rgb(77, 138, 179);
        border-radius: 5px;
        font-size: 18px;
        text-transform: capitalize;
        letter-spacing: 2px;
        width: 100px;
        text-align: center;
        transition: background 0.3s;
      }

      .login:hover {
        background-color: rgba(53, 137, 189, 0.9);
      }

      .login:active {
        background-color: rgb(53, 137, 189);
      }
    </style>
  </head>
  <body>
    <div class='input'>
      <h1><b>Email atau Password Salah</b></h1>
      <p>Silahkan coba login kembali.</p>
      <a href='index.html' class='login'>Login</a>
    </div>
  </body>
</html>";
} 