package Day9;

public class problem8 {
    public static void main(String[] args) {
        int[] marks = {80, 90, 70};
        int sum = 0;

        for (int mark : marks)
            sum += mark;

        System.out.println(sum / marks.length);
    }
}

