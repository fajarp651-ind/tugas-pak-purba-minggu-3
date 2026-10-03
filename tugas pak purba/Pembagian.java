
import java.util.Scanner;

public class Pembagian {

    public static double pembagian(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = 50;
        double b = 10;

        System.out.println("Angka pertama = " + a);
        System.out.println("Angka kedua = " + b);

        System.out.print("Masukkan angka pertama (atau tekan Enter): ");
        String nilaiA = input.nextLine();

        if (!nilaiA.isEmpty()) {
            a = Double.parseDouble(nilaiA);
        }

        System.out.print("Masukkan angka kedua (atau tekan Enter): ");
        String nilaiB = input.nextLine();

        if (!nilaiB.isEmpty()) {
            b = Double.parseDouble(nilaiB);
        }

        if (b == 0) {
            System.out.println("Error: angka kedua tidak boleh 0.");
        } else {
            double hasil = pembagian(a, b);
            System.out.println("Hasil pembagian = " + hasil);
        }

        input.close();
    }
}

