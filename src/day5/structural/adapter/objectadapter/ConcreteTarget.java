package day5.structural.adapter.objectadapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("Concrete Target目标方法");
    }
}
