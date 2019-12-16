package day5.structural.decorator.v2;

public class EggDecorator extends Abstractdecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "add an egg";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
