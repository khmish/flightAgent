/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author whatup
 */
public class Flight {
    
    private String Number;
    private String Airplane_Code;
    private String From_Airport_Code;
    private String Distanation_Airport_Code;
    private Time Depart_time;
    private Time Arrival_time;
    private Date Depart_Date;
    private Date Arrival_Date;
    private int Status;
    private String Cap_User_Id;
    
    public Flight(String Number,String Airplane_Code,String From_Airport_Code,String Distanation_Airport_Code,Time Depart_time,Time Arrival_time,int Status,String Cap_User_Id,Date Depart_Date,Date Arrival_Date){
    this.Number=Number;
    this.Airplane_Code=Airplane_Code;
    this.From_Airport_Code=From_Airport_Code;
    this.Distanation_Airport_Code=Distanation_Airport_Code;
    this.Depart_time=Depart_time;
    this.Arrival_time=Arrival_time;
    this.Status=Status;
    this.Cap_User_Id=Cap_User_Id;
    this.Depart_Date=Depart_Date;
    this.Arrival_Date=Arrival_Date;
    }
    public Flight()
    {
        
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

    public Time getDepart_time() {
        return Depart_time;
    }

    public void setDepart_time(Time Depart_time) {
        this.Depart_time = Depart_time;
    }

    public Time getArrival_time() {
        return Arrival_time;
    }

    public void setArrival_time(Time Arrival_time) {
        this.Arrival_time = Arrival_time;
    }

    public Date getDepart_Date() {
        return Depart_Date;
    }

    public void setDepart_Date(Date Depart_Date) {
        this.Depart_Date = Depart_Date;
    }

    public Date getArrival_Date() {
        return Arrival_Date;
    }

    @Override
    public String toString() {
        return "Flight{" + "Number=" + Number + ", Airplane_Code=" + Airplane_Code + ", From_Airport_Code=" + From_Airport_Code + ", Distanation_Airport_Code=" + Distanation_Airport_Code + ", Depart_time=" + Depart_time + ", Arrival_time=" + Arrival_time + ", Depart_Date=" + Depart_Date + ", Arrival_Date=" + Arrival_Date + ", Status=" + Status + ", Cap_User_Id=" + Cap_User_Id + '}';
    }

    public void setArrival_Date(Date Arrival_Date) {
        this.Arrival_Date = Arrival_Date;
    }
}
