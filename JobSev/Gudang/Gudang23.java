package JobSev.Gudang;

public class Gudang23 {
    Barang23[] tumpukan;
    int size;
    int top;

    Gudang23(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang23[size];
        top = -1;
    }

    boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(Barang23 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasul ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    Barang23 ambilBarang() {
        if (!cekKosong()) {
            Barang23 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasul di hapus dari gudang");
            return delete;
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang kosong");
            return null;
        }
    }

    Barang23 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang23 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            // for (int i = top; i >= 0; i--) {
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode &d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        }else{
            System.out.println("Tumpukan barang kosong");
        }
    }
}
