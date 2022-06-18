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
public class sales extends pegawai{
    private int penjualan ;
    private double komisi ;
    public sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi ;
    }
    public int getPenjualan() {
        return penjualan;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji(){
        double gaji ;
        gaji = this.penjualan * this.komisi;
        return gaji ;
    }
    @Override
    public String toString() {
        return "Sales : " +
                this.getNama() + "\n" + super.toString()+ "\n" + "Total Penjualan : " +
                this.penjualan + "\n" + "Besar Komisi : " +
                this.komisi + "\n" + "Pendapatan : Rp" + gaji() + "\n";
    }
}