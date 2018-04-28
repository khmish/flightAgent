-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2018 at 06:16 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `airplane`
--

CREATE TABLE `airplane` (
  `Airplane_code` varchar(25) NOT NULL,
  `Airplane_total_sets` int(11) DEFAULT '50',
  `Airplane_Description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airplane`
--

INSERT INTO `airplane` (`Airplane_code`, `Airplane_total_sets`, `Airplane_Description`) VALUES
('2018-04-25T21:07:07.859', 101, 'airbus 300'),
('2018-04-27T19:16:31.833', 200, 'airbus 420'),
('2018-04-27T19:17:13.854', 10, 'airs'),
('2018-04-27T19:27:58.286', 101, 'airbus 300'),
('2018-04-28T04:06:04.176', 50, 'air1');

-- --------------------------------------------------------

--
-- Table structure for table `airport`
--

CREATE TABLE `airport` (
  `Airport_code` varchar(25) NOT NULL,
  `Airport_city` varchar(25) NOT NULL,
  `Airport_name` varchar(25) NOT NULL,
  `Airport_Description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airport`
--

INSERT INTO `airport` (`Airport_code`, `Airport_city`, `Airport_name`, `Airport_Description`) VALUES
('2018-04-25T21:48:13.747', 'Dammam', 'K Fahad airport int', 'Des'),
('2018-04-26T08:48:12.670', 'Riyadh', 'K khaled int', ''),
('2018-04-26T08:52:34.915', 'Jeddah', 'K Abdul Aziz', ''),
('2018-04-27T19:52:29.463', 'Hufof', 'int', ''),
('2018-04-28T04:20:13.263', 'Abha', 'Abbha', '');

-- --------------------------------------------------------

--
-- Stand-in structure for view `bookaflight`
-- (See below for the actual view)
--
CREATE TABLE `bookaflight` (
`Booking_Class_Code` int(11)
,`Booking_Status` int(11)
,`Stops_Booking_Code` varchar(50)
,`Stops_Flight_Number` varchar(25)
);

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `Booking_Code` varchar(50) NOT NULL,
  `Booking_Class_Code` int(11) DEFAULT '1',
  `Booking_Status` int(11) DEFAULT '0',
  `Booking_Number_of_Passanger` int(11) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`Booking_Code`, `Booking_Class_Code`, `Booking_Status`, `Booking_Number_of_Passanger`) VALUES
('01bea037-10ca-4db6-8a1f-f7780a87da2f', 1, 0, 1),
('02fb8565-dfa9-490a-90dd-80e36e961e6d', 1, 0, 1),
('06f53ff9-c6b6-45be-a301-87ec5f1664ae', 1, 0, 1),
('0727cbfc-76a9-4592-8c81-bb18c6586f6b', 1, 0, 1),
('075fa137-cbbf-4dde-a0ba-819e8995234b', 1, 0, 1),
('08d1812e-6aef-4ac7-bede-aa281b4b91f0', 1, 1, 1),
('0b1c60b6-2914-4d35-9eff-4bdaa0f75ef3', 1, 0, 1),
('0d7864ea-a182-4b23-9256-739ed6536afc', 1, 0, 1),
('0f123374-6f69-4315-a9d3-651f27b4f1b8', 1, 0, 1),
('11f88ed4-f65c-4479-a648-b9d2728e7994', 1, 0, 1),
('12df3096-4b2c-48bc-8e54-3002d0c25c48', 1, 1, 1),
('1536a321-8ebd-4626-ae01-778a52a081bb', 1, 0, 1),
('17d32a77-4497-4c50-ba73-f997b5f54221', 1, 0, 1),
('1887bace-4689-478f-bfac-d0eff7b6b876', 1, 0, 1),
('19bd6ea3-02ac-4150-a503-2cf509bc9bd6', 1, 0, 1),
('1df92eca-863a-4c16-bb3d-8c283f1e36b4', 1, 0, 1),
('229e68da-3222-4a71-ae4d-10d9a7f4ded5', 1, 0, 1),
('252519fe-6517-498a-abda-b648467e2b04', 1, 0, 1),
('284f56f0-31e4-417c-b061-a1e6807693a6', 1, 0, 1),
('2ff87a44-8384-4535-ae57-0c706907474a', 1, 0, 1),
('31238fba-e192-4b5b-8c7a-e55ef622224a', 1, 0, 1),
('320a1083-c06f-4c48-85ac-d82154f27205', 1, 0, 1),
('36a756a3-3930-4531-937c-32fd2263fffa', 1, 0, 1),
('36cf075c-bfeb-4d2f-bb6b-303a0b3b0b6a', 1, 0, 1),
('385f47f8-7fb6-40c1-b388-779039e791fe', 1, 0, 1),
('3893546c-f159-433c-88c3-398b08421ab5', 1, 0, 1),
('3a90d0cc-2878-4ca3-8847-78c4547c13b0', 1, 0, 1),
('3d3691c7-ce24-4a43-a61d-6eb60ddd7ee3', 1, 0, 1),
('40f9fdf9-5a7a-49f1-8f19-8a740b23a5bc', 1, 0, 1),
('43aa1816-9fc7-49dd-bf6a-6a6057b56ae0', 1, 0, 1),
('474eb126-d3f9-4c62-9a1e-76c3d6749c15', 1, 0, 1),
('49d7826f-31e3-4ba5-befc-33176005e8a0', 1, 0, 1),
('4a981999-a7cf-46ba-9edb-de48a2e11218', 1, 0, 1),
('4b4cda97-e7f5-4506-b0cc-3447e448294f', 1, 0, 1),
('4ef5a28f-b406-423c-bdc8-607864c3c192', 1, 0, 1),
('4f7141ff-c7c8-4497-a104-4b67613cff25', 1, 0, 1),
('4f9a5ad8-2412-4a05-be7e-c8980d230b19', 1, 0, 1),
('532f64fd-564c-48e8-a35e-d4cec24b9ee1', 1, 0, 1),
('5382239b-1345-4492-82b8-c54a87239c9e', 1, 0, 1),
('542fd5df-9c08-4478-808f-6b2f91c5eecd', 1, 0, 1),
('54cd5105-1b05-41e0-a3f2-55d44675bc7a', 1, 0, 1),
('558e5fbf-4faf-4c3b-8a1d-4ef16daf42ed', 1, 0, 1),
('5706258c-4fb9-43e9-99b1-7e3e429dec61', 1, 0, 1),
('61fcbf11-6650-4df7-8f46-0e547192d84b', 1, 0, 1),
('6278d503-a27d-4c78-acbc-b506635a3195', 1, 0, 1),
('63c80708-8dcd-40a4-9bf5-0957227b548d', 1, 0, 1),
('64ed530e-278d-462b-8564-78aade31a40c', 1, 0, 1),
('66f88c66-83b9-49d0-84d9-697644d3958b', 1, 0, 1),
('676a4974-53dc-4140-9b6a-c2a752b207a0', 1, 0, 1),
('68dba3a3-bf5f-4220-826d-7f368b6434cd', 1, 0, 1),
('699bebce-17c4-40e9-93a1-5b7c19eface9', 1, 0, 1),
('6b1bdc1f-e260-4798-8562-1f3c3a86b88a', 1, 0, 1),
('6b4c60f0-ab44-4373-855c-b85be191e4b2', 1, 0, 1),
('6c32cc28-10ac-4ff9-823b-d21a694d9839', 1, 0, 1),
('6cf5528a-742f-44c2-b981-d220583f0560', 1, 0, 1),
('6eff9101-6431-4406-87ab-f4b9d4a7e423', 1, 0, 1),
('7102e16a-c675-43b6-b76a-d2101b3272b9', 1, 0, 1),
('72242f10-3e12-41c4-ba70-e4fef4e2fb3e', 1, 0, 1),
('74ab6fdc-6077-40f1-bb3d-de21b2379598', 1, 0, 1),
('75a9c9d0-8f86-4805-b32d-e9a0a9117e20', 1, 0, 1),
('7a54f7c0-7c87-4547-8ecf-a9c043ee3c3a', 1, 0, 1),
('7a86a0e1-427b-42b0-b92a-a46cf4e03ebf', 1, 0, 1),
('7e4460ee-11d1-45bc-bd43-992668943c8c', 1, 0, 1),
('81f68333-f898-4df8-8356-3e40965f1e02', 1, 0, 1),
('84e60cc6-44a2-4651-bb31-4e1d6fab98a4', 1, 0, 1),
('84feb3c1-dde8-4203-9361-4f1cd897ce46', 1, 0, 1),
('87da8e5c-28a1-445d-8f35-5202b5c20c00', 1, 0, 1),
('88c67dfe-99c1-482e-a263-1f1df980311d', 1, 0, 1),
('8f27f25b-2d5b-4a1f-85f3-df3a4bd278c7', 1, 0, 1),
('8fc47a6f-6e18-4c20-b955-23ba63159231', 1, 0, 1),
('905c4df1-3e7f-4838-988b-1eeb02785d26', 1, 0, 1),
('91c0470b-cd4c-4890-a83e-1d8f0878893e', 1, 0, 1),
('92fe4814-1cf5-4b62-bb2b-753791140456', 1, 0, 1),
('93d3a125-4be4-4d89-9afc-ade1437a9721', 1, 0, 1),
('948fe19b-b102-43e2-a8b1-9f2920f0d94f', 1, 0, 1),
('9825a51d-75ac-4c14-8681-e542c9906cc7', 1, 0, 1),
('98cc7dad-546c-4b42-8cb7-1b4f617a8e2c', 1, 0, 1),
('9a0e8391-0910-4d7f-b48e-f6603df1c1be', 1, 0, 1),
('9b987ce1-62b9-4061-9cc0-d230f1b01928', 1, 0, 1),
('9c044840-d305-4695-8f40-4d865a6a749e', 1, 0, 1),
('9d0e6bf2-a0dc-4a70-b42d-b92e6e652646', 1, 0, 1),
('9db24508-8e17-4de3-b185-8424c5148508', 1, 0, 1),
('9fabf6e2-06b4-422c-9317-3d58310e6518', 1, 0, 1),
('a550eb26-440c-4ba6-8fb8-658550776779', 1, 0, 1),
('a9595e87-2707-4403-9101-a35360121c51', 1, 0, 1),
('a9b39e74-3ed3-46d0-ae34-a1f20dd8f4e1', 1, 0, 1),
('a9fc63af-e27f-4bde-a382-ee13dd1706ce', 1, 0, 1),
('ada22b9f-cb88-41ec-9b37-b0286b92677d', 1, 0, 1),
('aef431fa-92f5-43e8-a958-e9d0f666f374', 1, 0, 1),
('aef53818-3740-4d14-af25-4516e0167b41', 1, 0, 1),
('af279e89-863e-4abf-b51a-eb6aa2dd4d78', 1, 0, 1),
('afdce3d7-2e9e-473b-b739-138a506edc96', 1, 0, 1),
('b05d5be4-e768-452c-976b-cb29cd0bea8b', 1, 0, 1),
('b32a5f8e-a553-4308-bf43-fdd2e08c8fc0', 1, 0, 1),
('b88db0c7-a6a0-4dc9-ab38-61fce7c0903f', 1, 0, 1),
('bab4ee43-407a-47fd-9387-9cb892a5fc97', 1, 0, 1),
('babb4c5b-a6af-4723-bb1b-b4f0b89fc686', 1, 0, 1),
('bd4b62e1-39ca-4a68-8cbb-3e26524cdc6c', 1, 0, 1),
('be6fb829-de50-4c6a-94c4-795fef3bb306', 1, 0, 1),
('bf24d174-eb49-44cf-95f0-a07cabedcf84', 1, 0, 1),
('c0641d98-aacc-4507-a5df-fdc7642f2aab', 1, 0, 1),
('c0f75764-b8f9-4851-9e93-449e1a3977ff', 1, 0, 1),
('c3b4414e-1170-463f-a37c-501f6c6e0634', 1, 0, 1),
('c3deaac2-a7b0-4202-a6f8-8f7cd6346af5', 1, 0, 1),
('c40aa4cc-4fc5-4dfe-9ad0-effa19d19ea7', 1, 0, 1),
('c46d39f2-ee89-4c17-ab87-2c83652cbd10', 1, 0, 1),
('c8391d3b-4272-4d99-8624-757caea5a1cc', 1, 0, 1),
('c8b000c1-0d3f-41f9-a431-08643e67b6c9', 1, 0, 1),
('ca1724e6-fa37-41d0-8039-d7afbade1093', 1, 0, 1),
('cc7cc222-a2de-49aa-b3d8-92ddb75f64c1', 1, 0, 1),
('cdc12e32-0b07-4bf5-a024-479cdf1ab0be', 1, 0, 1),
('d4c49e1c-14a7-40f8-932b-90d688d229f8', 1, 0, 1),
('d510aefe-96bf-4c49-aa9d-f3698ac29e0c', 1, 0, 1),
('d51ea08a-efe5-4ee6-aa79-449e2f8ce04b', 1, 0, 1),
('d56e7f1e-20b6-43d4-aa97-3e1ed07707c7', 1, 0, 1),
('dbb038e8-2ba5-490a-bdba-fefa4a39bf26', 1, 0, 1),
('dbeedde5-bdfa-47d1-825c-59e6be11e60f', 1, 0, 1),
('e048e44d-b88e-496b-a02c-443f04912578', 1, 0, 1),
('e177b0c4-b317-4274-8ff2-eea584ccf4b0', 1, 0, 1),
('e5ea75c8-53d9-4728-8d72-a3a60814a022', 1, 0, 1),
('e6f9c891-e839-4d82-acce-17954b438019', 1, 0, 1),
('e9e84488-facb-4823-9641-0bff5a9d5d46', 1, 0, 1),
('ed3fc63d-9f30-41b6-8a96-a6ab0599e4a9', 1, 0, 1),
('ee55b812-a24a-4761-b560-b9ad178ab9c7', 1, 0, 1),
('f3c6ba97-8287-4e53-9102-34a87564480a', 1, 0, 1),
('f41cd5c8-024a-4403-b7de-fe703eb0dcd1', 1, 0, 1),
('f6001839-30f0-467b-8629-c8224c6e0235', 1, 0, 1),
('f96be90d-b1e1-4c5d-839b-2a91428d789d', 1, 0, 1),
('f9d2047e-5e07-4f8e-ad95-d43ca277694c', 1, 0, 1),
('fc1f64fb-3c65-4bf5-b9fd-2c412355983a', 1, 0, 1),
('fca2d716-3eb1-456c-b493-d241e926b21a', 1, 0, 1);

-- --------------------------------------------------------

--
-- Stand-in structure for view `bookingflights`
-- (See below for the actual view)
--
CREATE TABLE `bookingflights` (
`Booking_Users_Booking_Code` varchar(50)
,`Booking_Users_User_Id` varchar(25)
,`Booking_Class_Code` int(11)
,`Booking_Status` int(11)
,`Booking_Number_of_Passanger` int(11)
,`Stops_Booking_Code` varchar(50)
,`Stops_Flight_Number` varchar(25)
);

-- --------------------------------------------------------

--
-- Table structure for table `booking_users`
--

CREATE TABLE `booking_users` (
  `Booking_Users_User_Id` varchar(25) NOT NULL,
  `Booking_Users_Booking_Code` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking_users`
--

INSERT INTO `booking_users` (`Booking_Users_User_Id`, `Booking_Users_Booking_Code`) VALUES
('10014223', '08d1812e-6aef-4ac7-bede-aa281b4b91f0'),
('10014223', '12df3096-4b2c-48bc-8e54-3002d0c25c48');

-- --------------------------------------------------------

--
-- Table structure for table `class_booking`
--

CREATE TABLE `class_booking` (
  `Class_Code` int(11) NOT NULL,
  `Class_Name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class_booking`
--

INSERT INTO `class_booking` (`Class_Code`, `Class_Name`) VALUES
(1, 'Economey'),
(2, 'Business');

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `Flight_Number` varchar(25) NOT NULL,
  `Flight_Airplane_Code` varchar(25) NOT NULL,
  `Flight_From_Airport_Code` varchar(25) NOT NULL,
  `Flight_Distanation_Airport_Code` varchar(25) NOT NULL,
  `Flight_Depart_time` time DEFAULT NULL,
  `Flight_Arrival_time` time DEFAULT NULL,
  `Flight_Status` int(11) NOT NULL DEFAULT '0',
  `Flight_Captin_User_Id` varchar(25) DEFAULT NULL,
  `Flight_Depart_Date` date NOT NULL,
  `Flight_Arraival_Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`Flight_Number`, `Flight_Airplane_Code`, `Flight_From_Airport_Code`, `Flight_Distanation_Airport_Code`, `Flight_Depart_time`, `Flight_Arrival_time`, `Flight_Status`, `Flight_Captin_User_Id`, `Flight_Depart_Date`, `Flight_Arraival_Date`) VALUES
('2018-04-27T23:50:48.693', '2018-04-27T19:17:13.854', '2018-04-25T21:48:13.747', '2018-04-27T19:52:29.463', '23:50:00', '00:50:00', 0, '1564888896', '2018-04-27', '2018-04-27'),
('2018-04-28T00:00:13.301', '2018-04-27T19:17:13.854', '2018-04-27T19:52:29.463', '2018-04-26T08:52:34.915', '23:59:00', '00:59:00', 0, '1564888896', '2018-04-30', '2018-04-30'),
('2018-04-28T00:02:34.697', '2018-04-27T19:17:13.854', '2018-04-25T21:48:13.747', '2018-04-26T08:48:12.670', '00:02:00', '01:02:00', 0, '1564888896', '2018-04-29', '2018-04-29'),
('2018-04-28T03:42:55.197', '2018-04-27T19:27:58.286', '2018-04-26T08:48:12.670', '2018-04-27T19:52:29.463', '03:42:00', '04:42:00', 0, '1564888896', '2018-05-02', '2018-05-02');

-- --------------------------------------------------------

--
-- Stand-in structure for view `flighttimes`
-- (See below for the actual view)
--
CREATE TABLE `flighttimes` (
`Flight_Depart_Date` date
,`Flight_Arraival_Date` date
,`Flight_Arrival_time` time
,`Flight_Depart_time` time
,`Flight_Number` varchar(25)
,`Airplane_code` varchar(25)
,`Airplane_Description` varchar(100)
,`fcity` varchar(25)
,`fname` varchar(25)
,`dcity` varchar(25)
,`dname` varchar(25)
,`Flight_Distanation_Airport_Code` varchar(25)
,`Flight_From_Airport_Code` varchar(25)
,`User_LastName` varchar(25)
,`User_firstName` varchar(25)
,`Flight_Captin_User_Id` varchar(25)
);

-- --------------------------------------------------------

--
-- Table structure for table `stops`
--

CREATE TABLE `stops` (
  `Stops_Booking_Code` varchar(50) NOT NULL,
  `Stops_Flight_Number` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stops`
--

INSERT INTO `stops` (`Stops_Booking_Code`, `Stops_Flight_Number`) VALUES
('01bea037-10ca-4db6-8a1f-f7780a87da2f', '2018-04-28T03:42:55.197'),
('02fb8565-dfa9-490a-90dd-80e36e961e6d', '2018-04-28T03:42:55.197'),
('06f53ff9-c6b6-45be-a301-87ec5f1664ae', '2018-04-28T03:42:55.197'),
('0727cbfc-76a9-4592-8c81-bb18c6586f6b', '2018-04-28T03:42:55.197'),
('075fa137-cbbf-4dde-a0ba-819e8995234b', '2018-04-27T23:50:48.693'),
('08d1812e-6aef-4ac7-bede-aa281b4b91f0', '2018-04-28T00:02:34.697'),
('0b1c60b6-2914-4d35-9eff-4bdaa0f75ef3', '2018-04-28T03:42:55.197'),
('0d7864ea-a182-4b23-9256-739ed6536afc', '2018-04-28T03:42:55.197'),
('0f123374-6f69-4315-a9d3-651f27b4f1b8', '2018-04-28T03:42:55.197'),
('11f88ed4-f65c-4479-a648-b9d2728e7994', '2018-04-28T03:42:55.197'),
('12df3096-4b2c-48bc-8e54-3002d0c25c48', '2018-04-28T00:02:34.697'),
('1536a321-8ebd-4626-ae01-778a52a081bb', '2018-04-28T03:42:55.197'),
('17d32a77-4497-4c50-ba73-f997b5f54221', '2018-04-28T03:42:55.197'),
('1887bace-4689-478f-bfac-d0eff7b6b876', '2018-04-28T03:42:55.197'),
('19bd6ea3-02ac-4150-a503-2cf509bc9bd6', '2018-04-28T03:42:55.197'),
('1df92eca-863a-4c16-bb3d-8c283f1e36b4', '2018-04-28T03:42:55.197'),
('229e68da-3222-4a71-ae4d-10d9a7f4ded5', '2018-04-28T03:42:55.197'),
('252519fe-6517-498a-abda-b648467e2b04', '2018-04-28T03:42:55.197'),
('284f56f0-31e4-417c-b061-a1e6807693a6', '2018-04-28T03:42:55.197'),
('2ff87a44-8384-4535-ae57-0c706907474a', '2018-04-28T03:42:55.197'),
('31238fba-e192-4b5b-8c7a-e55ef622224a', '2018-04-28T03:42:55.197'),
('320a1083-c06f-4c48-85ac-d82154f27205', '2018-04-28T03:42:55.197'),
('36a756a3-3930-4531-937c-32fd2263fffa', '2018-04-28T03:42:55.197'),
('36cf075c-bfeb-4d2f-bb6b-303a0b3b0b6a', '2018-04-28T03:42:55.197'),
('385f47f8-7fb6-40c1-b388-779039e791fe', '2018-04-28T00:02:34.697'),
('3893546c-f159-433c-88c3-398b08421ab5', '2018-04-28T03:42:55.197'),
('3a90d0cc-2878-4ca3-8847-78c4547c13b0', '2018-04-28T03:42:55.197'),
('3d3691c7-ce24-4a43-a61d-6eb60ddd7ee3', '2018-04-27T23:50:48.693'),
('40f9fdf9-5a7a-49f1-8f19-8a740b23a5bc', '2018-04-28T03:42:55.197'),
('43aa1816-9fc7-49dd-bf6a-6a6057b56ae0', '2018-04-28T03:42:55.197'),
('474eb126-d3f9-4c62-9a1e-76c3d6749c15', '2018-04-28T03:42:55.197'),
('49d7826f-31e3-4ba5-befc-33176005e8a0', '2018-04-28T03:42:55.197'),
('4a981999-a7cf-46ba-9edb-de48a2e11218', '2018-04-28T00:02:34.697'),
('4b4cda97-e7f5-4506-b0cc-3447e448294f', '2018-04-28T03:42:55.197'),
('4ef5a28f-b406-423c-bdc8-607864c3c192', '2018-04-28T03:42:55.197'),
('4f7141ff-c7c8-4497-a104-4b67613cff25', '2018-04-28T03:42:55.197'),
('4f9a5ad8-2412-4a05-be7e-c8980d230b19', '2018-04-28T03:42:55.197'),
('532f64fd-564c-48e8-a35e-d4cec24b9ee1', '2018-04-28T03:42:55.197'),
('5382239b-1345-4492-82b8-c54a87239c9e', '2018-04-28T03:42:55.197'),
('542fd5df-9c08-4478-808f-6b2f91c5eecd', '2018-04-28T03:42:55.197'),
('54cd5105-1b05-41e0-a3f2-55d44675bc7a', '2018-04-28T03:42:55.197'),
('558e5fbf-4faf-4c3b-8a1d-4ef16daf42ed', '2018-04-28T03:42:55.197'),
('5706258c-4fb9-43e9-99b1-7e3e429dec61', '2018-04-28T00:00:13.301'),
('61fcbf11-6650-4df7-8f46-0e547192d84b', '2018-04-28T03:42:55.197'),
('6278d503-a27d-4c78-acbc-b506635a3195', '2018-04-28T00:02:34.697'),
('63c80708-8dcd-40a4-9bf5-0957227b548d', '2018-04-28T00:00:13.301'),
('64ed530e-278d-462b-8564-78aade31a40c', '2018-04-28T03:42:55.197'),
('66f88c66-83b9-49d0-84d9-697644d3958b', '2018-04-28T03:42:55.197'),
('676a4974-53dc-4140-9b6a-c2a752b207a0', '2018-04-28T00:00:13.301'),
('68dba3a3-bf5f-4220-826d-7f368b6434cd', '2018-04-28T03:42:55.197'),
('699bebce-17c4-40e9-93a1-5b7c19eface9', '2018-04-28T03:42:55.197'),
('6b1bdc1f-e260-4798-8562-1f3c3a86b88a', '2018-04-27T23:50:48.693'),
('6b4c60f0-ab44-4373-855c-b85be191e4b2', '2018-04-28T00:02:34.697'),
('6c32cc28-10ac-4ff9-823b-d21a694d9839', '2018-04-28T03:42:55.197'),
('6cf5528a-742f-44c2-b981-d220583f0560', '2018-04-28T03:42:55.197'),
('6eff9101-6431-4406-87ab-f4b9d4a7e423', '2018-04-28T03:42:55.197'),
('7102e16a-c675-43b6-b76a-d2101b3272b9', '2018-04-28T00:00:13.301'),
('72242f10-3e12-41c4-ba70-e4fef4e2fb3e', '2018-04-28T03:42:55.197'),
('74ab6fdc-6077-40f1-bb3d-de21b2379598', '2018-04-27T23:50:48.693'),
('75a9c9d0-8f86-4805-b32d-e9a0a9117e20', '2018-04-28T03:42:55.197'),
('7a54f7c0-7c87-4547-8ecf-a9c043ee3c3a', '2018-04-28T03:42:55.197'),
('7a86a0e1-427b-42b0-b92a-a46cf4e03ebf', '2018-04-28T03:42:55.197'),
('7e4460ee-11d1-45bc-bd43-992668943c8c', '2018-04-27T23:50:48.693'),
('81f68333-f898-4df8-8356-3e40965f1e02', '2018-04-27T23:50:48.693'),
('84e60cc6-44a2-4651-bb31-4e1d6fab98a4', '2018-04-28T03:42:55.197'),
('84feb3c1-dde8-4203-9361-4f1cd897ce46', '2018-04-28T00:00:13.301'),
('87da8e5c-28a1-445d-8f35-5202b5c20c00', '2018-04-28T03:42:55.197'),
('88c67dfe-99c1-482e-a263-1f1df980311d', '2018-04-28T03:42:55.197'),
('8f27f25b-2d5b-4a1f-85f3-df3a4bd278c7', '2018-04-28T03:42:55.197'),
('8fc47a6f-6e18-4c20-b955-23ba63159231', '2018-04-28T03:42:55.197'),
('905c4df1-3e7f-4838-988b-1eeb02785d26', '2018-04-28T00:02:34.697'),
('91c0470b-cd4c-4890-a83e-1d8f0878893e', '2018-04-28T03:42:55.197'),
('92fe4814-1cf5-4b62-bb2b-753791140456', '2018-04-28T03:42:55.197'),
('93d3a125-4be4-4d89-9afc-ade1437a9721', '2018-04-28T03:42:55.197'),
('948fe19b-b102-43e2-a8b1-9f2920f0d94f', '2018-04-28T00:00:13.301'),
('9825a51d-75ac-4c14-8681-e542c9906cc7', '2018-04-28T03:42:55.197'),
('98cc7dad-546c-4b42-8cb7-1b4f617a8e2c', '2018-04-28T03:42:55.197'),
('9a0e8391-0910-4d7f-b48e-f6603df1c1be', '2018-04-28T03:42:55.197'),
('9b987ce1-62b9-4061-9cc0-d230f1b01928', '2018-04-28T03:42:55.197'),
('9c044840-d305-4695-8f40-4d865a6a749e', '2018-04-28T03:42:55.197'),
('9d0e6bf2-a0dc-4a70-b42d-b92e6e652646', '2018-04-28T00:02:34.697'),
('9db24508-8e17-4de3-b185-8424c5148508', '2018-04-28T03:42:55.197'),
('9fabf6e2-06b4-422c-9317-3d58310e6518', '2018-04-28T03:42:55.197'),
('a550eb26-440c-4ba6-8fb8-658550776779', '2018-04-28T03:42:55.197'),
('a9595e87-2707-4403-9101-a35360121c51', '2018-04-28T03:42:55.197'),
('a9b39e74-3ed3-46d0-ae34-a1f20dd8f4e1', '2018-04-28T00:00:13.301'),
('a9fc63af-e27f-4bde-a382-ee13dd1706ce', '2018-04-28T03:42:55.197'),
('ada22b9f-cb88-41ec-9b37-b0286b92677d', '2018-04-28T03:42:55.197'),
('aef431fa-92f5-43e8-a958-e9d0f666f374', '2018-04-28T00:00:13.301'),
('aef53818-3740-4d14-af25-4516e0167b41', '2018-04-28T03:42:55.197'),
('af279e89-863e-4abf-b51a-eb6aa2dd4d78', '2018-04-28T03:42:55.197'),
('afdce3d7-2e9e-473b-b739-138a506edc96', '2018-04-28T03:42:55.197'),
('b05d5be4-e768-452c-976b-cb29cd0bea8b', '2018-04-28T03:42:55.197'),
('b32a5f8e-a553-4308-bf43-fdd2e08c8fc0', '2018-04-28T03:42:55.197'),
('b88db0c7-a6a0-4dc9-ab38-61fce7c0903f', '2018-04-28T03:42:55.197'),
('bab4ee43-407a-47fd-9387-9cb892a5fc97', '2018-04-28T00:00:13.301'),
('babb4c5b-a6af-4723-bb1b-b4f0b89fc686', '2018-04-28T03:42:55.197'),
('bd4b62e1-39ca-4a68-8cbb-3e26524cdc6c', '2018-04-28T03:42:55.197'),
('be6fb829-de50-4c6a-94c4-795fef3bb306', '2018-04-28T03:42:55.197'),
('bf24d174-eb49-44cf-95f0-a07cabedcf84', '2018-04-28T03:42:55.197'),
('c0641d98-aacc-4507-a5df-fdc7642f2aab', '2018-04-27T23:50:48.693'),
('c0f75764-b8f9-4851-9e93-449e1a3977ff', '2018-04-28T03:42:55.197'),
('c3b4414e-1170-463f-a37c-501f6c6e0634', '2018-04-28T03:42:55.197'),
('c3deaac2-a7b0-4202-a6f8-8f7cd6346af5', '2018-04-28T00:02:34.697'),
('c40aa4cc-4fc5-4dfe-9ad0-effa19d19ea7', '2018-04-28T03:42:55.197'),
('c46d39f2-ee89-4c17-ab87-2c83652cbd10', '2018-04-28T00:02:34.697'),
('c8391d3b-4272-4d99-8624-757caea5a1cc', '2018-04-28T03:42:55.197'),
('c8b000c1-0d3f-41f9-a431-08643e67b6c9', '2018-04-28T03:42:55.197'),
('ca1724e6-fa37-41d0-8039-d7afbade1093', '2018-04-28T03:42:55.197'),
('cc7cc222-a2de-49aa-b3d8-92ddb75f64c1', '2018-04-27T23:50:48.693'),
('cdc12e32-0b07-4bf5-a024-479cdf1ab0be', '2018-04-28T03:42:55.197'),
('d4c49e1c-14a7-40f8-932b-90d688d229f8', '2018-04-27T23:50:48.693'),
('d510aefe-96bf-4c49-aa9d-f3698ac29e0c', '2018-04-28T03:42:55.197'),
('d51ea08a-efe5-4ee6-aa79-449e2f8ce04b', '2018-04-28T03:42:55.197'),
('d56e7f1e-20b6-43d4-aa97-3e1ed07707c7', '2018-04-28T03:42:55.197'),
('dbb038e8-2ba5-490a-bdba-fefa4a39bf26', '2018-04-28T03:42:55.197'),
('dbeedde5-bdfa-47d1-825c-59e6be11e60f', '2018-04-28T03:42:55.197'),
('e048e44d-b88e-496b-a02c-443f04912578', '2018-04-28T03:42:55.197'),
('e177b0c4-b317-4274-8ff2-eea584ccf4b0', '2018-04-28T03:42:55.197'),
('e5ea75c8-53d9-4728-8d72-a3a60814a022', '2018-04-28T03:42:55.197'),
('e6f9c891-e839-4d82-acce-17954b438019', '2018-04-28T03:42:55.197'),
('e9e84488-facb-4823-9641-0bff5a9d5d46', '2018-04-28T00:00:13.301'),
('ed3fc63d-9f30-41b6-8a96-a6ab0599e4a9', '2018-04-28T03:42:55.197'),
('ee55b812-a24a-4761-b560-b9ad178ab9c7', '2018-04-28T03:42:55.197'),
('f3c6ba97-8287-4e53-9102-34a87564480a', '2018-04-28T03:42:55.197'),
('f41cd5c8-024a-4403-b7de-fe703eb0dcd1', '2018-04-28T03:42:55.197'),
('f6001839-30f0-467b-8629-c8224c6e0235', '2018-04-28T03:42:55.197'),
('f96be90d-b1e1-4c5d-839b-2a91428d789d', '2018-04-28T03:42:55.197'),
('f9d2047e-5e07-4f8e-ad95-d43ca277694c', '2018-04-28T03:42:55.197'),
('fc1f64fb-3c65-4bf5-b9fd-2c412355983a', '2018-04-28T03:42:55.197'),
('fca2d716-3eb1-456c-b493-d241e926b21a', '2018-04-27T23:50:48.693');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `User_Id` varchar(25) NOT NULL,
  `User_firstName` varchar(25) NOT NULL,
  `User_LastName` varchar(25) NOT NULL,
  `User_Phone` varchar(25) NOT NULL,
  `User_Address` varchar(150) NOT NULL,
  `User_Type` int(11) DEFAULT '0',
  `User_Password` varchar(25) NOT NULL,
  `User_Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User_Id`, `User_firstName`, `User_LastName`, `User_Phone`, `User_Address`, `User_Type`, `User_Password`, `User_Email`) VALUES
('0987654321', 'fass', 'ccc', '2211334455', '', 0, '123', 'asd@dsd.co'),
('10014223', 'Hassan', 'alkham', '0555411011', 'somewhere', 1, '123', 'asa@adsf.com'),
('123123', 'ahemd', 'Ali', '2131234', 'sda	', 0, '123', 'ahemd@fa.com'),
('1231231230', 'asd', 'asd', '1231231231', '', 0, 'aa', 'hea@asd'),
('1564888800', 'Meme', 'Jamal', '0886000000', 'asdasd	', 0, '123', 'ada@g.com'),
('1564888896', 'Fatimah', 'Essa', '088600', 'asdasd	', 2, '', 'ada@g.com');

-- --------------------------------------------------------

--
-- Stand-in structure for view `usersinflights`
-- (See below for the actual view)
--
CREATE TABLE `usersinflights` (
`Stops_Booking_Code` varchar(50)
,`Stops_Flight_Number` varchar(25)
,`Booking_Class_Code` int(11)
,`Booking_Status` int(11)
,`Booking_Number_of_Passanger` int(11)
,`Booking_Users_User_Id` varchar(25)
,`Booking_Users_Booking_Code` varchar(50)
,`User_firstName` varchar(25)
,`User_LastName` varchar(25)
,`Flight_Airplane_Code` varchar(25)
,`Flight_From_Airport_Code` varchar(25)
,`Flight_Distanation_Airport_Code` varchar(25)
,`Flight_Depart_time` time
,`Flight_Arrival_time` time
,`Flight_Status` int(11)
,`Flight_Depart_Date` date
,`Flight_Arraival_Date` date
,`Flight_Captin_User_Id` varchar(25)
);

-- --------------------------------------------------------

--
-- Structure for view `bookaflight`
--
DROP TABLE IF EXISTS `bookaflight`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bookaflight`  AS  select `booking`.`Booking_Class_Code` AS `Booking_Class_Code`,`booking`.`Booking_Status` AS `Booking_Status`,`stops`.`Stops_Booking_Code` AS `Stops_Booking_Code`,`stops`.`Stops_Flight_Number` AS `Stops_Flight_Number` from (`stops` join `booking` on((`stops`.`Stops_Booking_Code` = `booking`.`Booking_Code`))) ;

-- --------------------------------------------------------

--
-- Structure for view `bookingflights`
--
DROP TABLE IF EXISTS `bookingflights`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bookingflights`  AS  select `booking_users`.`Booking_Users_Booking_Code` AS `Booking_Users_Booking_Code`,`booking_users`.`Booking_Users_User_Id` AS `Booking_Users_User_Id`,`booking`.`Booking_Class_Code` AS `Booking_Class_Code`,`booking`.`Booking_Status` AS `Booking_Status`,`booking`.`Booking_Number_of_Passanger` AS `Booking_Number_of_Passanger`,`stops`.`Stops_Booking_Code` AS `Stops_Booking_Code`,`stops`.`Stops_Flight_Number` AS `Stops_Flight_Number` from ((`booking_users` join `booking` on((`booking_users`.`Booking_Users_Booking_Code` = `booking`.`Booking_Code`))) join `stops` on((`stops`.`Stops_Booking_Code` = `booking`.`Booking_Code`))) ;

-- --------------------------------------------------------

--
-- Structure for view `flighttimes`
--
DROP TABLE IF EXISTS `flighttimes`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `flighttimes`  AS  select `flight`.`Flight_Depart_Date` AS `Flight_Depart_Date`,`flight`.`Flight_Arraival_Date` AS `Flight_Arraival_Date`,`flight`.`Flight_Arrival_time` AS `Flight_Arrival_time`,`flight`.`Flight_Depart_time` AS `Flight_Depart_time`,`flight`.`Flight_Number` AS `Flight_Number`,`airplane`.`Airplane_code` AS `Airplane_code`,`airplane`.`Airplane_Description` AS `Airplane_Description`,`airport`.`Airport_city` AS `fcity`,`airport`.`Airport_name` AS `fname`,`airport_1`.`Airport_city` AS `dcity`,`airport_1`.`Airport_name` AS `dname`,`flight`.`Flight_Distanation_Airport_Code` AS `Flight_Distanation_Airport_Code`,`flight`.`Flight_From_Airport_Code` AS `Flight_From_Airport_Code`,`user`.`User_LastName` AS `User_LastName`,`user`.`User_firstName` AS `User_firstName`,`flight`.`Flight_Captin_User_Id` AS `Flight_Captin_User_Id` from ((((`airplane` join `flight` on((`airplane`.`Airplane_code` = `flight`.`Flight_Airplane_Code`))) join `user` on((`flight`.`Flight_Captin_User_Id` = `user`.`User_Id`))) join `airport` `airport_1` on((`airport_1`.`Airport_code` = `flight`.`Flight_Distanation_Airport_Code`))) join `airport` on((`flight`.`Flight_From_Airport_Code` = `airport`.`Airport_code`))) ;

-- --------------------------------------------------------

--
-- Structure for view `usersinflights`
--
DROP TABLE IF EXISTS `usersinflights`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `usersinflights`  AS  select `stops`.`Stops_Booking_Code` AS `Stops_Booking_Code`,`stops`.`Stops_Flight_Number` AS `Stops_Flight_Number`,`booking`.`Booking_Class_Code` AS `Booking_Class_Code`,`booking`.`Booking_Status` AS `Booking_Status`,`booking`.`Booking_Number_of_Passanger` AS `Booking_Number_of_Passanger`,`booking_users`.`Booking_Users_User_Id` AS `Booking_Users_User_Id`,`booking_users`.`Booking_Users_Booking_Code` AS `Booking_Users_Booking_Code`,`user`.`User_firstName` AS `User_firstName`,`user`.`User_LastName` AS `User_LastName`,`flight`.`Flight_Airplane_Code` AS `Flight_Airplane_Code`,`flight`.`Flight_From_Airport_Code` AS `Flight_From_Airport_Code`,`flight`.`Flight_Distanation_Airport_Code` AS `Flight_Distanation_Airport_Code`,`flight`.`Flight_Depart_time` AS `Flight_Depart_time`,`flight`.`Flight_Arrival_time` AS `Flight_Arrival_time`,`flight`.`Flight_Status` AS `Flight_Status`,`flight`.`Flight_Depart_Date` AS `Flight_Depart_Date`,`flight`.`Flight_Arraival_Date` AS `Flight_Arraival_Date`,`flight`.`Flight_Captin_User_Id` AS `Flight_Captin_User_Id` from ((((`booking` join `stops` on((`booking`.`Booking_Code` = `stops`.`Stops_Booking_Code`))) join `booking_users` on((`booking_users`.`Booking_Users_Booking_Code` = `booking`.`Booking_Code`))) join `user` on((`booking_users`.`Booking_Users_User_Id` = `user`.`User_Id`))) join `flight` on((`flight`.`Flight_Number` = `stops`.`Stops_Flight_Number`))) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airplane`
--
ALTER TABLE `airplane`
  ADD PRIMARY KEY (`Airplane_code`);

--
-- Indexes for table `airport`
--
ALTER TABLE `airport`
  ADD PRIMARY KEY (`Airport_code`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`Booking_Code`),
  ADD KEY `pk_Class` (`Booking_Class_Code`);

--
-- Indexes for table `booking_users`
--
ALTER TABLE `booking_users`
  ADD PRIMARY KEY (`Booking_Users_User_Id`,`Booking_Users_Booking_Code`),
  ADD KEY `pkBooking` (`Booking_Users_Booking_Code`);

--
-- Indexes for table `class_booking`
--
ALTER TABLE `class_booking`
  ADD PRIMARY KEY (`Class_Code`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`Flight_Number`),
  ADD KEY `pkFrom` (`Flight_From_Airport_Code`),
  ADD KEY `pkAir` (`Flight_Airplane_Code`),
  ADD KEY `pkCap` (`Flight_Captin_User_Id`);

--
-- Indexes for table `stops`
--
ALTER TABLE `stops`
  ADD PRIMARY KEY (`Stops_Booking_Code`,`Stops_Flight_Number`),
  ADD KEY `pkflight` (`Stops_Flight_Number`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`User_Id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `pk_Class` FOREIGN KEY (`Booking_Class_Code`) REFERENCES `class_booking` (`Class_Code`);

--
-- Constraints for table `booking_users`
--
ALTER TABLE `booking_users`
  ADD CONSTRAINT `pkBooking` FOREIGN KEY (`Booking_Users_Booking_Code`) REFERENCES `booking` (`Booking_Code`),
  ADD CONSTRAINT `pkUser` FOREIGN KEY (`Booking_Users_User_Id`) REFERENCES `user` (`User_Id`);

--
-- Constraints for table `flight`
--
ALTER TABLE `flight`
  ADD CONSTRAINT `pkAir` FOREIGN KEY (`Flight_Airplane_Code`) REFERENCES `airplane` (`Airplane_code`),
  ADD CONSTRAINT `pkCap` FOREIGN KEY (`Flight_Captin_User_Id`) REFERENCES `user` (`User_Id`),
  ADD CONSTRAINT `pkDistan` FOREIGN KEY (`Flight_From_Airport_Code`) REFERENCES `airport` (`Airport_code`),
  ADD CONSTRAINT `pkFrom` FOREIGN KEY (`Flight_From_Airport_Code`) REFERENCES `airport` (`Airport_code`);

--
-- Constraints for table `stops`
--
ALTER TABLE `stops`
  ADD CONSTRAINT `pkBook` FOREIGN KEY (`Stops_Booking_Code`) REFERENCES `booking` (`Booking_Code`),
  ADD CONSTRAINT `pkflight` FOREIGN KEY (`Stops_Flight_Number`) REFERENCES `flight` (`Flight_Number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
