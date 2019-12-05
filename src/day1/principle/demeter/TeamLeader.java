package day1.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<>();
        for(int i =0;i< 20;i++){
            courseList.add(new Course());
        }
        System.out.println("Course number is "+courseList.size());
    }
}
