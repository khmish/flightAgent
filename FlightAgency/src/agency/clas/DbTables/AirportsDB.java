/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import agency.clas.Airport;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whatup
 */
public class AirportsDB {

    Database database = new Database();
    PreparedStatement ps;
    ResultSet rs;

    public boolean addNew(Airport newAirport) {
        try {
            //
            database.connect();

            ps = database.prepareStatement("INSERT INTO airport(Airport_code, Airport_city, Airport_name, Airport_Description) VALUES(?, ?, ?, ?)");
            ps.setString(1, newAirport.getAirport_code());
            ps.setString(2, newAirport.getCity());
            ps.setString(3, newAirport.getName());
            ps.setString(4, newAirport.getDescription());
            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delete(String code) {
        try {
            //
            database.connect();

            ps = database.prepareStatement("DELETE FROM airport WHERE Airport_code=?");
            ps.setString(1, code);

            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean update(Airport updateAirport) {
        try {
            //
            database.connect();

            ps = database.prepareStatement("UPDATE airport SET  Airport_city=?, Airport_name=?, Airport_Description=? WHERE Airport_code=?");

            ps.setString(1, updateAirport.getCity());
            ps.setString(2, updateAirport.getName());
            ps.setString(3, updateAirport.getDescription());
            ps.setString(4, updateAirport.getAirport_code());

            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Airport findByAirportCode(String code) {
        Airport airport = new Airport();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT Airport_code, Airport_city, Airport_name, Airport_Description FROM airport WHERE Airport_code=?");
            ps.setString(1, code);

            rs = ps.executeQuery();
            if (rs.next()) {
                airport.setAirport_code(rs.getString("Airport_code"));
                airport.setCity(rs.getString("Airport_city"));
                airport.setName(rs.getString("Airport_name"));
                airport.setDescription(rs.getString("Airport_Description"));
            }
            ps.close();
            database.close();
            return airport;
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airport;
    }

    public Airport findByAirportName(String name) {
        Airport airport = new Airport();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT Airport_code, Airport_city, Airport_name, Airport_Description FROM airport WHERE Airport_name=?");
            ps.setString(1, name);

            rs = ps.executeQuery();
            if (rs.next()) {
                airport.setAirport_code(rs.getString("Airport_code"));
                airport.setCity(rs.getString("Airport_city"));
                airport.setName(rs.getString("Airport_name"));
                airport.setDescription(rs.getString("Airport_Description"));
            }
            ps.close();
            database.close();
            return airport;
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airport;
    }
    public Airport findByCity(String city) {
        Airport airport = new Airport();
        try {
            //
            database.connect();

            ps = database.prepareStatement("SELECT Airport_code, Airport_city, Airport_name, Airport_Description FROM airport WHERE Airport_city=?");
            ps.setString(1, city);

            rs = ps.executeQuery();
            if (rs.next()) {
                airport.setAirport_code(rs.getString("Airport_code"));
                airport.setCity(rs.getString("Airport_city"));
                airport.setName(rs.getString("Airport_name"));
                airport.setDescription(rs.getString("Airport_Description"));
            }
            ps.close();
            database.close();
            return airport;
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airport;
    }
}
