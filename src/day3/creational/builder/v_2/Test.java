package day3.creational.builder.v_2;

public class Test {
    public static void main(String[] args) {
        Course.CourseBuilder courseBuilder = new Course.CourseBuilder()
                                                        .buildCourseName("PythonName")
                                                        .buildCoursePPT("PythonPPT")
                                                        .buildCourseVideo("PythonVideo")
                                                        .buildCourseArticle("PythonArticle")
                                                        .buildCourseQA("PythonQA");
        Course course = courseBuilder.build();
        System.out.println(course);
    }
}
