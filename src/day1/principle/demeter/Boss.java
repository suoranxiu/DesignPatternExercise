package day1.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    //Boss 和 Course 不属于朋友 不需要了解Course这个类
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
