/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan56.umurbarangantik;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan umur sebuah barang antik
 */
public class BarangAntik {
    private final int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}
