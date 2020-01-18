package exercises.school;

import java.util.HashMap;
import java.util.Map;

public class Course {
    public String courseName;
    public int courseId;
    public static Map<Integer, Student> courseStudent = new HashMap<>();

    public Course(String courseName, int courseId, Map<Integer, Student> courseStudent) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseStudent = courseStudent;


}

}