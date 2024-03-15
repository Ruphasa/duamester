package power;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Masukkan Jumlah Elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        int pangkat;
        int nilai;
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Elemen ke-" + (i + 1) + " : ");
            nilai = sc.nextInt();
            System.out.print("Masukkan Nilai Pangkatnya : ");
            pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("\033[H\033[2J");
        System.out.println("1. BRUTE FORCE");
        System.out.println("2. DIVIDE AND CONQUER");
        System.out.print("Pilih Metode : ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Hasil - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil Pangkat dari " + png[i].nilai + " ^ " + png[i].pangkat + " = "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil Pangkat dari " + png[i].nilai + " ^ " + png[i].pangkat + " = "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                break;
        }

    }
}
