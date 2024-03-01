package JobSheetree.LatPrak.DataMahasiswa;

import java.util.Scanner;

public class sistemMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double rata2 = 0;
        int jumlah;

        System.out.print("Berapa Banyak Mahasiswa : ");
        jumlah = sc.nextInt();
        sc.nextLine();
        mahasiswa arrayMahasiswa[] = new mahasiswa[jumlah];

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            arrayMahasiswa[i] = new mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama : ");
            arrayMahasiswa[i].nama = sc.nextLine();
            System.out.print("NIM : ");
            arrayMahasiswa[i].nim = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            arrayMahasiswa[i].kelamin = sc.next().charAt(0);
            System.out.print("IPK : ");
            rata2 += arrayMahasiswa[i].ipk = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println();
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Nama : " + arrayMahasiswa[i].nama);
            System.out.println("NIM : " + arrayMahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + arrayMahasiswa[i].kelamin);
            System.out.println("IPK : " + arrayMahasiswa[i].ipk);
        }
        System.out.println("--------------------------------------");
        rataRata(rata2, arrayMahasiswa.length);
        terbaik(arrayMahasiswa);
    }

    static void rataRata(double rata2, int jumlah) {
        System.out.printf("Rata - Rata IPK : %.2f\n", rata2 / jumlah);
    }
    
    static void terbaik(mahasiswa[] arrayMahasiswa) {
        int index=0;
        double nilaiTertinggi = 0;
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            if (nilaiTertinggi < arrayMahasiswa[i].ipk) {
                nilaiTertinggi = arrayMahasiswa[i].ipk;
                index = i;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Mahasiswa terbaik diraih oleh");
        System.out.println("Nama : " + arrayMahasiswa[index].nama);
        System.out.println("NIM : " + arrayMahasiswa[index].nim);
        System.out.println("Jenis Kelamin : " + arrayMahasiswa[index].kelamin);
        System.out.println("IPK : " + arrayMahasiswa[index].ipk);
    }
}
