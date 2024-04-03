package JobSix.Buku;

public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku(String kodeBuku, String judul, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    Buku(){
        
    }

    void tampilkanDataBuku() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);
    }
}
