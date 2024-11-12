/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum11;

/**
 *
 * @author ASUS
 */
class Buku {
    private String judul;
    private Pengarang pengarang;

    Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    String infoBuku() {
        return "Judul: " + judul + ", " + pengarang.infoPengarang();
    }
}


