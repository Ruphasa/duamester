package JobSix.Buku;

import java.util.Arrays;
import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pencarianBuku data = new pencarianBuku();
        int jumBuku = 5;

        System.out.println("=========================================");
        System.out.println("Masukkan Data Buku secara urut dari kodeBuku Terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-----------------------------------------");
            System.out.print("Kode Buku : ");
            String kodeBuku = sc.nextLine();
            System.out.print("Judul : ");
            String judul = sc.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = sc.nextInt();
            sc.nextLine();
            System.out.print("Pengarang : ");
            String pengarang = sc.nextLine();
            System.out.print("Stock : ");
            int stock = sc.nextInt();
            sc.nextLine();

            Buku m = new Buku(kodeBuku, judul, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("=========================================");
        data.sort();
        data.tampil();

        // System.out.println("=========================================");
        // System.out.println("data keseluruhan buku : ");
        // data.tampil();

        // System.out.println("________________________________________");
        // System.out.println("____________Pencarian Buku______________");
        // System.out.print("masukkan kode buku yang ingin dicari : ");
        // int cari = sc.nextInt();
        // System.out.println("Menggunakan Sequential Search");
        // int posisi = data.FindSearch(cari);
        // data.tampilPosisi(cari, posisi);

        // Buku dataBuku = data.FindBuku(cari);
        // if (dataBuku == null) {
        //     System.out.println("Data tidak ditemukan");
            
        // }else{
        //     dataBuku.tampilkanDataBuku();
        // }

        System.out.println("____________Pencarian Buku______________");
        System.out.print("masukkan judul yang ingin dicari : ");
        String cari = sc.nextLine();
        int posisi = data.FindJudulSeq(cari);
        if (posisi == -1) {
            System.out.println("Data tidak ditemukan");
        }else if (posisi == -2) {
            System.out.println("Data duplicate");
        }else{
            data.tampilPosisi(cari, posisi);
        }

        System.out.println("=========================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindJudulBinarySearch(cari, 0, jumBuku - 1);
        if (posisi == -1) {
            System.out.println("Data tidak ditemukan");
        }else if (posisi == -2) {
            System.out.println("DATA LEBIH DARI SATU!!!");
        }else{
            data.tampilPosisi(cari, posisi);
        }
        // System.out.println("=========================================");
        // System.out.println("Menggunakan Binary Search");
        // int posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        // data.tampilPosisi(cari, posisi);
    }
}
