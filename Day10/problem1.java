package Day10;

public class problem1 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.getAge());
    }
}

class Student {
    private int age = 18;

    int getAge() {
        return age;
    }
}
