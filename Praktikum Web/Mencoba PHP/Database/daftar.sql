-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2025 at 05:21 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_users`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `fullname` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `phonenumber` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`fullname`, `username`, `phonenumber`, `email`, `password`) VALUES
('Dini Aprilia Frydayanti', 'diniapril', '08129876123', 'dini98@gmail.com', '123456'),
('Herpia Fitria Ningsih', 'herpiafn_21', '08136665321', 'herpia21@gmail.com', '987654'),
('Hikmah Fitria Ramadhani', 'hikmaa', '08125553888', 'hikmah99@gmail.com', 'letmein'),
('Intan Firli Safitri', 'tan_intan', '08123456711', 'intan23@gmail.com', 'qwerty'),
('Khoirunisa Fitri Handayani ', 'Ncaa', '082335292667 ', 'update@example.com', '2525');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`fullname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
