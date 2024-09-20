/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) {
        Kucing caca = new Kucing();
        caca.nama = "Caca";
        caca.jenis = "Kucing";
        caca.suara = "Meoww";
        caca.jenis_makanan = "Karnivora";
        System.out.println("Informasi Hewan");
        
        System.out.println();
              
        caca.InfoHewan();
        
        System.out.println();
        
        Anjing toboy = new Anjing();
        toboy.nama = "Toboy";
        toboy.jenis = "Anjing";
        toboy.suara = "Guk-guk";
        toboy.jenis_makanan = "Omnivora";

        toboy.InfoHewan();
    }
}
    
