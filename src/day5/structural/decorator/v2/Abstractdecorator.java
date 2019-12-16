package day5.structural.decorator.v2;

public class Abstractdecorator extends ABattercake{

    private ABattercake aBattercake;

    public Abstractdecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return aBattercake.cost();
    }
}
