package dayschoral;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            boolean daySch = sc.nextBoolean();
            stud[i] = new Student(id, name, branch, score, daySch);
        }
        //task 1
        int task1 = findCountOfDaysSchoralStudent(stud);
        if (task1 != 0) {
            System.out.println(task1);
        } else {
            System.out.println("There are no such dayscholar students");
        }

        //task 2
        Student task2 = findStudentWithSecondHighestScore(stud);
        if (task2 != null) {
            System.out.println(task2.getId() + "#" + task2.getName() + "#" + task2.getScore());
        } else {
            System.out.println("There are no student from non day scholar");
        }
    }

    public static int findCountOfDaysSchoralStudent(Student[] stud) {
        int count = 0;
        int n = stud.length;
        for (Student s : stud) {
            if ((s.getScore() > 80) && (s.getDaySch())) {
                count++;
            }
        }
        return count;
    }

    //task 2
    public static Student findStudentWithSecondHighestScore(Student[] stud) {
        int count = 0;
        for (Student s : stud) {
            if (!s.getDaySch()) {
                count++;
            }
        }
        if (count < 2) {
            return null;
        }
        //copy in non daySch
        Student[] ans = new Student[count];
        int index = 0;
        for (Student s : stud) {
            if (!s.getDaySch()) {
                ans[index] = s;
                index++;
            }
        }
        //sort based on score
        for (int i = 0; i < count - 1; i++) {
            for (int j = i; j < count; j++) {
                if (ans[i].getScore() < ans[j].getScore()) {
                    Student temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans[1];
    }
}

class Student {

    private int id;
    private String name;
    private String branch;
    private double score;
    private boolean daySch;

    public Student(int id, String name, String branch, double score, boolean daySch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.daySch = daySch;

    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBranch() {
        return this.branch;
    }

    public double getScore() {
        return this.score;
    }

    public boolean getDaySch() {
        return this.daySch;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setDaySch(boolean daySch) {
        this.daySch = daySch;
    }
}
