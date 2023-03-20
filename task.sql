-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: task
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `BirthDate` date DEFAULT NULL,
  `BirthCity` varchar(45) DEFAULT NULL,
  `Code` int NOT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `JobTitle` varchar(45) DEFAULT NULL,
  `DirectManager` varchar(45) DEFAULT NULL,
  `ContractType` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Code_UNIQUE` (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Code`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (2,'Hassan Mohamed','1996-01-11','Cairo',100,'Java','Developer','Motaz Mahmoud','Full Time','Online'),(3,'Sherif Ahmed','1999-10-11','Alex',111,'DotNet','Developer','Ayman Said','Part Time','Online'),(4,'Ahmed Sayed','1998-12-01','Banha',112,'Php','Team Lead','Mohsen Deab','Full Time','Online'),(5,'Mohamed Samy','1996-05-12','Cairo',102,'Java','Developer','Motaz Mahmoud','Full Time','Offline'),(6,'Sohaila Barkat','1889-08-12','PortSaid',104,'Java','Developer','Motaz Mahmoud','Full Time','Online'),(7,'Mai Samir','1996-08-20','Cairo',108,'Java','Developer','Motaz Mahmoud','Fullt Time','Offline'),(8,'Hamza Alaa','1995-04-01','Banha',110,'DotNet','Developer','Ayman Said','Full Time','Online'),(9,'Abdallah Khamis','1995-06-12','Alex',120,'DotNet','Developer','Ayman Said','Part Time','Online'),(10,'Ahmad Said','1997-05-10','Alex',121,'Php','Developer','Mohsen Deab','Part Time','Oniline'),(11,'Ramy Moamen','1993-06-10','PortSaid',123,'Php','Developer','Mohsen Deab','Full Time','Offline'),(12,'Mohsen Deab','1980-05-14','Cairo',21,'Php','Manager','Ayamn Ashraf','Full Time','Online'),(13,'Ayman Said','1982-05-13','Banha',11,'DotNet','Manager','Ayman Ashraf','Full Time','Online'),(14,'Motaz Mahmoud','1996-05-12','Alex',14,'Java','Manager','Ayman Ashraf','Full Time','Offline');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-21  1:19:45
