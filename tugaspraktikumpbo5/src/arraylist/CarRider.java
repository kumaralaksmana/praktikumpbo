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
public class CarRider {
    String name; int age; String phone;

    public CarRider(String name, int age, String phone){
        //inisialisasi dari variable lokal ke global
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    //membalikkan nilai string dan int 
    public String getName(){ return name;}
    public int getAge(){
        return age;
    }
    public String getPhone(){
        return phone;
    }
}
