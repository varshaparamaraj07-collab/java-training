package Day9;

public class problem10 {
    public static void main(String[] args) {
        String text = "Programming";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }

        System.out.println(count);
    }
}

