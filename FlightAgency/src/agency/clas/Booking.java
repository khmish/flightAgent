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
public class Booking {
    
    private String Booking_Code;
    private String Class_Code;
    private int Status;
    private int NumberOfPassangers;
    public Booking( String Booking_Code,String Class_Code,int Status,int NumberOfPassangers){
        this.Booking_Code=Booking_Code;
        this.Class_Code=Class_Code;
        this.Status=Status;
        this.NumberOfPassangers=NumberOfPassangers;
    }
    public Booking()
    {
        
    }

    public String getBooking_Code() {
        return Booking_Code;
    }

    public void setBooking_Code(String Booking_Code) {
        this.Booking_Code = Booking_Code;
    }

    public String getClass_Code() {
        return Class_Code;
    }

    public void setClass_Code(String Class_Code) {
        this.Class_Code = Class_Code;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public int getNumberOfPassangers() {
        return NumberOfPassangers;
    }

    public void setNumberOfPassangers(int NumberOfPassangers) {
        this.NumberOfPassangers = NumberOfPassangers;
    }
}
