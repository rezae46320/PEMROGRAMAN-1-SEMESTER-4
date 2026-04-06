package P4_rezza.src.latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float Kehadiran;
        float realisasi;
        float tugas;
        float uts;
        float uas;
        float nilaiKehadiran;
        float nilaitugas;
        float nilaiuts;
        float nilaiuas;
        float nilaiakhir;

        System.out.println("=========INPUT========");

        System.out.print("Input jumlah kehadiran : ");
        Kehadiran = input.nextFloat();

        System.out.print("Input realisasi : ");
        realisasi = input.nextFloat();

        System.out.print("Input nilai tugas : ");
        tugas = input.nextFloat();

        System.out.print("Input nilai uts : ");
        uts = input.nextFloat();

        System.out.print("Input nilai uas : ");
        uas = input.nextFloat();

        //proses
        System.out.println("=========Nilai=========");

        nilaiKehadiran = (Kehadiran / realisasi) *10;
        System.out.println("Nilai kehadiran : " + nilaiKehadiran);

        nilaitugas = (tugas * 20 / 100);
        System.out.println("Nilai tugas : " + nilaitugas);

        nilaiuts = (uts * 30 / 100);
        System.out.println("Nilai uts : " + nilaiuts);

        nilaiuas = (uas * 40 / 100);
        System.out.println("Nilai uas : " + nilaiuas);

        System.out.println("=======Nilai Akhir======");

        nilaiakhir = (nilaiKehadiran + nilaitugas + nilaiuts + nilaiuas);
        System.out.println("Nilai Akhir : " + nilaiakhir);
    }
}
