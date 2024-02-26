/*
Nama : Eka Nurul Baridah
NIM :  2206789
Kelas : Pendidikan Ilmu Komputer 4A

Soal 2
Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.

*/

package pkg2206789_eka.nurul_pertemuan.pkg3;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa panjang sisi pertama : ");
        double sisi1 = scanner.nextDouble();

        System.out.print("Berapa panjang sisi kedua: ");
        double sisi2 = scanner.nextDouble();

        System.out.print("Berapa panjang sisi ketiga: ");
        double sisi3 = scanner.nextDouble();

        // Memanggil fungsi untuk memeriksa kubus
        if (isCube(sisi1, sisi2, sisi3)) {
            System.out.println("Ya, ini Kubus");
        } else {
            System.out.println("Ini bukan Kubus");
        }
    }

    // Fungsi untuk memeriksa apakah tiga sisi membentuk kubus
    private static boolean isCube(double sisi1, double sisi2, double sisi3) {
        return sisi1 == sisi2 && sisi2 == sisi3;
    }
}
