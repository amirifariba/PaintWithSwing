-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2017 at 11:21 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `paint`
--

-- --------------------------------------------------------

--
-- Table structure for table `shape`
--

CREATE TABLE `shape` (
  `ShapeId` int(11) NOT NULL,
  `shapeTypeId` int(11) DEFAULT NULL,
  `x1` int(11) DEFAULT NULL,
  `y1` int(11) DEFAULT NULL,
  `x2` int(11) DEFAULT NULL,
  `y2` int(11) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shape`
--

INSERT INTO `shape` (`ShapeId`, `shapeTypeId`, `x1`, `y1`, `x2`, `y2`, `color`, `userId`) VALUES
(1, 1, 206, 89, 320, 236, 'black', 1),
(2, 3, 45, 77, 128, 232, 'green', 1);

-- --------------------------------------------------------

--
-- Table structure for table `shapetype`
--

CREATE TABLE `shapetype` (
  `ShapeTypeId` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shapetype`
--

INSERT INTO `shapetype` (`ShapeTypeId`, `name`) VALUES
(1, 'line'),
(2, 'circle'),
(3, 'rectangle');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserId` int(11) NOT NULL,
  `UserName` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserId`, `UserName`, `password`) VALUES
(1, 'admin', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `shape`
--
ALTER TABLE `shape`
  ADD PRIMARY KEY (`ShapeId`);

--
-- Indexes for table `shapetype`
--
ALTER TABLE `shapetype`
  ADD PRIMARY KEY (`ShapeTypeId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `shape`
--
ALTER TABLE `shape`
  MODIFY `ShapeId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `shapetype`
--
ALTER TABLE `shapetype`
  MODIFY `ShapeTypeId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
