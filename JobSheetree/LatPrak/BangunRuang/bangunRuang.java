package JobSheetree.LatPrak.BangunRuang;

public class bangunRuang {
    int sisi;
    int jari;
    double tinggi;
    double miring;
    int jenisBangunRuang;

    bangunRuang() {

    }

    double hitungLuasPermukaan() {
        if (jenisBangunRuang == 2) {
            return 4.0 * 22.0 * jari * jari / 7.0;
        } else if (jenisBangunRuang == 1) {
            return sisi * sisi + 4.0 * (sisi * miring / 2.0);
        } else {
            return (22.0 * jari * jari / 7.0) + (22.0 * jari / 7.0 *  miring);
        }
    }

    double hitungVolume() {
        if (jenisBangunRuang == 1) {
            return sisi * sisi * tinggi / 3.0;
        } else if (jenisBangunRuang == 2) {
            return 4.0 * 22.0 * jari * jari * jari / 3.0 / 7.0;
        } else {
            return 22.0 * jari * jari * tinggi / 3.0 / 7.0;
        }
    }
}
