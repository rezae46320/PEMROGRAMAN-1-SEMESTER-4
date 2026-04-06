package latihan;

import javax.swing.JOptionPane;

public class latihan1 {
    public static void main(String[] args){
        String nama;

        nama = JOptionPane.showInputDialog("Ketik nama anda : ");
        String msg = "Hai " + nama + "\nGass belajar, pasti bisa jadi programer java";
        
        JOptionPane.showMessageDialog(null, msg);

    }
    
}
