/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author khrns
 */
public class HewanDarat extends Hewan {
    String jenis_makanan;
    
    @Override
    public void InfoHewan() {
        super.InfoHewan();
        System.out.println("Jenis Makanan: " + jenis_makanan);
    }
}
