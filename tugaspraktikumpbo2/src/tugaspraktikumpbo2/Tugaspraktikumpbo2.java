/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo2;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class Tugaspraktikumpbo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nama/t : Kumara sahasika Laksmana");
        System.out.println("NIM/t : 215150601111022");
        System.out.println("Menghitung Luas");
       
    Scanner scan = new Scanner (System.in);
    int pilihan = scan.nextInt();    
            if (pilihan == 1) {
            int sisi = scan.nextInt();
            Persegi p = new Persegi(sisi);
            p.luasPersegi();
            }
            else if (pilihan == 2) {
            int alas = scan.nextInt();
            int tinggi = scan.nextInt();
            Segitiga s = new Segitiga(alas, tinggi);
            s.luasSegitiga();
            }
            else if (pilihan == 3) {
            int jarijari = scan.nextInt();
            Lingkaran l = new Lingkaran(jarijari);
            l.luasLingkaran();
            }
            else
            System.out.println("Input yang anda masukan tidak sesuai");
 }
}
    
    class Persegi {
        int sisi;
        
        Persegi(int sisi) {
            this.sisi = sisi;
        }
        void luasPersegi(){
            int kuadrat = 2;
            int luas = (int)Math.pow(sisi,2);
            System.out.println(luas);
        }
    }
    
    class Segitiga {
        int alas, tinggi;
        
        Segitiga (int alas, int tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
        }
        
        void luasSegitiga(){
            int luas = alas * tinggi / 2;
            System.out.println(luas);
        }
    }
    
    class Lingkaran {
        int jarijari;
        double phi;
        
        Lingkaran (int jarijari) {
            this.jarijari = jarijari;
        }
        
        void luasLingkaran(){
            if (jarijari % 7 == 0)
                phi = 22/7;
            else
                phi = 3.14;
            double luas = phi * jarijari * jarijari;
            System.out.println((double)(int) luas);
        }
    }
    
