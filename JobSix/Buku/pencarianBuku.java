package JobSix.Buku;

public class pencarianBuku {
    Buku listBK[] = new Buku[5];
    int idx;

    void tambah(Buku m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Buku m : listBK) {
            m.tampilkanDataBuku();
            System.out.println("------------------------------");
        }
    }

    // int FindSearch(int cari) {
    // int posisi = -1;
    // for (int i = 0; i < listBK.length; i++) {
    // if (listBK[i].kodeBuku.equals(cari)) {
    // posisi = i;
    // }
    // }
    // return posisi;
    // }

    Buku FindBuku(int cari) {
        for (int i = 0; i < listBK.length; i++) {
            if (Integer.parseInt(listBK[i].kodeBuku) == cari) {
                return listBK[i];
            }
        }
        return null;
    }

    void tampilPosisi(String x, int pos) {
        if (pos == -1) {
            System.out.println("Data tidak ditemukan");
        } else if (pos == -2) {
            System.out.println("Data duplicate");
        } else {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
            System.out.println("kode buku : " + x);
            System.out.println("Judul : " + listBK[pos].judul);
            System.out.println("Tahun Terbit : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBK[pos].pengarang);
            System.out.println("Stock : " + listBK[pos].stock);
        }
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (Integer.parseInt(listBK[mid].kodeBuku) == cari) {
                return mid;
            } else if (Integer.parseInt(listBK[mid].kodeBuku) < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int FindJudulSeq(String cari) {
        int count = 0;
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].judul.equalsIgnoreCase(cari)) {
                posisi = i;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        } else if (count == 1) {
            return posisi;
        } else {
            System.out.println("BUKU ADA " + count + "!!!");
            return -2;
        }
    }

    int FindJudulBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listBK[mid].judul.equals(cari)) {
                if (mid >= 0 && mid < listBK.length - 1) {
                    if (listBK[mid].judul.equals(listBK[mid + 1].judul)) {
                        return -2;
                    }
                }
                if (mid > 0 && mid <= listBK.length - 1) {
                    if (listBK[mid].judul.equals(listBK[mid - 1].judul)) {
                        return -2;
                    }
                } else {
                    return mid;
                }
            } else if (listBK[mid].judul.compareTo(cari) > 0) {
                return FindJudulBinarySearch(cari, left, mid - 1);
            } else {
                return FindJudulBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void sort() {
        Buku temp = new Buku();
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = 0; j < listBK.length - i - 1; j++) {
                if (listBK[j].judul.compareTo(listBK[j + 1].judul) > 0) {
                    temp = listBK[j];
                    listBK[j] = listBK[j + 1];
                    listBK[j + 1] = temp;
                }
            }
        }
    }
}