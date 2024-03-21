package JobsheetS.latprak;

import java.util.Scanner;

public class hotelService {
    hotel[] room = new hotel[0];

    void tambah(){
        Scanner sc = new Scanner(System.in);
        int length = room.length+1;
        hotel[] temp = new hotel[length];
        for (int i = 0; i < room.length; i++) {
            temp[i]=room[i];
        }
        room=temp;
        System.out.print("Masukkan nama hotel : ");
        String name = sc.nextLine();
        System.out.print("Masukkan kota hotel : ");
        String city = sc.nextLine();
        System.out.print("Masukkan harga hotel : ");
        int price = sc.nextInt();
        System.out.print("Masukkan bintang hotel : ");
        Byte star = sc.nextByte();
        room[length-1] = new hotel(name, city, price, star);
    }

    void tampilAll(){
        System.out.println("Daftar hotel : ");
        for (hotel hotel : room) {
            hotel.tampil();
            System.out.println("===============================================================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < room.length-1; i++) {
            for (int j = 1; j < room.length-i; j++) {
                if (room[j-1].harga > room[j].harga) {
                    hotel temp = room[j-1];
                    room[j-1] = room[j];
                    room[j] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < room.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < room.length; j++) {
                if (room[j].bintang > room[idxMin].bintang) {
                    idxMin = j;
                }
            }
            hotel temp = room[i];
            room[i] = room[idxMin];
            room[idxMin] = temp;
        }
    }
}
