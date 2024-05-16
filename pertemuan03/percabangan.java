import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        System.out.println("Eny Niswatun Hasanah");
        System.out.println("PERCABANGAN IF");
        // Membuat variabel dan Scanner
        int nilai;
        Scanner scan= new Scanner(System.in);

        // Mengambil input
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt(); 
        // Percabangan if
        if (nilai > 85) {
          System.out.println("Nilai Anda A");
        } else if (nilai > 75) {
          System.out.println("Nilai Anda B");
        } else if (nilai > 65) {
          System.out.println("Nilai Anda C");
        } else {
          System.out.println("Nilai Anda D");
        }
    }
}