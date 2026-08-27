
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[4];
        for (int i = 0; i < 4; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String sub = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();
            stud[i] = new Student(rollNo, name, sub, grade, date);

        }
        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt();

        Student[] task1 = findStudentByGradeAndMonth(stud, grade, month);
        if (task1 == null) {
            System.out.println("No Student found");
        } else {
            for (Student s : task1) {
                System.out.println(s.getName());
                System.out.println(s.getSub());
            }
            System.out.println(task1.length);
        }
    }

    public static Student[] findStudentByGradeAndMonth(Student[] stud, char grade, int month) {
        Student[] copy = new Student[stud.length];
        int count = 0;
        String mon = String.format("%02d", month);
        for (Student s : stud) {
            String[] dateparts = s.getDate().split("/");
            if ((s.getGrade() == grade) && dateparts[1].equals(mon)) {
                copy[count] = s;
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        //create result
        Student[] result = new Student[count];
        for (int i = 0; i < count; i++) {
            result[i] = copy[i];
        }
        //sorting 
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (result[i].getRollNo() > result[j].getRollNo()) {
                    Student temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}

class Student {

    private int rollNo;
    private String name;
    private String sub;
    private char grade;
    private String date;

    public Student(int rollNo, String name, String sub, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.date = date;

    }

    //getter 
    public int getRollNo() {
        return this.rollNo;
    }

    public String getName() {
        return this.name;
    }

    public String getSub() {
        return this.sub;
    }

    public char getGrade() {
        return this.grade;
    }

    public String getDate() {
        return this.date;
    }

    //setters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
