package JobSheetwo;

public class Buku24 {

    String judul, pengarang;
    int halaman, stok, harga;

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
            stok -= jml;
        } else {
            System.out.println("stok habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        return harga = hrg;
    }

    int hitungHargaTotal(int jml, int hrg) {
        return harga = hrg * jml;
    }

    int hitungDiskon(int hrgTotal) {
        int hargaDisc;
        if (hrgTotal > 150000) {
            hargaDisc = (int)(hrgTotal * 0.12);
        } else if (hrgTotal > 75000) {
            hargaDisc = (int)(hrgTotal * 0.05);
        } else {
            hargaDisc = 0;
        }
        return hargaDisc;
    }

    int hitungbayar(int hargaTotal, int hargaDiscount) {
        return (hargaTotal - hargaDiscount);
    }
}