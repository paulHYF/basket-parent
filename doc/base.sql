SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema basketdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema basketdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `basketdb` DEFAULT CHARACTER SET utf8mb4 ;
USE `basketdb` ;


-- -----------------------------------------------------
-- Table `basketdb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `basketdb`.`user` ;

CREATE TABLE IF NOT EXISTS `basketdb`.`user` (
  `userId` VARCHAR(60) NOT NULL,
  `passwd` VARCHAR(60) NOT NULL,
  `mobile` VARCHAR(60) NULL,
  `email` VARCHAR(60) NULL,
  `nickname` VARCHAR(100) NOT NULL,
  `avatar` VARCHAR(255) NULL,
  `signature` VARCHAR(100) NULL,
  `introduction` VARCHAR(1000) NULL,
  `gender` CHAR(1) NOT NULL DEFAULT 'S',
  `country` VARCHAR(60) NULL,
  `province` VARCHAR(60) NULL,
  `city` VARCHAR(60) NULL,
  `tag1` VARCHAR(60) NULL,
  `tag2` VARCHAR(60) NULL,
  `status` VARCHAR(60) NOT NULL,
  `isVip` CHAR(1) NOT NULL DEFAULT 'N',
  `vipEndDate` DATE NULL,
  `isRecommend` CHAR(1) NOT NULL DEFAULT 'N',
  `recommendTime` DATETIME NULL,
  `isAdministrator` CHAR(1) NOT NULL DEFAULT 'N',
  `createdTime` DATETIME NULL,
  `lastModified` DATETIME NULL,
  `lastLoginTime` DATETIME NULL,
  `lastLoginIp` VARCHAR(60) NULL,
  PRIMARY KEY (`userId`))
ENGINE = InnoDB;