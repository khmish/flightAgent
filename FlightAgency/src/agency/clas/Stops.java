/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas;

/**
 *
 * @author whatup
 */
public class Stops {
    private String Booking_Code;
    private String Flight_Number;

    public Stops( String Booking_Code,String Flight_Number)
    {
        this.Flight_Number=Flight_Number;
        this.Booking_Code=Booking_Code;
    }
    public String getBooking_Code() {
        return Booking_Code;
    }

    public void setBooking_Code(String Booking_Code) {
        this.Booking_Code = Booking_Code;
    }

    public String getFlight_Number() {
        return Flight_Number;
    }

    public void setFlight_Number(String Flight_Number) {
        this.Flight_Number = Flight_Number;
    }
    
}
