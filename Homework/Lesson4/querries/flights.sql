CREATE TABLE `test`.`flights` (
  `flightNumbers` INT NOT NULL,
  `departureAirport` VARCHAR(45) NOT NULL,
  `arrivalAirport` VARCHAR(45) NOT NULL,
  `stopsNumber` INT NULL,
  `averageTicketPrice` INT NULL,
  `availableSeats` INT NULL,
  PRIMARY KEY (`flightNumbers`));