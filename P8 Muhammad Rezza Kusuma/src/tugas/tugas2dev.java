package tugas;

import java.util.Scanner;

public class tugas2dev {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int menu;

        // S1: Menu
        System.out.println("===== MENU =====");
        System.out.println("1. Hitung Nilai Mahasiswa");
        System.out.print("Pilih menu: ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                float kehadiran;
                float realisasi;
                float tugas, uts, uas;
                float nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

                System.out.println("\n===== INPUT DATA =====");

                // S2: Input Kehadiran + VALIDASI (LOOP)
                while (true) {
                    System.out.print("Input jumlah kehadiran: ");
                    kehadiran = input.nextFloat();

                    System.out.print("Input realisasi pertemuan: ");
                    realisasi = input.nextFloat();

                    if (kehadiran >= 0 && kehadiran <= realisasi) {
                        break;
                    } else {
                        System.out.println("Kehadiran tidak valid! Harus antara 0 - " + realisasi);
                    }
                }

                // S3: Input Nilai
                System.out.print("Input nilai tugas: ");
                tugas = input.nextFloat();

                System.out.print("Input nilai UTS: ");
                uts = input.nextFloat();

                System.out.print("Input nilai UAS: ");
                uas = input.nextFloat();

                // S4: Proses Pembobotan
                System.out.println("\n===== PROSES NILAI =====");

                nilaiKehadiran = (kehadiran / realisasi) * 10;
                nilaiTugas = tugas * 0.20f;
                nilaiUTS = uts * 0.30f;
                nilaiUAS = uas * 0.40f;

                nilaiAkhir = nilaiKehadiran + nilaiTugas + nilaiUTS + nilaiUAS;

                // S5: Output (Final State)
                System.out.println("\n===== HASIL =====");
                System.out.println("Nilai Kehadiran : " + nilaiKehadiran);
                System.out.println("Nilai Tugas     : " + nilaiTugas);
                System.out.println("Nilai UTS       : " + nilaiUTS);
                System.out.println("Nilai UAS       : " + nilaiUAS);
                System.out.println("--------------------------");
                System.out.println("Nilai Akhir     : " + nilaiAkhir);

                break;

            default:
                System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
    
}
