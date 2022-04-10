/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo1;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class menghitungluas {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int pilihan = scan.nextInt();    
            if (pilihan == 1) {
            int sisi = scan.nextInt();
            System.out.println(luasPersegi(sisi));
            }
            else if (pilihan == 2) {
            int alas = scan.nextInt();
            int tinggi = scan.nextInt();
            System.out.println(luasSegitiga(alas, tinggi));
            }
            else if (pilihan == 3) {
            int jarijari = scan.nextInt();
            System.out.println(luasLingkaran(jarijari));
            }
            else
            System.out.println("Input yang anda masukan tidak sesuai");
 }
    
    static int luasPersegi(int sisi){
        int kuadrat = 2;
        int luas = (int)Math.pow(sisi,2);
        return luas;
    }
    
    static int luasSegitiga(int alas, int tinggi){
        int luas = alas * tinggi / 2;
        return luas;
    }
    
    static double luasLingkaran(int jarijari){
        if(jarijari % 7 == 0){
        double phi = 22/7;
        double luas = phi * jarijari * jarijari;
        return (double)(int)luas;  
        } 
        else {
        double phi = 3.14;
        double luas = phi * jarijari * jarijari;
        return (double)(int)luas;  
        }
        
    }
 }

