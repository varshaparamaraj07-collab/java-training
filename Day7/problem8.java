package Day7;

public class problem8 {
    public static void main(String[] args) {
        int num = 12345, count = 0;

        while(num > 0) {
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}
