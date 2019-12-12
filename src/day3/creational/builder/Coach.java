package day3.creational.builder;

public class Coach {
    private CourseActualBuilder courseBuilder;

    public CourseBuilder getCourseBuilder() {
        return courseBuilder;
    }

    public void setCourseBuilder(CourseActualBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }
    public Course makeCourse(String courseName ,String coursePPT ,String courseVideo ,String courseArticle,String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
