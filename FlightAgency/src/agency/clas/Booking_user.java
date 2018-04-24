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
public class Booking_user {
    
    private String User_Id;
    private String Booking_Code;

    public Booking_user(String User_Id,String Booking_Code)
    {
        this.User_Id=User_Id;
        this.Booking_Code=Booking_Code;
    }
    public String getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(String User_Id) {
        this.User_Id = User_Id;
    }

    public String getBooking_Code() {
        return Booking_Code;
    }

    public void setBooking_Code(String Booking_Code) {
        this.Booking_Code = Booking_Code;
    }
}
