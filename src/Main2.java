import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        String x = sc.next();
//        int x = sc.nextInt();
//        double x = sc.nextDouble();
//        char x = sc.next().charAt(0);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.print("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }
}
