/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.ArrayList;
/**
 *
 * @author kumar
 */
public class Main {
    
 public static void main(String[] args) {
    Manusia hmn1 = new Manusia("Alif", "215150600111018", true, true);
    Manusia hmn2 = new Manusia("Denis", "215150600111018", true, true);
    Manusia hmn3 = new Manusia("Rani", "215150600111018", false, false);
    ArrayList<Manusia> output = new ArrayList<Manusia>();
    output.add(hmn1);
    output.add(hmn2);
    output.add(hmn3);
    
     System.out.println("Nama   : Kumara Sahasika Laksmana");
     System.out.println("NIM    : 215150601111022");
     System.out.println("");
     
    System.out.println("========== DAFTAR MANUSIA ==========");
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
    System.out.println("=====================================");

    MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Aries", "3326134801030063", true, false, "215150400111018", 3.5);
    MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Reza", "3326134801030063", true, true, "205150700111018", 4.0);
    MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Fariz", "3326134801030063", true, false, "195150200111018", 3.2);
    ArrayList<MahasiswaFilkom> output1 = new ArrayList<MahasiswaFilkom>();
    output1.add(mahasiswa1);
    output1.add(mahasiswa2);
    output1.add(mahasiswa3);

    System.out.println();
    System.out.println("====== DAFTAR MAHASISWA FILKOM ======");
        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
    System.out.println("=====================================");
//digit satu kantor cabang, digit 3 kantor cabang, dgit 7 departemen
    Pekerja pkerja1 = new Pekerja("amel", "3216549878945612", false, true, 6, 26, "355892189");
    Pekerja pkerja2 = new Pekerja("joyo", "3126549826548536", true, false, 8, 28, "454821669");
    Pekerja pkerja3 = new Pekerja("atma", "3629854120559932", true, false, 5, 30, "757198244");
    ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
    output2.add(pkerja1);
    output2.add(pkerja2);
    output2.add(pkerja3);

    System.out.println();
    System.out.println("========== DAFTAR PEKERJA ==========");
        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
    System.out.println("=====================================");

    Manager manag1 = new Manager("bulan", "3326134801030063", false, true,9, 25,"351707384392", 3540);
    Manager manag2 = new Manager("indah", "3326134801030063", false, false,8, 28,"351707384392", 3765);
    Manager manag3 = new Manager("tono", "3326134801030063", true, true,6, 25,"351707384392", 3432);
    ArrayList<Manager> output3 = new ArrayList<Manager>();
    output3.add(manag1);
    output3.add(manag2);
    output3.add(manag3);

    System.out.println();
    System.out.println("=========== DAFTAR MANAGER ==========");
        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
    System.out.println("=====================================");

    }
}
