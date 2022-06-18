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
public class Arraylist {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       //inisialisasi objec dari carrider
    CarRider ming = new CarRider ("Lin Ming", 18, "08000000000");
    CarRider youhan = new CarRider ("Bei Youhan", 19, "08111111111");
    CarRider ling = new CarRider ("Ling'er", 20, "08222222222");
    CarRider jett = new CarRider ("jett", 21, "08333333333");

    CarData data = new CarData();
    //inisialisasi objec dan cardata
    data.addCar("SUV", "N 1111 AB", "Honda");
    data.addCar("SPORT", "N 2222 AB", "SCC Tuatara");
    data.addCar("TRUCK", "N 3333 AB", "Suzuki");
    data.addCar("MPV", "N 4444 AB", "Toyota");

    data.listOfCar();

    RentArchive arsip = new RentArchive();
    arsip.Rent(ming, data.getCarList().get(0), 9);
    arsip.Rent(youhan, data.getCarList().get(1), 3);
    arsip.Rent(ling, data.getCarList().get(2), 1);
    arsip.Rent(jett, data.getCarList().get(3), 4);

    System.out.println();
    //menampilkan data mobil
    Car.status();
    //menampilan informasi dari pelanggan
    arsip.info();
    }
}
