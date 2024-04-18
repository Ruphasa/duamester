package JobSev.Gudang;

import java.util.Scanner;

public class Utama23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa kapasitas Gudang anda? ");
        int kapasitas = scanner.nextInt();
        Gudang23 gudang = new Gudang23(kapasitas);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan tumpukan barang teratas");
            System.out.println("5. Keluar");
            System.out.println("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang23 barangBaru = new Barang23(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
