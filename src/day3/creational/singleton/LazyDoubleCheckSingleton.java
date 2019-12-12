package day3.creational.singleton;

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySingleton = null;
    //所有线程都可看到内存的共享状态
    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
