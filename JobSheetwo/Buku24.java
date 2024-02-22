package JobSheetwo;

public class Buku24 {

    String judul, pengarang;
    int halaman, stok, harga;
    int hargaBayar, hargaDisc;
    int jumlah;


    Buku24() {

    }

    Buku24(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            jumlah=jml;
            stok -= jml;
        } else {
            System.out.println("stok habis");
        }
    }

    void restock(int jml) {
        jumlah=jml;
        stok += jml;
    }

    int gantiHarga(int hrg) {
        return harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * jumlah;
    }

    int hitungDiskon() {
        if (hargaBayar > 150000) {
            return (int)(hargaBayar * 0.12);
        } else if (hargaBayar > 75000) {
            return hargaDisc = (int)(hargaBayar * 0.05);
        } else {
            return hargaDisc = 0;
        }
    }

    int hitungbayar() {
        return (hargaBayar - hargaDisc);
    }
}