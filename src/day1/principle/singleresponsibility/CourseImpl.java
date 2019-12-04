package day1.principle.singleresponsibility;

public class CourseImpl implements ICourseManager,ICourseContent{


    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void StudyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
