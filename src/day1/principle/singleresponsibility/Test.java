package day1.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("企鹅");

        //对类进行拆分，减少修改原始类功能函数所造成的风险，符合职责单一原则
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("企鹅");
    }
}
