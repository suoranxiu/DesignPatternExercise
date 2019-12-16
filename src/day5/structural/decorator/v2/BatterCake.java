package day5.structural.decorator.v2;

public class BatterCake extends ABattercake{
    @Override
    public String getDesc() {
        return "BatterCake";
    }

    @Override
    public int cost() {
        return 8;
    }
}
