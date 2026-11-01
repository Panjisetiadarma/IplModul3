package latihan1_mvc_student;

public class MVCPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== 3.2 LATIHAN 1: MODEL-VIEW-CONTROLLER (MVC) PATTERN ===");
        // Fetch student record based on roll no from database (simulated)
        Student model = retrieveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        System.out.println("--- Tampilan Data Awal Siswa ---");
        controller.updateView();

        // Update model data via controller
        System.out.println("\n--- Memperbarui Data Siswa Melalui Controller ---");
        controller.setStudentName("John");

        System.out.println("--- Tampilan Setelah Data Diperbarui ---");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
