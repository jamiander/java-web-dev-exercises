package exercises.school;

import java.util.HashMap;
import java.util.Map;

public class Course {
    public String courseName;
    public int courseId;
    Map<Integer, Student> courseStudent = new HashMap<>();

    public Course (String courseName, int courseId, HashMap<Integer, Student> courseStudent) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseStudent = courseStudent;

        courseStudent.put(123,jamie);
        System.out.println(courseStudent);
    }
}