/*
 Navicat Premium Data Transfer

 Source Server         : docker_245
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : 10.168.1.245:3306
 Source Schema         : ApolloPortalDB

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 14/01/2019 13:44:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for App
-- ----------------------------
DROP TABLE IF EXISTS `App`;
CREATE TABLE `App`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `AppId` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `Name` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '应用名',
  `OrgId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '部门Id',
  `OrgName` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '部门名字',
  `OwnerName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ownerName',
  `OwnerEmail` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ownerEmail',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `AppId`(`AppId`(191)) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_Name`(`Name`(191)) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应用表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of App
-- ----------------------------
INSERT INTO `App` VALUES (1, 'SampleApp', 'Sample App', 'TEST1', '样例部门1', 'apollo', 'apollo@acme.com', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `App` VALUES (2, 'ssm', 'hh-dlxt-app', 'TEST1', '样例部门1', 'apollo', 'apollo@acme.com', b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');

-- ----------------------------
-- Table structure for AppNamespace
-- ----------------------------
DROP TABLE IF EXISTS `AppNamespace`;
CREATE TABLE `AppNamespace`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `Name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'namespace名字，注意，需要全局唯一',
  `AppId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'app id',
  `Format` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'properties' COMMENT 'namespace的format类型',
  `IsPublic` bit(1) NOT NULL DEFAULT b'0' COMMENT 'namespace是否为公共',
  `Comment` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '注释',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_AppId`(`AppId`) USING BTREE,
  INDEX `Name_AppId`(`Name`, `AppId`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应用namespace定义' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of AppNamespace
-- ----------------------------
INSERT INTO `AppNamespace` VALUES (1, 'application', 'SampleApp', 'properties', b'0', 'default app namespace', b'0', '', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `AppNamespace` VALUES (2, 'application', 'ssm', 'properties', b'0', 'default app namespace', b'0', 'apollo', '2018-07-30 16:31:35', 'apollo', '2018-07-30 16:31:35');
INSERT INTO `AppNamespace` VALUES (3, 'ssm-dlxt', 'ssm', 'properties', b'0', '电力系统', b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');

-- ----------------------------
-- Table structure for Audit
-- ----------------------------
DROP TABLE IF EXISTS `Audit`;
CREATE TABLE `Audit`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `EntityName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '表名',
  `EntityId` int(10) UNSIGNED NULL DEFAULT NULL COMMENT '记录ID',
  `OpName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '操作类型',
  `Comment` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 479 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '日志审计表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Audit
-- ----------------------------
INSERT INTO `Audit` VALUES (1, 'App', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:31:35', NULL, '2018-07-30 16:31:35');
INSERT INTO `Audit` VALUES (2, 'AppNamespace', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:31:35', NULL, '2018-07-30 16:31:35');
INSERT INTO `Audit` VALUES (3, 'Cluster', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:31:35', NULL, '2018-07-30 16:31:35');
INSERT INTO `Audit` VALUES (4, 'Namespace', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:31:35', NULL, '2018-07-30 16:31:35');
INSERT INTO `Audit` VALUES (5, 'Item', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:32:45', NULL, '2018-07-30 16:32:45');
INSERT INTO `Audit` VALUES (6, 'Item', 2, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 16:32:51', NULL, '2018-07-30 16:32:51');
INSERT INTO `Audit` VALUES (7, 'Release', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:33:12', NULL, '2018-07-30 16:33:12');
INSERT INTO `Audit` VALUES (8, 'ReleaseHistory', 2, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:33:12', NULL, '2018-07-30 16:33:12');
INSERT INTO `Audit` VALUES (9, 'Item', 2, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 16:35:44', NULL, '2018-07-30 16:35:44');
INSERT INTO `Audit` VALUES (10, 'Release', 3, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:37:01', NULL, '2018-07-30 16:37:01');
INSERT INTO `Audit` VALUES (11, 'ReleaseHistory', 3, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 16:37:01', NULL, '2018-07-30 16:37:01');
INSERT INTO `Audit` VALUES (12, 'Item', 3, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:01:38', NULL, '2018-07-30 17:01:38');
INSERT INTO `Audit` VALUES (13, 'Item', 4, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:01:38', NULL, '2018-07-30 17:01:38');
INSERT INTO `Audit` VALUES (14, 'Item', 5, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:01:38', NULL, '2018-07-30 17:01:38');
INSERT INTO `Audit` VALUES (15, 'Item', 6, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:01:38', NULL, '2018-07-30 17:01:38');
INSERT INTO `Audit` VALUES (16, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:01:38', NULL, '2018-07-30 17:01:38');
INSERT INTO `Audit` VALUES (17, 'Release', 4, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:03:12', NULL, '2018-07-30 17:03:12');
INSERT INTO `Audit` VALUES (18, 'ReleaseHistory', 4, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:03:12', NULL, '2018-07-30 17:03:12');
INSERT INTO `Audit` VALUES (19, 'Item', 7, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:50', NULL, '2018-07-30 17:04:50');
INSERT INTO `Audit` VALUES (20, 'Item', 8, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:50', NULL, '2018-07-30 17:04:50');
INSERT INTO `Audit` VALUES (21, 'Item', 9, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:50', NULL, '2018-07-30 17:04:50');
INSERT INTO `Audit` VALUES (22, 'Item', 10, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:50', NULL, '2018-07-30 17:04:50');
INSERT INTO `Audit` VALUES (23, 'Item', 11, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:50', NULL, '2018-07-30 17:04:50');
INSERT INTO `Audit` VALUES (24, 'Item', 12, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (25, 'Item', 13, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (26, 'Item', 14, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (27, 'Item', 15, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (28, 'Item', 16, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (29, 'Item', 17, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (30, 'Item', 18, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (31, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:04:51', NULL, '2018-07-30 17:04:51');
INSERT INTO `Audit` VALUES (32, 'Item', 19, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (33, 'Item', 20, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (34, 'Item', 21, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (35, 'Item', 22, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (36, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (37, 'Item', 7, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (38, 'Item', 8, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (39, 'Item', 9, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (40, 'Item', 10, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (41, 'Item', 11, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (42, 'Item', 12, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (43, 'Item', 13, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (44, 'Item', 14, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (45, 'Item', 15, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (46, 'Item', 16, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (47, 'Item', 17, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (48, 'Item', 18, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (49, 'ItemSet', NULL, 'UPDATE', NULL, b'0', 'apollo', '2018-07-30 17:05:45', NULL, '2018-07-30 17:05:45');
INSERT INTO `Audit` VALUES (50, 'Release', 5, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:06:00', NULL, '2018-07-30 17:06:00');
INSERT INTO `Audit` VALUES (51, 'ReleaseHistory', 5, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:06:00', NULL, '2018-07-30 17:06:00');
INSERT INTO `Audit` VALUES (52, 'Item', 23, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (53, 'Item', 24, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (54, 'Item', 25, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (55, 'Item', 26, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (56, 'Item', 27, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (57, 'Item', 28, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (58, 'Item', 29, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (59, 'Item', 30, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (60, 'Item', 31, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (61, 'Item', 32, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (62, 'Item', 33, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (63, 'Item', 34, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (64, 'Item', 35, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (65, 'Item', 36, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (66, 'Item', 37, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (67, 'Item', 38, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (68, 'Item', 39, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (69, 'Item', 40, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (70, 'Item', 41, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (71, 'Item', 42, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (72, 'Item', 43, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (73, 'Item', 44, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (74, 'Item', 45, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (75, 'Item', 46, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (76, 'Item', 47, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (77, 'Item', 48, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (78, 'Item', 49, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (79, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:14', NULL, '2018-07-30 17:07:14');
INSERT INTO `Audit` VALUES (80, 'Release', 6, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:31', NULL, '2018-07-30 17:07:31');
INSERT INTO `Audit` VALUES (81, 'ReleaseHistory', 6, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:07:31', NULL, '2018-07-30 17:07:31');
INSERT INTO `Audit` VALUES (82, 'Namespace', 3, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:18:58', NULL, '2018-07-30 17:18:58');
INSERT INTO `Audit` VALUES (83, 'AppNamespace', 3, 'INSERT', NULL, b'0', 'apollo', '2018-07-30 17:18:58', NULL, '2018-07-30 17:18:58');
INSERT INTO `Audit` VALUES (84, 'Release', 7, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:39:47', NULL, '2018-07-31 11:39:47');
INSERT INTO `Audit` VALUES (85, 'ReleaseHistory', 7, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:39:47', NULL, '2018-07-31 11:39:47');
INSERT INTO `Audit` VALUES (86, 'Release', 8, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:39:55', NULL, '2018-07-31 11:39:55');
INSERT INTO `Audit` VALUES (87, 'ReleaseHistory', 8, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:39:55', NULL, '2018-07-31 11:39:55');
INSERT INTO `Audit` VALUES (88, 'Release', 9, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:02', NULL, '2018-07-31 11:40:02');
INSERT INTO `Audit` VALUES (89, 'ReleaseHistory', 9, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:02', NULL, '2018-07-31 11:40:02');
INSERT INTO `Audit` VALUES (90, 'Item', 50, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (91, 'Item', 51, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (92, 'Item', 52, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (93, 'Item', 53, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (94, 'Item', 54, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (95, 'Item', 55, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (96, 'Item', 56, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (97, 'Item', 57, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (98, 'Item', 58, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (99, 'Item', 59, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (100, 'Item', 60, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (101, 'Item', 61, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (102, 'Item', 62, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (103, 'Item', 63, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (104, 'Item', 64, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (105, 'Item', 65, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (106, 'Item', 66, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (107, 'Item', 67, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (108, 'Item', 68, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (109, 'Item', 69, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (110, 'Item', 70, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (111, 'Item', 71, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (112, 'Item', 72, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:49', NULL, '2018-07-31 11:40:49');
INSERT INTO `Audit` VALUES (113, 'Item', 73, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (114, 'Item', 74, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (115, 'Item', 75, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (116, 'Item', 76, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (117, 'Item', 77, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (118, 'Item', 78, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (119, 'Item', 79, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (120, 'Item', 80, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (121, 'Item', 81, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (122, 'Item', 82, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (123, 'Item', 83, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (124, 'Item', 84, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (125, 'Item', 85, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (126, 'Item', 86, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (127, 'Item', 87, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (128, 'Item', 88, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (129, 'Item', 89, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (130, 'Item', 90, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (131, 'Item', 91, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (132, 'Item', 92, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (133, 'Item', 93, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (134, 'Item', 94, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (135, 'Item', 95, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (136, 'Item', 96, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (137, 'Item', 97, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (138, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:40:50', NULL, '2018-07-31 11:40:50');
INSERT INTO `Audit` VALUES (139, 'Release', 10, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:41:03', NULL, '2018-07-31 11:41:03');
INSERT INTO `Audit` VALUES (140, 'ReleaseHistory', 10, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 11:41:03', NULL, '2018-07-31 11:41:03');
INSERT INTO `Audit` VALUES (141, 'Item', 98, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:31:22', NULL, '2018-07-31 15:31:22');
INSERT INTO `Audit` VALUES (142, 'Item', 99, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:31:55', NULL, '2018-07-31 15:31:55');
INSERT INTO `Audit` VALUES (143, 'Release', 11, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:32:06', NULL, '2018-07-31 15:32:06');
INSERT INTO `Audit` VALUES (144, 'ReleaseHistory', 11, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:32:06', NULL, '2018-07-31 15:32:06');
INSERT INTO `Audit` VALUES (145, 'Release', 12, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:32:14', NULL, '2018-07-31 15:32:14');
INSERT INTO `Audit` VALUES (146, 'ReleaseHistory', 12, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:32:14', NULL, '2018-07-31 15:32:14');
INSERT INTO `Audit` VALUES (147, 'Item', 98, 'UPDATE', NULL, b'0', 'apollo', '2018-07-31 15:41:55', NULL, '2018-07-31 15:41:55');
INSERT INTO `Audit` VALUES (148, 'Release', 13, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:43:04', NULL, '2018-07-31 15:43:04');
INSERT INTO `Audit` VALUES (149, 'ReleaseHistory', 13, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 15:43:04', NULL, '2018-07-31 15:43:04');
INSERT INTO `Audit` VALUES (150, 'Item', 6, 'UPDATE', NULL, b'0', 'apollo', '2018-07-31 16:18:33', NULL, '2018-07-31 16:18:33');
INSERT INTO `Audit` VALUES (151, 'Release', 14, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:21:22', NULL, '2018-07-31 16:21:22');
INSERT INTO `Audit` VALUES (152, 'ReleaseHistory', 14, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:21:23', NULL, '2018-07-31 16:21:23');
INSERT INTO `Audit` VALUES (153, 'Item', 6, 'UPDATE', NULL, b'0', 'apollo', '2018-07-31 16:24:57', NULL, '2018-07-31 16:24:57');
INSERT INTO `Audit` VALUES (154, 'Release', 15, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:25:02', NULL, '2018-07-31 16:25:02');
INSERT INTO `Audit` VALUES (155, 'ReleaseHistory', 15, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:25:02', NULL, '2018-07-31 16:25:02');
INSERT INTO `Audit` VALUES (156, 'Item', 6, 'UPDATE', NULL, b'0', 'apollo', '2018-07-31 16:26:55', NULL, '2018-07-31 16:26:55');
INSERT INTO `Audit` VALUES (157, 'Release', 16, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:27:01', NULL, '2018-07-31 16:27:01');
INSERT INTO `Audit` VALUES (158, 'ReleaseHistory', 16, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:27:01', NULL, '2018-07-31 16:27:01');
INSERT INTO `Audit` VALUES (159, 'Item', 4, 'UPDATE', NULL, b'0', 'apollo', '2018-07-31 16:35:03', NULL, '2018-07-31 16:35:03');
INSERT INTO `Audit` VALUES (160, 'Release', 17, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:35:08', NULL, '2018-07-31 16:35:08');
INSERT INTO `Audit` VALUES (161, 'ReleaseHistory', 17, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:35:08', NULL, '2018-07-31 16:35:08');
INSERT INTO `Audit` VALUES (162, 'Item', 4, 'UPDATE', NULL, b'0', 'apollo', '2018-07-31 16:38:23', NULL, '2018-07-31 16:38:23');
INSERT INTO `Audit` VALUES (163, 'Release', 18, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:38:28', NULL, '2018-07-31 16:38:28');
INSERT INTO `Audit` VALUES (164, 'ReleaseHistory', 18, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 16:38:28', NULL, '2018-07-31 16:38:28');
INSERT INTO `Audit` VALUES (165, 'Item', 100, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 17:01:50', NULL, '2018-07-31 17:01:50');
INSERT INTO `Audit` VALUES (166, 'Item', 101, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 17:02:43', NULL, '2018-07-31 17:02:43');
INSERT INTO `Audit` VALUES (167, 'Item', 102, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 17:03:17', NULL, '2018-07-31 17:03:17');
INSERT INTO `Audit` VALUES (168, 'Release', 19, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 17:03:23', NULL, '2018-07-31 17:03:23');
INSERT INTO `Audit` VALUES (169, 'ReleaseHistory', 19, 'INSERT', NULL, b'0', 'apollo', '2018-07-31 17:03:24', NULL, '2018-07-31 17:03:24');
INSERT INTO `Audit` VALUES (170, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 12:38:05', NULL, '2018-08-01 12:38:05');
INSERT INTO `Audit` VALUES (171, 'Release', 20, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 12:38:22', NULL, '2018-08-01 12:38:22');
INSERT INTO `Audit` VALUES (172, 'ReleaseHistory', 20, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 12:38:23', NULL, '2018-08-01 12:38:23');
INSERT INTO `Audit` VALUES (173, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:06:50', NULL, '2018-08-01 14:06:50');
INSERT INTO `Audit` VALUES (174, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:06:48', NULL, '2018-08-01 14:06:48');
INSERT INTO `Audit` VALUES (175, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:07:35', NULL, '2018-08-01 14:07:35');
INSERT INTO `Audit` VALUES (176, 'Release', 21, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:08:23', NULL, '2018-08-01 14:08:23');
INSERT INTO `Audit` VALUES (177, 'ReleaseHistory', 21, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:08:24', NULL, '2018-08-01 14:08:24');
INSERT INTO `Audit` VALUES (178, 'Item', 2, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:24:02', NULL, '2018-08-01 14:24:02');
INSERT INTO `Audit` VALUES (179, 'Release', 22, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:24:39', NULL, '2018-08-01 14:24:39');
INSERT INTO `Audit` VALUES (180, 'ReleaseHistory', 22, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:24:39', NULL, '2018-08-01 14:24:39');
INSERT INTO `Audit` VALUES (181, 'Item', 98, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:25:20', NULL, '2018-08-01 14:25:20');
INSERT INTO `Audit` VALUES (182, 'Release', 23, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:25:26', NULL, '2018-08-01 14:25:26');
INSERT INTO `Audit` VALUES (183, 'ReleaseHistory', 23, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:25:26', NULL, '2018-08-01 14:25:26');
INSERT INTO `Audit` VALUES (184, 'Item', 103, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:11', NULL, '2018-08-01 14:26:11');
INSERT INTO `Audit` VALUES (185, 'Item', 104, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:11', NULL, '2018-08-01 14:26:11');
INSERT INTO `Audit` VALUES (186, 'Item', 105, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:11', NULL, '2018-08-01 14:26:11');
INSERT INTO `Audit` VALUES (187, 'Item', 106, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:12', NULL, '2018-08-01 14:26:12');
INSERT INTO `Audit` VALUES (188, 'Item', 107, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:12', NULL, '2018-08-01 14:26:12');
INSERT INTO `Audit` VALUES (189, 'Item', 108, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:12', NULL, '2018-08-01 14:26:12');
INSERT INTO `Audit` VALUES (190, 'Item', 109, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:12', NULL, '2018-08-01 14:26:12');
INSERT INTO `Audit` VALUES (191, 'Item', 110, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:12', NULL, '2018-08-01 14:26:12');
INSERT INTO `Audit` VALUES (192, 'Item', 111, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (193, 'Item', 112, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (194, 'Item', 113, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (195, 'Item', 114, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (196, 'Item', 115, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (197, 'Item', 116, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (198, 'Item', 117, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (199, 'Item', 118, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (200, 'Item', 119, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (201, 'Item', 120, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (202, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (203, 'Item', 51, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (204, 'Item', 52, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (205, 'Item', 53, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (206, 'Item', 54, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (207, 'Item', 55, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (208, 'Item', 56, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:13', NULL, '2018-08-01 14:26:13');
INSERT INTO `Audit` VALUES (209, 'Item', 57, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (210, 'Item', 58, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (211, 'Item', 59, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (212, 'Item', 60, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (213, 'Item', 61, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (214, 'Item', 62, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (215, 'Item', 63, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (216, 'Item', 64, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (217, 'Item', 65, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (218, 'Item', 66, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (219, 'Item', 67, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (220, 'Item', 68, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (221, 'Item', 69, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (222, 'Item', 70, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (223, 'Item', 71, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (224, 'Item', 74, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (225, 'Item', 76, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (226, 'Item', 79, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (227, 'Item', 81, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:14', NULL, '2018-08-01 14:26:14');
INSERT INTO `Audit` VALUES (228, 'Item', 85, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (229, 'Item', 87, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (230, 'Item', 89, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (231, 'Item', 91, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (232, 'Item', 93, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (233, 'Item', 95, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (234, 'Item', 97, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (235, 'ItemSet', NULL, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (236, 'Item', 72, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (237, 'Item', 73, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (238, 'Item', 75, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (239, 'Item', 77, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (240, 'Item', 78, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:15', NULL, '2018-08-01 14:26:15');
INSERT INTO `Audit` VALUES (241, 'Item', 80, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (242, 'Item', 82, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (243, 'Item', 83, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (244, 'Item', 84, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (245, 'Item', 86, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (246, 'Item', 88, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (247, 'Item', 90, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (248, 'Item', 92, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (249, 'Item', 94, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:16', NULL, '2018-08-01 14:26:16');
INSERT INTO `Audit` VALUES (250, 'Item', 96, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:17', NULL, '2018-08-01 14:26:17');
INSERT INTO `Audit` VALUES (251, 'Item', 99, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:17', NULL, '2018-08-01 14:26:17');
INSERT INTO `Audit` VALUES (252, 'Item', 50, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:17', NULL, '2018-08-01 14:26:17');
INSERT INTO `Audit` VALUES (253, 'ItemSet', NULL, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:17', NULL, '2018-08-01 14:26:17');
INSERT INTO `Audit` VALUES (254, 'Item', 121, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:31', NULL, '2018-08-01 14:26:31');
INSERT INTO `Audit` VALUES (255, 'Item', 122, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:31', NULL, '2018-08-01 14:26:31');
INSERT INTO `Audit` VALUES (256, 'Item', 123, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:31', NULL, '2018-08-01 14:26:31');
INSERT INTO `Audit` VALUES (257, 'Item', 124, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (258, 'Item', 125, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (259, 'Item', 126, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (260, 'Item', 127, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (261, 'Item', 128, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (262, 'Item', 129, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (263, 'Item', 130, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (264, 'Item', 131, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (265, 'Item', 132, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (266, 'Item', 133, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (267, 'Item', 134, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (268, 'Item', 135, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (269, 'Item', 136, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:32', NULL, '2018-08-01 14:26:32');
INSERT INTO `Audit` VALUES (270, 'Item', 137, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (271, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (272, 'Item', 51, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (273, 'Item', 52, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (274, 'Item', 53, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (275, 'Item', 54, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (276, 'Item', 55, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (277, 'Item', 56, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (278, 'Item', 57, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:33', NULL, '2018-08-01 14:26:33');
INSERT INTO `Audit` VALUES (279, 'Item', 58, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:34', NULL, '2018-08-01 14:26:34');
INSERT INTO `Audit` VALUES (280, 'Item', 59, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:34', NULL, '2018-08-01 14:26:34');
INSERT INTO `Audit` VALUES (281, 'Item', 60, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:34', NULL, '2018-08-01 14:26:34');
INSERT INTO `Audit` VALUES (282, 'Item', 61, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:34', NULL, '2018-08-01 14:26:34');
INSERT INTO `Audit` VALUES (283, 'Item', 62, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:34', NULL, '2018-08-01 14:26:34');
INSERT INTO `Audit` VALUES (284, 'Item', 63, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (285, 'Item', 64, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (286, 'Item', 65, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (287, 'Item', 66, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (288, 'Item', 67, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (289, 'Item', 68, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (290, 'Item', 69, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (291, 'Item', 70, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (292, 'Item', 71, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (293, 'Item', 74, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:36', NULL, '2018-08-01 14:26:36');
INSERT INTO `Audit` VALUES (294, 'Item', 76, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (295, 'Item', 79, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (296, 'Item', 81, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (297, 'Item', 85, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (298, 'Item', 87, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (299, 'Item', 89, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (300, 'Item', 91, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (301, 'Item', 93, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (302, 'Item', 95, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:37', NULL, '2018-08-01 14:26:37');
INSERT INTO `Audit` VALUES (303, 'Item', 97, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (304, 'ItemSet', NULL, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (305, 'Item', 103, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (306, 'Item', 104, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (307, 'Item', 105, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (308, 'Item', 106, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (309, 'Item', 107, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (310, 'Item', 108, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (311, 'Item', 109, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (312, 'Item', 110, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (313, 'Item', 111, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (314, 'Item', 112, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (315, 'Item', 113, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (316, 'Item', 114, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (317, 'Item', 115, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (318, 'Item', 116, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (319, 'Item', 117, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (320, 'Item', 119, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (321, 'Item', 120, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (322, 'Item', 118, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (323, 'ItemSet', NULL, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:26:38', NULL, '2018-08-01 14:26:38');
INSERT INTO `Audit` VALUES (324, 'Release', 24, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:55', NULL, '2018-08-01 14:26:55');
INSERT INTO `Audit` VALUES (325, 'ReleaseHistory', 24, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:26:56', NULL, '2018-08-01 14:26:56');
INSERT INTO `Audit` VALUES (326, 'Item', 138, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (327, 'Item', 139, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (328, 'Item', 140, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (329, 'Item', 141, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (330, 'Item', 142, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (331, 'Item', 143, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (332, 'Item', 144, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (333, 'Item', 145, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (334, 'Item', 146, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (335, 'Item', 147, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (336, 'Item', 148, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (337, 'Item', 149, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (338, 'Item', 150, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (339, 'Item', 151, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (340, 'Item', 152, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (341, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (342, 'Item', 3, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (343, 'Item', 4, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (344, 'Item', 5, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:00', NULL, '2018-08-01 14:27:00');
INSERT INTO `Audit` VALUES (345, 'Item', 6, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (346, 'Item', 19, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (347, 'Item', 20, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (348, 'Item', 21, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (349, 'Item', 22, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (350, 'Item', 7, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (351, 'Item', 8, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (352, 'Item', 9, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (353, 'Item', 10, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (354, 'Item', 11, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (355, 'Item', 12, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (356, 'Item', 13, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (357, 'Item', 14, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (358, 'Item', 15, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (359, 'Item', 16, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (360, 'Item', 17, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (361, 'Item', 18, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (362, 'Item', 23, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (363, 'Item', 26, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (364, 'Item', 28, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (365, 'Item', 31, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (366, 'Item', 33, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (367, 'Item', 37, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (368, 'Item', 39, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (369, 'Item', 41, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (370, 'Item', 43, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (371, 'Item', 45, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (372, 'Item', 47, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (373, 'Item', 49, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (374, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (375, 'Item', 101, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (376, 'Item', 102, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (377, 'ItemSet', NULL, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (378, 'Item', 24, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (379, 'Item', 25, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (380, 'Item', 27, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (381, 'Item', 29, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (382, 'Item', 30, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:01', NULL, '2018-08-01 14:27:01');
INSERT INTO `Audit` VALUES (383, 'Item', 32, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (384, 'Item', 34, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (385, 'Item', 35, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (386, 'Item', 36, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (387, 'Item', 38, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (388, 'Item', 40, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (389, 'Item', 42, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (390, 'Item', 44, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (391, 'Item', 46, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (392, 'Item', 48, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (393, 'ItemSet', NULL, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 14:27:02', NULL, '2018-08-01 14:27:02');
INSERT INTO `Audit` VALUES (394, 'Release', 25, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:06', NULL, '2018-08-01 14:27:06');
INSERT INTO `Audit` VALUES (395, 'ReleaseHistory', 25, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 14:27:07', NULL, '2018-08-01 14:27:07');
INSERT INTO `Audit` VALUES (396, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 15:59:39', NULL, '2018-08-01 15:59:39');
INSERT INTO `Audit` VALUES (397, 'Item', 137, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:00:07', NULL, '2018-08-01 16:00:07');
INSERT INTO `Audit` VALUES (398, 'Item', 121, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:00:18', NULL, '2018-08-01 16:00:18');
INSERT INTO `Audit` VALUES (399, 'Release', 26, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:01:06', NULL, '2018-08-01 16:01:06');
INSERT INTO `Audit` VALUES (400, 'ReleaseHistory', 26, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:01:06', NULL, '2018-08-01 16:01:06');
INSERT INTO `Audit` VALUES (401, 'Release', 27, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:01:30', NULL, '2018-08-01 16:01:30');
INSERT INTO `Audit` VALUES (402, 'ReleaseHistory', 27, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:01:30', NULL, '2018-08-01 16:01:30');
INSERT INTO `Audit` VALUES (403, 'Item', 153, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (404, 'Item', 154, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (405, 'Item', 155, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (406, 'Item', 156, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (407, 'Item', 157, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (408, 'Item', 158, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (409, 'Item', 159, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (410, 'Item', 160, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (411, 'Item', 161, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (412, 'Item', 162, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (413, 'Item', 163, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (414, 'Item', 164, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (415, 'Item', 165, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (416, 'Item', 166, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (417, 'Item', 167, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (418, 'Item', 168, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (419, 'Item', 169, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:00', NULL, '2018-08-01 16:02:00');
INSERT INTO `Audit` VALUES (420, 'Item', 170, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (421, 'ItemSet', NULL, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (422, 'Item', 51, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (423, 'Item', 52, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (424, 'Item', 53, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (425, 'Item', 54, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (426, 'Item', 55, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (427, 'Item', 56, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (428, 'Item', 57, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (429, 'Item', 58, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (430, 'Item', 59, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (431, 'Item', 60, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (432, 'Item', 61, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (433, 'Item', 62, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (434, 'Item', 63, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (435, 'Item', 64, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (436, 'Item', 65, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (437, 'Item', 66, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (438, 'Item', 67, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (439, 'Item', 68, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (440, 'Item', 69, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (441, 'Item', 70, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (442, 'Item', 71, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (443, 'Item', 74, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (444, 'Item', 76, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (445, 'Item', 79, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (446, 'Item', 81, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (447, 'Item', 85, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (448, 'Item', 87, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (449, 'Item', 89, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (450, 'Item', 91, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (451, 'Item', 93, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (452, 'Item', 95, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (453, 'Item', 97, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (454, 'ItemSet', NULL, 'UPDATE', NULL, b'0', 'apollo', '2018-08-01 16:02:01', NULL, '2018-08-01 16:02:01');
INSERT INTO `Audit` VALUES (455, 'Item', 122, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (456, 'Item', 123, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (457, 'Item', 124, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (458, 'Item', 125, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (459, 'Item', 126, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (460, 'Item', 127, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (461, 'Item', 128, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (462, 'Item', 129, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (463, 'Item', 130, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (464, 'Item', 131, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (465, 'Item', 132, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (466, 'Item', 133, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (467, 'Item', 134, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (468, 'Item', 135, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (469, 'Item', 136, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (470, 'ItemSet', NULL, 'DELETE', NULL, b'0', 'apollo', '2018-08-01 16:02:02', NULL, '2018-08-01 16:02:02');
INSERT INTO `Audit` VALUES (471, 'Release', 28, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:07', NULL, '2018-08-01 16:02:07');
INSERT INTO `Audit` VALUES (472, 'ReleaseHistory', 28, 'INSERT', NULL, b'0', 'apollo', '2018-08-01 16:02:07', NULL, '2018-08-01 16:02:07');
INSERT INTO `Audit` VALUES (473, 'Item', 100, 'UPDATE', NULL, b'0', 'apollo', '2018-08-03 09:49:54', NULL, '2018-08-03 09:49:54');
INSERT INTO `Audit` VALUES (474, 'Release', 29, 'INSERT', NULL, b'0', 'apollo', '2018-08-03 09:50:18', NULL, '2018-08-03 09:50:18');
INSERT INTO `Audit` VALUES (475, 'ReleaseHistory', 29, 'INSERT', NULL, b'0', 'apollo', '2018-08-03 09:50:18', NULL, '2018-08-03 09:50:18');
INSERT INTO `Audit` VALUES (476, 'Item', 168, 'UPDATE', NULL, b'0', 'apollo', '2018-08-03 10:05:47', NULL, '2018-08-03 10:05:47');
INSERT INTO `Audit` VALUES (477, 'Release', 30, 'INSERT', NULL, b'0', 'apollo', '2018-08-03 10:05:53', NULL, '2018-08-03 10:05:53');
INSERT INTO `Audit` VALUES (478, 'ReleaseHistory', 30, 'INSERT', NULL, b'0', 'apollo', '2018-08-03 10:05:53', NULL, '2018-08-03 10:05:53');

-- ----------------------------
-- Table structure for Authorities
-- ----------------------------
DROP TABLE IF EXISTS `Authorities`;
CREATE TABLE `Authorities`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Authority` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Authorities
-- ----------------------------
INSERT INTO `Authorities` VALUES (1, 'apollo', 'ROLE_user');

-- ----------------------------
-- Table structure for Cluster
-- ----------------------------
DROP TABLE IF EXISTS `Cluster`;
CREATE TABLE `Cluster`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `Name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '集群名字',
  `AppId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'App id',
  `ParentClusterId` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '父cluster',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_AppId_Name`(`AppId`, `Name`) USING BTREE,
  INDEX `IX_ParentClusterId`(`ParentClusterId`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '集群' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Cluster
-- ----------------------------
INSERT INTO `Cluster` VALUES (1, 'default', 'SampleApp', 0, b'0', '', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `Cluster` VALUES (2, 'default', 'ssm', 0, b'0', 'apollo', '2018-07-30 16:31:35', 'apollo', '2018-07-30 16:31:35');

-- ----------------------------
-- Table structure for Commit
-- ----------------------------
DROP TABLE IF EXISTS `Commit`;
CREATE TABLE `Commit`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ChangeSets` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '修改变更集',
  `AppId` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `ClusterName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ClusterName',
  `NamespaceName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'namespaceName',
  `Comment` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `AppId`(`AppId`(191)) USING BTREE,
  INDEX `ClusterName`(`ClusterName`(191)) USING BTREE,
  INDEX `NamespaceName`(`NamespaceName`(191)) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'commit 历史表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Commit
-- ----------------------------
INSERT INTO `Commit` VALUES (1, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"sql-url\",\"value\":\"10.168.1.131\",\"comment\":\"数据库地址\",\"lineNum\":1,\"id\":2,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 16:32:44\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 16:32:44\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-30 16:32:45', 'apollo', '2018-07-30 16:32:45');
INSERT INTO `Commit` VALUES (2, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"sql-url\",\"value\":\"10.168.1.131\",\"comment\":\"数据库地址\",\"lineNum\":1,\"id\":2,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 16:32:45\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 16:32:45\"},\"newItem\":{\"namespaceId\":2,\"key\":\"sql-url\",\"value\":\"10.168.1.245\",\"comment\":\"数据库地址\",\"lineNum\":1,\"id\":2,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 16:32:45\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 16:35:43\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-30 16:35:44', 'apollo', '2018-07-30 16:35:44');
INSERT INTO `Commit` VALUES (3, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"jdbc.driver\",\"value\":\"oracle.jdbc.driver.OracleDriver\",\"comment\":\"\",\"lineNum\":2,\"id\":3,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:37\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:01:37\"},{\"namespaceId\":2,\"key\":\"jdbc.url\",\"value\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"comment\":\"\",\"lineNum\":3,\"id\":4,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:37\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:01:37\"},{\"namespaceId\":2,\"key\":\"jdbc.username\",\"value\":\"adminsystem\",\"comment\":\"\",\"lineNum\":4,\"id\":5,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:37\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:01:37\"},{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:37\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:01:37\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-30 17:01:38', 'apollo', '2018-07-30 17:01:38');
INSERT INTO `Commit` VALUES (4, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"jdbc.maxWait\",\"value\":\"60000\",\"comment\":\"\",\"lineNum\":6,\"id\":7,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.initialSize\",\"value\":\"15\",\"comment\":\"\",\"lineNum\":7,\"id\":8,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.maxActive\",\"value\":\"5000\",\"comment\":\"\",\"lineNum\":8,\"id\":9,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.maxIdle\",\"value\":\"0\",\"comment\":\"\",\"lineNum\":9,\"id\":10,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.maxWait\",\"value\":\"900000\",\"comment\":\"\",\"lineNum\":10,\"id\":11,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.defaultAutoCommit\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":11,\"id\":12,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.removeAbandoned\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":12,\"id\":13,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.removeAbandonedTimeout\",\"value\":\"30\",\"comment\":\"\",\"lineNum\":13,\"id\":14,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.whenExhaustedAction\",\"value\":\"1\",\"comment\":\"\",\"lineNum\":14,\"id\":15,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.validationQuery\",\"value\":\"select 1 from dual\",\"comment\":\"\",\"lineNum\":15,\"id\":16,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.testOnBorrow\",\"value\":\"fasle\",\"comment\":\"\",\"lineNum\":16,\"id\":17,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"},{\"namespaceId\":2,\"key\":\"dbcp.testOnReturn\",\"value\":\"false\",\"comment\":\"\",\"lineNum\":17,\"id\":18,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:04:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:04:50\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-07-30 17:04:51');
INSERT INTO `Commit` VALUES (5, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"jdbc.initialSize\",\"value\":\"0\",\"comment\":\"\",\"lineNum\":6,\"id\":19,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:05:44\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:05:45\"},{\"namespaceId\":2,\"key\":\"jdbc.maxActive\",\"value\":\"20\",\"comment\":\"\",\"lineNum\":7,\"id\":20,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:05:44\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:05:45\"},{\"namespaceId\":2,\"key\":\"jdbc.maxIdle\",\"value\":\"20\",\"comment\":\"\",\"lineNum\":8,\"id\":21,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:05:44\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:05:45\"},{\"namespaceId\":2,\"key\":\"jdbc.minIdle\",\"value\":\"1\",\"comment\":\"\",\"lineNum\":9,\"id\":22,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:05:44\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:05:45\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-30 17:05:45', 'apollo', '2018-07-30 17:05:45');
INSERT INTO `Commit` VALUES (6, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"redis.hostName\",\"value\":\"10.168.1.233\",\"comment\":\"\",\"lineNum\":22,\"id\":23,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.port\",\"value\":\"6379\",\"comment\":\"\",\"lineNum\":25,\"id\":26,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.password\",\"value\":\"123456\",\"comment\":\"\",\"lineNum\":27,\"id\":28,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.timeout\",\"value\":\"10000\",\"comment\":\"\",\"lineNum\":30,\"id\":31,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.maxIdle\",\"value\":\"300\",\"comment\":\"\",\"lineNum\":32,\"id\":33,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.maxTotal\",\"value\":\"1000\",\"comment\":\"\",\"lineNum\":36,\"id\":37,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.maxWaitMillis\",\"value\":\"1000\",\"comment\":\"\",\"lineNum\":38,\"id\":39,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.minEvictableIdleTimeMillis\",\"value\":\"300000\",\"comment\":\"\",\"lineNum\":40,\"id\":41,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.numTestsPerEvictionRun\",\"value\":\"1024\",\"comment\":\"\",\"lineNum\":42,\"id\":43,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.timeBetweenEvictionRunsMillis\",\"value\":\"30000\",\"comment\":\"\",\"lineNum\":44,\"id\":45,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.testOnBorrow\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":46,\"id\":47,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"},{\"namespaceId\":2,\"key\":\"redis.testWhileIdle\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":48,\"id\":49,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:07:14\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:07:14\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-07-30 17:07:14');
INSERT INTO `Commit` VALUES (7, '{\"createItems\":[{\"namespaceId\":3,\"key\":\"sql-url\",\"value\":\"10.168.1.245\",\"comment\":\"\",\"lineNum\":1,\"id\":50,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.driver\",\"value\":\"oracle.jdbc.driver.OracleDriver\",\"comment\":\"\",\"lineNum\":2,\"id\":51,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.url\",\"value\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"comment\":\"\",\"lineNum\":3,\"id\":52,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.username\",\"value\":\"adminsystem\",\"comment\":\"\",\"lineNum\":4,\"id\":53,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"comment\":\"\",\"lineNum\":5,\"id\":54,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.initialSize\",\"value\":\"0\",\"comment\":\"\",\"lineNum\":6,\"id\":55,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.maxActive\",\"value\":\"20\",\"comment\":\"\",\"lineNum\":7,\"id\":56,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.maxIdle\",\"value\":\"20\",\"comment\":\"\",\"lineNum\":8,\"id\":57,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.minIdle\",\"value\":\"1\",\"comment\":\"\",\"lineNum\":9,\"id\":58,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:48\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"jdbc.maxWait\",\"value\":\"60000\",\"comment\":\"\",\"lineNum\":10,\"id\":59,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.initialSize\",\"value\":\"15\",\"comment\":\"\",\"lineNum\":11,\"id\":60,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.maxActive\",\"value\":\"5000\",\"comment\":\"\",\"lineNum\":12,\"id\":61,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.maxIdle\",\"value\":\"0\",\"comment\":\"\",\"lineNum\":13,\"id\":62,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.maxWait\",\"value\":\"900000\",\"comment\":\"\",\"lineNum\":14,\"id\":63,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.defaultAutoCommit\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":15,\"id\":64,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.removeAbandoned\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":16,\"id\":65,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.removeAbandonedTimeout\",\"value\":\"30\",\"comment\":\"\",\"lineNum\":17,\"id\":66,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.whenExhaustedAction\",\"value\":\"1\",\"comment\":\"\",\"lineNum\":18,\"id\":67,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.validationQuery\",\"value\":\"select 1 from dual\",\"comment\":\"\",\"lineNum\":19,\"id\":68,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.testOnBorrow\",\"value\":\"fasle\",\"comment\":\"\",\"lineNum\":20,\"id\":69,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"dbcp.testOnReturn\",\"value\":\"false\",\"comment\":\"\",\"lineNum\":21,\"id\":70,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.hostName\",\"value\":\"10.168.1.233\",\"comment\":\"\",\"lineNum\":22,\"id\":71,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.port\",\"value\":\"6379\",\"comment\":\"\",\"lineNum\":25,\"id\":74,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.password\",\"value\":\"123456\",\"comment\":\"\",\"lineNum\":27,\"id\":76,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.timeout\",\"value\":\"10000\",\"comment\":\"\",\"lineNum\":30,\"id\":79,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.maxIdle\",\"value\":\"300\",\"comment\":\"\",\"lineNum\":32,\"id\":81,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.maxTotal\",\"value\":\"1000\",\"comment\":\"\",\"lineNum\":36,\"id\":85,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.maxWaitMillis\",\"value\":\"1000\",\"comment\":\"\",\"lineNum\":38,\"id\":87,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.minEvictableIdleTimeMillis\",\"value\":\"300000\",\"comment\":\"\",\"lineNum\":40,\"id\":89,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.numTestsPerEvictionRun\",\"value\":\"1024\",\"comment\":\"\",\"lineNum\":42,\"id\":91,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.timeBetweenEvictionRunsMillis\",\"value\":\"30000\",\"comment\":\"\",\"lineNum\":44,\"id\":93,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.testOnBorrow\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":46,\"id\":95,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"},{\"namespaceId\":3,\"key\":\"redis.testWhileIdle\",\"value\":\"true\",\"comment\":\"\",\"lineNum\":48,\"id\":97,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 11:40:49\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-07-31 11:40:50');
INSERT INTO `Commit` VALUES (8, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"redis.ip\",\"value\":\"10.168.1.245\",\"lineNum\":49,\"id\":98,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 15:31:20\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 15:31:22\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 15:31:22', 'apollo', '2018-07-31 15:31:22');
INSERT INTO `Commit` VALUES (9, '{\"createItems\":[{\"namespaceId\":3,\"key\":\"redis.ip\",\"value\":\"10.168.1.265\",\"lineNum\":49,\"id\":99,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 15:31:54\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 15:31:54\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-07-31 15:31:55', 'apollo', '2018-07-31 15:31:55');
INSERT INTO `Commit` VALUES (10, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"redis.ip\",\"value\":\"10.168.1.245\",\"lineNum\":49,\"id\":98,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 15:31:21\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 15:31:21\"},\"newItem\":{\"namespaceId\":2,\"key\":\"redis.ip\",\"value\":\"10.168.1.265\",\"comment\":\"\",\"lineNum\":49,\"id\":98,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 15:31:21\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 15:41:55\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 15:41:55', 'apollo', '2018-07-31 15:41:55');
INSERT INTO `Commit` VALUES (11, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:01:38\"},\"newItem\":{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:18:33\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 16:18:34', 'apollo', '2018-07-31 16:18:34');
INSERT INTO `Commit` VALUES (12, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:18:34\"},\"newItem\":{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco-\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:24:57\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 16:24:57', 'apollo', '2018-07-31 16:24:57');
INSERT INTO `Commit` VALUES (13, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco-\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:24:57\"},\"newItem\":{\"namespaceId\":2,\"key\":\"jdbc.password\",\"value\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"comment\":\"\",\"lineNum\":5,\"id\":6,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:26:55\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 16:26:55', 'apollo', '2018-07-31 16:26:55');
INSERT INTO `Commit` VALUES (14, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"jdbc.url\",\"value\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"comment\":\"\",\"lineNum\":3,\"id\":4,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-30 17:01:38\"},\"newItem\":{\"namespaceId\":2,\"key\":\"jdbc.url\",\"value\":\"jdbc:oracle:thin:@10.168.1.235:1521:ORA11G\",\"comment\":\"\",\"lineNum\":3,\"id\":4,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:35:03\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 16:35:03', 'apollo', '2018-07-31 16:35:03');
INSERT INTO `Commit` VALUES (15, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"jdbc.url\",\"value\":\"jdbc:oracle:thin:@10.168.1.235:1521:ORA11G\",\"comment\":\"\",\"lineNum\":3,\"id\":4,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:35:03\"},\"newItem\":{\"namespaceId\":2,\"key\":\"jdbc.url\",\"value\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"comment\":\"\",\"lineNum\":3,\"id\":4,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 17:01:38\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 16:38:23\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 16:38:23', 'apollo', '2018-07-31 16:38:23');
INSERT INTO `Commit` VALUES (16, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.245\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 17:01:50\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 17:01:50', 'apollo', '2018-07-31 17:01:50');
INSERT INTO `Commit` VALUES (17, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"httpproject\",\"value\":\"hunt-admin\",\"comment\":\"项目名称\",\"lineNum\":51,\"id\":101,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:02:43\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 17:02:43\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 17:02:43', 'apollo', '2018-07-31 17:02:43');
INSERT INTO `Commit` VALUES (18, '{\"createItems\":[{\"namespaceId\":2,\"key\":\"httpprost\",\"value\":\"8089\",\"lineNum\":52,\"id\":102,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:03:17\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 17:03:17\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-07-31 17:03:17', 'apollo', '2018-07-31 17:03:17');
INSERT INTO `Commit` VALUES (19, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.245\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-07-31 17:01:50\"},\"newItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 12:38:07\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-01 12:38:08', 'apollo', '2018-08-01 12:38:08');
INSERT INTO `Commit` VALUES (20, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 12:38:07\"},\"newItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.135\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:07:30\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-01 14:07:31', 'apollo', '2018-08-01 14:07:31');
INSERT INTO `Commit` VALUES (21, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 12:38:07\"},\"newItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.135\",\"comment\":\"远程地址\",\"lineNum\":50,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:07:30\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-01 14:07:31', 'apollo', '2018-08-01 14:07:31');
INSERT INTO `Commit` VALUES (22, '{\"createItems\":[],\"updateItems\":[],\"deleteItems\":[{\"namespaceId\":2,\"key\":\"sql-url\",\"value\":\"10.168.1.245\",\"comment\":\"数据库地址\",\"lineNum\":1,\"id\":2,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-30 16:32:45\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:24:04\"}]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-01 14:24:05', 'apollo', '2018-08-01 14:24:05');
INSERT INTO `Commit` VALUES (23, '{\"createItems\":[],\"updateItems\":[],\"deleteItems\":[{\"namespaceId\":2,\"key\":\"redis.ip\",\"value\":\"10.168.1.265\",\"comment\":\"\",\"lineNum\":49,\"id\":98,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 15:31:21\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:25:19\"}]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-01 14:25:20', 'apollo', '2018-08-01 14:25:20');
INSERT INTO `Commit` VALUES (24, '{\"createItems\":[{\"namespaceId\":3,\"key\":\"domainip\",\"value\":\"10.168.1.135\",\"comment\":\"\",\"lineNum\":48,\"id\":118,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:13\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:17\"},{\"namespaceId\":3,\"key\":\"httpproject\",\"value\":\"hunt-admin\",\"comment\":\"\",\"lineNum\":49,\"id\":119,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:13\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:17\"},{\"namespaceId\":3,\"key\":\"httpprost\",\"value\":\"8089\",\"comment\":\"\",\"lineNum\":50,\"id\":120,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:13\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:17\"}],\"updateItems\":[],\"deleteItems\":[{\"namespaceId\":3,\"key\":\"redis.ip\",\"value\":\"10.168.1.265\",\"lineNum\":49,\"id\":99,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 15:31:55\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:17\"},{\"namespaceId\":3,\"key\":\"sql-url\",\"value\":\"10.168.1.245\",\"comment\":\"\",\"lineNum\":1,\"id\":50,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 11:40:49\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:17\"}]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-08-01 14:26:17', 'apollo', '2018-08-01 14:26:17');
INSERT INTO `Commit` VALUES (25, '{\"createItems\":[{\"namespaceId\":3,\"key\":\"sql-url\",\"value\":\"10.168.1.245\",\"comment\":\"\",\"lineNum\":1,\"id\":121,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:31\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:38\"},{\"namespaceId\":3,\"key\":\"redis.ip\",\"value\":\"10.168.1.265\",\"comment\":\"\",\"lineNum\":49,\"id\":137,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:33\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:38\"}],\"updateItems\":[],\"deleteItems\":[{\"namespaceId\":3,\"key\":\"httpproject\",\"value\":\"hunt-admin\",\"comment\":\"\",\"lineNum\":49,\"id\":119,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:13\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:38\"},{\"namespaceId\":3,\"key\":\"httpprost\",\"value\":\"8089\",\"comment\":\"\",\"lineNum\":50,\"id\":120,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:13\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:38\"},{\"namespaceId\":3,\"key\":\"domainip\",\"value\":\"10.168.1.135\",\"comment\":\"\",\"lineNum\":48,\"id\":118,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:13\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:26:38\"}]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-08-01 14:26:38', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Commit` VALUES (26, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.135\",\"comment\":\"远程地址\",\"lineNum\":48,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 14:27:02\"},\"newItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"远程地址\",\"lineNum\":48,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 15:59:42\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-01 15:59:43', 'apollo', '2018-08-01 15:59:43');
INSERT INTO `Commit` VALUES (27, '{\"createItems\":[],\"updateItems\":[],\"deleteItems\":[{\"namespaceId\":3,\"key\":\"redis.ip\",\"value\":\"10.168.1.265\",\"comment\":\"\",\"lineNum\":49,\"id\":137,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:33\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 16:00:06\"}]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-08-01 16:00:07', 'apollo', '2018-08-01 16:00:07');
INSERT INTO `Commit` VALUES (28, '{\"createItems\":[],\"updateItems\":[],\"deleteItems\":[{\"namespaceId\":3,\"key\":\"sql-url\",\"value\":\"10.168.1.245\",\"comment\":\"\",\"lineNum\":1,\"id\":121,\"isDeleted\":true,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 14:26:31\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 16:00:18\"}]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-08-01 16:00:18', 'apollo', '2018-08-01 16:00:18');
INSERT INTO `Commit` VALUES (29, '{\"createItems\":[{\"namespaceId\":3,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"\",\"lineNum\":48,\"id\":168,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 16:02:00\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 16:02:02\"},{\"namespaceId\":3,\"key\":\"httpproject\",\"value\":\"hunt-admin\",\"comment\":\"\",\"lineNum\":49,\"id\":169,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 16:02:00\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 16:02:02\"},{\"namespaceId\":3,\"key\":\"httpprost\",\"value\":\"8089\",\"comment\":\"\",\"lineNum\":50,\"id\":170,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 16:02:00\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 16:02:02\"}],\"updateItems\":[],\"deleteItems\":[]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-08-01 16:02:02', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Commit` VALUES (30, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"远程地址\",\"lineNum\":48,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 15:59:42\"},\"newItem\":{\"namespaceId\":2,\"key\":\"domainip\",\"value\":\"10.168.1.245\",\"comment\":\"远程地址\",\"lineNum\":48,\"id\":100,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-07-31 17:01:50\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-03 09:49:55\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'application', NULL, b'0', 'apollo', '2018-08-03 09:49:57', 'apollo', '2018-08-03 09:49:57');
INSERT INTO `Commit` VALUES (31, '{\"createItems\":[],\"updateItems\":[{\"oldItem\":{\"namespaceId\":3,\"key\":\"domainip\",\"value\":\"10.168.1.236\",\"comment\":\"\",\"lineNum\":48,\"id\":168,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 16:02:00\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-01 16:02:00\"},\"newItem\":{\"namespaceId\":3,\"key\":\"domainip\",\"value\":\"10.168.1.245\",\"comment\":\"\",\"lineNum\":48,\"id\":168,\"isDeleted\":false,\"dataChangeCreatedBy\":\"apollo\",\"dataChangeCreatedTime\":\"2018-08-01 16:02:00\",\"dataChangeLastModifiedBy\":\"apollo\",\"dataChangeLastModifiedTime\":\"2018-08-03 10:05:46\"}}],\"deleteItems\":[]}', 'ssm', 'default', 'ssm-dlxt', NULL, b'0', 'apollo', '2018-08-03 10:05:47', 'apollo', '2018-08-03 10:05:47');

-- ----------------------------
-- Table structure for Consumer
-- ----------------------------
DROP TABLE IF EXISTS `Consumer`;
CREATE TABLE `Consumer`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `AppId` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `Name` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '应用名',
  `OrgId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '部门Id',
  `OrgName` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '部门名字',
  `OwnerName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ownerName',
  `OwnerEmail` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ownerEmail',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `AppId`(`AppId`(191)) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '开放API消费者' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ConsumerAudit
-- ----------------------------
DROP TABLE IF EXISTS `ConsumerAudit`;
CREATE TABLE `ConsumerAudit`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `ConsumerId` int(11) UNSIGNED NULL DEFAULT NULL COMMENT 'Consumer Id',
  `Uri` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '访问的Uri',
  `Method` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '访问的Method',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_ConsumerId`(`ConsumerId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'consumer审计表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ConsumerRole
-- ----------------------------
DROP TABLE IF EXISTS `ConsumerRole`;
CREATE TABLE `ConsumerRole`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `ConsumerId` int(11) UNSIGNED NULL DEFAULT NULL COMMENT 'Consumer Id',
  `RoleId` int(10) UNSIGNED NULL DEFAULT NULL COMMENT 'Role Id',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_RoleId`(`RoleId`) USING BTREE,
  INDEX `IX_ConsumerId_RoleId`(`ConsumerId`, `RoleId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'consumer和role的绑定表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ConsumerToken
-- ----------------------------
DROP TABLE IF EXISTS `ConsumerToken`;
CREATE TABLE `ConsumerToken`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `ConsumerId` int(11) UNSIGNED NULL DEFAULT NULL COMMENT 'ConsumerId',
  `Token` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'token',
  `Expires` datetime(0) NOT NULL DEFAULT '2099-01-01 00:00:00' COMMENT 'token失效时间',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  UNIQUE INDEX `IX_Token`(`Token`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'consumer token表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for Favorite
-- ----------------------------
DROP TABLE IF EXISTS `Favorite`;
CREATE TABLE `Favorite`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `UserId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '收藏的用户',
  `AppId` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `Position` int(32) NOT NULL DEFAULT 10000 COMMENT '收藏顺序',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `AppId`(`AppId`(191)) USING BTREE,
  INDEX `IX_UserId`(`UserId`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应用收藏表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for GrayReleaseRule
-- ----------------------------
DROP TABLE IF EXISTS `GrayReleaseRule`;
CREATE TABLE `GrayReleaseRule`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `AppId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `ClusterName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Cluster Name',
  `NamespaceName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Namespace Name',
  `BranchName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'branch name',
  `Rules` varchar(16000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '[]' COMMENT '灰度规则',
  `ReleaseId` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '灰度对应的release',
  `BranchStatus` tinyint(2) NULL DEFAULT 1 COMMENT '灰度分支状态: 0:删除分支,1:正在使用的规则 2：全量发布',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_Namespace`(`AppId`, `ClusterName`, `NamespaceName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '灰度规则表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for Instance
-- ----------------------------
DROP TABLE IF EXISTS `Instance`;
CREATE TABLE `Instance`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `AppId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `ClusterName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ClusterName',
  `DataCenter` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Data Center Name',
  `Ip` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'instance ip',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  UNIQUE INDEX `IX_UNIQUE_KEY`(`AppId`, `ClusterName`, `Ip`, `DataCenter`) USING BTREE,
  INDEX `IX_IP`(`Ip`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '使用配置的应用实例' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Instance
-- ----------------------------
INSERT INTO `Instance` VALUES (1, 'ssm', 'default', '', '10.168.1.135', '2018-07-31 15:24:57', '2018-07-31 15:24:57');
INSERT INTO `Instance` VALUES (2, 'ssm', 'default', '', '10.168.1.236', '2018-08-01 14:43:04', '2018-08-01 14:43:04');
INSERT INTO `Instance` VALUES (3, 'ssm', 'default', '', '10.168.1.235', '2018-08-01 15:02:16', '2018-08-01 15:02:16');
INSERT INTO `Instance` VALUES (4, 'ssm', 'default', '', '172.17.0.4', '2018-08-03 09:09:40', '2018-08-03 09:09:40');
INSERT INTO `Instance` VALUES (5, 'ssm', 'default', '', '172.17.0.5', '2018-08-03 09:13:50', '2018-08-03 09:13:50');

-- ----------------------------
-- Table structure for InstanceConfig
-- ----------------------------
DROP TABLE IF EXISTS `InstanceConfig`;
CREATE TABLE `InstanceConfig`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `InstanceId` int(11) UNSIGNED NULL DEFAULT NULL COMMENT 'Instance Id',
  `ConfigAppId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Config App Id',
  `ConfigClusterName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Config Cluster Name',
  `ConfigNamespaceName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Config Namespace Name',
  `ReleaseKey` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '发布的Key',
  `ReleaseDeliveryTime` timestamp(0) NULL DEFAULT NULL COMMENT '配置获取时间',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  UNIQUE INDEX `IX_UNIQUE_KEY`(`InstanceId`, `ConfigAppId`, `ConfigNamespaceName`) USING BTREE,
  INDEX `IX_ReleaseKey`(`ReleaseKey`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_Valid_Namespace`(`ConfigAppId`, `ConfigClusterName`, `ConfigNamespaceName`, `DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '应用实例的配置信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of InstanceConfig
-- ----------------------------
INSERT INTO `InstanceConfig` VALUES (1, 1, 'ssm', 'default', 'application', '20180801160130-da5bb8ea1d7cc82a', '2018-08-01 16:01:32', '2018-07-31 15:24:53', '2018-08-01 16:40:24');
INSERT INTO `InstanceConfig` VALUES (2, 2, 'ssm', 'default', 'application', '20180801160130-da5bb8ea1d7cc82a', '2018-08-01 16:01:32', '2018-08-01 14:43:03', '2018-08-02 17:29:53');
INSERT INTO `InstanceConfig` VALUES (3, 2, 'ssm', 'default', 'ssm-dlxt', '20180801160207-124fb8ea1d7cc82b', '2018-08-01 16:02:08', '2018-08-01 14:43:03', '2018-08-02 17:29:56');
INSERT INTO `InstanceConfig` VALUES (4, 3, 'ssm', 'default', 'application', '20180803095017-da5bb8ea1d4612c3', '2018-08-03 10:50:19', '2018-08-01 15:02:15', '2018-08-03 10:50:20');
INSERT INTO `InstanceConfig` VALUES (5, 3, 'ssm', 'default', 'ssm-dlxt', '20180803100552-124fb8ea1d4612c4', '2018-08-03 10:50:19', '2018-08-01 15:02:16', '2018-08-03 10:50:21');
INSERT INTO `InstanceConfig` VALUES (6, 4, 'ssm', 'default', 'application', '20180803095017-da5bb8ea1d4612c3', '2018-08-03 09:50:23', '2018-08-03 09:09:39', '2018-08-03 16:44:02');
INSERT INTO `InstanceConfig` VALUES (7, 4, 'ssm', 'default', 'ssm-dlxt', '20180803100552-124fb8ea1d4612c4', '2018-08-03 10:05:54', '2018-08-03 09:09:39', '2018-08-03 16:44:02');
INSERT INTO `InstanceConfig` VALUES (8, 5, 'ssm', 'default', 'application', '20180803095017-da5bb8ea1d4612c3', '2018-08-03 09:50:22', '2018-08-03 09:13:49', '2018-08-03 16:49:56');
INSERT INTO `InstanceConfig` VALUES (9, 5, 'ssm', 'default', 'ssm-dlxt', '20180803100552-124fb8ea1d4612c4', '2018-08-03 10:05:54', '2018-08-03 09:13:49', '2018-08-03 16:49:56');

-- ----------------------------
-- Table structure for Item
-- ----------------------------
DROP TABLE IF EXISTS `Item`;
CREATE TABLE `Item`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `NamespaceId` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '集群NamespaceId',
  `Key` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '配置项Key',
  `Value` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '配置项值',
  `Comment` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '注释',
  `LineNum` int(10) UNSIGNED NULL DEFAULT 0 COMMENT '行号',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_GroupId`(`NamespaceId`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 171 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '配置项目' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Item
-- ----------------------------
INSERT INTO `Item` VALUES (1, 1, 'timeout', '100', 'sample timeout配置', 1, b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `Item` VALUES (2, 2, 'sql-url', '10.168.1.245', '数据库地址', 1, b'1', 'apollo', '2018-07-30 16:32:45', 'apollo', '2018-08-01 14:24:03');
INSERT INTO `Item` VALUES (3, 2, 'jdbc.driver', 'oracle.jdbc.driver.OracleDriver', '', 1, b'0', 'apollo', '2018-07-30 17:01:38', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (4, 2, 'jdbc.url', 'jdbc:oracle:thin:@10.168.1.231:1521:ORA11G', '', 2, b'0', 'apollo', '2018-07-30 17:01:38', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (5, 2, 'jdbc.username', 'adminsystem', '', 3, b'0', 'apollo', '2018-07-30 17:01:38', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (6, 2, 'jdbc.password', 'L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco=', '', 4, b'0', 'apollo', '2018-07-30 17:01:38', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (7, 2, 'jdbc.maxWait', '60000', '', 9, b'0', 'apollo', '2018-07-30 17:04:50', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (8, 2, 'dbcp.initialSize', '15', '', 10, b'0', 'apollo', '2018-07-30 17:04:50', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (9, 2, 'dbcp.maxActive', '5000', '', 11, b'0', 'apollo', '2018-07-30 17:04:50', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (10, 2, 'dbcp.maxIdle', '0', '', 12, b'0', 'apollo', '2018-07-30 17:04:50', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (11, 2, 'dbcp.maxWait', '900000', '', 13, b'0', 'apollo', '2018-07-30 17:04:50', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (12, 2, 'dbcp.defaultAutoCommit', 'true', '', 14, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (13, 2, 'dbcp.removeAbandoned', 'true', '', 15, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (14, 2, 'dbcp.removeAbandonedTimeout', '30', '', 16, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (15, 2, 'dbcp.whenExhaustedAction', '1', '', 17, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (16, 2, 'dbcp.validationQuery', 'select 1 from dual', '', 18, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (17, 2, 'dbcp.testOnBorrow', 'fasle', '', 19, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (18, 2, 'dbcp.testOnReturn', 'false', '', 20, b'0', 'apollo', '2018-07-30 17:04:51', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (19, 2, 'jdbc.initialSize', '0', '', 5, b'0', 'apollo', '2018-07-30 17:05:45', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (20, 2, 'jdbc.maxActive', '20', '', 6, b'0', 'apollo', '2018-07-30 17:05:45', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (21, 2, 'jdbc.maxIdle', '20', '', 7, b'0', 'apollo', '2018-07-30 17:05:45', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (22, 2, 'jdbc.minIdle', '1', '', 8, b'0', 'apollo', '2018-07-30 17:05:45', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (23, 2, 'redis.hostName', '10.168.1.233', '', 21, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (24, 2, '', '', '#redis.hostName=127.0.0.1', 23, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (25, 2, '', '', '#端口号', 24, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (26, 2, 'redis.port', '6379', '', 24, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (27, 2, '', '', '#如果有密码', 26, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (28, 2, 'redis.password', '123456', '', 26, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (29, 2, '', '', '#redis.password=', 28, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (30, 2, '', '', '#客户端超时时间单位是毫秒 默认是2000', 29, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (31, 2, 'redis.timeout', '10000', '', 29, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (32, 2, '', '', '#最大空闲数', 31, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (33, 2, 'redis.maxIdle', '300', '', 31, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (34, 2, '', '', '#连接池的最大数据库连接数。设为0表示无限制,如果是jedis 2.4以后用redis.maxTotal', 33, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (35, 2, '', '', '#redis.maxActive=600', 34, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (36, 2, '', '', '#控制一个pool可分配多少个jedis实例,用来替换上面的redis.maxActive,如果是jedis 2.4以后用该属性', 35, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (37, 2, 'redis.maxTotal', '1000', '', 35, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (38, 2, '', '', '#最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。', 37, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (39, 2, 'redis.maxWaitMillis', '1000', '', 37, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (40, 2, '', '', '#连接的最小空闲时间 默认1800000毫秒(30分钟)', 39, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (41, 2, 'redis.minEvictableIdleTimeMillis', '300000', '', 39, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (42, 2, '', '', '#每次释放连接的最大数目,默认3', 41, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (43, 2, 'redis.numTestsPerEvictionRun', '1024', '', 41, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (44, 2, '', '', '#逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1', 43, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (45, 2, 'redis.timeBetweenEvictionRunsMillis', '30000', '', 43, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (46, 2, '', '', '#是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个', 45, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (47, 2, 'redis.testOnBorrow', 'true', '', 45, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (48, 2, '', '', '#在空闲时检查有效性, 默认false', 47, b'1', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (49, 2, 'redis.testWhileIdle', 'true', '', 47, b'0', 'apollo', '2018-07-30 17:07:14', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (50, 3, 'sql-url', '10.168.1.245', '', 1, b'1', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (51, 3, 'jdbc.driver', 'oracle.jdbc.driver.OracleDriver', '', 1, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (52, 3, 'jdbc.url', 'jdbc:oracle:thin:@10.168.1.231:1521:ORA11G', '', 2, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (53, 3, 'jdbc.username', 'adminsystem', '', 3, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (54, 3, 'jdbc.password', 'L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco=', '', 4, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (55, 3, 'jdbc.initialSize', '0', '', 5, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (56, 3, 'jdbc.maxActive', '20', '', 6, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (57, 3, 'jdbc.maxIdle', '20', '', 7, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (58, 3, 'jdbc.minIdle', '1', '', 8, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (59, 3, 'jdbc.maxWait', '60000', '', 9, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (60, 3, 'dbcp.initialSize', '15', '', 10, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (61, 3, 'dbcp.maxActive', '5000', '', 11, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (62, 3, 'dbcp.maxIdle', '0', '', 12, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (63, 3, 'dbcp.maxWait', '900000', '', 13, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (64, 3, 'dbcp.defaultAutoCommit', 'true', '', 14, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (65, 3, 'dbcp.removeAbandoned', 'true', '', 15, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (66, 3, 'dbcp.removeAbandonedTimeout', '30', '', 16, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (67, 3, 'dbcp.whenExhaustedAction', '1', '', 17, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (68, 3, 'dbcp.validationQuery', 'select 1 from dual', '', 18, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (69, 3, 'dbcp.testOnBorrow', 'fasle', '', 19, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (70, 3, 'dbcp.testOnReturn', 'false', '', 20, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (71, 3, 'redis.hostName', '10.168.1.233', '', 21, b'0', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (72, 3, '', '', '#redis.hostName=127.0.0.1', 23, b'1', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (73, 3, '', '', '#端口号', 24, b'1', 'apollo', '2018-07-31 11:40:49', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (74, 3, 'redis.port', '6379', '', 24, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (75, 3, '', '', '#如果有密码', 26, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (76, 3, 'redis.password', '123456', '', 26, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (77, 3, '', '', '#redis.password=', 28, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (78, 3, '', '', '#客户端超时时间单位是毫秒 默认是2000', 29, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (79, 3, 'redis.timeout', '10000', '', 29, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (80, 3, '', '', '#最大空闲数', 31, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (81, 3, 'redis.maxIdle', '300', '', 31, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (82, 3, '', '', '#连接池的最大数据库连接数。设为0表示无限制,如果是jedis 2.4以后用redis.maxTotal', 33, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (83, 3, '', '', '#redis.maxActive=600', 34, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (84, 3, '', '', '#控制一个pool可分配多少个jedis实例,用来替换上面的redis.maxActive,如果是jedis 2.4以后用该属性', 35, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (85, 3, 'redis.maxTotal', '1000', '', 35, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (86, 3, '', '', '#最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。', 37, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (87, 3, 'redis.maxWaitMillis', '1000', '', 37, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (88, 3, '', '', '#连接的最小空闲时间 默认1800000毫秒(30分钟)', 39, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (89, 3, 'redis.minEvictableIdleTimeMillis', '300000', '', 39, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (90, 3, '', '', '#每次释放连接的最大数目,默认3', 41, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (91, 3, 'redis.numTestsPerEvictionRun', '1024', '', 41, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (92, 3, '', '', '#逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1', 43, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (93, 3, 'redis.timeBetweenEvictionRunsMillis', '30000', '', 43, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (94, 3, '', '', '#是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个', 45, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (95, 3, 'redis.testOnBorrow', 'true', '', 45, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (96, 3, '', '', '#在空闲时检查有效性, 默认false', 47, b'1', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (97, 3, 'redis.testWhileIdle', 'true', '', 47, b'0', 'apollo', '2018-07-31 11:40:50', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (98, 2, 'redis.ip', '10.168.1.265', '', 49, b'1', 'apollo', '2018-07-31 15:31:21', 'apollo', '2018-08-01 14:25:20');
INSERT INTO `Item` VALUES (99, 3, 'redis.ip', '10.168.1.265', NULL, 49, b'1', 'apollo', '2018-07-31 15:31:55', 'apollo', '2018-08-01 14:26:18');
INSERT INTO `Item` VALUES (100, 2, 'domainip', '10.168.1.245', '远程地址', 48, b'0', 'apollo', '2018-07-31 17:01:50', 'apollo', '2018-08-03 09:49:55');
INSERT INTO `Item` VALUES (101, 2, 'httpproject', 'hunt-admin', '项目名称', 49, b'0', 'apollo', '2018-07-31 17:02:43', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (102, 2, 'httpprost', '8089', NULL, 50, b'0', 'apollo', '2018-07-31 17:03:17', 'apollo', '2018-08-01 14:27:02');
INSERT INTO `Item` VALUES (103, 3, '', '', '#redis.hostName=127.0.0.1', 22, b'1', 'apollo', '2018-08-01 14:26:11', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (104, 3, '', '', '#端口号', 23, b'1', 'apollo', '2018-08-01 14:26:11', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (105, 3, '', '', '#如果有密码', 25, b'1', 'apollo', '2018-08-01 14:26:11', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (106, 3, '', '', '#redis.password=', 27, b'1', 'apollo', '2018-08-01 14:26:11', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (107, 3, '', '', '#客户端超时时间单位是毫秒 默认是2000', 28, b'1', 'apollo', '2018-08-01 14:26:12', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (108, 3, '', '', '#最大空闲数', 30, b'1', 'apollo', '2018-08-01 14:26:12', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (109, 3, '', '', '#连接池的最大数据库连接数。设为0表示无限制,如果是jedis 2.4以后用redis.maxTotal', 32, b'1', 'apollo', '2018-08-01 14:26:12', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (110, 3, '', '', '#redis.maxActive=600', 33, b'1', 'apollo', '2018-08-01 14:26:12', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (111, 3, '', '', '#控制一个pool可分配多少个jedis实例,用来替换上面的redis.maxActive,如果是jedis 2.4以后用该属性', 34, b'1', 'apollo', '2018-08-01 14:26:12', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (112, 3, '', '', '#最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。', 36, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (113, 3, '', '', '#连接的最小空闲时间 默认1800000毫秒(30分钟)', 38, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (114, 3, '', '', '#每次释放连接的最大数目,默认3', 40, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (115, 3, '', '', '#逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1', 42, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (116, 3, '', '', '#是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个', 44, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (117, 3, '', '', '#在空闲时检查有效性, 默认false', 46, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (118, 3, 'domainip', '10.168.1.135', '', 48, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (119, 3, 'httpproject', 'hunt-admin', '', 49, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (120, 3, 'httpprost', '8089', '', 50, b'1', 'apollo', '2018-08-01 14:26:13', 'apollo', '2018-08-01 14:26:38');
INSERT INTO `Item` VALUES (121, 3, 'sql-url', '10.168.1.245', '', 1, b'1', 'apollo', '2018-08-01 14:26:31', 'apollo', '2018-08-01 16:00:18');
INSERT INTO `Item` VALUES (122, 3, '', '', '#redis.hostName=127.0.0.1', 23, b'1', 'apollo', '2018-08-01 14:26:31', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (123, 3, '', '', '#端口号', 24, b'1', 'apollo', '2018-08-01 14:26:31', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (124, 3, '', '', '#如果有密码', 26, b'1', 'apollo', '2018-08-01 14:26:31', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (125, 3, '', '', '#redis.password=', 28, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (126, 3, '', '', '#客户端超时时间单位是毫秒 默认是2000', 29, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (127, 3, '', '', '#最大空闲数', 31, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (128, 3, '', '', '#连接池的最大数据库连接数。设为0表示无限制,如果是jedis 2.4以后用redis.maxTotal', 33, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (129, 3, '', '', '#redis.maxActive=600', 34, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (130, 3, '', '', '#控制一个pool可分配多少个jedis实例,用来替换上面的redis.maxActive,如果是jedis 2.4以后用该属性', 35, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (131, 3, '', '', '#最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。', 37, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (132, 3, '', '', '#连接的最小空闲时间 默认1800000毫秒(30分钟)', 39, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (133, 3, '', '', '#每次释放连接的最大数目,默认3', 41, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (134, 3, '', '', '#逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1', 43, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (135, 3, '', '', '#是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个', 45, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (136, 3, '', '', '#在空闲时检查有效性, 默认false', 47, b'1', 'apollo', '2018-08-01 14:26:32', 'apollo', '2018-08-01 16:02:02');
INSERT INTO `Item` VALUES (137, 3, 'redis.ip', '10.168.1.265', '', 49, b'1', 'apollo', '2018-08-01 14:26:33', 'apollo', '2018-08-01 16:00:07');
INSERT INTO `Item` VALUES (138, 2, '', '', '#redis.hostName=127.0.0.1', 22, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (139, 2, '', '', '#端口号', 23, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (140, 2, '', '', '#如果有密码', 25, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (141, 2, '', '', '#redis.password=', 27, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (142, 2, '', '', '#客户端超时时间单位是毫秒 默认是2000', 28, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (143, 2, '', '', '#最大空闲数', 30, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (144, 2, '', '', '#连接池的最大数据库连接数。设为0表示无限制,如果是jedis 2.4以后用redis.maxTotal', 32, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (145, 2, '', '', '#redis.maxActive=600', 33, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (146, 2, '', '', '#控制一个pool可分配多少个jedis实例,用来替换上面的redis.maxActive,如果是jedis 2.4以后用该属性', 34, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (147, 2, '', '', '#最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。', 36, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (148, 2, '', '', '#连接的最小空闲时间 默认1800000毫秒(30分钟)', 38, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (149, 2, '', '', '#每次释放连接的最大数目,默认3', 40, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (150, 2, '', '', '#逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1', 42, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (151, 2, '', '', '#是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个', 44, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (152, 2, '', '', '#在空闲时检查有效性, 默认false', 46, b'0', 'apollo', '2018-08-01 14:27:00', 'apollo', '2018-08-01 14:27:00');
INSERT INTO `Item` VALUES (153, 3, '', '', '#redis.hostName=127.0.0.1', 22, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (154, 3, '', '', '#端口号', 23, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (155, 3, '', '', '#如果有密码', 25, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (156, 3, '', '', '#redis.password=', 27, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (157, 3, '', '', '#客户端超时时间单位是毫秒 默认是2000', 28, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (158, 3, '', '', '#最大空闲数', 30, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (159, 3, '', '', '#连接池的最大数据库连接数。设为0表示无限制,如果是jedis 2.4以后用redis.maxTotal', 32, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (160, 3, '', '', '#redis.maxActive=600', 33, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (161, 3, '', '', '#控制一个pool可分配多少个jedis实例,用来替换上面的redis.maxActive,如果是jedis 2.4以后用该属性', 34, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (162, 3, '', '', '#最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。', 36, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (163, 3, '', '', '#连接的最小空闲时间 默认1800000毫秒(30分钟)', 38, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (164, 3, '', '', '#每次释放连接的最大数目,默认3', 40, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (165, 3, '', '', '#逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1', 42, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (166, 3, '', '', '#是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个', 44, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (167, 3, '', '', '#在空闲时检查有效性, 默认false', 46, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (168, 3, 'domainip', '10.168.1.245', '', 48, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-03 10:05:47');
INSERT INTO `Item` VALUES (169, 3, 'httpproject', 'hunt-admin', '', 49, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');
INSERT INTO `Item` VALUES (170, 3, 'httpprost', '8089', '', 50, b'0', 'apollo', '2018-08-01 16:02:00', 'apollo', '2018-08-01 16:02:00');

-- ----------------------------
-- Table structure for Namespace
-- ----------------------------
DROP TABLE IF EXISTS `Namespace`;
CREATE TABLE `Namespace`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `AppId` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `ClusterName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Cluster Name',
  `NamespaceName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'Namespace Name',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `AppId_ClusterName_NamespaceName`(`AppId`(191), `ClusterName`(191), `NamespaceName`(191)) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_NamespaceName`(`NamespaceName`(191)) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '命名空间' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Namespace
-- ----------------------------
INSERT INTO `Namespace` VALUES (1, 'SampleApp', 'default', 'application', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `Namespace` VALUES (2, 'ssm', 'default', 'application', b'0', 'apollo', '2018-07-30 16:31:35', 'apollo', '2018-07-30 16:31:35');
INSERT INTO `Namespace` VALUES (3, 'ssm', 'default', 'ssm-dlxt', b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');

-- ----------------------------
-- Table structure for NamespaceLock
-- ----------------------------
DROP TABLE IF EXISTS `NamespaceLock`;
CREATE TABLE `NamespaceLock`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `NamespaceId` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '集群NamespaceId',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT 'default' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  `IsDeleted` bit(1) NULL DEFAULT b'0' COMMENT '软删除',
  PRIMARY KEY (`Id`) USING BTREE,
  UNIQUE INDEX `IX_NamespaceId`(`NamespaceId`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'namespace的编辑锁' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for Permission
-- ----------------------------
DROP TABLE IF EXISTS `Permission`;
CREATE TABLE `Permission`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `PermissionType` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '权限类型',
  `TargetId` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '权限对象类型',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_TargetId_PermissionType`(`TargetId`(191), `PermissionType`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'permission表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Permission
-- ----------------------------
INSERT INTO `Permission` VALUES (1, 'CreateCluster', 'SampleApp', b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Permission` VALUES (2, 'CreateNamespace', 'SampleApp', b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Permission` VALUES (3, 'AssignRole', 'SampleApp', b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Permission` VALUES (4, 'ModifyNamespace', 'SampleApp+application', b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Permission` VALUES (5, 'ReleaseNamespace', 'SampleApp+application', b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Permission` VALUES (6, 'CreateCluster', 'ssm', b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `Permission` VALUES (7, 'CreateNamespace', 'ssm', b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `Permission` VALUES (8, 'AssignRole', 'ssm', b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `Permission` VALUES (9, 'ModifyNamespace', 'ssm+application', b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `Permission` VALUES (10, 'ReleaseNamespace', 'ssm+application', b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `Permission` VALUES (11, 'ModifyNamespace', 'ssm+ssm-dlxt', b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');
INSERT INTO `Permission` VALUES (12, 'ReleaseNamespace', 'ssm+ssm-dlxt', b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');

-- ----------------------------
-- Table structure for Release
-- ----------------------------
DROP TABLE IF EXISTS `Release`;
CREATE TABLE `Release`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `ReleaseKey` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '发布的Key',
  `Name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '发布名字',
  `Comment` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发布说明',
  `AppId` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `ClusterName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ClusterName',
  `NamespaceName` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'namespaceName',
  `Configurations` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布配置',
  `IsAbandoned` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否废弃',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `AppId_ClusterName_GroupName`(`AppId`(191), `ClusterName`(191), `NamespaceName`(191)) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_ReleaseKey`(`ReleaseKey`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '发布' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Release
-- ----------------------------
INSERT INTO `Release` VALUES (1, '20161009155425-d3a0749c6e20bc15', '20161009155424-release', 'Sample发布', 'SampleApp', 'default', 'application', '{\"timeout\":\"100\"}', b'0', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `Release` VALUES (2, '20180730163311-da5bb8ea1d7cc811', '20180730163253-release', '数据库地址', 'ssm', 'default', 'application', '{\"sql-url\":\"10.168.1.131\"}', b'0', b'0', 'apollo', '2018-07-30 16:33:12', 'apollo', '2018-07-30 16:33:12');
INSERT INTO `Release` VALUES (3, '20180730163701-da5bb8ea1d7cc812', '20180730163642-release', 'url修改', 'ssm', 'default', 'application', '{\"sql-url\":\"10.168.1.245\"}', b'0', b'0', 'apollo', '2018-07-30 16:37:01', 'apollo', '2018-07-30 16:37:01');
INSERT INTO `Release` VALUES (4, '20180730170312-da5bb8ea1d7cc813', '20180730170300-release', '最新配置文件', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.username\":\"adminsystem\",\"sql-url\":\"10.168.1.245\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\"}', b'0', b'0', 'apollo', '2018-07-30 17:03:12', 'apollo', '2018-07-30 17:03:12');
INSERT INTO `Release` VALUES (5, '20180730170600-da5bb8ea1d7cc814', '20180730170555-release', '最新配置文件', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"dbcp.defaultAutoCommit\":\"true\",\"jdbc.maxActive\":\"20\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"dbcp.testOnBorrow\":\"fasle\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-30 17:06:00', 'apollo', '2018-07-30 17:06:00');
INSERT INTO `Release` VALUES (6, '20180730170731-da5bb8ea1d7cc815', '20180730170726-release', '最新配置文件', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-30 17:07:31', 'apollo', '2018-07-30 17:07:31');
INSERT INTO `Release` VALUES (7, '20180731113943-124fb8ea1d7cc816', '20180731113936-release', '', 'ssm', 'default', 'ssm-dlxt', '{}', b'0', b'0', 'apollo', '2018-07-31 11:39:43', 'apollo', '2018-07-31 11:39:43');
INSERT INTO `Release` VALUES (8, '20180731113954-da5bb8ea1d7cc817', '20180731113948-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 11:39:55', 'apollo', '2018-07-31 11:39:55');
INSERT INTO `Release` VALUES (9, '20180731114001-da5bb8ea1d7cc818', '20180731113955-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 11:40:02', 'apollo', '2018-07-31 11:40:02');
INSERT INTO `Release` VALUES (10, '20180731114103-124fb8ea1d7cc819', '20180731114054-release', '', 'ssm', 'default', 'ssm-dlxt', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"jdbc.maxIdle\":\"20\",\"dbcp.maxIdle\":\"0\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 11:41:03', 'apollo', '2018-07-31 11:41:03');
INSERT INTO `Release` VALUES (11, '20180731153205-124fb8ea1d7cc81a', '20180731153202-release', '', 'ssm', 'default', 'ssm-dlxt', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"jdbc.maxIdle\":\"20\",\"dbcp.maxIdle\":\"0\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 15:32:05', 'apollo', '2018-07-31 15:32:05');
INSERT INTO `Release` VALUES (12, '20180731153213-da5bb8ea1d7cc81b', '20180731153211-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.245\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 15:32:14', 'apollo', '2018-07-31 15:32:14');
INSERT INTO `Release` VALUES (13, '20180731154304-da5bb8ea1d7cc81c', '20180731154300-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 15:43:04', 'apollo', '2018-07-31 15:43:04');
INSERT INTO `Release` VALUES (14, '20180731162122-da5bb8ea1d7cc81d', '20180731162117-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 16:21:22', 'apollo', '2018-07-31 16:21:22');
INSERT INTO `Release` VALUES (15, '20180731162502-da5bb8ea1d7cc81e', '20180731162459-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco-\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 16:25:02', 'apollo', '2018-07-31 16:25:02');
INSERT INTO `Release` VALUES (16, '20180731162701-da5bb8ea1d7cc81f', '20180731162659-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 16:27:01', 'apollo', '2018-07-31 16:27:01');
INSERT INTO `Release` VALUES (17, '20180731163507-da5bb8ea1d7cc820', '20180731163505-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.235:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 16:35:07', 'apollo', '2018-07-31 16:35:07');
INSERT INTO `Release` VALUES (18, '20180731163828-da5bb8ea1d7cc821', '20180731163826-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 16:38:28', 'apollo', '2018-07-31 16:38:28');
INSERT INTO `Release` VALUES (19, '20180731170323-da5bb8ea1d7cc822', '20180731170320-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.245\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-07-31 17:03:23', 'apollo', '2018-07-31 17:03:23');
INSERT INTO `Release` VALUES (20, '20180801123821-da5bb8ea1d7cc823', '20180801123815-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.236\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 12:38:21', 'apollo', '2018-08-01 12:38:21');
INSERT INTO `Release` VALUES (21, '20180801140821-da5bb8ea1d7cc824', '20180801140756-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.135\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 14:08:22', 'apollo', '2018-08-01 14:08:22');
INSERT INTO `Release` VALUES (22, '20180801142438-da5bb8ea1d7cc825', '20180801142429-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.135\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 14:24:38', 'apollo', '2018-08-01 14:24:38');
INSERT INTO `Release` VALUES (23, '20180801142526-da5bb8ea1d7cc826', '20180801142519-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.135\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 14:25:26', 'apollo', '2018-08-01 14:25:26');
INSERT INTO `Release` VALUES (24, '20180801142654-124fb8ea1d7cc827', '20180801142645-release', '', 'ssm', 'default', 'ssm-dlxt', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"redis.ip\":\"10.168.1.265\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"jdbc.maxIdle\":\"20\",\"dbcp.maxIdle\":\"0\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"sql-url\":\"10.168.1.245\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 14:26:54', 'apollo', '2018-08-01 14:26:54');
INSERT INTO `Release` VALUES (25, '20180801142706-da5bb8ea1d7cc828', '20180801142658-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.135\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 14:27:06', 'apollo', '2018-08-01 14:27:06');
INSERT INTO `Release` VALUES (26, '20180801160105-124fb8ea1d7cc829', '20180801160102-release', '', 'ssm', 'default', 'ssm-dlxt', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"jdbc.maxIdle\":\"20\",\"dbcp.maxIdle\":\"0\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 16:01:05', 'apollo', '2018-08-01 16:01:05');
INSERT INTO `Release` VALUES (27, '20180801160130-da5bb8ea1d7cc82a', '20180801160128-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.236\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 16:01:30', 'apollo', '2018-08-01 16:01:30');
INSERT INTO `Release` VALUES (28, '20180801160207-124fb8ea1d7cc82b', '20180801160205-release', '', 'ssm', 'default', 'ssm-dlxt', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"jdbc.maxIdle\":\"20\",\"dbcp.maxIdle\":\"0\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.236\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-01 16:02:07', 'apollo', '2018-08-01 16:02:07');
INSERT INTO `Release` VALUES (29, '20180803095017-da5bb8ea1d4612c3', '20180803095011-release', '', 'ssm', 'default', 'application', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"dbcp.maxIdle\":\"0\",\"jdbc.maxIdle\":\"20\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.245\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-03 09:50:18', 'apollo', '2018-08-03 09:50:18');
INSERT INTO `Release` VALUES (30, '20180803100552-124fb8ea1d4612c4', '20180803100551-release', '', 'ssm', 'default', 'ssm-dlxt', '{\"jdbc.password\":\"L+eS2uu/gnZzLiw9E/t1DrDVFC93X3icfxsOu6M8JRs57ztBM2bWIioFfTzwaky7q/+1pJkNcYlm79viHrVXv84HqDjflvjfG5GYQhTeLFUPXG5zHMtUsDGIajhH4EG+p8IHxz7wcsUMYWsBOpFGdkEQNjHljjqRH6k8/yMoLco\\u003d\",\"jdbc.minIdle\":\"1\",\"dbcp.defaultAutoCommit\":\"true\",\"redis.port\":\"6379\",\"redis.maxIdle\":\"300\",\"jdbc.maxActive\":\"20\",\"jdbc.url\":\"jdbc:oracle:thin:@10.168.1.231:1521:ORA11G\",\"redis.testOnBorrow\":\"true\",\"redis.password\":\"123456\",\"httpproject\":\"hunt-admin\",\"redis.minEvictableIdleTimeMillis\":\"300000\",\"redis.numTestsPerEvictionRun\":\"1024\",\"jdbc.maxIdle\":\"20\",\"dbcp.maxIdle\":\"0\",\"jdbc.driver\":\"oracle.jdbc.driver.OracleDriver\",\"dbcp.removeAbandonedTimeout\":\"30\",\"httpprost\":\"8089\",\"dbcp.initialSize\":\"15\",\"dbcp.validationQuery\":\"select 1 from dual\",\"jdbc.username\":\"adminsystem\",\"redis.hostName\":\"10.168.1.233\",\"redis.timeBetweenEvictionRunsMillis\":\"30000\",\"redis.testWhileIdle\":\"true\",\"redis.timeout\":\"10000\",\"redis.maxWaitMillis\":\"1000\",\"dbcp.removeAbandoned\":\"true\",\"jdbc.initialSize\":\"0\",\"dbcp.testOnReturn\":\"false\",\"dbcp.maxActive\":\"5000\",\"redis.maxTotal\":\"1000\",\"jdbc.maxWait\":\"60000\",\"dbcp.maxWait\":\"900000\",\"domainip\":\"10.168.1.245\",\"dbcp.testOnBorrow\":\"fasle\",\"dbcp.whenExhaustedAction\":\"1\"}', b'0', b'0', 'apollo', '2018-08-03 10:05:53', 'apollo', '2018-08-03 10:05:53');

-- ----------------------------
-- Table structure for ReleaseHistory
-- ----------------------------
DROP TABLE IF EXISTS `ReleaseHistory`;
CREATE TABLE `ReleaseHistory`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `AppId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'AppID',
  `ClusterName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'ClusterName',
  `NamespaceName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT 'namespaceName',
  `BranchName` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '发布分支名',
  `ReleaseId` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '关联的Release Id',
  `PreviousReleaseId` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '前一次发布的ReleaseId',
  `Operation` tinyint(3) UNSIGNED NOT NULL DEFAULT 0 COMMENT '发布类型，0: 普通发布，1: 回滚，2: 灰度发布，3: 灰度规则更新，4: 灰度合并回主分支发布，5: 主分支发布灰度自动发布，6: 主分支回滚灰度自动发布，7: 放弃灰度',
  `OperationContext` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布上下文信息',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_Namespace`(`AppId`, `ClusterName`, `NamespaceName`, `BranchName`) USING BTREE,
  INDEX `IX_ReleaseId`(`ReleaseId`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '发布历史' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ReleaseHistory
-- ----------------------------
INSERT INTO `ReleaseHistory` VALUES (1, 'SampleApp', 'default', 'application', 'default', 1, 0, 0, '{}', b'0', 'apollo', '2018-07-30 07:44:57', 'apollo', '2018-07-30 07:44:57');
INSERT INTO `ReleaseHistory` VALUES (2, 'ssm', 'default', 'application', 'default', 2, 0, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-30 16:33:12', 'apollo', '2018-07-30 16:33:12');
INSERT INTO `ReleaseHistory` VALUES (3, 'ssm', 'default', 'application', 'default', 3, 2, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-30 16:37:01', 'apollo', '2018-07-30 16:37:01');
INSERT INTO `ReleaseHistory` VALUES (4, 'ssm', 'default', 'application', 'default', 4, 3, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-30 17:03:12', 'apollo', '2018-07-30 17:03:12');
INSERT INTO `ReleaseHistory` VALUES (5, 'ssm', 'default', 'application', 'default', 5, 4, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-30 17:06:00', 'apollo', '2018-07-30 17:06:00');
INSERT INTO `ReleaseHistory` VALUES (6, 'ssm', 'default', 'application', 'default', 6, 5, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-30 17:07:31', 'apollo', '2018-07-30 17:07:31');
INSERT INTO `ReleaseHistory` VALUES (7, 'ssm', 'default', 'ssm-dlxt', 'default', 7, 0, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 11:39:47', 'apollo', '2018-07-31 11:39:47');
INSERT INTO `ReleaseHistory` VALUES (8, 'ssm', 'default', 'application', 'default', 8, 6, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 11:39:55', 'apollo', '2018-07-31 11:39:55');
INSERT INTO `ReleaseHistory` VALUES (9, 'ssm', 'default', 'application', 'default', 9, 8, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 11:40:02', 'apollo', '2018-07-31 11:40:02');
INSERT INTO `ReleaseHistory` VALUES (10, 'ssm', 'default', 'ssm-dlxt', 'default', 10, 7, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 11:41:03', 'apollo', '2018-07-31 11:41:03');
INSERT INTO `ReleaseHistory` VALUES (11, 'ssm', 'default', 'ssm-dlxt', 'default', 11, 10, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 15:32:06', 'apollo', '2018-07-31 15:32:06');
INSERT INTO `ReleaseHistory` VALUES (12, 'ssm', 'default', 'application', 'default', 12, 9, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 15:32:14', 'apollo', '2018-07-31 15:32:14');
INSERT INTO `ReleaseHistory` VALUES (13, 'ssm', 'default', 'application', 'default', 13, 12, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 15:43:04', 'apollo', '2018-07-31 15:43:04');
INSERT INTO `ReleaseHistory` VALUES (14, 'ssm', 'default', 'application', 'default', 14, 13, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 16:21:22', 'apollo', '2018-07-31 16:21:22');
INSERT INTO `ReleaseHistory` VALUES (15, 'ssm', 'default', 'application', 'default', 15, 14, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 16:25:02', 'apollo', '2018-07-31 16:25:02');
INSERT INTO `ReleaseHistory` VALUES (16, 'ssm', 'default', 'application', 'default', 16, 15, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 16:27:01', 'apollo', '2018-07-31 16:27:01');
INSERT INTO `ReleaseHistory` VALUES (17, 'ssm', 'default', 'application', 'default', 17, 16, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 16:35:08', 'apollo', '2018-07-31 16:35:08');
INSERT INTO `ReleaseHistory` VALUES (18, 'ssm', 'default', 'application', 'default', 18, 17, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 16:38:28', 'apollo', '2018-07-31 16:38:28');
INSERT INTO `ReleaseHistory` VALUES (19, 'ssm', 'default', 'application', 'default', 19, 18, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-07-31 17:03:24', 'apollo', '2018-07-31 17:03:24');
INSERT INTO `ReleaseHistory` VALUES (20, 'ssm', 'default', 'application', 'default', 20, 19, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 12:38:22', 'apollo', '2018-08-01 12:38:22');
INSERT INTO `ReleaseHistory` VALUES (21, 'ssm', 'default', 'application', 'default', 21, 20, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 14:08:23', 'apollo', '2018-08-01 14:08:24');
INSERT INTO `ReleaseHistory` VALUES (22, 'ssm', 'default', 'application', 'default', 22, 21, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 14:24:39', 'apollo', '2018-08-01 14:24:39');
INSERT INTO `ReleaseHistory` VALUES (23, 'ssm', 'default', 'application', 'default', 23, 22, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 14:25:26', 'apollo', '2018-08-01 14:25:26');
INSERT INTO `ReleaseHistory` VALUES (24, 'ssm', 'default', 'ssm-dlxt', 'default', 24, 11, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 14:26:56', 'apollo', '2018-08-01 14:26:56');
INSERT INTO `ReleaseHistory` VALUES (25, 'ssm', 'default', 'application', 'default', 25, 23, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 14:27:06', 'apollo', '2018-08-01 14:27:06');
INSERT INTO `ReleaseHistory` VALUES (26, 'ssm', 'default', 'ssm-dlxt', 'default', 26, 24, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 16:01:06', 'apollo', '2018-08-01 16:01:06');
INSERT INTO `ReleaseHistory` VALUES (27, 'ssm', 'default', 'application', 'default', 27, 25, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 16:01:30', 'apollo', '2018-08-01 16:01:30');
INSERT INTO `ReleaseHistory` VALUES (28, 'ssm', 'default', 'ssm-dlxt', 'default', 28, 26, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-01 16:02:07', 'apollo', '2018-08-01 16:02:07');
INSERT INTO `ReleaseHistory` VALUES (29, 'ssm', 'default', 'application', 'default', 29, 27, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-03 09:50:18', 'apollo', '2018-08-03 09:50:18');
INSERT INTO `ReleaseHistory` VALUES (30, 'ssm', 'default', 'ssm-dlxt', 'default', 30, 28, 0, '{\"isEmergencyPublish\":false}', b'0', 'apollo', '2018-08-03 10:05:53', 'apollo', '2018-08-03 10:05:53');

-- ----------------------------
-- Table structure for ReleaseMessage
-- ----------------------------
DROP TABLE IF EXISTS `ReleaseMessage`;
CREATE TABLE `ReleaseMessage`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `Message` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '发布的消息内容',
  `DataChange_LastTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_Message`(`Message`(191)) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '发布消息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ReleaseMessage
-- ----------------------------
INSERT INTO `ReleaseMessage` VALUES (28, 'ssm+default+application', '2018-08-03 09:50:18');
INSERT INTO `ReleaseMessage` VALUES (29, 'ssm+default+ssm-dlxt', '2018-08-03 10:05:53');

-- ----------------------------
-- Table structure for Role
-- ----------------------------
DROP TABLE IF EXISTS `Role`;
CREATE TABLE `Role`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `RoleName` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'Role name',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_RoleName`(`RoleName`(191)) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Role
-- ----------------------------
INSERT INTO `Role` VALUES (1, 'Master+SampleApp', b'0', 'default', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Role` VALUES (2, 'ModifyNamespace+SampleApp+application', b'0', 'default', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Role` VALUES (3, 'ReleaseNamespace+SampleApp+application', b'0', 'default', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `Role` VALUES (4, 'Master+ssm', b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `Role` VALUES (5, 'ModifyNamespace+ssm+application', b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `Role` VALUES (6, 'ReleaseNamespace+ssm+application', b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `Role` VALUES (7, 'ModifyNamespace+ssm+ssm-dlxt', b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');
INSERT INTO `Role` VALUES (8, 'ReleaseNamespace+ssm+ssm-dlxt', b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');

-- ----------------------------
-- Table structure for RolePermission
-- ----------------------------
DROP TABLE IF EXISTS `RolePermission`;
CREATE TABLE `RolePermission`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `RoleId` int(10) UNSIGNED NULL DEFAULT NULL COMMENT 'Role Id',
  `PermissionId` int(10) UNSIGNED NULL DEFAULT NULL COMMENT 'Permission Id',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_RoleId`(`RoleId`) USING BTREE,
  INDEX `IX_PermissionId`(`PermissionId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '角色和权限的绑定表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of RolePermission
-- ----------------------------
INSERT INTO `RolePermission` VALUES (1, 1, 1, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `RolePermission` VALUES (2, 1, 2, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `RolePermission` VALUES (3, 1, 3, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `RolePermission` VALUES (4, 2, 4, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `RolePermission` VALUES (5, 3, 5, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `RolePermission` VALUES (6, 4, 6, b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `RolePermission` VALUES (7, 4, 7, b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `RolePermission` VALUES (8, 4, 8, b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `RolePermission` VALUES (9, 5, 9, b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `RolePermission` VALUES (10, 6, 10, b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `RolePermission` VALUES (11, 7, 11, b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');
INSERT INTO `RolePermission` VALUES (12, 8, 12, b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');

-- ----------------------------
-- Table structure for ServerConfig
-- ----------------------------
DROP TABLE IF EXISTS `ServerConfig`;
CREATE TABLE `ServerConfig`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `Key` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '配置项Key',
  `Cluster` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '配置对应的集群，default为不针对特定的集群',
  `Value` varchar(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '配置项值',
  `Comment` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '注释',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_Key`(`Key`) USING BTREE,
  INDEX `DataChange_LastTime`(`DataChange_LastTime`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '配置服务自身配置' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ServerConfig
-- ----------------------------
INSERT INTO `ServerConfig` VALUES (1, 'eureka.service.url', 'default', 'http://localhost:8080/eureka/', 'Eureka服务Url，多个service以英文逗号分隔', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `ServerConfig` VALUES (2, 'namespace.lock.switch', 'default', 'false', '一次发布只能有一个人修改开关', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `ServerConfig` VALUES (3, 'item.value.length.limit', 'default', '20000', 'item value最大长度限制', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `ServerConfig` VALUES (4, 'config-service.cache.enabled', 'default', 'false', 'ConfigService是否开启缓存，开启后能提高性能，但是会增大内存消耗！', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');
INSERT INTO `ServerConfig` VALUES (5, 'item.key.length.limit', 'default', '128', 'item key 最大长度限制', b'0', 'default', '2018-07-30 07:44:57', '', '2018-07-30 07:44:57');

-- ----------------------------
-- Table structure for UserRole
-- ----------------------------
DROP TABLE IF EXISTS `UserRole`;
CREATE TABLE `UserRole`  (
  `Id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `UserId` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '用户身份标识',
  `RoleId` int(10) UNSIGNED NULL DEFAULT NULL COMMENT 'Role Id',
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '1: deleted, 0: normal',
  `DataChange_CreatedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '创建人邮箱前缀',
  `DataChange_CreatedTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `DataChange_LastModifiedBy` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '最后修改人邮箱前缀',
  `DataChange_LastTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `IX_DataChange_LastTime`(`DataChange_LastTime`) USING BTREE,
  INDEX `IX_RoleId`(`RoleId`) USING BTREE,
  INDEX `IX_UserId_RoleId`(`UserId`, `RoleId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户和role的绑定表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of UserRole
-- ----------------------------
INSERT INTO `UserRole` VALUES (1, 'apollo', 1, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `UserRole` VALUES (2, 'apollo', 2, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `UserRole` VALUES (3, 'apollo', 3, b'0', '', '2018-07-30 07:45:41', '', '2018-07-30 07:45:41');
INSERT INTO `UserRole` VALUES (4, 'apollo', 4, b'0', 'apollo', '2018-07-30 16:31:32', 'apollo', '2018-07-30 16:31:32');
INSERT INTO `UserRole` VALUES (5, 'apollo', 5, b'0', 'apollo', '2018-07-30 16:31:33', 'apollo', '2018-07-30 16:31:33');
INSERT INTO `UserRole` VALUES (6, 'apollo', 6, b'0', 'apollo', '2018-07-30 16:31:34', 'apollo', '2018-07-30 16:31:34');
INSERT INTO `UserRole` VALUES (7, 'apollo', 7, b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');
INSERT INTO `UserRole` VALUES (8, 'apollo', 8, b'0', 'apollo', '2018-07-30 17:18:58', 'apollo', '2018-07-30 17:18:58');

-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users`  (
  `Id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增Id',
  `Username` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '用户名',
  `Password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '密码',
  `Email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'default' COMMENT '邮箱地址',
  `Enabled` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of Users
-- ----------------------------
INSERT INTO `Users` VALUES (1, 'apollo', '$2a$10$7r20uS.BQ9uBpf3Baj3uQOZvMVvB1RN3PYoKE94gtz2.WAOuiiwXS', 'apollo@acme.com', 1);

SET FOREIGN_KEY_CHECKS = 1;
