SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- 初始化的时候如果已存在数据库则删除，并创建数据库
DROP DATABASE IF EXISTS `tank`;
CREATE DATABASE  `tank` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE `tank`;

-- ----------------------------
-- Table structure for map
-- ----------------------------
DROP TABLE IF EXISTS `map`;
CREATE TABLE `map`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `map` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
