SELECT airlines.airline
FROM flights
RIGHT JOIN airlines
ON flights.flightNumbers = airlines.flightNumber
WHERE
airlines.webRegistration = 'yes'
AND (flights.arrivalAirport = 'Milan' OR flights.arrivalAirport = 'Helsinki')
AND flights.averageTicketPrice < 100