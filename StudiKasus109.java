import java.util.Scanner;

public class StudiKasus109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang Bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup*hargaPercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga*10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga: " +totalHarga);
        System.out.println("Diskon: " +diskon);
        System.out.println("Total Bayar: " +totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar-totalBayar;
            System.out.println("kembalian: " +kembalian);
        } else {
            kurang = totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " +kurang);
        }
    }

     }