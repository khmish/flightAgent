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
public class Class_Booking {
    private int Code;
    private String Name;

    public Class_Booking(int Code,String Name)
    {
        this.Code=Code;
        this.Name= Name;
    }
    public Class_Booking(){
        
    }
    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
