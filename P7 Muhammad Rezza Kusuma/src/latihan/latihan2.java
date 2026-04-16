package latihan;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Pilihan a.ayam , b.beruang : ");
        char pilihan = input.next().charAt(0);

        String hasil = "";

        switch (pilihan) {
            case 'a':
                hasil = "Anda memilih hewan: ayam";
                break;

            case 'b' :
                hasil = "Anda memilih hewan: beruang";
                break;
        
            default:
                hasil = "Pilihan anda tidak valid";
                break;
        }

        System.out.println("\n=====Hasil======");
        System.out.println(hasil);

        input.close();
    }

    
}
