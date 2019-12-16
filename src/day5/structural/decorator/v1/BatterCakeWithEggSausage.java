package day5.structural.decorator.v1;

public class BatterCakeWithEggSausage extends BatterCakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc()+ "and a sausage";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
