package factorial;

import java.util.Scanner;

public class faktorialMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.print("Masukkan Jumlah elemen : ");
        int iJml = sc.nextInt();

        faktorial[] fk = new faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukkan Nilai Data ke-" + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Faktorial dari "+fk[i].nilai+" = "+fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("Hasil - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Faktorial dari "+fk[i].nilai+" = "+fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.println("Hasil - WHILE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Faktorial dari "+fk[i].nilai+" = "+fk[i].faktorialWhile(fk[i].nilai));
        }
    }
}
