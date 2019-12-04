package day1.principle.openclose;

/**
 * 基于原始的JavaCourse类在实现ICourse接口功能之后，新加入的DiscountJavaCourse需要引入DiscountPrice，
 * 因此为减少底层接口基类的修改，新建JavaCourse的子类DiscountJavaCourse，重写getPrice方法，并创建getOriginalPrice方法
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginalPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

}
