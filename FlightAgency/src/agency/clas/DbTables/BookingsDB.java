/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import agency.clas.Booking;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whatup
 */
public class BookingsDB {
    Database database=new Database();
    PreparedStatement ps ;
    ResultSet rs;
    public boolean addNew(Booking newBooking)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("INSERT INTO booking(Booking_Code, Booking_Class_Code, Booking_Status, Booking_Number_of_Passanger) VALUES(?, ?, ?, ?)");
           
            ps.setString(1, newBooking.getBooking_Code());
            ps.setString(2, newBooking.getClass_Code());
            ps.setInt(3, newBooking.getStatus());
            ps.setInt(4, newBooking.getNumberOfPassangers());

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;

        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean addQuick(String newBooking,int classes)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("INSERT INTO booking(Booking_Code, Booking_Class_Code) VALUES(?,?)");
           
            ps.setString(1, newBooking);
            ps.setInt(2, classes);

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(String code)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("DELETE FROM booking WHERE Booking_Code=?");
           
            
            
            ps.setString(1, code);
            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(Booking updateAirport)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("UPDATE booking SET  Booking_Class_Code=?, Booking_Status=?, Booking_Number_of_Passanger=? WHERE Booking_Code=?");
           
            
            ps.setString(1, updateAirport.getClass_Code());
            ps.setInt(2, updateAirport.getStatus());
            ps.setInt(3, updateAirport.getNumberOfPassangers());
            ps.setString(4, updateAirport.getBooking_Code());
            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Booking findByBookingCode(String code)
    {
        Booking booking= new Booking();
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Booking_Code, Booking_Class_Code, Booking_Status, Booking_Number_of_Passanger FROM booking WHERE Booking_Code=?");
           
            
            
            ps.setString(1, code);
            rs=ps.executeQuery();
            while(rs.next())
            {
                booking.setBooking_Code(code);
                booking.setClass_Code(rs.getString("Booking_Class_Code"));
                booking.setNumberOfPassangers(rs.getInt("Booking_Number_of_Passanger"));
                booking.setStatus(rs.getInt("Booking_Status"));
            }
            ps.close();
            database.close();
            return booking;
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booking;
    }
    
}
