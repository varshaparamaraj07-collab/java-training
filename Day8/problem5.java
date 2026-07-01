package Day8;

public class problem5 {
       public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("Average = " + (sum / arr.length));
    }
}

