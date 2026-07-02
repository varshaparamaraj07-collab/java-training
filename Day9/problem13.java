package Day9;

public class problem13 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 25};

        int max = numbers[0];

        for (int number : numbers)
            if (number > max)
                max = number;

        System.out.println(max);
    }
}
