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
public class Flight {
    
    private String Number;
    private String Airplane_Code;
    private String From_Airport_Code;
    private String Distanation_Airport_Code;
    private String Depart_time;
    private String Arrival_time;
    private int Status;
    private String Cap_User_Id;
    public Flight(String Number,String Airplane_Code,String From_Airport_Code,String Distanation_Airport_Code,String Depart_time,String Arrival_time,int Status,String Cap_User_Id){
    this.Number=Number;
    this.Airplane_Code=Airplane_Code;
    this.From_Airport_Code=From_Airport_Code;
    this.Distanation_Airport_Code=Distanation_Airport_Code;
    this.Depart_time=Depart_time;
    this.Arrival_time=Arrival_time;
    this.Status=Status;
    this.Cap_User_Id=Cap_User_Id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getAirplane_Code() {
        return Airplane_Code;
    }

    public void setAirplane_Code(String Airplane_Code) {
        this.Airplane_Code = Airplane_Code;
    }

    public String getFrom_Airport_Code() {
        return From_Airport_Code;
    }

    public void setFrom_Airport_Code(String From_Airport_Code) {
        this.From_Airport_Code = From_Airport_Code;
    }

    public String getDistanation_Airport_Code() {
        return Distanation_Airport_Code;
    }

    public void setDistanation_Airport_Code(String Distanation_Airport_Code) {
        this.Distanation_Airport_Code = Distanation_Airport_Code;
    }

    public String getDepart_time() {
        return Depart_time;
    }

    public void setDepart_time(String Depart_time) {
        this.Depart_time = Depart_time;
    }

    public String getArrival_time() {
        return Arrival_time;
    }

    public void setArrival_time(String Arrival_time) {
        this.Arrival_time = Arrival_time;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getCap_User_Id() {
        return Cap_User_Id;
    }

    public void setCap_User_Id(String Cap_User_Id) {
        this.Cap_User_Id = Cap_User_Id;
    }
}
