-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: MovieDB
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
-- Table structure for table `seats`
--

DROP TABLE IF EXISTS `seats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seats` (
  `row_num` int NOT NULL,
  `col_num` int NOT NULL,
  `status` varchar(2) DEFAULT 'AV',
  PRIMARY KEY (`row_num`,`col_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seats`
--

LOCK TABLES `seats` WRITE;
/*!40000 ALTER TABLE `seats` DISABLE KEYS */;
INSERT INTO `seats` VALUES (1,1,'AV'),(1,2,'AV'),(1,3,'AV'),(1,4,'AV'),(1,5,'AV'),(1,6,'AV'),(1,7,'AV'),(1,8,'AV'),(1,9,'AV'),(1,10,'AV'),(1,11,'AV'),(1,12,'AV'),(1,13,'AV'),(1,14,'BK'),(1,15,'AV'),(1,16,'AV'),(1,17,'AV'),(1,18,'AV'),(1,19,'AV'),(1,20,'AV'),(2,1,'AV'),(2,2,'AV'),(2,3,'AV'),(2,4,'AV'),(2,5,'AV'),(2,6,'AV'),(2,7,'AV'),(2,8,'AV'),(2,9,'AV'),(2,10,'AV'),(2,11,'AV'),(2,12,'AV'),(2,13,'AV'),(2,14,'AV'),(2,15,'AV'),(2,16,'AV'),(2,17,'AV'),(2,18,'AV'),(2,19,'AV'),(2,20,'AV'),(3,1,'AV'),(3,2,'AV'),(3,3,'BK'),(3,4,'BK'),(3,5,'AV'),(3,6,'AV'),(3,7,'AV'),(3,8,'AV'),(3,9,'AV'),(3,10,'AV'),(3,11,'AV'),(3,12,'AV'),(3,13,'AV'),(3,14,'AV'),(3,15,'AV'),(3,16,'AV'),(3,17,'AV'),(3,18,'AV'),(3,19,'AV'),(3,20,'AV'),(4,1,'AV'),(4,2,'AV'),(4,3,'AV'),(4,4,'AV'),(4,5,'AV'),(4,6,'AV'),(4,7,'AV'),(4,8,'AV'),(4,9,'AV'),(4,10,'AV'),(4,11,'AV'),(4,12,'AV'),(4,13,'AV'),(4,14,'AV'),(4,15,'AV'),(4,16,'AV'),(4,17,'AV'),(4,18,'AV'),(4,19,'AV'),(4,20,'AV'),(5,1,'AV'),(5,2,'AV'),(5,3,'AV'),(5,4,'AV'),(5,5,'AV'),(5,6,'AV'),(5,7,'AV'),(5,8,'AV'),(5,9,'AV'),(5,10,'AV'),(5,11,'AV'),(5,12,'AV'),(5,13,'AV'),(5,14,'AV'),(5,15,'AV'),(5,16,'AV'),(5,17,'AV'),(5,18,'AV'),(5,19,'AV'),(5,20,'AV');
/*!40000 ALTER TABLE `seats` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-30 17:28:02
