
import java.util.Scanner;

public class IniMethod {

    public static void iniMethod(String nama) {
        System.out.println("====================");
        System.out.println("Nama: " + nama);
        System.out.println("====================");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama = "M. Damar Raihan Nafis";

        System.out.println("Nama awal = " + nama);

        System.out.print("Masukkan nama (atau tekan Enter): ");
        String namaInput = input.nextLine();

        if (!namaInput.isEmpty()) {
            nama = namaInput;
        }

        iniMethod(nama);

        input.close();
    }
}
