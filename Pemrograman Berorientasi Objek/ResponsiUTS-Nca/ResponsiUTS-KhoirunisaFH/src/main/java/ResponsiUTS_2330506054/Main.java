/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_2330506054;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Kamera", 15000000, 1);
        Produk produk2 = new Makanan("Chiki", 15000, "2025-08-25");
        
        Pegawai pegawai1 = new PegawaiTetap("Nca", 12000000, 4500000);
        Pegawai pegawai2 = new PegawaiKontrak("Caca", 8750000, 11);

        System.out.println("Output Produk");
        produk1.tampilkanInfo();
        System.out.println();

        System.out.println("Output Pegawai");
        pegawai1.tampilkanInfo();
        System.out.println();

        System.out.println("Output Polimorfisme");
        produk2.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
