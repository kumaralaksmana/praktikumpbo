/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo4;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class Tugaspraktikumpbo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nama/t : Kumara sahasika Laksmana");
        System.out.println("NIM/t : 215150601111022");
        System.out.println("main class");
        
   Scanner in = new Scanner(System.in);
        System.out.println("Nama\t: Kumara Sahasika Laksmana");
        System.out.println("NIM\t: 215150601111022");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        System.out.println("Masukkan Nama Merchant, Nama Produk, Harga Makanan! ");
        String a, b; double c;
        a = in.nextLine(); b = in.nextLine(); c = in.nextDouble();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(a, b, c));
        DataMerchant.tampilData();
    }
}
    
