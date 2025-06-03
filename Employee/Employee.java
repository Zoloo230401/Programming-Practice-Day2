public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateBonus() {
        double rate = 0;

        if (salary >= 0 && salary <= 400.00) {
            rate = 15;
        } else if (salary <= 800.00) {
            rate = 12;
        } else if (salary <= 1200.00) {
            rate = 10;
        } else if (salary <= 2000.00) {
            rate = 7;
        } else {
            rate = 4;
        }

        double bonus = salary * rate / 100;
        double newSalary = salary + bonus;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.printf("Em percentual: %.0f %%\n", rate);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Жишээ
        Employee emp1 = new Employee("John", 400.00);
        emp1.calculateBonus();

        System.out.println();

        Employee emp2 = new Employee("Maria", 800.01);
        emp2.calculateBonus();

        System.out.println();

        Employee emp3 = new Employee("Pedro", 2000.00);
        emp3.calculateBonus();
    }
}
