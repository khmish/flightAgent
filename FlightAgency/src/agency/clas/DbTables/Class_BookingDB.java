/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;


import agency.clas.Class_Booking;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whatup
 */
public class Class_BookingDB {
    Database database = new Database();
    PreparedStatement ps;
    ResultSet rs;
    public boolean addNew(Class_Booking newClass_Booking)
    {
       try {
            //
            database.connect();

            ps = database.prepareStatement("INSERT INTO class_booking(Class_Code, Class_Name) VALUES(?, ?)");
            ps.setInt(1, newClass_Booking.getCode());
            ps.setString(2, newClass_Booking.getName());
            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Class_Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(int code)
    {
        
        try {
            //
            database.connect();

            ps = database.prepareStatement("DELETE FROM class_booking WHERE Class_Code=?");
            
            
            ps.setInt(1, code);
            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Class_Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(Class_Booking updateClass_Booking)
    {
        try {
            //
            database.connect();

            ps = database.prepareStatement("UPDATE class_booking SET  Class_Name=? WHERE Class_Code=?");
            
            ps.setString(1, updateClass_Booking.getName());
            ps.setInt(2, updateClass_Booking.getCode());
            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Class_Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Class_Booking findByClass_BookingCode(int code)
    {
        Class_Booking class_Booking=new Class_Booking();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT Class_Code, Class_Name  FROM class_booking WHERE Class_Code=?");
            ps.setInt(1, code);

            rs = ps.executeQuery();
            if (rs.next()) {
                class_Booking.setCode(code);
                class_Booking.setName(rs.getString("Class_Name"));
                
            }
            ps.close();
            database.close();
            return class_Booking;
        } catch (SQLException ex) {
            Logger.getLogger(Class_Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return class_Booking;
    }
    public Class_Booking findByClass_BookingName(String name)
    {
        Class_Booking class_Booking=new Class_Booking();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT Class_Code, Class_Name  FROM class_booking WHERE Class_Code=?");
            ps.setString(1, name);

            rs = ps.executeQuery();
            if (rs.next()) {
                class_Booking.setCode(rs.getInt("Class_Code"));
                class_Booking.setName(name);
                
            }
            ps.close();
            database.close();
            return class_Booking;
        } catch (SQLException ex) {
            Logger.getLogger(Class_Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return class_Booking;
    }
}
