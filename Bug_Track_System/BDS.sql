-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: BDS
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assignproject`
--

DROP TABLE IF EXISTS `assignproject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignproject` (
  `projectID` int DEFAULT NULL,
  `empCode` int DEFAULT NULL,
  KEY `projectID` (`projectID`),
  KEY `empCode` (`empCode`),
  CONSTRAINT `assignproject_ibfk_1` FOREIGN KEY (`projectID`) REFERENCES `project` (`projectID`) ON DELETE CASCADE,
  CONSTRAINT `assignproject_ibfk_2` FOREIGN KEY (`empCode`) REFERENCES `employee` (`empCode`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignproject`
--

LOCK TABLES `assignproject` WRITE;
/*!40000 ALTER TABLE `assignproject` DISABLE KEYS */;
INSERT INTO `assignproject` VALUES (109,1003),(101,1002),(102,1001),(103,1001),(104,1002),(105,1004),(106,1003),(107,1001),(108,1004);
/*!40000 ALTER TABLE `assignproject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bugreport`
--

DROP TABLE IF EXISTS `bugreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bugreport` (
  `bugNo` int NOT NULL,
  `bugCode` int DEFAULT NULL,
  `projectID` int DEFAULT NULL,
  `TCode` int DEFAULT NULL,
  `ECode` int DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `bugDes` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`bugNo`),
  KEY `bugCode` (`bugCode`),
  KEY `projectID` (`projectID`),
  KEY `TCode` (`TCode`),
  KEY `ECode` (`ECode`),
  CONSTRAINT `bugreport_ibfk_1` FOREIGN KEY (`bugCode`) REFERENCES `bugtype` (`bugCode`),
  CONSTRAINT `bugreport_ibfk_2` FOREIGN KEY (`projectID`) REFERENCES `project` (`projectID`),
  CONSTRAINT `bugreport_ibfk_3` FOREIGN KEY (`TCode`) REFERENCES `employee` (`empCode`),
  CONSTRAINT `bugreport_ibfk_4` FOREIGN KEY (`ECode`) REFERENCES `employee` (`empCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bugreport`
--

LOCK TABLES `bugreport` WRITE;
/*!40000 ALTER TABLE `bugreport` DISABLE KEYS */;
INSERT INTO `bugreport` VALUES (1,5,101,3007,2002,'resolved','Bug due to fail in communication protocols'),(2,8,109,3003,2007,'Pending','Bug due to several issues in calculations'),(3,4,105,3005,2004,'Pending','Bug due to Unknown Run Time Errors'),(4,7,102,3001,2010,'Pending','Bug due to error handling'),(5,6,102,3006,2005,'Resolved','Bug due to incorrect Logic'),(6,2,102,3009,2006,'Resolved','Bug due to Compilation');
/*!40000 ALTER TABLE `bugreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bugtype`
--

DROP TABLE IF EXISTS `bugtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bugtype` (
  `bugCode` int NOT NULL,
  `bugCatgory` varchar(30) DEFAULT NULL,
  `bugSeverty` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`bugCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bugtype`
--

LOCK TABLES `bugtype` WRITE;
/*!40000 ALTER TABLE `bugtype` DISABLE KEYS */;
INSERT INTO `bugtype` VALUES (1,'Functional Errors','Critical'),(2,'Compilation Errors','Major'),(3,'Missing commands','Major'),(4,'Run time Errors','Critical'),(5,'Communication problems','Medium'),(6,'Logical errors','High'),(7,'Inappropriate error handling','Medium'),(8,'Calculation issues','High');
/*!40000 ALTER TABLE `bugtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `empCode` int NOT NULL,
  `empName` varchar(30) DEFAULT NULL,
  `empEmail` varchar(40) DEFAULT NULL,
  `empPassword` varchar(20) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  `mobileNo` bigint DEFAULT NULL,
  `Role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`empCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1001,'James B','jamesbuck@gmail.com','jamesB123','M','06/07/2008',9999999999,'manager'),(1002,'Krishnaveni','krish@gmail.com','krish@123','F','05/06/2004',8798755555,'manager'),(1003,'Steve S','stevesmith@gmail.com','smithy@123','M','04/05/2003',6789054312,'Manager'),(1004,'Jacqueline Blake','jacqblake@gmail.com','jacq@123','F','03/12/2005',5432167890,'Manager'),(1005,'Averia Davids','avedavids@hotmail.com','aveyy@234','F','06/07/2001',6543789043,'Manager'),(2001,'Ravi','ravig@gmil.com','ravi@123','M','08/09/2006',1234567890,'developer'),(2002,'Deepa','deep@hotmail.com','deeps@gmail.com','F','09/10/2002',9080765432,'developer'),(2003,'Denny','denny@gmail.com','den@123','F','06/11/2002',6902156743,'Developer'),(2004,'Vanessa','vanessa@gmail.com','vans@123','F','07/12/3004',6789012345,'Developer'),(2005,'Sebastian S','sebstan@gmail.com','seb@123','M','05/07/2008',7890123456,'Developer'),(2006,'Shayla','shay@hotmail.com','shay@890','F','06/08/2001',5678912345,'Developer'),(2007,'Hyun J','hyun@gmail.com','hyun@123','F','02/01/2003',5432109876,'Developer'),(2008,'Kaycee H','kay@gmail.com','kay@345','F','06/05/2003',5432167890,'Developer'),(2009,'Noel M','noe@gmail.com','noey@124','M','03/06/2004',5432167890,'Developer'),(2010,'Henry G','ghen@gmail.com','gih@123','M','07/06/2000',7568432908,'Developer'),(2011,'Andrea D','andydens@gmail.com','anden@123','F','09/10/2003',9876543280,'Developer'),(2012,'Lisa G','lizzygeorge@gmail.com','lizzard@123','F','09/10/2004',9087624176,'Developer'),(2013,'Peter Q','petequill@hotmail.com','peteyquill@456','M','07/08/2000',9076542765,'Developer'),(2014,'Maya H','mayahee@hotmail.com','maya@345','F','06/05/2004',9065476231,'Developer'),(2015,'Shenreck','shen@hotmail.com','shenny@345','M','02/03/2001',6578934201,'Developer'),(2016,'Wilhema C','willc@gmail.com','willy@123','F','04/08/2005',8904567321,'Developer'),(2017,'Detsy B','detsinabetle@gmail.com','datty@678','F','02/02/2002',3456723456,'Developer'),(2018,'Fischer M','fischermatt@gmail.com','fisch@123','M','03/06/2007',5678903214,'Developer'),(2019,'Jun H','junh@gmail.com','junee@123','M','04/03/2002',9054367892,'Developer'),(2020,'Ash S','ashlins@hotmail.com','ashh@124','M','03/01/2004',9854376921,'Developer'),(3001,'Will M','willm@gmail.com','will@123','M','11/09/2001',9870054321,'Tester'),(3002,'Joe R','joer@gmail.com','joey@123','M','04/06/2000',8765432678,'Tester'),(3003,'Sammy','sammy@gmail.com','sammy@123','F','09/07/2005',8789712345,'tester'),(3004,'Nathasa ','nathasha@hotmail.com','natts@123','F','03/04/2000',5678901234,'Tester'),(3005,'Georgia','georgiad@gmail.com','georgs@123','F','06/07/2008',7865443120,'Tester'),(3006,'Matthew M','mattmurdock@gmail.com','matty@123','M','06/03/2001',5436790321,'Tester'),(3007,'Peter P','parker@hotmail.com','parks@345','M','08/09/2005',6789012345,'Tester'),(3008,'Sasha','sash@gmail.com','sashy@345','F','05/08/2003',5436712345,'Tester'),(3009,'Fletcher','fletch@gmail.com','fletch@123','M','06/07/2001',6789012345,'Tester'),(3010,'Rachel','rachel@gmail.com','rachel@123','F','04/11/2005',6789012345,'Tester'),(4001,'Tim C','timothyc@gmail.com','timmy@123','M','05/02/2008',5436721891,'Admin'),(4002,'Savannah H','savannah@hotmail.com','savvy@123','F','04/05/2006',1234509876,'Admin');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `projectID` int NOT NULL,
  `projectName` varchar(30) DEFAULT NULL,
  `SDate` varchar(30) DEFAULT NULL,
  `EDate` varchar(30) DEFAULT NULL,
  `projectDec` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (101,'Sunflower Electricity','02/06/2025','08/07/2027',' The project aims to utilize sunflowers\' inherent characterstics to model a solar panel to produce electricity.'),(102,'Hydro Clock','09/02/2024','09/02/2026','Clock based on high speed movement of water droplets'),(103,'High Speed sensor','06/07/2025','06/07/2027','Sensors which can work at high frequencies in high speed environment'),(104,'Sugar Chart Monitor','08/03/2025','08/03/2026','Detecting calories in each food consumed throughout a month'),(105,'Temperature Regulator','07/04/2024','07/04/2025','Automatic temperature regulator based Air Conditioner'),(106,'Summarizer','07/04/2024','07/04/2026','Automated pdf summarizer tool based on NLP'),(107,'Large Remote','05/07/2024','05/07/2028','Large sized remote for ease of use for children and seniors'),(108,'Helicopter drone','09/10/2025','09/10/2028','Drone with helicopter like wings'),(109,'Traffic light','03/04/2025','03/04/2026','Automated traffic light controller');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-30 15:20:09
