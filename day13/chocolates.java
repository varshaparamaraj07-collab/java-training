import java.util.Scanner;
public class chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int days = sc.nextInt();
        int perDay = sc.nextInt();

        if (chocolates >= days * perDay)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}