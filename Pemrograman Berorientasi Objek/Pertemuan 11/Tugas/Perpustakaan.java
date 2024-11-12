/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum11;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan.");
        } else {
            for (Buku buku : daftarBuku) {
                System.out.println(buku.infoBuku());
            }
        }
    }
}

