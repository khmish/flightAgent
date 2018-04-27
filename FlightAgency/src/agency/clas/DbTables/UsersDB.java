/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.DbTables;

import agency.clas.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author whatup
 */
public class UsersDB {
    Database database=new Database();
    PreparedStatement ps ;
    ResultSet rs; 
    public boolean addNew(User User)
    {
         try {
            //
            database.connect();
            
            ps = database.prepareStatement("INSERT INTO user(User_Id, User_firstName, User_LastName, User_Phone, User_Address, User_Password, User_Email)  VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, User.getId());
            ps.setString(2, User.getFirstName());
            ps.setString(3, User.getLastName());
            ps.setString(4, User.getPhone());
            ps.setString(5, User.getAddress());
            ps.setString(6, User.getPassword());
            ps.setString(7, User.getEmail());
            

            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(String Id)
    {
         try {
            database.connect();
            ps = database.prepareStatement("DELETE FROM user WHERE User_Id=?");
            ps.setString(1, Id);
            

            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(User updateUser)
    {
        try {
            //
            database.connect();
            
            ps = database.prepareStatement("UPDATE user SET  User_firstName=?, User_LastName=?, User_Phone=?, User_Address=?,  User_Password=?, User_Email=? WHERE User_Id=?");
            
            ps.setString(1, updateUser.getFirstName());
            ps.setString(2, updateUser.getLastName());
            ps.setString(3, updateUser.getPhone());
            ps.setString(4, updateUser.getAddress());
            ps.setString(5, updateUser.getPassword());
            ps.setString(6, updateUser.getEmail());
            ps.setString(7, updateUser.getId());

            ps.execute();
            ps.close();
            database.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public User findByUserId(String Id)
    {
        User temp=new User();
           try {
            //
            database.connect();    
            ps = database.prepareStatement("SELECT User_Id, User_firstName, User_LastName, User_Phone, User_Address, User_Type, User_Password, User_Email FROM user WHERE User_Id=?");
            ps.setString(1, Id);
            rs=ps.executeQuery();
            if (rs.next()) {
                
                temp.setId(rs.getString("User_Id"));
                
                temp.setFirstName(rs.getString("User_firstName"));
                temp.setLastName(rs.getString("User_LastName"));
                temp.setPhone(rs.getString("User_Phone"));
                temp.setAddress(rs.getString("User_Address"));
                temp.setTypeUser(rs.getInt("User_Type"));
                temp.setPassword(rs.getString("User_Password"));
                temp.setEmail(rs.getString("User_Email"));
                
            }
            
            ps.close();
            database.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return temp;
    }
    public User findByUserName(String name)
    {
        return null;
    }
    public int login(String Id,String pass)
    {
        int temp=0;
           try {
            //
            database.connect();    
            ps = database.prepareStatement("SELECT User_Id, User_firstName, User_LastName, User_Phone, User_Address, User_Type, User_Password, User_Email FROM user WHERE User_Id=? and User_Password=?");
            ps.setString(1, Id);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            if (rs.next() ) {
                if(rs.getInt("User_Type")==0){
                    temp=1;
                }
                else if(rs.getInt("User_Type")==1){
                    temp=2;
                }
                
                
            }
            
            
            ps.close();
            database.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return temp;
    }
    public ArrayList<User> AllUserCaps()
    {
        ArrayList<User> arrayUsers= new ArrayList<>();
           try {
            //
            database.connect();    
            ps = database.prepareStatement("SELECT User_Id, User_firstName, User_LastName, User_Phone, User_Address, User_Type, User_Password, User_Email FROM user WHERE User_Type=? ");
            ps.setInt(1, 2);
            rs=ps.executeQuery();
            while (rs.next()) {
                User temp=new User();
                temp.setId(rs.getString("User_Id"));
                
                temp.setFirstName(rs.getString("User_firstName"));
                temp.setLastName(rs.getString("User_LastName"));
                temp.setPhone(rs.getString("User_Phone"));
                temp.setAddress(rs.getString("User_Address"));
                temp.setTypeUser(rs.getInt("User_Type"));
                temp.setPassword(rs.getString("User_Password"));
                temp.setEmail(rs.getString("User_Email"));
                arrayUsers.add(temp);
            }
            
            ps.close();
            database.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayUsers;
    }
    public ArrayList<User> AllUsers()
    {
        ArrayList<User> arrayUsers= new ArrayList<>();
           try {
            //
            database.connect();    
            ps = database.prepareStatement("SELECT User_Id, User_firstName, User_LastName, User_Phone, User_Address, User_Type, User_Password, User_Email FROM user");
            
            rs=ps.executeQuery();
            while (rs.next()) {
                User temp=new User();
                temp.setId(rs.getString("User_Id"));
                
                temp.setFirstName(rs.getString("User_firstName"));
                temp.setLastName(rs.getString("User_LastName"));
                temp.setPhone(rs.getString("User_Phone"));
                temp.setAddress(rs.getString("User_Address"));
                temp.setTypeUser(rs.getInt("User_Type"));
                temp.setPassword(rs.getString("User_Password"));
                temp.setEmail(rs.getString("User_Email"));
                arrayUsers.add(temp);
            }
            
            ps.close();
            database.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrayUsers;
    }
    public static void main(String[] args) {
        UsersDB dB=new UsersDB();
        System.out.println(dB.AllUserCaps());
    }
}
