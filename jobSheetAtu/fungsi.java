package jobSheetAtu;

import java.util.Scanner;

public class fungsi {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean exit = false;
        int[][] stock = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 },
    };

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("+--------------------------------------+");
            System.out.println("|      Royal Garden Administration     |");
            System.out.println("+--------------------------------------+");
            System.out.println("| 1.  Perhitungan Keuntungan kotor Max |");
            System.out.println("| 2.  Pengurangan Stock                |");
            System.out.println("| 3.  Exit                             |");
            System.out.println("+--------------------------------------+");
            System.out.print("Mau Ngapain : ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    ClearScreen();
                    untungKotor(stock);
                    break;
                case 2:
                    ClearScreen();
                    stock=penguranganStock(stock, sc);
                    break;
                case 3:
                    exit=true;
                    ClearScreen();
                    System.out.println("cyaa~");
                    break;
                default:
                    System.out.println("WRONG INPUT!");
            }
        } while (exit==false);
    }

    public static int[][] penguranganStock(int[][] stock, Scanner sc) {

        int baris = 0;
        int kolom = 0;

        System.out.println("+-------------------+");
        System.out.println("|    Cabang Mana    |");
        System.out.println("| 1. Royal Garden 1 |");
        System.out.println("| 2. Royal Garden 2 |");
        System.out.println("| 3. Royal Garden 3 |");
        System.out.println("| 4. Royal Garden 4 |");
        System.out.println("| 5. Balik          |");
        System.out.println("+-------------------+");
        baris = sc.nextInt();
        if (baris == 5) {
            menu();
        }
        ClearScreen();
        System.out.println("+-------------------+");
        System.out.println("|     Bunga Mana    |");
        System.out.println(
                "| 1. Aglonema   " + stock[baris - 1][0] + " ".repeat(4 - String.valueOf(stock[baris - 1][0]).length())
                        + "|");
        System.out.println(
                "| 2. Keladi     " + stock[baris - 1][1] + " ".repeat(4 - String.valueOf(stock[baris - 1][1]).length())
                        + "|");
        System.out.println(
                "| 3. Alocasia   " + stock[baris - 1][2] + " ".repeat(4 - String.valueOf(stock[baris - 1][2]).length())
                        + "|");
        System.out.println(
                "| 4. Mawar      " + stock[baris - 1][3] + " ".repeat(4 - String.valueOf(stock[baris - 1][3]).length())
                        + "|");
        System.out.println("| 5. Balik          |");
        System.out.println("+-------------------+");
        kolom = sc.nextInt();
        if (kolom == 5) {
            menu();
        }
        System.out.print("dikurangi jadi berapa : -");
        stock[baris - 1][kolom - 1] -= sc.nextInt();
        return stock;
    }

    public static void untungKotor(int[][] stock) {
        int[] harga = { 75000, 50000, 60000, 10000 };
        int total = 0;

        System.out.println("Nama Cabang        Aglonema        Keladi        Alocasia         Mawar        Total");
        for (int i = 0; i < stock.length; i++) {
            System.out.print("Royal Garden " + (i + 1) + "    ");
            for (int j = 0; j < stock.length; j++) {
                System.out.print(stock[i][j] + " ".repeat(3 - String.valueOf(stock[i][j]).length()) + "X " + harga[j]
                        + " ".repeat(10 - String.valueOf(harga[j]).length()));
                total += stock[i][j] * harga[j];
            }
            System.out.print(total);
            System.out.println();
            total = 0;
        }
        goback();
    }

    public static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void goback() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input anything to go back");
        String anything = sc.nextLine();
        ClearScreen();
        menu();
    }
}
