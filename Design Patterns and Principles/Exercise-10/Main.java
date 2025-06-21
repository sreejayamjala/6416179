public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aryan", "101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Aarya Sharma");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
