package day5.structural.decorator.v1;

public class BatterCakeWithEgg extends BatterCake{

    @Override
    public String getDesc() {
        return super.getDesc()+" with an egg";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
