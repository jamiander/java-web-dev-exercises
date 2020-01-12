package exercises.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    public String name;
    public int studentId;
    public int numberOfCredits = 0;
    public double gpa = 0.0;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
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
        public void setName(String aName) {
            name = aName;
        }
        public void setStudentId(int aStudentId) {
            studentId = aStudentId;
        }
        public void setNumberOfCredits(int aNumberOfCredits) {
            numberOfCredits = aNumberOfCredits;
        }
        public void setGpa(int aGpa) {
            gpa = aGpa;
        }

    }

