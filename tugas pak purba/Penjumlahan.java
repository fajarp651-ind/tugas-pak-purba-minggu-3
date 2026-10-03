
import java.util.Scanner;

public class Penjumlahan {

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 50;
        int b = 10;

        System.out.println("Angka pertama = " + a);
        System.out.println("Angka kedua = " + b);

        System.out.print("Masukkan angka pertama (atau tekan Enter): ");

        String nilaiA = input.nextLine();

        if (!nilaiA.isEmpty()) {
            a = Integer.parseInt(nilaiA);
        }

        System.out.print("Masukkan angka kedua (atau tekan Enter): ");

        String nilaiB = input.nextLine();

        if (!nilaiB.isEmpty()) {
            b = Integer.parseInt(nilaiB);
        }

        int hasil = penjumlahan(a, b);

        System.out.println("Hasil penjumlahan = " + hasil);

        input.close();
    }
}

