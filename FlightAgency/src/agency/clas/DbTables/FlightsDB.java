/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import agency.clas.Flight;
import agency.clas.Flighttimes;
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
public class FlightsDB {
    Database database=new Database();
    PreparedStatement ps ;
    ResultSet rs;
    public boolean addNew(Flight newFlight)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("INSERT INTO flight(Flight_Number, Flight_Airplane_Code, Flight_From_Airport_Code, Flight_Distanation_Airport_Code, Flight_Depart_time, Flight_Arrival_time, Flight_Status, Flight_Captin_User_Id, Flight_Depart_Date, Flight_Arraival_Date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
           
            ps.setString(1, newFlight.getNumber());
            ps.setString(2, newFlight.getAirplane_Code());
            ps.setString(3, newFlight.getFrom_Airport_Code());
            ps.setString(4, newFlight.getDistanation_Airport_Code());
            ps.setTime(5, newFlight.getDepart_time());
            ps.setTime(6, newFlight.getArrival_time());
            ps.setInt(7, newFlight.getStatus());
            ps.setString(8, newFlight.getCap_User_Id());
            ps.setDate(9, newFlight.getDepart_Date());
            ps.setDate(10, newFlight.getArrival_Date());
            

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(String number)
    {
         try {
            //
            database.connect();
            
            ps = database.prepareStatement("DELETE FROM flight WHERE Flight_Number=?");
           
            
            ps.setString(1, number);

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(Flight updateFlight)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("UPDATE flight SET  Flight_Airplane_Code=?, Flight_From_Airport_Code=?, Flight_Distanation_Airport_Code=?, Flight_Depart_time=?, Flight_Arrival_time=?, Flight_Status=?, Flight_Captin_User_Id=?, Flight_Depart_Date=?, Flight_Arraival_Date=? WHERE Flight_Number=?");
           
            
            ps.setString(1, updateFlight.getAirplane_Code());
            ps.setString(2, updateFlight.getFrom_Airport_Code());
            ps.setTime(3, updateFlight.getDepart_time());
            ps.setTime(4, updateFlight.getArrival_time());
            ps.setInt(5, updateFlight.getStatus());
            ps.setString(6, updateFlight.getCap_User_Id());
            ps.setDate(7, updateFlight.getDepart_Date());
            ps.setDate(8, updateFlight.getArrival_Date());
            ps.setString(9, updateFlight.getNumber());

            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Flight findByFlightCode(String number)
    {
        Flight flight= new Flight();
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Flight_Number, Flight_Airplane_Code, Flight_From_Airport_Code, Flight_Distanation_Airport_Code, Flight_Depart_time, Flight_Arrival_time, Flight_Status, Flight_Captin_User_Id, Flight_Depart_Date, Flight_Arraival_Date FROM flight WHERE Flight_Number=?");
           
            
            ps.setString(1, number);
            

            rs=ps.executeQuery();
            if(rs.next())
            {
                flight.setNumber(rs.getString("Flight_Number"));
                flight.setAirplane_Code(rs.getString("Flight_Airplane_Code"));
                flight.setFrom_Airport_Code(rs.getString("Flight_From_Airport_Code"));
                flight.setDistanation_Airport_Code(rs.getString("Flight_Distanation_Airport_Code"));
                flight.setDepart_time(rs.getTime("Flight_Depart_time"));
                flight.setArrival_time(rs.getTime("Flight_Arrival_time"));
                flight.setStatus(rs.getInt("Flight_Status"));
                flight.setCap_User_Id(rs.getString("Flight_Captin_User_Id"));
                flight.setDepart_Date(rs.getDate("Flight_Depart_Date"));
                flight.setArrival_Date(rs.getDate("Flight_Arraival_Date"));
            }
            ps.close();
            database.close();
            return flight;
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flight;
    }
    public ArrayList<Flight> AllFlight()
    {
        ArrayList<Flight> arrayFlights= new ArrayList<>();
        
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Flight_Number, Flight_Airplane_Code, Flight_From_Airport_Code, Flight_Distanation_Airport_Code, Flight_Depart_time, Flight_Arrival_time, Flight_Status, Flight_Captin_User_Id, Flight_Depart_Date, Flight_Arraival_Date FROM flight");
           
   
            rs=ps.executeQuery();
            while(rs.next())
            {
                Flight flight= new Flight();
                flight.setNumber(rs.getString("Flight_Number"));
                flight.setAirplane_Code(rs.getString("Flight_Airplane_Code"));
                flight.setFrom_Airport_Code(rs.getString("Flight_From_Airport_Code"));
                flight.setDistanation_Airport_Code(rs.getString("Flight_Distanation_Airport_Code"));
                flight.setDepart_time(rs.getTime("Flight_Depart_time"));
                flight.setArrival_time(rs.getTime("Flight_Arrival_time"));
                flight.setStatus(rs.getInt("Flight_Status"));
                flight.setCap_User_Id(rs.getString("Flight_Captin_User_Id"));
                flight.setDepart_Date(rs.getDate("Flight_Depart_Date"));
                flight.setArrival_Date(rs.getDate("Flight_Arraival_Date"));
                arrayFlights.add(flight);
            }
            ps.close();
            database.close();
            return arrayFlights;
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFlights;
    }
    public ArrayList<Flighttimes> AllFlights()
    {
        ArrayList<Flighttimes> arrayFlights= new ArrayList<>();
        
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Flight_Depart_Date, Flight_Arraival_Date, Flight_Arrival_time, Flight_Depart_time, Flight_Number, Airplane_code, Airplane_Description, fcity, fname, dcity, dname, Flight_Distanation_Airport_Code, Flight_From_Airport_Code, User_LastName, User_firstName, Flight_Captin_User_Id FROM flighttimes");
           
   
            rs=ps.executeQuery();
            while(rs.next())
            {
                Flighttimes flight= new Flighttimes();
                flight.setFlightNumber(rs.getString("Flight_Number"));
                
                flight.setAirplaneCode(rs.getString("Airplane_code"));
                flight.setAirplaneDescription(rs.getString("Airplane_Description"));
                
                flight.setFcity(rs.getString("fcity"));
                flight.setFname(rs.getString("fname"));
                flight.setDpartDate(rs.getString("Flight_Depart_Date"));
                flight.setDpartTime(rs.getString("Flight_Depart_time"));
                
                flight.setDcity(rs.getString("dcity"));
                flight.setDname(rs.getString("dname"));
                flight.setArriveDate(rs.getString("Flight_Arraival_Date"));
                flight.setArriveTime(rs.getString("Flight_Arrival_time"));
                flight.setAirplaneDescription(rs.getString("Flight_Depart_Date"));
                
                
                flight.setFirstName(rs.getString("User_firstName"));
                flight.setLastName(rs.getString("User_LastName"));
                
                arrayFlights.add(flight);
            }
            ps.close();
            database.close();
            return arrayFlights;
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFlights;
    }
    
    
    
}
