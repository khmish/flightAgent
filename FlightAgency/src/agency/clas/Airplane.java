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
public class Airplane {
    private String Airplane_Code;
    private int Total_Sets;
    private String Description;

    public Airplane(String Airplane_Code,int Total_Sets,String Description){
        this.Airplane_Code=Airplane_Code;
        this.Total_Sets=Total_Sets;
        this.Description=Description;
    }
    public String getAirplane_Code() {
        return Airplane_Code;
    }

    public void setAirplane_Code(String Airplane_Code) {
        this.Airplane_Code = Airplane_Code;
    }

    public int getTotal_Sets() {
        return Total_Sets;
    }

    public void setTotal_Sets(int Total_Sets) {
        this.Total_Sets = Total_Sets;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
