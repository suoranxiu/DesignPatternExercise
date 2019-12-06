package day3.creational.abstractfactory;

public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("Creating Java Article!");
    }
}
