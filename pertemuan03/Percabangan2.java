import java.util.Scanner;
public class Percabangan2 {
    public static void main(String[] args) {
        System.out.println("Eny Niswatun Hasanah");
        System.out.println("PERCABANGAN SWITCH");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input sebuah huruf: ");
        char huruf = scanner.next().charAt(0);
        switch (huruf) {
            case 'A':
            System.out.println("Huruf A adalah huruf vokal");
            break;
            case 'I':
            case 'E':
            case 'O':
            case 'U':
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':
            System.out.println("Huruf " + huruf + " adalah huruf vokal");
            break;
            default:
            System.out.println("Huruf " + huruf + " bukan huruf vokal");
        }
    }
}