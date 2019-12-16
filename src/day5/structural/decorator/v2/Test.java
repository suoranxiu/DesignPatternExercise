package day5.structural.decorator.v2;

public class Test {

    public static void main(String[] args) {
        ABattercake battercake = new BatterCake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getDesc()+" cost: "+battercake.cost());
    }

}
