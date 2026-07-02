package Day9;

public class problem9 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int key = 20;
        boolean found = false;

        for (int number : numbers) {
            if (number == key) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
