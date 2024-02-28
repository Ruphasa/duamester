package JobSheetwo;

import java.util.Scanner;

public class BukuMain24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option;
        int jml;
        boolean exit = false;
        String anything;

        // Buku24 bk1 = new Buku24();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;

        // bk1.tampilkanInformasi();
        // bk1.terjual(5);
        // bk1.gantiHarga(60000);
        // bk1.tampilkanInformasi();

        // Buku24 bk2 = new Buku24("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        // bk2.terjual(11);
        // bk2.tampilkanInformasi();

        Buku24 BukuRizqi = new Buku24("A Games Of Thrones", "George R. R. Martin", 640, 24, 350000);
        do {

            System.out.println("Main Menu");
            System.out.println("1. Info Buku");
            System.out.println("2. Beli Buku");
            System.out.println("3. Restock Buku");
            System.out.println("4. Ganti Harga Buku");
            System.out.println("5. Exit");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    BukuRizqi.tampilkanInformasi();
                    anything=sc.nextLine();
                    break;
                case 2:
                    System.out.print("Beli Berapa :");
                    jml = sc.nextInt();
                    sc.nextLine();
                    BukuRizqi.terjual(jml);
                    BukuRizqi.hargaBayar = BukuRizqi.hitungHargaTotal();
                    BukuRizqi.hargaDisc = BukuRizqi.hitungDiskon();
                    System.out.println("Harga Total : " + BukuRizqi.hitungbayar());
                    anything = sc.nextLine();
                    break;
                case 3:
                    System.out.print("Tambah Berapa : ");
                    jml = sc.nextInt();
                    BukuRizqi.restock(jml);
                    break;
                case 4:
                    System.out.print("Masukkan Harga Baru : ");
                    jml = sc.nextInt();
                    BukuRizqi.gantiHarga(jml);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    continue;
            }
        } while (exit != true);

    }
}
