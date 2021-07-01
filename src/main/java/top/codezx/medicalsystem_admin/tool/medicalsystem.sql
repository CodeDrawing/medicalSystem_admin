/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : medicalsystem

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 01/07/2021 11:06:20
*/
create medicalsystem;
use medicalsystem;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `administratorId` int NOT NULL AUTO_INCREMENT,
  `administratorName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `createUserId` int NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `available` tinyint(1) NULL DEFAULT 1,
  `createDate` datetime NULL DEFAULT NULL,
  `power` int NOT NULL DEFAULT 3,
  PRIMARY KEY (`administratorId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES (1, 'admin', 0, '08290516', 1, '2021-06-27 09:25:59', 3);
INSERT INTO `administrator` VALUES (2, 'admin1', 0, '0829', 1, '2021-06-29 17:11:36', 3);

-- ----------------------------
-- Table structure for assets
-- ----------------------------
DROP TABLE IF EXISTS `assets`;
CREATE TABLE `assets`  (
  `assetsId` int NOT NULL AUTO_INCREMENT,
  `personInCharge` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `affiliatedUnits` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '住院部',
  `apacity` int NULL DEFAULT NULL,
  `roomId` int NOT NULL,
  `floorId` int NOT NULL,
  `buildingId` int NOT NULL,
  PRIMARY KEY (`assetsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of assets
-- ----------------------------

-- ----------------------------
-- Table structure for case
-- ----------------------------
DROP TABLE IF EXISTS `case`;
CREATE TABLE `case`  (
  `caseId` int NOT NULL AUTO_INCREMENT,
  `createDate` datetime NULL DEFAULT NULL,
  `createDoctorId` int NOT NULL,
  `inspectionResults` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `inspectionImg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `firstDoctorId` int NOT NULL,
  `diagnosisResults` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `patientId` int NOT NULL,
  `prescriptionId` int NOT NULL,
  PRIMARY KEY (`caseId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of case
-- ----------------------------

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `departmentId` int NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `parentId` int NOT NULL,
  `createUser` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `createDate` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`departmentId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '东兴区（新）', 0, 'admin', '2021-06-30 10:42:02');
INSERT INTO `department` VALUES (2, '内科', 1, 'admin', '2021-06-30 10:41:52');
INSERT INTO `department` VALUES (3, '外科', 1, 'admin', '2021-06-30 10:41:53');
INSERT INTO `department` VALUES (4, '老年科', 1, 'admin', '2021-06-30 10:41:54');
INSERT INTO `department` VALUES (5, '神经内科', 1, 'admin', '2021-06-30 10:41:50');

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor`  (
  `doctorId` int NOT NULL AUTO_INCREMENT,
  `skill` char(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `doctorImg` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `personalProfile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '暂无' COMMENT '暂无\n',
  `entryData` datetime NULL DEFAULT NULL,
  `departmentId` int NULL DEFAULT NULL,
  `gender` int NULL DEFAULT 1,
  `birthday` datetime NULL DEFAULT NULL,
  `title` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `doctorName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `state` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '1',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '123456',
  `createAdmin` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`doctorId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES (2, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 5, 1, '1989-06-28 08:00:00', '教授', '张三1', '张三111', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (3, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 5, 1, '1989-06-28 16:04:52', '教授', '张三2', 'doctor', '13558724972', '0', '123456', NULL);
INSERT INTO `doctor` VALUES (4, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 5, 0, '1989-06-28 16:04:52', '教授', '张三3', 'doctor', '13558724972', '0', '123456', NULL);
INSERT INTO `doctor` VALUES (5, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 5, 1, '1989-06-28 16:04:52', '教授', '张三4', 'doctor', '13558724972', '0', '123456', NULL);
INSERT INTO `doctor` VALUES (8, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 5, 0, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (11, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '0', '123456', NULL);
INSERT INTO `doctor` VALUES (12, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 0, '1989-06-28 16:04:52', '教授', '张三6', 'doctor', '13558724972', '0', '123456', NULL);
INSERT INTO `doctor` VALUES (16, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 1, '1989-06-28 16:04:52', '教授', '张三55', 'doctor', '13558724972', '0', '123456', NULL);
INSERT INTO `doctor` VALUES (17, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 1, '1989-06-28 16:04:52', '教授', '张三5', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (18, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (19, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (20, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 4, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (21, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 3, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (22, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 3, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (23, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 3, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (24, '擅长心胸外科疑难杂症', NULL, '医者仁心', '2021-03-28 16:02:47', 2, 1, '1989-06-28 16:04:52', '教授', '张三', 'doctor', '13558724972', '1', '123456', NULL);
INSERT INTO `doctor` VALUES (26, NULL, NULL, '暂无', '2021-06-30 15:56:14', 1, NULL, NULL, '副教授', '李四', NULL, '1898058234', '1', '123456', 'admin');
INSERT INTO `doctor` VALUES (27, NULL, NULL, '暂无', '2021-06-30 15:58:40', 4, NULL, '1962-06-28 08:00:00', '主治医生', '王五', NULL, '13232321231', '1', '123456', 'admin');
INSERT INTO `doctor` VALUES (28, NULL, NULL, '暂无', '2021-06-30 16:00:24', 4, NULL, '1976-06-30 08:00:00', '副教授', '赵六', NULL, '12123123123', '1', '123456', 'admin');

-- ----------------------------
-- Table structure for drugs
-- ----------------------------
DROP TABLE IF EXISTS `drugs`;
CREATE TABLE `drugs`  (
  `drugsId` int NOT NULL AUTO_INCREMENT,
  `surplus` int NOT NULL DEFAULT 0,
  `supplierId` int NOT NULL,
  `isSpecialDrugs` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`drugsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of drugs
-- ----------------------------

-- ----------------------------
-- Table structure for operation
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation`  (
  `operationId` int NOT NULL,
  `startTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `patientId` int NOT NULL,
  `operationStats` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '未安排',
  `overTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sumTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `operationTeam` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `operationLog` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `operationRoom` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `operationMainDoctorId` int NOT NULL,
  `operationMainDoctorAdvice` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `operationPrepare` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`operationId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of operation
-- ----------------------------

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient`  (
  `patientId` int NOT NULL AUTO_INCREMENT,
  `patientName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `emergencyContact` int NULL DEFAULT 0,
  `familyAddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phoneNumber` int NULL DEFAULT NULL,
  `registerData` datetime NULL DEFAULT NULL,
  `patientGender` tinyint(1) NULL DEFAULT 1,
  `patientBirthday` datetime NULL DEFAULT NULL,
  `patientImg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`patientId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of patient
-- ----------------------------

-- ----------------------------
-- Table structure for prescription
-- ----------------------------
DROP TABLE IF EXISTS `prescription`;
CREATE TABLE `prescription`  (
  `prescriptionId` int NOT NULL AUTO_INCREMENT,
  `patientId` int NOT NULL,
  `createTime` datetime NULL DEFAULT NULL,
  `applyDoctorId` int NOT NULL,
  `auditDoctorId` int NOT NULL,
  `auditState` tinyint(1) NULL DEFAULT 0,
  `drugsPrescribed` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `doctorAdvice` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`prescriptionId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of prescription
-- ----------------------------

-- ----------------------------
-- Table structure for registerdepartment
-- ----------------------------
DROP TABLE IF EXISTS `registerdepartment`;
CREATE TABLE `registerdepartment`  (
  `departmentId` int NOT NULL AUTO_INCREMENT,
  `createTime` datetime NULL DEFAULT NULL,
  `createDoctorId` int NOT NULL,
  `numberLimit` int NOT NULL,
  `remainingNumber` int NOT NULL,
  `visitingPhysicianId` int NOT NULL,
  `roomId` int NOT NULL,
  `buildingId` int NOT NULL,
  `floorId` int NOT NULL,
  PRIMARY KEY (`departmentId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of registerdepartment
-- ----------------------------

-- ----------------------------
-- Table structure for registerinformation
-- ----------------------------
DROP TABLE IF EXISTS `registerinformation`;
CREATE TABLE `registerinformation`  (
  `patientId` int NOT NULL,
  `registerId` int NOT NULL AUTO_INCREMENT,
  `departmentId` int NOT NULL,
  `isOrNotPay` tinyint(1) NULL DEFAULT 0,
  `makeATime` datetime NULL DEFAULT NULL,
  `selfAccusationOfIllness` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `commitDate` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`registerId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of registerinformation
-- ----------------------------

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `supplierId` int NOT NULL AUTO_INCREMENT,
  `supplierAdd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `contactPhoneNumber` int NULL DEFAULT NULL,
  `contactName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `cooperationStartTime` datetime NULL DEFAULT NULL,
  `cooperationEndTime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`supplierId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of supplier
-- ----------------------------

-- ----------------------------
-- Table structure for sys_power
-- ----------------------------
DROP TABLE IF EXISTS `sys_power`;
CREATE TABLE `sys_power`  (
  `power_id` char(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '权限编号',
  `power_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限名称',
  `power_type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限类型',
  `power_code` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限标识',
  `power_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限路径',
  `open_type` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '打开方式',
  `parent_id` char(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '父类编号',
  `icon` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图标',
  `sort` int NULL DEFAULT NULL COMMENT '排序',
  `create_by` char(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `enable` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否开启',
  PRIMARY KEY (`power_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_power
-- ----------------------------
INSERT INTO `sys_power` VALUES ('1', '数据图表', '0', NULL, NULL, NULL, NULL, 'layui-icon layui-icon-chart', 1, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('11', '门诊人数', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-face-smile', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('12', '住院人数', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-face-smile', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('2', '人员管理', '0', NULL, NULL, NULL, NULL, 'layui-icon layui-icon-console', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('21', '医生列表', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-console', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('22', '患者列表', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-console', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('23', '数据分析', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-console', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('3', '排班管理', '0', NULL, NULL, NULL, NULL, 'layui-icon layui-icon-component', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('31', '住院部', '0', NULL, NULL, NULL, NULL, 'layui-icon layui-icon-console', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('311', '按科室', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-face-smile', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sys_power` VALUES ('312', '按医生', '1', NULL, NULL, '_iframe', NULL, 'layui-icon layui-icon-face-cry', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
