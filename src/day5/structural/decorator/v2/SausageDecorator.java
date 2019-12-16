package day5.structural.decorator.v2;

public class SausageDecorator extends Abstractdecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"add an sausage";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
