/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author kumar
 */
public class CarData {
    //menampung data bertipe data car
    private static ArrayList<Car> carList= new ArrayList<>();
    
//fungsi untuk menambahkan mobil
    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType,polNum,merk));
    }
//setter getter dari carlist
    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        CarData.carList = carList;
    }
    //berisikan data dari mobil
    public void listOfCar(){
        System.out.println("===============================");
        System.out.println("\t DAFTAR MOBIL \t\t");
        System.out.println("===============================");
        for (Car data : CarData.carList) {
            System.out.println("TIPE MOBIL  : " + data.getCarType());
            System.out.println("NO.POLIS    : " + data.getPolNum());
            System.out.println("MERK MOBIL  : " + data.getMerk());
            System.out.println("-------------------------------");
        }
    }
}

