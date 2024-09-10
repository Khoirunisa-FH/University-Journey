/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerjasatu = new Pekerja("Nca", 19, "Engginer", 10000000);
        
        System.out.println("Informasi Pekerja Awal : ");
        System.out.println(pekerjasatu.toString());
        
        pekerjasatu.setNama("Caca");
        
        System.out.println("\nInformasi Pekerja Setelah Nama Diubah : ");
        System.out.println(pekerjasatu.toString());
    } 
}
