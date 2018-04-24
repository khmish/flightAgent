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
public class Airport {
    private String Airport_code;
    private String City;
    private String Name;
    private String Description;

    public Airport(String Airport_code,String City,String Name,String Description)
    {
        this.Airport_code=Airport_code;
        this.City=City;
        this.Name=Name;
        this.Description=Description;
    }
    public String getAirport_code() {
        return Airport_code;
    }

    public void setAirport_code(String Airport_code) {
        this.Airport_code = Airport_code;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
