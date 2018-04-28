/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import agency.clas.Booking_user;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whatup
 */
public class BookingUsersDB {
    Database database=new Database();
    PreparedStatement ps ;
    ResultSet rs;
    public boolean addNew(Booking_user newBooking_user)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("INSERT INTO booking_users(Booking_Users_User_Id, Booking_Users_Booking_Code) VALUES(?, ?)");
           
            ps.setString(1, newBooking_user.getUser_Id());
            ps.setString(2, newBooking_user.getBooking_Code());
           

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;

        } catch (SQLException ex) {
            Logger.getLogger(Booking_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(String code)
    {
        return false;
    }
    public boolean update(Booking_user updateBooking_user)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("UPDATE booking_users SET Booking_Users_User_Id=? WHERE Booking_Users_Booking_Code=?");
           
            ps.setString(1, updateBooking_user.getUser_Id());
            ps.setString(2, updateBooking_user.getBooking_Code());
           

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;

        } catch (SQLException ex) {
            Logger.getLogger(Booking_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Booking_user findByBookingCode(String code)
    {
        return null;
    }
    public Booking_user findByBookingUserID(String userID)
    {
        return null;
    }
}
