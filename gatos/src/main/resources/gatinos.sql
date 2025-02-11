-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: gatinos
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

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
-- Table structure for table `colonias`
--

DROP TABLE IF EXISTS `colonias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colonias` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `movil` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tamano` varchar(255) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colonias`
--

LOCK TABLES `colonias` WRITE;
/*!40000 ALTER TABLE `colonias` DISABLE KEYS */;
INSERT INTO `colonias` VALUES (1,'Gatos Agraciados',654321,'Colonia Bonita',NULL,123456,NULL),(3,'Gatos sarnosos',3456346,'Colonia Fea',NULL,634563,'cuanto mas lejos mejor');
/*!40000 ALTER TABLE `colonias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gatos`
--

DROP TABLE IF EXISTS `gatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gatos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `colores` varchar(255) DEFAULT NULL,
  `edad_aproximada` int(11) DEFAULT NULL,
  `fecha_entrada` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `motivo_entrada` varchar(255) DEFAULT NULL,
  `motivo_salida` varchar(255) DEFAULT NULL,
  `pelaje` enum('CORTO','LARGO','RIZADO','SEMILARGO','SIN_PELO') DEFAULT NULL,
  `raza` varchar(255) DEFAULT NULL,
  `sexo` enum('HEMBRA','MACHO') DEFAULT NULL,
  `tamano` enum('GRANDE','MEDIANO','PEQUEÑO') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gatos`
--

LOCK TABLES `gatos` WRITE;
/*!40000 ALTER TABLE `gatos` DISABLE KEYS */;
INSERT INTO `gatos` VALUES (1,'Negro, Gris',1,'2025-01-05','2025-02-01','Abandonado en un parque','Adoptado por una pareja','SEMILARGO','Siberiano','HEMBRA','MEDIANO'),(2,'Gris, Blanco',2,'2025-01-10','2025-02-20','Entregado por su dueño','Adoptado por una familia','LARGO','Persa','HEMBRA','PEQUEÑO'),(3,'Naranja, Blanco',5,'2024-12-01','2025-01-15','Rescatado tras accidente','Enviado a un refugio especializado','CORTO','Mestizo','MACHO','GRANDE'),(4,'Blanco, Marrón',3,'2025-01-01','2025-02-15','Rescatado de la calle','Adoptado','CORTO','Siames','MACHO','MEDIANO');
/*!40000 ALTER TABLE `gatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'gatinos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-29 21:10:25
