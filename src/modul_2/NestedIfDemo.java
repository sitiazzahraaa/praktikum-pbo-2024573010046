package modul_2;
import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        if (umur < 2) {
            System.out.println("Keterangan: Bayi");
        } else if (umur < 5) {
            System.out.println("Keterangan: Balita");
        } else if (umur < 12) {
            System.out.println("Keterangan: Anak-anak");
        } else {
            System.out.println("Keterangan: Remaja/Dewasa");
        }
    }
}