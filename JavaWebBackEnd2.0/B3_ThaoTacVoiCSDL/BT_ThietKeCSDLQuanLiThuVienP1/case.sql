-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: casestudydatabase
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `approle`
--

DROP TABLE IF EXISTS `approle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `approle` (
  `roleid` int(11) NOT NULL,
  `rolename` varchar(50) NOT NULL,
  PRIMARY KEY (`roleid`),
  UNIQUE KEY `rolename` (`rolename`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `approle`
--

LOCK TABLES `approle` WRITE;
/*!40000 ALTER TABLE `approle` DISABLE KEYS */;
INSERT INTO `approle` VALUES (1,'roleadmin'),(2,'roleuser');
/*!40000 ALTER TABLE `approle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appuser`
--

DROP TABLE IF EXISTS `appuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appuser` (
  `iduser` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `encrytedpassword` varchar(128) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `idkhachhang` int(11) DEFAULT NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE KEY `iduser` (`iduser`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `idkhachhang` (`idkhachhang`),
  CONSTRAINT `idkhachhangfk` FOREIGN KEY (`idkhachhang`) REFERENCES `khachhang` (`IDKhachHang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appuser`
--

LOCK TABLES `appuser` WRITE;
/*!40000 ALTER TABLE `appuser` DISABLE KEYS */;
INSERT INTO `appuser` VALUES (1,'dbadmin1','$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu',_binary '',NULL),(2,'dbuser1','$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu',_binary '',3);
/*!40000 ALTER TABLE `appuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bophan`
--

DROP TABLE IF EXISTS `bophan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bophan` (
  `IDBoPhan` int(11) NOT NULL AUTO_INCREMENT,
  `TenBoPhan` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IDBoPhan`),
  UNIQUE KEY `IDBoPhan` (`IDBoPhan`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bophan`
--

LOCK TABLES `bophan` WRITE;
/*!40000 ALTER TABLE `bophan` DISABLE KEYS */;
INSERT INTO `bophan` VALUES (1,'Buồng phòng'),(2,'Lễ tân'),(3,'Nhà hàng'),(4,'An ninhh'),(5,'Văn phòng');
/*!40000 ALTER TABLE `bophan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `danhgia`
--

DROP TABLE IF EXISTS `danhgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhgia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rate` tinyint(4) DEFAULT NULL,
  `noidung` varchar(200) DEFAULT NULL,
  `idkhachhang` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `danhgia_fk` (`idkhachhang`),
  CONSTRAINT `danhgia_fk` FOREIGN KEY (`idkhachhang`) REFERENCES `khachhang` (`IDKhachHang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhgia`
--

LOCK TABLES `danhgia` WRITE;
/*!40000 ALTER TABLE `danhgia` DISABLE KEYS */;
/*!40000 ALTER TABLE `danhgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `IDDichVu` int(11) NOT NULL AUTO_INCREMENT,
  `TenDichVu` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DienTich` double NOT NULL,
  `SoTang` tinyint(4) DEFAULT NULL,
  `SoNguoiToiDa` tinyint(4) DEFAULT NULL,
  `ChiPhiThue` decimal(10,0) DEFAULT NULL,
  `TrangThai` bit(1) DEFAULT NULL,
  `IDKieuThue` int(11) DEFAULT NULL,
  `IDLoaiDichVu` int(11) DEFAULT NULL,
  `hinh` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`IDDichVu`),
  UNIQUE KEY `IDDichVu` (`IDDichVu`),
  KEY `IDKieuThue_fk` (`IDKieuThue`),
  KEY `IDLoaiDichVu_fk` (`IDLoaiDichVu`),
  CONSTRAINT `IDKieuThue_fk` FOREIGN KEY (`IDKieuThue`) REFERENCES `kieuthue` (`IDKieuThue`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDLoaiDichVu_fk` FOREIGN KEY (`IDLoaiDichVu`) REFERENCES `loaidichvu` (`IDLoaiDichVu`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` VALUES (1,'Villa1',100,3,3,1000000,_binary '\0',2,1,'full_phong--13-_1457411636.jpg'),(2,'House1',50,2,3,750000,_binary '\0',3,2,'full_phong--13-_1457411636.jpg'),(3,'House2',60,2,5,850000,_binary '\0',4,2,'full_phong--13-_1457411636.jpg'),(4,'Room1',30,1,3,300000,_binary '\0',3,3,'full_phong--13-_1457411636.jpg'),(5,'Villa2',150,4,5,1500000,_binary '\0',3,1,'full_phong--13-_1457411636.jpg'),(6,'House3',50,1,3,5000000,_binary '\0',2,2,'full_phong--13-_1457411636.jpg'),(7,'Romm2',25,1,2,1500000,_binary '\0',4,3,'full_phong--13-_1457411636.jpg'),(8,'Villa3',100,2,2,6000000,_binary '\0',2,1,'full_phong--13-_1457411636.jpg'),(9,'Room3',20,2,1,1000000,_binary '\0',4,3,'full_phong--13-_1457411636.jpg'),(10,'Villa4',60,2,5,850000,_binary '\0',4,3,'full_phong--13-_1457411636.jpg'),(11,'House2',60,2,5,850000,_binary '\0',4,2,'full_phong--13-_1457411636.jpg'),(12,'House2',60,2,5,850000,_binary '\0',4,2,'full_phong--13-_1457411636.jpg'),(13,'House2',60,2,5,850000,_binary '\0',4,2,'full_phong--13-_1457411636.jpg');
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvudikem`
--

DROP TABLE IF EXISTS `dichvudikem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvudikem` (
  `IDDichVuDiKem` int(11) NOT NULL AUTO_INCREMENT,
  `TenDichVuDiKem` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Gia` decimal(10,0) DEFAULT NULL,
  `DonVi` int(11) DEFAULT NULL,
  `TrangThaiKhaDung` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`IDDichVuDiKem`),
  UNIQUE KEY `IDDichVuDiKem` (`IDDichVuDiKem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvudikem`
--

LOCK TABLES `dichvudikem` WRITE;
/*!40000 ALTER TABLE `dichvudikem` DISABLE KEYS */;
/*!40000 ALTER TABLE `dichvudikem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdong`
--

DROP TABLE IF EXISTS `hopdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdong` (
  `IDHopDong` int(11) NOT NULL AUTO_INCREMENT,
  `NgayLamHopDong` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `TienDatCoc` decimal(10,0) DEFAULT NULL,
  `TongTien` decimal(10,0) DEFAULT NULL,
  `IDKhachHang` int(11) DEFAULT NULL,
  `IDDichVu` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDHopDong`),
  UNIQUE KEY `IDHopDong` (`IDHopDong`),
  KEY `IDKhachHang_fk` (`IDKhachHang`),
  KEY `IDDichVu_fk` (`IDDichVu`),
  CONSTRAINT `IDDichVu_fk` FOREIGN KEY (`IDDichVu`) REFERENCES `dichvu` (`IDDichVu`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDKhachHang_fk` FOREIGN KEY (`IDKhachHang`) REFERENCES `khachhang` (`IDKhachHang`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdong`
--

LOCK TABLES `hopdong` WRITE;
/*!40000 ALTER TABLE `hopdong` DISABLE KEYS */;
/*!40000 ALTER TABLE `hopdong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdongchitiet`
--

DROP TABLE IF EXISTS `hopdongchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdongchitiet` (
  `IDHopDongChiTiet` int(11) NOT NULL AUTO_INCREMENT,
  `SoLuong` int(11) DEFAULT NULL,
  `IDHopDong` int(11) DEFAULT NULL,
  `IDDichVuDiKem` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDHopDongChiTiet`),
  KEY `IDHopDong_fk` (`IDHopDong`),
  KEY `IDDichVuDiKem_fk` (`IDDichVuDiKem`),
  CONSTRAINT `IDDichVuDiKem_fk` FOREIGN KEY (`IDDichVuDiKem`) REFERENCES `dichvudikem` (`IDDichVuDiKem`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDHopDong_fk` FOREIGN KEY (`IDHopDong`) REFERENCES `hopdong` (`IDHopDong`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdongchitiet`
--

LOCK TABLES `hopdongchitiet` WRITE;
/*!40000 ALTER TABLE `hopdongchitiet` DISABLE KEYS */;
/*!40000 ALTER TABLE `hopdongchitiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `IDKhachHang` int(11) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `SoCMTND` varchar(15) NOT NULL,
  `SDT` varchar(15) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `IDLoaiKhach` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDKhachHang`),
  UNIQUE KEY `IDKhachHang` (`IDKhachHang`),
  UNIQUE KEY `SoCMTND` (`SoCMTND`),
  UNIQUE KEY `SDT` (`SDT`),
  UNIQUE KEY `Email` (`Email`),
  KEY `IDLoaiKhach_fk` (`IDLoaiKhach`),
  CONSTRAINT `IDLoaiKhach_fk` FOREIGN KEY (`IDLoaiKhach`) REFERENCES `loaikhach` (`IDLoaiKhach`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Hoàng Long','1970-03-15','98765432','23567344','zxcs@gmail.com','Quảng Trị',1),(2,'Trần Văn A','1968-09-15','98712322','23567865','zxwqe232cs@gmail.com','Đà Nẵng',1),(3,'Nguyễn Ngọc B','1990-07-15','6755432','23567432','zx23cs@gmail.com','Quảng Trị',3),(4,'Lê Văn C','1969-06-15','98734534','23567423','5asd6@gmail.com','Quảng Trị',5),(5,'Nguyễn Hà','1983-05-15','9886652','23549676','zxmkucs@gmail.com','Đà Nẵng',2),(6,'Hoàng Văn C','1985-11-25','94355432','23565624','zxqwecs@gmail.com','Vinh',1),(7,'Trần B','1995-04-25','98765232','23567631','zxacs@gmail.com','Quảng Ngãi',1),(8,'Đoàn A','1993-06-24','98765412','23567231','fdsd@gmail.com','Quảng Trị',2),(9,'Trần Văn A','1982-01-23','98767332','23847324','zghghgxcs@gmail.com','Đà Nẵng',1),(10,'Lê Văn K','1965-02-04','97123132','98367344','zxwewcs@gmail.com','Quảng Ngãi',2);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kieuthue`
--

DROP TABLE IF EXISTS `kieuthue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kieuthue` (
  `IDKieuThue` int(11) NOT NULL AUTO_INCREMENT,
  `TenKieuThue` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Gia` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`IDKieuThue`),
  UNIQUE KEY `IDKieuThue` (`IDKieuThue`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kieuthue`
--

LOCK TABLES `kieuthue` WRITE;
/*!40000 ALTER TABLE `kieuthue` DISABLE KEYS */;
INSERT INTO `kieuthue` VALUES (1,'Năm',100000000),(2,'Tháng',15000000),(3,'Ngày',1000000),(4,'Gio',200000);
/*!40000 ALTER TABLE `kieuthue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaidichvu`
--

DROP TABLE IF EXISTS `loaidichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaidichvu` (
  `IDLoaiDichVu` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoaiDichVu` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IDLoaiDichVu`),
  UNIQUE KEY `IDLoaiDichVu` (`IDLoaiDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaidichvu`
--

LOCK TABLES `loaidichvu` WRITE;
/*!40000 ALTER TABLE `loaidichvu` DISABLE KEYS */;
INSERT INTO `loaidichvu` VALUES (1,'Villa'),(2,'House'),(3,'Room');
/*!40000 ALTER TABLE `loaidichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhach`
--

DROP TABLE IF EXISTS `loaikhach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaikhach` (
  `IDLoaiKhach` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoaiKhach` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IDLoaiKhach`),
  UNIQUE KEY `IDLoaiKhach` (`IDLoaiKhach`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhach`
--

LOCK TABLES `loaikhach` WRITE;
/*!40000 ALTER TABLE `loaikhach` DISABLE KEYS */;
INSERT INTO `loaikhach` VALUES (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');
/*!40000 ALTER TABLE `loaikhach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `IDNhanVien` int(11) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `SoCMTND` int(11) NOT NULL,
  `Luong` decimal(10,0) DEFAULT NULL,
  `SDT` int(11) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `IdVitri` int(11) DEFAULT NULL,
  `IDTrinhDo` int(11) DEFAULT NULL,
  `IDBoPhan` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDNhanVien`),
  UNIQUE KEY `IDNhanVien` (`IDNhanVien`),
  UNIQUE KEY `SoCMTND` (`SoCMTND`),
  KEY `IDVitri_fk` (`IdVitri`),
  KEY `IDTrinhDo_fk` (`IDTrinhDo`),
  KEY `IDBoPhan_fk` (`IDBoPhan`),
  CONSTRAINT `IDBoPhan_fk` FOREIGN KEY (`IDBoPhan`) REFERENCES `bophan` (`IDBoPhan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDTrinhDo_fk` FOREIGN KEY (`IDTrinhDo`) REFERENCES `trinhdo` (`IDTrinhDo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDVitri_fk` FOREIGN KEY (`IdVitri`) REFERENCES `vitri` (`IDVitri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Hoàng Văn A','1990-01-24',12312345,7000000,76121212,'abc1@gamil.com','Quảng Trị',4,3,2),(2,'Đặng Văn B','1970-07-12',12312346,20000000,932121234,'abc2@gamil.com','Đà Nẵng',1,1,5),(3,'Trần C','1991-02-14',12312347,9000000,33121256,'abc3@gamil.com','Quảng Bình',2,2,3),(4,'Khánh Trang','1994-10-12',12312348,7000000,44121278,'Trang@gamil.com','Quảng Trị',4,3,1),(5,'Nguyễn Thị Trang','1992-11-11',12312398,15000000,231213412,'ab23@gamil.com','Đà Nẵng',3,1,2),(6,'Hoàng Thị Ngọc Quỳnh','1994-08-06',12312432,15000000,12123434,'abewq4@gamil.com','Huế',2,2,5),(7,'Trần Thị Thu Út','1980-06-19',12312567,9000000,2324356,'abqwe@gamil.com','Đà Nẵng',3,2,3),(8,'Lê Văn C','1982-05-21',12845743,7000000,821212345,'abqq223@gamil.com','Quảng Nam',4,2,2),(9,'Hoàng Ngọc G','1981-04-14',12324183,15000000,94121278,'abcwqe224@gamil.com','Hà Nội',2,3,4),(10,'Trần Long Hoàng Ngọc','1979-02-15',12324179,15000000,541212986,'abdsad4@gamil.com','Quảng Trị',2,1,5);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trinhdo`
--

DROP TABLE IF EXISTS `trinhdo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trinhdo` (
  `IDTrinhDo` int(11) NOT NULL AUTO_INCREMENT,
  `TrinhDo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IDTrinhDo`),
  UNIQUE KEY `IDTrinhDo` (`IDTrinhDo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinhdo`
--

LOCK TABLES `trinhdo` WRITE;
/*!40000 ALTER TABLE `trinhdo` DISABLE KEYS */;
INSERT INTO `trinhdo` VALUES (1,'Cao học'),(2,'Đại Học'),(3,'Cao đẳng'),(4,'Trung cấp');
/*!40000 ALTER TABLE `trinhdo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userrole`
--

DROP TABLE IF EXISTS `userrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userrole` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `userid_fk` (`userid`),
  KEY `roleid_fk` (`roleid`),
  CONSTRAINT `roleid_fk` FOREIGN KEY (`roleid`) REFERENCES `approle` (`roleid`),
  CONSTRAINT `userid_fk` FOREIGN KEY (`userid`) REFERENCES `appuser` (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrole`
--

LOCK TABLES `userrole` WRITE;
/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
INSERT INTO `userrole` VALUES (1,1,1),(2,1,2),(3,2,2);
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitri`
--

DROP TABLE IF EXISTS `vitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitri` (
  `IDVitri` int(11) NOT NULL AUTO_INCREMENT,
  `TenViTri` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IDVitri`),
  UNIQUE KEY `IDVitri` (`IDVitri`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vitri`
--

LOCK TABLES `vitri` WRITE;
/*!40000 ALTER TABLE `vitri` DISABLE KEYS */;
INSERT INTO `vitri` VALUES (1,'Giam Đốc'),(2,'Trưởng Phòng'),(3,'Quản Lý'),(4,'Nhan Vien');
/*!40000 ALTER TABLE `vitri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'casestudydatabase'
--

--
-- Dumping routines for database 'casestudydatabase'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-13 17:08:25
