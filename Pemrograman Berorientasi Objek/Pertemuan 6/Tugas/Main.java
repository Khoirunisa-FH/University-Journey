/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        
        Buku buku = new Buku("Java: A Beginner's Guide", 350000, 15); 
        Elektronik elektronik = new Elektronik("Laptop", 9000000, 8); 
        Pakaian pakaian = new Pakaian("Vest", 267000, 30); 

        
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        
        keranjang.tampilkanProduk();
        
        System.out.println();

        
        double total = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total Harga Setelah Diskon: " + total);
    }
}