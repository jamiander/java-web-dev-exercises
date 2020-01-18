package exercises.school;

import java.util.HashMap;
import java.util.Map;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student jamie = new Student("Jamie Andersen", 123, 1, 4.0);
        Course.courseStudent.put(123, jamie);
        Course lc101 = new Course("lc101", 123, Course.courseStudent);
        System.out.println("Course roster: " + lc101.courseName + ", " + lc101.courseId + ", " + Course.courseStudent);
    }
}


