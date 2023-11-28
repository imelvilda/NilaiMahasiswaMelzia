/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myalgoproject.nilaimahasiswamelzia;

import java.util.Scanner;

/**
 *
 * @author linda
 */
public class NilaiMahasiswaMelzia {

   @SuppressWarnings("UnusedAssignment")
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Nama dan NPM
        System.out.print("Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("NPM mahasiswa: ");
        long npm = scanner.nextLong();
        int twoDigit = (int) (npm % 100);
        int ip = twoDigit;
      
        // Evaluasi Nilai
        String nilai = null;
        String keterangan;

        if (ip >= 90) {
            nilai = "A";
            keterangan = "Waw Kamu Hebat, Lulus dengan Nilai Terbaik";
        } else if (ip >= 80) {
            nilai = "B";
            keterangan = "Alhamdulillah, Kamu Lulus";
        } else if (ip >= 60) {
            nilai = "C";
            keterangan = "Lulus dengan ala kadarnya";
        }else if (ip >= 40) {
            nilai = "D";
            keterangan = "Mau Lulus? Yuk, Coba Perbaiki lagi";

           // Proses perulangan sampai Lulus
            while (ip < 90) {
                System.out.println("Nilai " + nilai + ", Perbaiki lagi dengan Penambahan Nilai = " + ip);
                ip += 10;
            }

            nilai = "A";
            keterangan = "Alhamdulillah Nilai sudah diperbaiki, Selamat sekarang Kamu Lulus";
        } else {
            nilai = "E";
            keterangan = "Tidak Lulus";
        }

        // Output
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + keterangan);
    }
}
