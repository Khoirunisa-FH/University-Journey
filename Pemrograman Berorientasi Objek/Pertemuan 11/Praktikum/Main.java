/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        Perpustakaan perpustakaan = new Perpustakaan();
        
        System.out.println("Library Information");
        System.out.println();
        
        perpustakaan.tambahBuku(new Buku("Java for Beginners"));
        perpustakaan.tambahBuku(new Buku("Design Patterns in Programming"));
        perpustakaan.tambahBuku(new Buku("Modern Software Engineering"));
        
        perpustakaan.infoPerpustakaan();
        
        Anggota anggota1 = new Anggota("Nca");
        Anggota anggota2 = new Anggota("Pia");
        Anggota anggota3 = new Anggota("Dini");
        Anggota anggota4 = new Anggota("Ayy");
        
        Klub klub = new Klub("Klub Roblox");

        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);
        klub.tambahAnggota(anggota4);
        
        System.out.println("\nClub Information");
        System.out.println();

        klub.infoKlub();
    }
}
        
       




