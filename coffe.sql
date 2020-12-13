-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: cf
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `tblchamcong`
--

DROP TABLE IF EXISTS `tblchamcong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblchamcong` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idNhanVien` int NOT NULL,
  `ngay` date NOT NULL,
  `caLamViec` int NOT NULL,
  `gioDen` float NOT NULL,
  `gioVe` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblchamcong`
--

LOCK TABLES `tblchamcong` WRITE;
/*!40000 ALTER TABLE `tblchamcong` DISABLE KEYS */;
INSERT INTO `tblchamcong` VALUES (3,10,'2019-10-21',1,7,11),(4,10,'2019-10-22',1,7,11);
/*!40000 ALTER TABLE `tblchamcong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblchitiethoadon`
--

DROP TABLE IF EXISTS `tblchitiethoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblchitiethoadon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idSanPham` int NOT NULL,
  `soLuong` int NOT NULL,
  `idHoaDon` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblchitiethoadon`
--

LOCK TABLES `tblchitiethoadon` WRITE;
/*!40000 ALTER TABLE `tblchitiethoadon` DISABLE KEYS */;
INSERT INTO `tblchitiethoadon` VALUES (43,4,2,41),(44,6,1,41),(45,5,1,41),(46,9,2,42),(47,15,1,42),(48,1,2,43);
/*!40000 ALTER TABLE `tblchitiethoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblhoadon`
--

DROP TABLE IF EXISTS `tblhoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblhoadon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idNhanVien` int NOT NULL,
  `idKhachHang` int NOT NULL,
  `ngay` date NOT NULL,
  `tongTien` int NOT NULL,
  `trangThai` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblhoadon`
--

LOCK TABLES `tblhoadon` WRITE;
/*!40000 ALTER TABLE `tblhoadon` DISABLE KEYS */;
INSERT INTO `tblhoadon` VALUES (41,34,35,'2019-11-19',230000,'ChuaThanhToan'),(42,34,35,'2019-11-19',230000,'DaThanhToan'),(43,34,35,'2019-12-07',60000,'DaThanhToan');
/*!40000 ALTER TABLE `tblhoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbllichlamviec`
--

DROP TABLE IF EXISTS `tbllichlamviec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbllichlamviec` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idNhanVien` int NOT NULL,
  `tenNhanVien` varchar(1000) NOT NULL,
  `ngay` date NOT NULL,
  `caLamViec` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbllichlamviec`
--

LOCK TABLES `tbllichlamviec` WRITE;
/*!40000 ALTER TABLE `tbllichlamviec` DISABLE KEYS */;
INSERT INTO `tbllichlamviec` VALUES (78,34,'Pham Van Do','2019-11-25',1),(79,34,'Pham Van Do','2019-11-26',1),(80,34,'Pham Van Do','2019-11-27',1),(81,34,'Pham Van Do','2019-11-28',1),(82,34,'Pham Van Do','2019-11-29',1),(83,34,'Pham Van Do','2019-11-30',1),(84,34,'Pham Van Do','2019-12-01',1),(85,34,'Pham Van Do','2019-11-25',2),(86,34,'Pham Van Do','2019-11-26',2),(87,34,'Pham Van Do','2019-11-27',2),(88,34,'Pham Van Do','2019-11-28',2),(89,34,'Pham Van Do','2019-11-29',2),(90,34,'Pham Van Do','2019-11-30',2),(91,34,'Pham Van Do','2019-12-01',2),(92,34,'Pham Van Do','2019-11-19',2),(93,34,'Pham Van Do','2019-12-02',1),(94,34,'Pham Van Do','2019-12-03',1),(95,34,'Pham Van Do','2019-12-04',1),(96,34,'Pham Van Do','2019-12-05',1),(97,34,'Pham Van Do','2019-12-06',1),(98,34,'Pham Van Do','2019-12-07',1),(99,34,'Pham Van Do','2019-12-08',1),(100,34,'Pham Van Do','2019-12-02',2),(101,34,'Pham Van Do','2019-12-03',2),(102,34,'Pham Van Do','2019-12-04',2),(103,34,'Pham Van Do','2019-12-05',2),(104,34,'Pham Van Do','2019-12-06',2),(105,34,'Pham Van Do','2019-12-07',2),(106,34,'Pham Van Do','2019-12-08',2);
/*!40000 ALTER TABLE `tbllichlamviec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsanpham`
--

DROP TABLE IF EXISTS `tblsanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsanpham` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(1000) NOT NULL,
  `url` varchar(1000) NOT NULL,
  `price` int NOT NULL,
  `type` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsanpham`
--

LOCK TABLES `tblsanpham` WRITE;
/*!40000 ALTER TABLE `tblsanpham` DISABLE KEYS */;
INSERT INTO `tblsanpham` VALUES (1,'Phin Den Da','Img/denda.jpg',30000,'cafe'),(2,'Phin Nau Da','Img/nauda.jpg',30000,'cafe'),(3,'Cappuccino','https://wallingfordcoffee.com/wp-content/uploads/2014/11/product-capp.jpg',80000,'cafe'),(4,'Latte','Img/latte.jpg',70000,'cafe'),(5,'Espresso','https://file.hstatic.net/1000275031/file/cino-caffe-espresso-cup-70ml-p02442-p02472-ocean-thai-lan-ly-thuy-tinh_grande.jpg',70000,'cafe'),(6,'Banh Gato Socola','https://media.cooky.vn/recipe/g2/10004/s300x300/recipe10004-prepare-step5-636520946674984535.png',20000,'banhngot'),(7,'Banh Gato Dau','https://cf.shopee.vn/file/15fcc54d04490f27465053448cf8a1d3_tn',15000,'banhngot'),(8,'Gato Trà Xanh','Img/gatotraxanh.jpg',20000,'banhngot'),(9,'Mojito','https://www.thespruceeats.com/thmb/MqGv7imLKyo0hh5be9SKDdLxtH8=/668x668/smart/filters:no_upscale()/mojito-5a8f339fba61770036ec61d8.jpg',100000,'cocktail'),(10,'Gin-Tonic','https://food.askorean.com/uploads/ddf122e04f7f9a41bd5319ccdaaa476c.jpg',100000,'cocktail'),(11,'Classic Margarita','https://mixthatdrink.com/wp-content/uploads/2009/02/margarita-3-735x735.jpg',100000,'cocktail'),(12,'Nuoc Ep Dau Tay','https://media.cooky.vn/recipe/g1/737/s480x480/recipe737-prepare-step3-635526075658496641.jpg',30000,'nuocep'),(13,'Nuoc Ep Cam','http://chauolong.com/wp-content/uploads/2016/12/nuocep-cam.jpg',30000,'nuocep'),(14,'Nuoc Ep Dua','https://phuongnam.info/cafe-moc-tra/wp-content/uploads/sites/8/2019/03/nuoc-ep-thom-600x600.jpg',30000,'nuocep'),(15,'Nuoc Ep Dua Hau','http://www.kobelegend.vn/wp-content/uploads/2019/01/nuoc-dua-hau-co-tac-dung-gi.jpg',30000,'nuocep'),(23,'Bac Xuu','Img/bacxuu.jpg',30000,'cafe');
/*!40000 ALTER TABLE `tblsanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblthanhvien`
--

DROP TABLE IF EXISTS `tblthanhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblthanhvien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(1000) NOT NULL,
  `gioiTinh` varchar(1000) NOT NULL,
  `diaChi` varchar(1000) NOT NULL,
  `soDienThoai` varchar(1000) NOT NULL,
  `tenDangNhap` varchar(1000) NOT NULL,
  `matKhau` varchar(1000) NOT NULL,
  `viTri` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblthanhvien`
--

LOCK TABLES `tblthanhvien` WRITE;
/*!40000 ALTER TABLE `tblthanhvien` DISABLE KEYS */;
INSERT INTO `tblthanhvien` VALUES (33,'admin','nam','HN','0123456789','admin','admin',1),(34,'Pham Van Do','Nam','Nam Dinh','0123456789','do@gmail.com','do',2),(35,'bui minh chi','Nam','Nam Dinh','098686868','buichi@gmail.com','123',3),(36,'Nguyen Van Hiep','Nam','Nam Dinh','99999999','hiepnguyen3003@gmail.com','9239615',3);
/*!40000 ALTER TABLE `tblthanhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'cf'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-13 16:43:19
