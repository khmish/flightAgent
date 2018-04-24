/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas;

/**
 *
 * @author whatup
 */
public class User {
    private String Id;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String Address;
    private String Password;
    private String Email;
    private int TypeUser;

    public User(String Id,String FirstName,String LastName,String Phone,String Address,String Password,String Email,int TypeUser)
    {
        this.Id=Id;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Phone=Phone;
        this.Address=Address;
        this.Password=Password;
        this.Email=Email;
        this.TypeUser=TypeUser;
        
    }
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTypeUser() {
        return TypeUser;
    }

    public void setTypeUser(int TypeUser) {
        this.TypeUser = TypeUser;
    }
    
    
}
