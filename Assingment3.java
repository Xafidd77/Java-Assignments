public class Assingment3 {
    // DATA FIELDS

    private String courseName;

    // Array used to store student names
    private String[] students;

    // Number of students currently enrolled
    private int numberOfStudents;

    // CONSTRUCTOR


    public Assingment3(String courseName) {

        // Store the course name
        this.courseName = courseName;

        // Start with a small array
        // It will grow automatically when it becomes full
        this.students = new String[4];

        // Initially there are no students
        this.numberOfStudents = 0;
    }

    // GET COURSE NAME

    public String getCourseName() {
        return courseName;
    }

    // ADD STUDENT


    public void addStudent(String student) {

        // Check if the array is full
        if (numberOfStudents >= students.length) {

            // Create a new array with double capacity
            String[] newStudents = new String[students.length * 2];

            // Copy old students into the new array
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            // Make the new array the current students array
            students = newStudents;
        }

        // Add the new student
        students[numberOfStudents] = student;

        // Increase number of students
        numberOfStudents++;
    }

    // DROP STUDENT
    public void dropStudent(String student) {

        // Search for the student
        for (int i = 0; i < numberOfStudents; i++) {

            // Check whether this is the student to remove
            if (students[i].equals(student)) {

                // Shift all students after this student
                // one position to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                // Remove the duplicate last value
                students[numberOfStudents - 1] = null;

                // Decrease the number of students
                numberOfStudents--;

                // Student found and removed
                return;
            }
        }
    }

    // GET STUDENTS
    public String[] getStudents() {

        // Create a new array containing only enrolled students
        String[] currentStudents = new String[numberOfStudents];

        // Copy enrolled students into the new array
        for (int i = 0; i < numberOfStudents; i++) {
            currentStudents[i] = students[i];
        }

        // Return the current students
        return currentStudents;
    }

    // GET NUMBER OF STUDENTS
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // MAIN METHOD - TEST THE PROGRAM
    public static void main(String[] args) {

        // Create a course
        Assingment3 course = new Assingment3("Java Programming");

        // ADD STUDENTS


        course.addStudent("Ismail");
        course.addStudent("Ahmed");
        course.addStudent("Mohamed");
        course.addStudent("Abdi");
        course.addStudent("Hassan");


        // DISPLAY COURSE INFORMATION


        System.out.println("======================================");
        System.out.println("          COURSE INFORMATION          ");
        System.out.println("======================================");

        System.out.println("Course Name: " + course.getCourseName());

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());


        // DISPLAY STUDENTS


        System.out.println("\nStudents:");

        String[] students = course.getStudents();

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }


        // DROP A STUDENT


        System.out.println("\nDropping student: Ahmed");

        course.dropStudent("Ahmed");


        // DISPLAY UPDATED INFORMATION


        System.out.println("\n======================================");
        System.out.println("        AFTER DROPPING STUDENT        ");
        System.out.println("======================================");

        System.out.println("Course Name: " + course.getCourseName());

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());


        // DISPLAY UPDATED STUDENTS

        System.out.println("\nStudents:");

        students = course.getStudents();

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
}