package PraktikumV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LabKomdas Jaket = new LabKomdas();
        int n[] = new int[3];
        String Line = "===============================";
        System.out.println(Line);
        System.out.println("CV. LABKOMDAS");
        System.out.println("JACKET PRODUCTION");
        Jaket.TampilkanData();
        System.out.println(Line);
        System.out.println("ORDER");
        System.out.println(Line);
        for (int i = 0; i < 3; i++) {
            System.out.print("Qty " + Jaket.Nama[i] + " : ");
            n[i] = in.nextInt();
        }
        Jaket.Order(n);
        Jaket.Harga();

    }
}
