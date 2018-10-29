/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama        : Alvin Lukman Nulhakim
 * Nim         : 10117095
 * Kelas       : IF-3
 */
public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        Radio radio = new Radio(234);
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
    
}
