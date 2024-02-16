package jobSheetAtu;

import java.util.Scanner;

public class deretan {
    public static void main(String[] args) {
        String NIM="";
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        NIM = sc.nextLine();
        n = Integer.parseInt(NIM.substring(8));
        if (n<10) {
            n+=10;
        }
        for (int i = 1; i <= n; i++) {
            if (i==6||i==10) {
                continue;
            }else if (i%2==0) {
                System.out.print(i+" ");
            }else{
                System.out.print("* ");
            }
        }
    }
}
