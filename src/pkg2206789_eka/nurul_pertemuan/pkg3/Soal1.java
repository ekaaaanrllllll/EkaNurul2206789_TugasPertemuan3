/*
Nama : Eka Nurul Baridah
NIM :  2206789
Kelas : Pendidikan Ilmu Komputer 4A

Soal 1
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah karakter, periksa
apakah karakter memiliki urutan konsonan-vokal-konsonan (masukan adalah sebuah
huruf dan merupakan huruf kecil)
 */

package pkg2206789_eka.nurul_pertemuan.pkg3;

import java.util.Scanner;
import java.util.function.Predicate;

public class Soal1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter pertama : ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Masukkan karakter kedua : ");
        char char2 = scanner.next().charAt(0);

        System.out.print("Masukkan karakter ketiga : ");
        char char3 = scanner.next().charAt(0);

        // Memanggil fungsi untuk memeriksa urutan
        if (checkOrder(char1, char2, char3)) {
            System.out.println("Urutan sesuai");
        } else {
            System.out.println("Urutan tidak sesuai");
        }
    }

    // Fungsi untuk memeriksa urutan konsonan-vokal-konsonan
    private static boolean checkOrder(char char1, char char2, char char3) {
        // Fungsi helper untuk memeriksa apakah karakter adalah konsonan
        Predicate<Character> isConsonant = c -> (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u');

        // Memeriksa urutan konsonan-vokal-konsonan
        return isConsonant.test(char1) && !isConsonant.test(char2) && isConsonant.test(char3);
    }
}
