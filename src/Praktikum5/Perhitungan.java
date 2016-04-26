package Praktikum5;

public class Perhitungan {

    public static void Penjumlahan(int bill1, int bill2) {
        System.out.println("Hasil       : " + (bill1 + bill2));
    }

    public static void Pengurangan(int bill1, int bill2) {
        System.out.println("Hasil       : " + (bill1 - bill2));
    }

    public void Perkalian(int bill1, int bill2) {
        System.out.println("Hasil       : " + (bill1 * bill2));
    }

    public void Pembagian(int bill1, int bill2) {
        System.out.println("Hasil       : " + (bill1 / bill2));
    }

    public void Sederhana(int bill1, int bill2) {
        int a = 1, b = 2;
        while (b <= bill1) {
            if (bill1 % b == 0 && bill2 % b == 0) {
                a = b;
            }
            b++;
        }
        System.out.println("Hasil       : " + (bill1 / a) + " / " + (bill2 / a));
    }
}
