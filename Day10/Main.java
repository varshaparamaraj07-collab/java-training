package Day10;

class problem1 {
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        problem1 e = new problem1();

        e.setName("Varsha");
        e.setSalary(30000);

        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}