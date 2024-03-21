package JobsheetS.latprak;

public class hotel {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    hotel(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {
        System.out.println("Hotel " + nama + " berlokasi di " + kota + " dengan harga " + harga + " dan bintang " + bintang);
    }
}
