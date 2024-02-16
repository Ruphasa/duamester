package jobSheetAtu;

import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        float tugas;
        float kuis;
        float UTS;
        float UAS;
        float nilaiAkhir = 0;
        String nilaiHuruf;
        boolean valid = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextFloat();
        if (tugas > 100) {
            valid = false;
        }
        tugas *= 0.2f;
        System.out.print("Masukkan Niali Kuis: ");
        kuis = sc.nextFloat();
        if (kuis > 100) {
            valid = false;
        }
        kuis *= 0.2f;
        System.out.print("Masukkan Niali UTS: ");
        UTS = sc.nextFloat();
        if (UTS > 100) {
            valid = false;
        }
        UTS *= 0.3f;
        System.out.print("Masukkan Niali UAS: ");
        UAS = sc.nextFloat();
        if (UAS > 100) {
            valid = false;
        }
        UAS *= 0.3f;
        nilaiAkhir = tugas + kuis + UTS + UAS;
        System.out.println("======================");
        if (valid == false) {
            System.out.println("==================");
            System.out.println("nilai tidak valid");
            System.out.println("==================");
        } else {
            System.out.println("==================");
            System.out.println("nilai akhir : " + nilaiAkhir);
            if (nilaiAkhir > 80) {
                System.out.println("Nilai Huruf : A");
            } else if (nilaiAkhir > 73) {
                System.out.println("Nilai Huruf : B+");
            } else if (nilaiAkhir > 65) {
                System.out.println("Nilai Huruf : B");
            } else if (nilaiAkhir > 60) {
                System.out.println("Nilai Huruf : C+");
            } else if (nilaiAkhir > 50) {
                System.out.println("Nilai Huruf : C");
            } else if (nilaiAkhir > 39) {
                System.out.println("Nilai Huruf : D");
            } else {
                System.out.println("Nilai Huruf : E");
            }
            System.out.println("==================");
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}