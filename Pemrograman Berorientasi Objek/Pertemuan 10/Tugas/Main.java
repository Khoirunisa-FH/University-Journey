/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) {
       
        Elektronik elektronik = new Elektronik();
        Makanan makanan = new Makanan();

        double hargaElektronik = 9800000; 
        double hargaMakanan = 55000;     

        System.out.println("Harga untuk pembayaran elektronik: " 
                + hargaElektronik);
        System.out.println("Pajak untuk pembayaran elektronik: " 
                + elektronik.hitungPajak(hargaElektronik));
        
        System.out.println();

        System.out.println("Harga untuk pembayaran makanan: " 
                + hargaMakanan);
        System.out.println("Pajak untuk pembayaran makanan: " 
                + makanan.hitungPajak(hargaMakanan));
    }   
}


