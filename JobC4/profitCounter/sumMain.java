package profitCounter;

import java.util.Scanner;

public class sumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("Program Menghitung Keuntungan Total Dalam Satuan Juta");
        System.out.print("Masukkan Banyak Perusahaan : ");
        int banyakPerusahaan = sc.nextInt();
        sum perusahaan[] = new sum[banyakPerusahaan];
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("=======================================================");
            System.out.print("Masukkan Jumlah Bulan Perusahaan ke-" + (i + 1) + " : ");
            int elm = sc.nextInt();
            perusahaan[i] = new sum(elm);
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan Keuntungan Bulan ke-" + (j + 1) + " : ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("\nKeuntungan Perusahaan ke-" + (i + 1));
            System.out.println("=======================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total Keuntungan : " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("=======================================================");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total Keuntungan : " + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].keuntungan.length - 1));
        }
    }
}
