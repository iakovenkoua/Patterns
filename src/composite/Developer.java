package composite;

public class Developer implements  Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public void add(Employee employee) {

    }
}
