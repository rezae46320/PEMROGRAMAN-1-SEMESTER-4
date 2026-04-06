import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Total Belanja : ");
        double total=input.nextDouble();

        double diskon = total * 0.1;
        double bayar = total - diskon;

        System.out.println("Diskon 10% : " + diskon);
        System.out.println("Total Bayar : " + bayar);

        input.close();

    }
    
}
