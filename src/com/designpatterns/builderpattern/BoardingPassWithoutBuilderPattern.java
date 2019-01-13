package com.designpatterns.builderpattern;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BoardingPassWithoutBuilderPattern {

    private  String nameOfPassenger;
    private  String flightNumber;
    private  String gateNumber;
    private  String seatNumber;
    private  String departingFrom;
    private  String departureDate;
    private  String departureTime;
    private  String destination;

    /*
    This would more than likely be a different type as defined
    by some library.  I'm using int for now but will look into using
    an actual library like Barcode4J just to learn about it.  But for demonstrating
    knowledge of the Builder Pattern this is sufficient
     */
    private int barCode;


    //Traditional constructor, values are set via passed in args.  With this approach all args must be defined even if they aren't needed
    public BoardingPassWithoutBuilderPattern(
         String nameOfPassenger,
         String flightNumber,
         String gateNumber,
         String seatNumber,
         String departingFrom,
         String departureDate,
         String departureTime,
         String destination,
         int barCode
    ){
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

    /*
    Below are multiple setters/mutators that have to
    be defined to modify field values.  This can become cumbersome
    as more fields a necessary to future refine the state of the object.
     */


    /*
    No arg constructor.  This allows me to set values independently via setter/mutator.  This is normally
    done to support flexibility in creating objects with different states
    */
    public BoardingPassWithoutBuilderPattern(){

    }

    //Method to set passenger name value
    public void setNameOfPassenger(String passenger){
            this.nameOfPassenger = passenger;
    }

    //Method to get passenger name value
    public String getNameOfPassenger(){
        return nameOfPassenger;
    }

    //Method to set flight number value
    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    //Method to get flight number value
    public String getFlightNumber(){
        return flightNumber;
    }

    //Method to set gate number value
    public void setGateNumber(String gateNumber){
        this.gateNumber = gateNumber;
    }

    //Method to get gate number value
    public String getGateNumber(){
        return gateNumber;
    }

    //Method to set seat number value
    public void setSeatNumber(String seatNumber){
        this.seatNumber = seatNumber;
    }

    //Method to get seat number value
    public String getSeatNumber(){
        return seatNumber;
    }

    //Method to set departing from value
    public void setDepartingFrom(String departingFrom){
        this.departingFrom = departingFrom;
    }

    //Method to get departing from value
    public String getDepartingFrom(){
        return departingFrom;
    }

    //Method to set departure date value
    public void setDepartureDate(String departureDate){
        this.departureDate = departureDate;
    }

    //Method to get departure date value
    public String getDepartureDate(){
        return departureDate;
    }

    //Method to set departure time value
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }

    //Method to get departure time value
    public String getDepartureTime(){
        return departureTime;
    }

    //Method to set destination value
    public void setDestination(String destination){
        this.destination = destination;
    }

    //Method to get destination value
    public String getDestination(){
        return destination;
    }

    //Method to set barcode value
    public void setBarCode(int barCode){
        this.barCode = barCode;
    }

    //Method to get barcode value
    public int getBarCode(){
        return barCode;
    }
}
