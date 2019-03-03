/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2019-03-03 13:11:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `department_name` varchar(30) DEFAULT NULL COMMENT '部门名称',
  `manager_id` int(10) DEFAULT NULL,
  `location_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=271 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employee_id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `hire_date` date DEFAULT NULL,
  `job_id` varchar(10) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL COMMENT '工资',
  `manager_id` int(10) DEFAULT NULL,
  `department_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14998 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `job_id` varchar(10) NOT NULL,
  `job_title` varchar(35) DEFAULT NULL,
  `min_salary` decimal(6,0) DEFAULT NULL,
  `max_salary` decimal(6,0) DEFAULT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for url_log
-- ----------------------------
DROP TABLE IF EXISTS `url_log`;
CREATE TABLE `url_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `creat_time` datetime DEFAULT NULL,
  `op_name` varchar(255) DEFAULT NULL,
  `op_id` int(11) DEFAULT NULL,
  `request_url` varchar(255) DEFAULT NULL,
  `request_method` varchar(255) DEFAULT NULL,
  `request_params` varchar(255) DEFAULT NULL,
  `response_status` varchar(255) DEFAULT NULL,
  `controller_name` varchar(255) DEFAULT NULL,
  `controller_method` varchar(255) DEFAULT NULL,
  `cost_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=548 DEFAULT CHARSET=utf8;
