package day1.principle.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely is studying FE Course!");
    }
}
