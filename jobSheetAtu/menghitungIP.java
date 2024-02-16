package jobSheetAtu;

import java.util.Scanner;

public class menghitungIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sks = { 2, 2, 3, 2, 2, 2, 3, 2 };

        // Input data for each course
        String[][] array = {
                { "Keselamatan dan Kesehatan Kerja", "", "", "" },
                { "Pancasila", "", "", "" },
                { "Matematika Dasar", "", "", "" },
                { "Bahasa Inggris", "", "", "" },
                { "Critical Thinking dan Problem Solving", "", "", "" },
                { "Dasar Pemrograman", "", "", "" },
                { "Praktikum Dasar Pemrograman", "", "", "" },
                { "Konsep Teknologi Informasi", "", "", "" },
        };

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // input nilai
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + array[i][0] + ": ");
            array[i][1] = sc.nextLine();

            if (Integer.parseInt(array[i][1]) < 0 || Integer.parseInt(array[i][1]) > 100) {
                System.out.println("Nilai tidak valid");
                --i;
                continue;
            }
        }
        // conversion
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i][1]) > 80) {
                array[i][2] = "A";
                array[i][3] = "4.00";
            } else if (Integer.parseInt(array[i][1]) > 73) {
                array[i][2] = "B+";
                array[i][3] = "3.5";
            } else if (Integer.parseInt(array[i][1]) > 65) {
                array[i][2] = "B";
                array[i][3] = "3";
            } else if (Integer.parseInt(array[i][1]) > 60) {
                array[i][2] = "C+";
                array[i][3] = "2.5";
            } else if (Integer.parseInt(array[i][1]) > 50) {
                array[i][2] = "C";
                array[i][3] = "2";
            } else if (Integer.parseInt(array[i][1]) > 39) {
                array[i][2] = "D";
                array[i][3] = "1";
            } else {
                array[i][2] = "E";
                array[i][3] = "0";
            }
        }

        // table of conversion
        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.println("MK                                   Nilai Angka                            Niali Huruf                             Bobot Nilai");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ".repeat(40-array[i][j].length()));
            }
            System.out.println();
        }
        System.out.println("=====================");
        float ip = 0;
        for (int i = 0; i < array.length; i++) {
            ip += Float.parseFloat(array[i][3]) * sks[i];
        }
        ip /= 18;
        System.out.printf("\nIP : %.2f", ip);
    }
}
