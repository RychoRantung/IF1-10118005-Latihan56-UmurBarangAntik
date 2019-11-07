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
public class IF110118005Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio rd = new Radio(234);
        rd.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rd.getName());
        rd.tampilUmur();
        
    }
    
}
