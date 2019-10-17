
import java.util.Scanner;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Kalkulator
 */

public class IF01PBO110118009Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static double value1;
    public static double vallue2;
    public static double tambahBilangan(){
        return value1 + vallue2;
    }
     public static double kurangBilangan(){
        return value1 - vallue2;
    }
     public static double kaliBilangan(){
        return value1 * vallue2;
    }
     public static double bagiBilangan(){
        return value1 / vallue2;
    }
     public static double sisaBilangan(){
        return value1 % vallue2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Apliaksi Kalkulator====");
        System.out.print("Masukkan nilai Ke-1 = ");
        value1 = input.nextDouble();
        System.out.print("Masukkan nilai Ke-2 = ");
        vallue2 = input.nextDouble();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.println("Hasil Pertambahan = "+tambahBilangan());
        System.out.println("Hasil Pengurangan = "+kurangBilangan());
        System.out.println("Hasil Perkalian = "+kaliBilangan());
        System.out.println("Hasil Pembagian = "+bagiBilangan());
    }

}
