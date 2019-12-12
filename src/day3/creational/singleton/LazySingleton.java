package day3.creational.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }//在类外部无法构造

    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
