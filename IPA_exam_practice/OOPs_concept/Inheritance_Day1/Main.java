
/**
 * Question
 *
 *  *Create:
 *
 *  *Employee
 * ├── name
 * ├── salary
 * └── work()
 *
 *  *Developer extends Employee
 * ├── programmingLanguage
 * └── work()
 *
 *  *Requirements:
 *
 *  *Employee ka parameterized constructor banao.
 * Developer ka parameterized constructor banao.
 * Developer constructor me super() use karo.
 * work() Developer me override karo.
 * Main me:
 * Employee e = new Developer(...);
 *
 *  *use karo.
 * 6. e.work() call karo.
 * 7. Output observe karo.
 *
 *  *Expected concept
 * Reference → Employee
 * Object    → Developer
 *
 *  *e.work()
 * ↓
 * Developer.work()
 */
public class Main {

    public static void main(String[] args) {
        //upcasting ->> Upcasting = converting a child-class reference to a parent-class reference.
        Employee e = new Developer("Ashish", 50000, "Java");
        //downcasting is the process of converting a parent class reference into a child class reference. It is explicitly performed using a cast and is mainly used to access child-specific methods or properties.
        Developer d = (Developer) e;
        System.out.println(d.programingLanguage);
        Employee e1 = new Employee("Ashish", 490000);
        Developer d1 = new Developer("avinash", 15000, "JAVA");
        e.work();
        e1.work();
        d1.work();
    }
}

class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " work as Employee & salary is " + salary);
    }
}

class Developer extends Employee {

    String programingLanguage;

    public Developer(String name, double salary, String programingLanguage) {
        super(name, salary);
        this.programingLanguage = programingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " Developer from " + programingLanguage + " programming Languege & salary is " + salary);

    }
}
