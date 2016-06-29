CREATE TABLE `test`.`airlines` (
  `flightNumber` INT(4) NOT NULL,
  `airline` VARCHAR(45) NOT NULL,
  `additionalSpaceService` VARCHAR(45) NOT NULL,
  `webRegistration` VARCHAR(3) NOT NULL,
  `isMealincluded` VARCHAR(3) NOT NULL,
  PRIMARY KEY (`flightNumber`));