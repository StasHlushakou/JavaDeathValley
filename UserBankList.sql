-- MySQL Script generated by MySQL Workbench
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema BankList
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema BankList
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BankList` DEFAULT CHARACTER SET utf8 ;
USE `BankList` ;

-- -----------------------------------------------------
-- Table `BankList`.`_l user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BankList`.`_l user` (
  `userid` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `sureName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BankList`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BankList`.`account` (
  `accountld` INT NOT NULL,
  `account` INT NOT NULL,
  `userid` INT NOT NULL,
  PRIMARY KEY (`accountld`),
  INDEX `userid_idx` (`userid` ASC) VISIBLE,
  CONSTRAINT `userid`
    FOREIGN KEY (`userid`)
    REFERENCES `BankList`.`_l user` (`userid`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `BankList`.`_l user`
-- -----------------------------------------------------
START TRANSACTION;
USE `BankList`;
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (1, 'Mark           ', 'Gilmore                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (2, 'John           ', 'Wilcox                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (3, 'Peter          ', 'Black                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (4, 'Ethan          ', 'Griffin                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (5, 'Peter          ', 'Poole                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (6, 'Karin          ', 'Doyle                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (7, 'Brittney       ', 'Carter                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (8, 'Ruth           ', 'Hoover                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (9, 'Merryl         ', 'Black                        ');
INSERT INTO `BankList`.`_l user` (`userid`, `name`, `sureName`) VALUES (10, 'Aleesha        ', 'Henry                        ');

COMMIT;


-- -----------------------------------------------------
-- Data for table `BankList`.`account`
-- -----------------------------------------------------
START TRANSACTION;
USE `BankList`;
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (1, 11, 10);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (2, 22, 9);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (3, 33, 8);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (4, 44, 7);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (5, 55, 6);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (6, 66, 5);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (7, 77, 4);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (8, 88, 3);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (9, 99, 2);
INSERT INTO `BankList`.`account` (`accountld`, `account`, `userid`) VALUES (10, 1010, 1);

COMMIT;
