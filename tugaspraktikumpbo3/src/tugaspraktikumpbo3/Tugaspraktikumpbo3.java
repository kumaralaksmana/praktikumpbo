/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo3;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class Tugaspraktikumpbo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nama/t : Kumara sahasika Laksmana");
        System.out.println("NIM/t : 215150601111022");
        System.out.println("main class Erigo Store");
        Scanner input = new Scanner(System.in);
    int bajua = 100000;
    int bajub = 125000;
    int bajuc = 175000;
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int jumlah = input.nextInt();
        
        Baju baju = new Baju(jenis, jumlah);
        baju.output();
        
}
}
