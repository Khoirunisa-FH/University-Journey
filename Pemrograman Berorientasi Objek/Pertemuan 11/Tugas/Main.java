/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Ahmad Tohari");
        Pengarang pengarang2 = new Pengarang("Pramoedya Ananta Toer");

        Buku buku1 = new Buku("Ronggeng Dukuh Paruk", pengarang1);
        Buku buku2 = new Buku("Bumi Manusia", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.tampilkanSemuaBuku();
    }
}

