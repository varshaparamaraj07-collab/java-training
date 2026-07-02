package Day10;
public class problem2 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
    }
}
interface Animal {
    void sound();
}
class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }
}
