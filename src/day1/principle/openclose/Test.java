package day1.principle.openclose;

public class Test {
    public static void main(String[] args) {
       ICourse iCourse = new JavaDiscountCourse(96,"srx",348d);
       JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
       System.out.println("ID:"+javaCourse.getId()+" Name:"+javaCourse.getName()+" DiscountPrice:"+javaCourse.getPrice()+" OriginalPrice:"+javaCourse.getOriginalPrice());
    }
}
