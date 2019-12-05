package day1.principle.dependenceinversion;

public class Geely {
    public void studyCourse(ICourse iCourse){
        iCourse.studyCourse();
    }

}
