package PraktikumV;

public class LabKomdas {

    String Nama[] = {"JaketA", "JaketB", "JaketC"};
    private final int Harga1[] = {100000, 125000, 175000};
    private final int Harga2[] = {95000, 120000, 160000};
    private int Harga3[] = new int[3];
    private int Jumlah[] = new int[3];
    private int Total;
    private String Line = "===============================";

    public void Order(int n[]) {
        Jumlah = n;
        for (int i = 0; i < 3; i++) {
            if (n[i] < 100) {
                Harga3[i] = (Harga1[i] * n[i]);
            } else {
                Harga3[i] = (Harga2[i] * n[i]);
            }
            Total += Harga3[i];
        }
    }

    public void TampilkanData() {
        System.out.println(Line);
        System.out.println("PRICE LIST");
        System.out.println(Line);
        System.out.println("NO  NAME    PRICE");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "   " + Nama[i] + "  IDR " + Harga1[i]);
        }
        System.out.println("Order > 100 Get some Discount!");
    }

    public void Harga() {
        System.out.println(Line);
        System.out.println("FAKTUR PEMBELIAN");
        System.out.println(Line);
        System.out.println("NO  NAME    QTY    PRICE");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "   " + Nama[i] + "  " + Jumlah[i] + "\t   IDR " + Harga3[i]);
        }
        System.out.println(Line);
        System.out.println("TOTAL              IDR " + Total);
    }
}
