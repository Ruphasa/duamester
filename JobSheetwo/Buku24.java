package JobSheetwo;

public class Buku24 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    void terjual(int jml) {
        if (stok>0) {
            stok -= jml;
        }else{
            System.out.println("stok habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga=hrg;
    }
}