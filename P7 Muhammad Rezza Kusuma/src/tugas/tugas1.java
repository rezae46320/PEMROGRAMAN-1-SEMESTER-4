package tugas;

import java.util.Scanner;

public class tugas1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH LAGU ===");
        System.out.println("1. Balonku");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();

        System.out.println("\n===== LIRIK =====");

        if (pilihan == 1) {
            System.out.println("Balonku ada lima");
            System.out.println("Rupa-rupa warnanya");
            System.out.println("Hijau, kuning, kelabu");
            System.out.println("Merah muda dan biru");
    
        } else {
            System.out.println("Pilihan lagu tidak tersedia!");
        }

        input.close();
    }
    
}
