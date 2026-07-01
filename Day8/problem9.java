package Day8;

public class problem9 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];

        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
    }
}
