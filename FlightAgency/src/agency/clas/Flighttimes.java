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
public class Flighttimes {
    private String DpartDate;
    private String DpartTime;
    private String ArriveDate;
    private String ArriveTime;
    private String FlightNumber;
    private String AirplaneCode;
    private String AirplaneDescription;
    private String Dcity;
    private String Dname;
    private String Fcity;
    private String Fname;
    private String FirstName;
    private String LastName;

    @Override
    public String toString() {
        return "Flighttimes{" + "DpartDate=" + DpartDate + ", DpartTime=" + DpartTime + ", ArriveDate=" + ArriveDate + ", ArriveTime=" + ArriveTime + ", FlightNumber=" + FlightNumber + ", AirplaneCode=" + AirplaneCode + ", AirplaneDescription=" + AirplaneDescription + ", Dcity=" + Dcity + ", Dname=" + Dname + ", Fcity=" + Fcity + ", Fname=" + Fname + ", FirstName=" + FirstName + ", LastName=" + LastName + '}';
    }

    public String getDpartDate() {
        return DpartDate;
    }

    public void setDpartDate(String DpartDate) {
        this.DpartDate = DpartDate;
    }

    public String getDpartTime() {
        return DpartTime;
    }

    public void setDpartTime(String DpartTime) {
        this.DpartTime = DpartTime;
    }

    public String getArriveDate() {
        return ArriveDate;
    }

    public void setArriveDate(String ArriveDate) {
        this.ArriveDate = ArriveDate;
    }

    public String getArriveTime() {
        return ArriveTime;
    }

    public void setArriveTime(String ArriveTime) {
        this.ArriveTime = ArriveTime;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public String getAirplaneCode() {
        return AirplaneCode;
    }

    public void setAirplaneCode(String AirplaneCode) {
        this.AirplaneCode = AirplaneCode;
    }

    public String getAirplaneDescription() {
        return AirplaneDescription;
    }

    public void setAirplaneDescription(String AirplaneDescription) {
        this.AirplaneDescription = AirplaneDescription;
    }

    public String getDcity() {
        return Dcity;
    }

    public void setDcity(String Dcity) {
        this.Dcity = Dcity;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getFcity() {
        return Fcity;
    }

    public void setFcity(String Fcity) {
        this.Fcity = Fcity;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
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
    
    
    
}
