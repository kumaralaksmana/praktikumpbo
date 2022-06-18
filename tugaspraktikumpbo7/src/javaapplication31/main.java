/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author kumar
 */
public class main {
      public static void main(String[] args) {
          
          System.out.println("Nama  : Kumara Sahasika Laksmana");
          System.out.println("Kelas : PTI-C");
          System.out.println("");
          System.out.println("====== Pegawai Tetap ======");
        pegawai pegawaitetap1 = new pegawaitetap("Bayu", "350728490327424892342", 2000000);
        pegawai pegawaitetap2 = new pegawaitetap("Lina", "350654651543148341454", 3200000);
        pegawai pegawaitetap3 = new pegawaitetap("Alif", "350456484614587549787", 1000000);
        System.out.println(pegawaitetap1.toString());
        System.out.println(pegawaitetap2.toString());
        System.out.println(pegawaitetap3.toString());
          System.out.println("============================");
          System.out.println("");
          System.out.println("====== Pegawai Harian ======");
        pegawai pegawaiharian1 = new pegawaiharian("Edo", "350728490327424892343", 9500, 40);
        pegawai pegawaiharian2 = new pegawaiharian("Rafi", "350646488874894154841", 6500, 42);
        pegawai pegawaiharian3 = new pegawaiharian("Dennis", "350126549234875515457", 25000, 36);
        System.out.println(pegawaiharian1.toString());
        System.out.println(pegawaiharian2.toString());
        System.out.println(pegawaiharian3.toString());
         System.out.println("============================");
          System.out.println("");
          System.out.println("=========== Sales ==========");
        pegawai sales1 = new sales("Tika", "350728490327424092344", 50, 50000);
        pegawai sales2 = new sales("Rahman", "350454896321478555484", 48, 43000);
        pegawai sales3 = new sales("Caca", "350962147536951224785", 39, 49000);
        System.out.println(sales1.toString());
        System.out.println(sales2.toString());
        System.out.println(sales3.toString());
         System.out.println("============================");
        
    }
}


