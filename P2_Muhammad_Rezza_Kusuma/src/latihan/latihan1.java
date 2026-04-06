package latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String Nama;
        Integer Nim;
        String Alamat;
        int Usia;

        System.out.print("input Nama : ");
        Nama = input.nextLine();

        System.out.print("input Nim : ");
        Nim = input.nextInt();
        input.nextLine();

        System.out.print("input Alamat : ");
        Alamat = input.nextLine();

        System.out.print("input Usia : ");
        Usia = input.nextInt();

        System.out.println("Nama :" + Nama);
        System.out.println("Nim :" + Nim);
        System.out.println("Alamat :" + Alamat);
        System.out.println("Usia :" + Usia);

        input.close();
    }
}