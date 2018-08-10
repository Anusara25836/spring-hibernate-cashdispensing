-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2018 at 09:28 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cashdispensing_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashdispensing`
--

CREATE TABLE `cashdispensing` (
  `id` int(11) NOT NULL,
  `number_of_thousand_card` int(11) NOT NULL,
  `number_of_fivehundred_card` int(11) NOT NULL,
  `number_of_hundred_card` int(11) NOT NULL,
  `number_of_fifty_card` int(11) NOT NULL,
  `number_of_twenty_card` int(11) NOT NULL,
  `number_of_thousand_card_dispensing` int(11) NOT NULL,
  `number_of_fivehundred_card_dispensing` int(11) NOT NULL,
  `number_of_hundred_card_dispensing` int(11) NOT NULL,
  `number_of_fifty_card_dispensing` int(11) NOT NULL,
  `number_of_twenty_card_dispensing` int(11) NOT NULL,
  `user_amount_enter` int(11) NOT NULL,
  `date_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashdispensing`
--

INSERT INTO `cashdispensing` (`id`, `number_of_thousand_card`, `number_of_fivehundred_card`, `number_of_hundred_card`, `number_of_fifty_card`, `number_of_twenty_card`, `number_of_thousand_card_dispensing`, `number_of_fivehundred_card_dispensing`, `number_of_hundred_card_dispensing`, `number_of_fifty_card_dispensing`, `number_of_twenty_card_dispensing`, `user_amount_enter`, `date_time`) VALUES
(1, 10, 100, 100, 100, 100, 90, 0, 0, 0, 0, 90000, '2018-08-10 06:42:09'),
(2, 10, 99, 96, 100, 100, 0, 1, 4, 0, 0, 900, '2018-08-10 06:42:25'),
(3, 0, 59, 96, 100, 100, 30, 40, 0, 0, 0, 30000, '2018-08-10 06:42:39'),
(4, 0, 0, 91, 100, 100, 0, 60, 5, 0, 0, 30000, '2018-08-10 06:42:48'),
(5, 0, 0, 0, 0, 55, 0, 0, 150, 118, 45, 15000, '2018-08-10 06:43:12'),
(6, 0, 10, 10, 10, 10, 10, 0, 0, 0, 0, 10000, '2018-08-10 07:25:13'),
(7, 0, 0, 10, 10, 10, 0, 10, 0, 0, 0, 5000, '2018-08-10 07:25:20'),
(8, 0, 0, 10, 10, 7, 0, 0, 0, 0, 3, 60, '2018-08-10 07:25:25'),
(9, 0, 0, 10, 9, 6, 0, 0, 0, 1, 1, 70, '2018-08-10 07:25:35'),
(10, 0, 0, 0, 9, 6, 0, 0, 10, 0, 0, 1000, '2018-08-10 07:25:53'),
(11, 0, 0, 0, 6, 6, 0, 0, 0, 3, 0, 150, '2018-08-10 07:26:06'),
(12, 0, 0, 0, 4, 6, 0, 0, 0, 2, 0, 100, '2018-08-10 07:26:13'),
(13, 0, 0, 0, 2, 6, 0, 0, 0, 2, 0, 100, '2018-08-10 07:26:19'),
(14, 0, 0, 0, 1, 5, 0, 0, 0, 1, 1, 70, '2018-08-10 07:26:24'),
(15, 0, 0, 0, 1, 1, 0, 0, 0, 0, 4, 80, '2018-08-10 07:26:35'),
(16, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 20, '2018-08-10 07:26:49');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashdispensing`
--
ALTER TABLE `cashdispensing`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashdispensing`
--
ALTER TABLE `cashdispensing`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
