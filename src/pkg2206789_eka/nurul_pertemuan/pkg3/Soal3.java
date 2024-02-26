/*
Nama : Eka Nurul Baridah
NIM :  2206789
Kelas : Pendidikan Ilmu Komputer 4A

Soal 3
Menentukan lama bekerja seseorang berdasarkan jam masuk dan jam keluar dengan
asumsi jam hanya 1 sampai dengan 12 dan lama bekerja seorang pegawai kurang dari
12 jam.

*/
package pkg2206789_eka.nurul_pertemuan.pkg3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masuk jam berapa : ");
        int jamMasuk = scanner.nextInt();

        System.out.print("Keluar jam berapa : ");
        int jamKeluar = scanner.nextInt();

        // Memanggil fungsi untuk menghitung lama bekerja
        int lamaBekerja = hitungLamaBekerja(jamMasuk, jamKeluar);

        if (lamaBekerja != -1) {
            System.out.println("Lama bekerja: " + lamaBekerja + " jam");
        } else {
            System.out.println("Coba lagi, Pastikan jam masuk dan jam keluar dalam rentang 1-12");
        }
    }

    // Fungsi untuk menghitung lama bekerja
    private static int hitungLamaBekerja(int jamMasuk, int jamKeluar) {
        if (jamMasuk >= 1 && jamMasuk <= 12 && jamKeluar >= 1 && jamKeluar <= 12) {
            // Menghitung lama bekerja dengan memperhitungkan perpindahan ke jam berikutnya
            int lamaBekerja = jamKeluar - jamMasuk;
            return (lamaBekerja >= 0) ? lamaBekerja : lamaBekerja + 12;
        } else {
            // Input tidak valid
            return -1;
        }
    }
}