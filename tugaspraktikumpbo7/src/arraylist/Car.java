/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author kumar
 */
public class Car {

    static void status() {
    }
    //variable global
    private String carType; 
    private String polNum; 
    private String merk; 
    private boolean status; 
//construktor dengan parameter
    Car(String carType, String polNum, String merk,boolean status){ 
        this.carType = carType; 
        this.polNum = polNum; 
        this.merk = merk; 
        this.status = status;
    }
//construktor dengan parameter
    Car(String carType, String polNum, String merk) {
        this.carType = carType; 
        this.polNum = polNum; 
        this.merk = merk; 
    }
//setter getter
    public String getPolNum() { 
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public String getCarType() {
        return carType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}