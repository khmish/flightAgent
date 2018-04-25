/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whatup
 */
public class Database {
    private String URL = "jdbc:mysql://localhost:3306/test";
    private String USER = "root";
    private String PASS = "";
    public Connection conn;

    public Database(String user,String Pass,String url) 
    {
        this.USER=user;
        this.PASS=Pass;
        this.URL=url;
    }
    
    public Database() 
    {
        
    }

    public boolean connect() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(URL, USER, PASS);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean close() {
        try {
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public boolean isConnected() throws SQLException
    {
        return !conn.isClosed();
    }
    
    public boolean hasConnection(){
        if (connect()){
            close();
            return true;
        }
        return false;
            
    }
     
    
    public PreparedStatement prepareStatement(String query){
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            return ps;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
