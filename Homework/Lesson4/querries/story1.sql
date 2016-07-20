SELECT flights.departureAirport
FROM flights
INNER JOIN airports
ON flights.flightNumbers = airports.airports
JOIN airlines 
ON airports.airports = airlines.flightNumber
WHERE flights.departureAirport = 'London'
AND flights.arrivalAirport = 'Munich'
AND flights.averageTicketPrice < 120
AND flights.availableSeats = 4
AND airports.priorityBoarding = 'yes'
AND airlines.additionalSpaceService = 'yes'