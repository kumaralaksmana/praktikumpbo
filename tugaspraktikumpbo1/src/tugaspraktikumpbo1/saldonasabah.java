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
public class saldonasabah {
    static double biayaadmin(double saldorekening, double setoranterbaru){
        
        double saldoSekarang = saldorekening + setoranterbaru;
        double admin = saldoSekarang - 7000;
        return admin;
    }
    
    static double saldotabungan(double saldorekening, double setoranterbaru){
        double bonus = 0.0005;
        double saldoakhir = biayaadmin(saldorekening,setoranterbaru) * bonus;
        double saldototal = biayaadmin(saldorekening,setoranterbaru) + saldoakhir;
        return saldototal;
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldorekening = scan.nextDouble();
        double setoranterbaru = scan.nextDouble();
        System.out.println(saldotabungan(saldorekening, setoranterbaru));
    }
}

