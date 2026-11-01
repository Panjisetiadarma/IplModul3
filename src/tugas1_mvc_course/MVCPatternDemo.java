package tugas1_mvc_course;

public class MVCPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== 3.3 TUGAS 1: MELENGKAPI KODE DAN IMPLEMENTASI MVC COURSE ===");
        // Fetch course record based on id from database (simulated)
        Course model = retrieveCourseFromDatabase();

        // Create a view : to write course details on console
        CourseView view = new CourseView();

        CourseController controller = new CourseController(model, view);
        controller.updateView();

        // Update model data
        controller.setCourseName("Python");
        System.out.println("\nAfter updating, Course Details are as follows");
        controller.updateView();
    }

    private static Course retrieveCourseFromDatabase() {
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}
