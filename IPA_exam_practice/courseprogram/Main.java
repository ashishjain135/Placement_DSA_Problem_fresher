
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Courses[] course = new Courses[4];
        for (int i = 0; i < 4; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String adminName = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();
            course[i] = new Courses(courseId, courseName, adminName, quiz, handson);
        }
        String admin = sc.nextLine();
        int handson = sc.nextInt();
        sc.nextLine();
        //task 1
        int average = findAvgOfQuizByAdmin(course, admin);
        if (average != 0) {
            System.out.println(average);
        } else {
            System.out.println("No courses found");
        }
        //task 2
        Courses[] result = sortCoursesByHandson(course, handson);
        if (result == null) {
            System.out.println("No Courses found with mentioned attributes");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i].getCoursesName());
            }
        }
    }

    public static int findAvgOfQuizByAdmin(Courses[] course, String admin) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (course[i].getCoursesAdmin().equalsIgnoreCase(admin)) {
                sum += course[i].getQuiz();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        int average = sum / count;
        return average;
    }

    public static Courses[] sortCoursesByHandson(Courses[] course, int handson) {
        Courses[] result = new Courses[course.length];
        int count = 0;
        //copy 
        for (int i = 0; i < course.length; i++) {
            if (course[i].getHandson() < handson) {
                result[count] = course[i];
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        //sorting 
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if ((result[i].getHandson()) > (result[j].getHandson())) {
                    Courses temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        //result
        Courses[] ans = new Courses[count];
        for (int i = 0; i < count; i++) {
            ans[i] = result[i];
        }
        return ans;
    }
}

class Courses {

    private int courseId;
    private String courseName;
    private String adminName;
    private int quiz;
    private int handson;

    public Courses(int courseId, String courseName, String adminName, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.adminName = adminName;
        this.quiz = quiz;
        this.handson = handson;
    }

    //getters
    public int getCoursesId() {
        return this.courseId;
    }

    public String getCoursesName() {
        return this.courseName;
    }

    public String getCoursesAdmin() {
        return this.adminName;
    }

    public int getQuiz() {
        return this.quiz;
    }

    public int getHandson() {
        return this.handson;
    }

    //setters
    public void setCoursesId(int courseId) {
        this.courseId = courseId;
    }

    public void setCoursesName(String courseName) {
        this.courseName = courseName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }

}
