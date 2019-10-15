package staff;

public abstract class Employee {

    private String name;
    private String nin;
    private double salary;

    public Employee(String name, String nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        if (name != null) {
            return this.name = name;
        } else {
            return this.name;
        }
    }

    public String getNin() {
        return this.nin;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
