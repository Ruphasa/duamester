package JobSev.Postfix;

import java.util.Scanner;

public class PostfixMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix23 post = new Postfix23(total);
        P=post.konversi(Q);
        System.out.println("Ekspresi matematika (postfix): " + P);
    }
}
