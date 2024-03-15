package LatPrak;

public class carMain {
    public static void main(String[] args) {
        int index;
        String[] merk = { "BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen" };
        String[] tipe = { "M2 Coupe", "Fiesta ST", "370Z", "BRZ", "Impreza WRX STI", "AE86 Trueno", "86/GT86",
                "Golf GTI" };
        int[] tahun = { 2016, 2014, 2009, 2014, 2013, 1986, 2014, 2014 };
        int[] top_acceleration = { 6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180 };
        int[] top_power = { 728, 575, 657, 609, 703, 553, 609, 631 };
        car car[] = new car[merk.length];
        for (int i = 0; i < merk.length; i++) {
            car[i] = new car();
            car[i].merk = merk[i];
            car[i].tipe = tipe[i];
            car[i].tahun = tahun[i];
            car[i].top_acceleration = top_acceleration[i];
            car[i].top_power = top_power[i];
        }
        index=topAccelerationDC(car, 0, car.length - 1);
        tampil("Mobil dengan top acceleration terbesar", car,index);
        index = worstAccelerationDC(car, 0, car.length - 1);
        tampil("Mobil dengan top acceleration terkecil", car, index);
        rataPower(top_power);
    }

    static void tampil(String massage, car car[], int index) {
        System.out.println();
        System.out.println("=========================================");
        System.out.println("ini adalah " + massage);
        System.out.println("merk : " + car[index].merk);
        System.out.println("tipe : " + car[index].tipe);
        System.out.println("tahun : " + car[index].tahun);
        System.out.println("top_acceleration : " + car[index].top_acceleration);
        System.out.println("top_power : " + car[index].top_power);
        System.out.println("=========================================");

    }

    static int topAccelerationDC(car[] car, int start, int end) {
        if (start == end) {
            return start;
        } else if (start == end - 1) {
            if (car[start].top_acceleration > car[end].top_acceleration) {
                return start;
            } else {
                return end;
            }
        } else {
            int mid = (start + end) / 2;
            int left = topAccelerationDC(car, start, mid);
            int right = topAccelerationDC(car, mid + 1, end);
            if (car[left].top_acceleration > car[right].top_acceleration) {
                return left;
            } else {
                return right;
            }
        }
    }

    static int worstAccelerationDC(car[] car, int start, int end) {
        if (start == end) {
            return start;
        } else if (start == end - 1) {
            if (car[start].top_acceleration < car[end].top_acceleration) {
                return start;
            } else {
                return end;
            }
        } else {
            int mid = (start + end) / 2;
            int left = worstAccelerationDC(car, start, mid);
            int right = worstAccelerationDC(car, mid + 1, end);
            if (car[left].top_acceleration < car[right].top_acceleration) {
                return left;
            } else {
                return right;
            }
        }
    }

    static void rataPower(int[] top_power) {
        double rataRata = 0;
        for (int i = 0; i < top_power.length; i++) {
            rataRata += top_power[i];
        }
        System.out.println("rata-rata power : " + rataRata / top_power.length);
    }
}
