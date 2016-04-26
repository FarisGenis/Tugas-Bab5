package Praktikum5;

import java.util.Scanner;

public class LatihanBab1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Pick, a, b;
        String line = "=============================";
        do {
            System.out.println("");
            System.out.println(line);
            System.out.println("MENU");
            System.out.println(line);
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan Pecahan");
            System.out.println("0. Exit");
            System.out.println(line);
            System.out.print("Pick: ");
            Pick = in.nextInt();
            switch (Pick) {
                case 1:
                    System.out.println(line);
                    System.out.println("PENJUMLAHAN");
                    System.out.println(line);
                    System.out.print("Masukkan Bill 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bill 2 : ");
                    b = in.nextInt();
                    System.out.println(line);
                    Perhitungan.Penjumlahan(a, b);
                    break;
                case 2:
                    System.out.println(line);
                    System.out.println("PENGURANGAN");
                    System.out.println(line);
                    System.out.print("Masukkan Bill 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bill 2 : ");
                    b = in.nextInt();
                    System.out.println(line);
                    Perhitungan.Pengurangan(a, b);
                    break;
                case 3:
                    System.out.println(line);
                    System.out.println("PERKALIAN");
                    System.out.println(line);
                    Perhitungan kali = new Perhitungan();
                    System.out.print("Masukkan Bill 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bill 2 : ");
                    b = in.nextInt();
                    System.out.println(line);
                    kali.Perkalian(a, b);
                    break;
                case 4:
                    System.out.println(line);
                    System.out.println("PEMBAGIAN");
                    System.out.println(line);
                    Perhitungan bagi = new Perhitungan();
                    System.out.print("Masukkan Bill 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bill 2 : ");
                    b = in.nextInt();
                    System.out.println(line);
                    bagi.Pembagian(a, b);
                    break;
                case 5:
                    System.out.println(line);
                    System.out.println("PENYEDERHANAAN");
                    System.out.println(line);
                    Perhitungan sederhana = new Perhitungan();
                    System.out.print("Masukkan Pembilang : ");
                    a = in.nextInt();
                    System.out.print("Masukkan Penyebut  : ");
                    b = in.nextInt();
                    System.out.println(line);
                    sederhana.Sederhana(a, b);
                    break;
            }
        } while (Pick != 0);
    }
}
