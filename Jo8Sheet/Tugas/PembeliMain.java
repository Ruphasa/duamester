package Jo8Sheet.Tugas;

import java.util.Scanner;

public class PembeliMain {
    static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli keluar");
        System.out.println("3. Cek Pembeli terdepan");
        System.out.println("4. Cek Semua Pembeli");
        System.out.println("5. Cek Pembeli terbelakang");
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                Pembeli pembeli = new Pembeli();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("No. HP : ");
                    int noHP = sc.nextInt();
                    sc.nextLine();
                    pembeli = new Pembeli(nama, noHP);
                    antri.enqueue(pembeli);
                    break;
                case 2:
                    Pembeli data = antri.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama+ " " + data.noHP+ " ");
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.daftarPembeli();
                    break;
                case 5:
                    antri.peekTail();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4||pilih==5);
    }
}
