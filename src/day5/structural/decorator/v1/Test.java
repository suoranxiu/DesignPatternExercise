package day5.structural.decorator.v1;

public class Test {
    public static void main(String[] args) {

        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc()+" cost:"+batterCake.cost());

        BatterCake batterCake1 = new BatterCakeWithEgg();
        System.out.println(batterCake1.getDesc()+" cost:"+batterCake1.cost());

        BatterCake batterCake2 = new BatterCakeWithEggSausage();
        System.out.println(batterCake2.getDesc()+" cost:"+batterCake2.cost());
    }
}
