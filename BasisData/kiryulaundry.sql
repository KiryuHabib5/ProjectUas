-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2021 at 08:01 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kiryulaundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `nama`) VALUES
('KiryuHabib5', '12345', 'Habib');

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `estimasiBerat` int(2) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `jenisSabun` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `tanggal` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`id`, `username`, `estimasiBerat`, `kategori`, `jenisSabun`, `alamat`, `tanggal`, `Status`) VALUES
(4, 'boni', 5, 'Normal', 'Cair', 'Karawang', '', 'Kurir sedang menuju'),
(5, 'boni', 5, 'Normal', 'Cair', 'Karawang', '', 'Kurir sedang menuju'),
(6, 'boni', 5, 'Normal', 'Cair', 'Karawang', '', 'Kurir sedang menuju'),
(8, 'boni', 5, 'Normal', 'Cair', 'Karawang', '', 'Kurir sedang menuju'),
(9, 'boni', 5, 'Normal', 'Cair', 'Karawang', '2021-017-07', 'Kurir sedang menuju'),
(10, 'KiryuHabib10', 10, 'Very Expert', 'Cair', 'Cikarang', '2021-017-07', 'Kurir sedang menuju'),
(11, 'KiryuHabib10', 20, 'Normal', 'Bubuk', 'Cikarang', '2021-017-07', 'Kurir sedang menuju'),
(12, 'boni', 6, 'Normal', 'Bubuk', 'Karawang', '2021-017-07', 'Menunggu Konfirmasi'),
(13, 'boni', 6, 'Normal', 'Bubuk', 'karawang', '2021-017-07', 'Menunggu Konfirmasi'),
(14, 'boni', 100, 'Normal', 'Bubuk', 'Karawang', '2021-017-07', 'Menunggu Konfirmasi'),
(15, 'boni', 7, 'Expert', 'Bubuk', 'Cikarang', '2021-017-07', 'Menunggu Konfirmasi'),
(16, 'KiryuHabib10', 10, 'Expert', 'Cair', 'Cikarang', '2021-017-07', 'Menunggu Konfirmasi'),
(17, 'kiryuHabib1', 6, 'Very Expert', 'Cair', 'Cikarang', '2021-017-07', 'Menunggu Konfirmasi');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `nama`, `alamat`, `password`) VALUES
('Boni', 'Ibnu', 'Karawang', '12345'),
('Boni2', 'Ibnu', 'Karawang', '1234'),
('Boni3', 'Ibnu', 'Karawang', '123'),
('Boniii', 'Ibnu', 'Karawang', '12345'),
('KiryuHabib1', 'Ahmad Habib Husaini', 'Cikarang', '123'),
('KiryuHabib10', 'Ahmad Habib Husaini', 'Cikarang', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pesan`
--
ALTER TABLE `pesan`
  ADD CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
