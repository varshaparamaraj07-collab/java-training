package Day10;

public class problem6 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {

            public void run() {
                System.out.println("Run");
            }
        };

        r.run();
    }
}
