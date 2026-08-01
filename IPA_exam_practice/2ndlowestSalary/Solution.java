
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] emps = new Employee[n];
        for (int i = 0; i < n; i++) {
            int empId = sc.nextInt();
            sc.nextLine();
            String empName = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gender = sc.nextLine().charAt(0);
            Double salary = sc.nextDouble();
            emps[i] = new Employee(empId, empName, age, gender, salary);

        }
        int age = sc.nextInt();
        sc.nextLine();
        sc.close();
        //output 1 print
        Employee result = getEmployeeWithSecondLowestSalary(emps);
        if (result != null) {
            System.out.println(result.getEmpId() + "#" + result.getEmpName());
        } else {
            System.out.println("null");
        }
        //output 2 print
        int count = countEmployeesBasedOnAge(emps, age);
        if (count == 0) {
            System.out.println("No Employee found for given age");
        } else {
            System.out.println(count);
        }
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee[] emps) {
        int n = emps.length;
        if (n < 2) {
            return null;
        }
        Employee[] result = new Employee[n];
        //copy in result
        for (int i = 0; i < n; i++) {
            result[i] = emps[i];
        }
        //bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (result[i].getSalary() > result[j].getSalary()) {
                    Employee temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result[1];
    }

    public static int countEmployeesBasedOnAge(Employee[] emps, int age) {
        int count = 0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getAge() == age) {
                count++;
            }
        }
        return count;
    }
}
//create Employee class

class Employee {

    private int empId;
    private String empName;
    private int age;
    private char gender;
    private double salary;

    //create constructor
    public Employee(int empId, String empName, int age, char gender, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    //create getters

    public int getEmpId() {
        return this.empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public double getSalary() {
        return this.salary;
    }
    //create setter method

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
