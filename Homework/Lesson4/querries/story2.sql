SELECT DISTINCT flights.arrivalAirport
FROM airlines 
JOIN flights
ON flights.flightNumbers = airlines.flightNumber
JOIN airports
WHERE 
flights.departureAirport = 'New York'
AND
flights.stopsNumber = 0
AND
flights.averageTicketPrice < 500
AND
airports.dutyFree = 'yes'
AND
airlines.isMealincluded = 'yes'