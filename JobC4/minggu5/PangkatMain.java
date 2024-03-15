package minggu5;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Masukkan Jumlah Elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan Nilai Elemen ke-" + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan Nilai Pangkatnya : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil Pangkat dari "+png[i].nilai+" ^ "+png[i].pangkat+" = "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("Hasil - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil Pangkat dari "+png[i].nilai+" ^ "+png[i].pangkat+" = "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
