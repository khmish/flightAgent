/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EssamAlmutair
 */
public class DatabaseConnection {
    
     
    public static void main(String []args) throws SQLException, ClassNotFoundException{
        connect();
    }

    public static Connection connect() throws SQLException, ClassNotFoundException {
        String driver="com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "";
        Class.forName(driver);
        Connection conn=DriverManager.getConnection(URL,username,password);
        System.out.println("Connected");
        return conn;
    }
   
}
