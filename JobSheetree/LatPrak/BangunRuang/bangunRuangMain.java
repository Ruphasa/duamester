package JobSheetree.LatPrak.BangunRuang;

import java.util.Scanner;

public class bangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bangunRuang[] arrayBangunRuang = new bangunRuang[3];
        
        for (int i = 0; i < arrayBangunRuang.length; i++) {
            arrayBangunRuang[i]=new bangunRuang();
            if (i==0) {
                arrayBangunRuang[i].jenisBangunRuang=i;
                System.out.print("Masukkan jari-jari Kerucut : ");
                arrayBangunRuang[i].jari=sc.nextInt();
                System.out.print("Masukkan Sisi Miring Kerucut : ");
                arrayBangunRuang[i].miring=sc.nextInt();
                arrayBangunRuang[i].tinggi=Math.sqrt(
                    arrayBangunRuang[i].miring*arrayBangunRuang[i].miring - arrayBangunRuang[i].jari*arrayBangunRuang[i].jari
                    );
            }else if (i==1) {
                arrayBangunRuang[i].jenisBangunRuang=i;
                System.out.print("Masukkan Sisi Limas Segiempat: ");
                arrayBangunRuang[i].sisi=sc.nextInt();
                System.out.print("Masukkan Tinggi Limas Segiempat : ");
                arrayBangunRuang[i].tinggi=sc.nextInt();
                arrayBangunRuang[i].miring=Math.sqrt(
                    arrayBangunRuang[i].tinggi*arrayBangunRuang[i].tinggi + arrayBangunRuang[i].sisi/2.0*arrayBangunRuang[i].sisi/2.0
                    );
            }else{
                arrayBangunRuang[i].jenisBangunRuang=i;
                System.out.print("Masukkan jari - jari Bola : ");
                arrayBangunRuang[i].jari=sc.nextInt();
            }
        }
        System.out.println("\nVolume Kerucut : " + arrayBangunRuang[0].hitungVolume());
        System.out.println("Luas Permukaan Kerucut : " + arrayBangunRuang[0].hitungLuasPermukaan());

        System.out.println("\nVolume limas Segiempat : " + arrayBangunRuang[1].hitungVolume());
        System.out.println("Luas Permukaan limas Segiempat : " + arrayBangunRuang[1].hitungLuasPermukaan());

        System.out.println("\nVolume Bola : " + arrayBangunRuang[2].hitungVolume());
        System.out.println("Luas Permukaan Bola : " + arrayBangunRuang[2].hitungLuasPermukaan());
    }
}
