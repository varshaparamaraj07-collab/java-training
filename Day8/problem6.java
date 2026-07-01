package Day8;

public class problem6 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int key = 15;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}

