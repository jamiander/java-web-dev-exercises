package exercises.classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (toBeCompared == null || getClass() != toBeCompared.getClass()) return false;
        Course course = (Course) toBeCompared;
        return Objects.equals(topic, course.topic) &&
                Objects.equals(instructor, course.instructor) &&
                Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor= " + instructor +
                ", Enrolled Students= " + enrolledStudents +
                '}';
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

}
