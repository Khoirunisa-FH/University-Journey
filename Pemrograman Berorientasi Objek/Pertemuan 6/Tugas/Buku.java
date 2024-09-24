/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author ASUS
 */
class Buku extends Produk {
    private double diskonPersen;

    public Buku(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskonPersen = diskonPersen;
    }

    @Override
    public double hitungDiskon() {
        return harga * (diskonPersen / 100);
    }
}
