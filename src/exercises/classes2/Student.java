package exercises.classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }



     public String getGradeLevel() {
        String gradeLevel;
//        // Determine the grade level of the student based on numberOfCredits
         if (this.numberOfCredits >= 90) {
             gradeLevel = "Senior";
         } else if (this.numberOfCredits >= 60) {
             gradeLevel = "Junior";
         } else if (this.numberOfCredits >=30) {
             gradeLevel = "Sophomore";
         } else {
             gradeLevel = "Freshman";
         }
         return gradeLevel;
    }


    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double qualityScore = this.numberOfCredits * this.gpa;
        qualityScore = qualityScore + (grade * courseCredits);
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = qualityScore/this.numberOfCredits;
    }

    public String toString() {
        return name + "Student ID: " + studentId + ", Number of credits: " + numberOfCredits + ", GPA: " + gpa;
    }

    public boolean equals(Object toBeCompared) {

        if (this == toBeCompared) return true;
        if (toBeCompared == null || getClass() != toBeCompared.getClass()) return false;
        Student theStudent = (Student) toBeCompared;
        return theStudent.getGpa() == getGpa();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
