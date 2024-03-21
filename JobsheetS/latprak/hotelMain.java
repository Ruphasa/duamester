package JobsheetS.latprak;

import java.util.Scanner;

public class hotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        hotelService service = new hotelService();
        do {
            System.out.println("+--------------------------+");
            System.out.println("|  Selamat Datang di Hotel |");
            System.out.println("+--------------------------+");
            System.out.println("1. Tambah Hotel");
            System.out.println("2. Tampilkan Hotel berdasarkan harga termurah ke tertinggi");
            System.out.println("3. Tampilkan Hotel berdasarkan bintang tertinggi ke terendah");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    service.tambah();
                    break;
                case 2:
                    service.bubbleSort();
                    service.tampilAll();
                    break;
                case 3:
                    service.selectionSort();
                    service.tampilAll();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("WrongInput");
                    break;
            }
        } while (exit != true);
    }
}
