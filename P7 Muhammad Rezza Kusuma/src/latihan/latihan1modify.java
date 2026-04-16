package latihan;

import java.util.Scanner;

public class latihan1modify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = null;
        String shiftkelas = null;

        System.out.print("Masukkan Pilihan (1. Teknik Informatika) : ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan==1) {

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Pilih shift kelas (1.Reg A, 2.Reg B, 3.Reg CK, 4.Reg CS : ");
        int shift = input.nextInt();

        switch (shift) {
            case 1:
                shiftkelas= "Reg A";
                break;

            case 2:
                shiftkelas= "Reg B";
                break;

            case 3:
                shiftkelas= "Reg CK";
                break;

            case 4:
                shiftkelas= "Reg CS";
                break;

            default:
                shiftkelas= "Reg A";
                break;
        }

        }else {
            System.out.print("Pilihan tidak valid");
        }

        input.close();

        System.out.println("\n=======Data======");
        System.out.println("jurusan Informatika");
        System.out.println("Nama : " + nama);
        System.out.println("Shift : " + shiftkelas);
//s4 
    }
}
