package day5.structural.adapter.classadapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("Concrete Target目标方法");
    }
}
