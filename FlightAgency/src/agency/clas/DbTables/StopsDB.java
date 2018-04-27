/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;


import agency.clas.Stops;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whatup
 */
public class StopsDB {
    Database database = new Database();
    PreparedStatement ps;
    ResultSet rs;
    public boolean addNew(Stops newStops)
    {
        try {
            //
            database.connect();

            ps = database.prepareStatement("INSERT INTO stops(Stops_Booking_Code, Stops_Flight_Number) VALUES(?, ?)");
            ps.setString(1, newStops.getBooking_Code());
            ps.setString(2, newStops.getFlight_Number());
            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Stops.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(String code)
    {
        return false;
    }
    public boolean update(Stops updateStops)
    {
        try {
            //
            database.connect();

            ps = database.prepareStatement("INSERT INTO stops(Stops_Booking_Code, Stops_Flight_Number) VALUES(?, ?)");
            ps.setString(1, updateStops.getBooking_Code());
            ps.setString(2, updateStops.getFlight_Number());
            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Stops.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Stops findByStopsCode(String code)
    {
        return null;
    }
    public Stops findByFlightNumber(String number)
    {
        return null;
    }
}
