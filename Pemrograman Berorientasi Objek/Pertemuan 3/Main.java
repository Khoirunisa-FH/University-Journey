/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) { 
        Mobil satu = new Mobil("Honda", "jazz", 2021, "pink");
        satu.displayInfo();
        
        satu.setWarna("biru");
        
        System.out.println("Warna mobil setelah melakukan perubahan warna : ");
        satu.displayInfo();
           
    } 
}
