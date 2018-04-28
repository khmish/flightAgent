/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import agency.clas.Airplane;
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
public class AirplanesDB {
    Database database=new Database();
    PreparedStatement ps ;
    ResultSet rs; 
    public boolean addNew(Airplane newAirplane)
    {
         try {
            //
            database.connect();
            
            ps = database.prepareStatement("INSERT INTO airplane(Airplane_code, Airplane_total_sets, Airplane_Description) VALUES(?,?, ?)");
            ps.setString(1, newAirplane.getAirplane_Code());
            ps.setInt(2, newAirplane.getTotal_Sets());
            ps.setString(3, newAirplane.getDescription());
            
            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Airplane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    public boolean delete(String code)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("DELETE FROM airplane WHERE Airplane_code=?");
            ps.setString(1, code);
                        
            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Airplane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(Airplane updateAirplane)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("UPDATE airplane SET  Airplane_total_sets=?, Airplane_Description=? WHERE Airplane_code=?");
            ps.setInt(1, updateAirplane.getTotal_Sets());
            ps.setString(2, updateAirplane.getDescription());
            ps.setString(3, updateAirplane.getAirplane_Code());            
            int x=ps.executeUpdate();
            ps.close();
            database.close();
            return (x>0)?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(Airplane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Airplane findByAirplaneCode(String code)
    {
        Airplane airplane= new Airplane();
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Airplane_code, Airplane_total_sets, Airplane_Description FROM airplane WHERE Airplane_code=?");
            ps.setString(1, code);
                        
            rs=ps.executeQuery();
            if(rs.next())
            {
                airplane.setAirplane_Code(rs.getString("Airplane_code"));
                airplane.setTotal_Sets(rs.getInt("Airplane_total_sets"));
                airplane.setDescription(rs.getString("Airplane_Description"));
            }
            ps.close();
            database.close();
            return airplane;
        } catch (SQLException ex) {
            Logger.getLogger(Airplane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airplane;
    }
    public Airplane findByAirplaneDescription(String description)
    {
        Airplane airplane= new Airplane();
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Airplane_code, Airplane_total_sets, Airplane_Description FROM airplane WHERE Airplane_Description=?");
            ps.setString(1, description);
                        
            rs=ps.executeQuery();
            if(rs.next())
            {
                airplane.setAirplane_Code(rs.getString("Airplane_code"));
                airplane.setTotal_Sets(rs.getInt("Airplane_total_sets"));
                airplane.setDescription(rs.getString("Airplane_Description"));
            }
            ps.close();
            database.close();
            return airplane;
        } catch (SQLException ex) {
            Logger.getLogger(Airplane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airplane;
    }
    public ArrayList<Airplane> AllAirplanes()
    {
        ArrayList<Airplane> airplanes= new ArrayList<Airplane>();
        
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("SELECT Airplane_code, Airplane_total_sets, Airplane_Description FROM airplane ");
            
                        
            rs=ps.executeQuery();
            while(rs.next())
            {
                Airplane airplane= new Airplane();
                airplane.setAirplane_Code(rs.getString("Airplane_code"));
                airplane.setTotal_Sets(rs.getInt("Airplane_total_sets"));
                airplane.setDescription(rs.getString("Airplane_Description"));
                airplanes.add(airplane);
            }
            ps.close();
            database.close();
            return airplanes;
        } catch (SQLException ex) {
            Logger.getLogger(Airplane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return airplanes;
    }
    
}
