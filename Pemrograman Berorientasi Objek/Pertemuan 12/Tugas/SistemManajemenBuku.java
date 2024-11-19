/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum12;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemManajemenBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Buku> daftarBuku = new ArrayList<>();

        while (true) {
            System.out.println("\n=============== Sistem Manajemen Buku ===============");
            System.out.println("1. Tambahkan Buku Baru dan Simpan ke File Teks");
            System.out.println("2. Simpan Semua Buku ke File Serialisasi");
            System.out.println("3. Lihat Daftar Buku dari File");
            System.out.println("4. Keluar dari Program");
            System.out.print("Pilih opsi (1-4): ");

            try {
                int pilihan = Integer.parseInt(scanner.nextLine().trim());
                switch (pilihan) {
                    case 1:
                        tambahBuku(scanner, daftarBuku);
                        FileManager.simpanKeFileTeks(daftarBuku);
                        break;
                    case 2:
                        FileManager.simpanKeFileSerial(daftarBuku);
                        break;
                    case 3:
                        FileManager.bacaDariFileTeks();
                        List<Buku> bukuDariSerial = FileManager.bacaDariFileSerial();
                        System.out.println("\n=== Buku dari File Serialisasi ===");
                        for (Buku buku : bukuDariSerial) {
                            System.out.println(buku);
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan Sistem Manajemen Buku. Sampai jumpa!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan angka antara 1 hingga 4.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner, List<Buku> daftarBuku) {
        try {
            System.out.print("Masukkan judul buku: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan nama pengarang: ");
            String pengarang = scanner.nextLine();
            System.out.print("Masukkan tahun terbit (angka): ");
            int tahunTerbit = Integer.parseInt(scanner.nextLine().trim());

            Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
            daftarBuku.add(bukuBaru);
            System.out.println("Buku berhasil ditambahkan ke daftar.");
        } catch (NumberFormatException e) {
            System.out.println("Tahun terbit harus berupa angka. Silakan coba lagi.");
        }
    }
}

