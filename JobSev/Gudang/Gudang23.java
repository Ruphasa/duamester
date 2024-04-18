package JobSev.Gudang;

public class Gudang23 {
    Barang[] tumpukan;
    int size;
    int top;

    Gudang(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang[size];
        top = -1;
    }
}
