package day3.creational.builder;

public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseActualBuilder actualBuilder = new CourseActualBuilder();
        coach.setCourseBuilder(actualBuilder);
        Course course = coach.makeCourse("Python",
                        "PythonPPT",
                        "PythonVideo",
                        "PythonArticle",
                        "PythonQA");
        System.out.println(course.toString());
    }
}

