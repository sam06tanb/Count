import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("8 + 8 = ?");
        int a = sc.nextInt();

        if (a == 16) {
            System.out.println("acertou!");
        } else {
            System.out.println("Errou!");
        }


    }
}
