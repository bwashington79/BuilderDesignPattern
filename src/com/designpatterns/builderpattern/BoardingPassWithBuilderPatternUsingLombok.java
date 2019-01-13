package com.designpatterns.builderpattern;

public class BoardingPassWithBuilderPatternUsingLombok {

    private String nameOfPassenger;
    private String flightNumber;
    private String gateNumber;
    private String seatNumber;
    private String departingFrom;
    private String departureDate;
    private String departureTime;
    private String destination;

    /*
    This would more than likely be a different type as defined
    by some library.  I'm using int for now but will look into using
    an actual library like Barcode4J just to learn about it.  But for demonstrating
    knowledge of the Builder Pattern this is sufficient
     */
    private int barCode;

    //    //Traditional constructor, values are set via passed in args.  With this approach all args must be defined even if they aren't needed
    public BoardingPassWithBuilderPatternUsingLombok(
            String nameOfPassenger,
            String flightNumber,
            String gateNumber,
            String seatNumber,
            String departingFrom,
            String departureDate,
            String departureTime,
            String destination,
            int barCode
    ) {
        this.nameOfPassenger = nameOfPassenger;
        this.flightNumber = flightNumber;
        this.gateNumber = gateNumber;
        this.seatNumber = seatNumber;
        this.departingFrom = departingFrom;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.barCode = barCode;
    }

    public String getNameOfPassenger() {
        return nameOfPassenger;
    }

    public static class BoardingPassBuilder {

        String nameOfPassenger;
        String flightNumber;
        String gateNumber;
        String seatNumber;
        String departingFrom;
        String departureDate;
        String departureTime;
        String destination;
        int barCode;

        public BoardingPassBuilder() {

        }

        public BoardingPassBuilder setNameofPassenger(String nameOfPassenger) {
            this.nameOfPassenger = nameOfPassenger;
            return this;
        }

        public BoardingPassBuilder setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public BoardingPassBuilder setGateNumber(String gateNumber) {
            this.gateNumber = gateNumber;
            return this;
        }

        public BoardingPassBuilder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public BoardingPassBuilder setDepartureFrom(String departingFrom) {
            this.departingFrom = departingFrom;
            return this;
        }

        public BoardingPassBuilder setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public BoardingPassBuilder setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public BoardingPassBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public BoardingPassBuilder setBarcode(String barcode) {
            this.barCode = barCode;
            return this;
        }

        public BoardingPassWithBuilderPatternUsingLombok
        build() {
            return new BoardingPassWithBuilderPatternUsingLombok(nameOfPassenger, flightNumber, gateNumber,
                    seatNumber, departingFrom, departureDate, departureTime, destination, barCode);
        }
    }
}