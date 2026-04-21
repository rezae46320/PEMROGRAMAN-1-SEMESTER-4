package tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        // S1: Pilih menu
        System.out.println("Menu:");
        System.out.println("1. Kehadiran");
        System.out.print("Pilih menu: ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                // S2: Input jumlah data kehadiran
                System.out.print("Masukkan jumlah kehadiran: ");
                int jumlah = input.nextInt();

                int[] kehadiran = new int[jumlah];

                // FOR LOOP
                for (int i = 0; i < jumlah; i++) {
                    // S3: Input kehadiran (berulang)
                    System.out.print("Input kehadiran ke-" + (i + 1) + ": ");
                    kehadiran[i] = input.nextInt();
                }

                // S4: Cetak kehadiran
                System.out.println("\nData Kehadiran:");
                for (int i = 0; i < jumlah; i++) {
                    System.out.println("Kehadiran ke-" + (i + 1) + ": " + kehadiran[i]);
                }
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
}