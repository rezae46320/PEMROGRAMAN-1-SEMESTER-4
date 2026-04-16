package latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = null;

        System.out.print("Masukkan Pilihan (1. Teknik Informatika) : ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan==1) {

        System.out.println("Jurusan Informatika");

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        }else {
            System.out.print("Pilihan tidak valid");
        }

        input.close();

        System.out.println("\n=======Data======");
        System.out.println("Jurusan Infromatika");
        System.out.println("Nama : " + nama);

    }
}