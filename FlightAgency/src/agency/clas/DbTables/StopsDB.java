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
import java.util.ArrayList;
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

            ps = database.prepareStatement("UPDATE stops SET  Stops_Flight_Number=? WHERE Stops_Booking_Code=?");
            ps.setString(2, updateStops.getBooking_Code());
            ps.setString(1, updateStops.getFlight_Number());
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
        Stops stops= new Stops();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT Stops_Booking_Code FROM stops WHERE  Stops_Flight_Number=?");
            ps.setString(1, number);
           
            rs=ps.executeQuery();
            if(rs.next())
            {
                stops.setFlight_Number(number);
                stops.setBooking_Code(rs.getString("Stops_Booking_Code"));
            }
            ps.close();
            database.close();
            return stops;
        } catch (SQLException ex) {
            Logger.getLogger(Stops.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stops;
    }
    public ArrayList<String> findFlightNumber(String number)
    {
        ArrayList<String> arrayList= new ArrayList<>();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT count(Booking_Class_Code) as count1, Booking_Status, Stops_Booking_Code, Stops_Flight_Number FROM bookaflight WHERE Booking_Status=0 and  Stops_Flight_Number=?");
            ps.setString(1, number);
           
            rs=ps.executeQuery();
            if(rs.next())
            {
                arrayList.add(number);
                arrayList.add(rs.getString("Stops_Booking_Code"));
                arrayList.add(rs.getString("count1"));
            }
            ps.close();
            database.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Stops.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
    public int availableSeats(String number)
    {
        int available=0;
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT count(Booking_Class_Code) as count1  FROM bookaflight where Booking_Status=0 and Stops_Flight_Number=?");
            ps.setString(1, number);
           
            rs=ps.executeQuery();
            if(rs.next())
            {
                
                available=(rs.getInt("count1"));
            }
            ps.close();
            database.close();
            return available;
        } catch (SQLException ex) {
            Logger.getLogger(Stops.class.getName()).log(Level.SEVERE, null, ex);
        }
        return available;
    }
    
    
}
