package day3.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);


//        ContainerSingleton.putInstance("object",new Object());
//        Object instance  = ContainerSingleton.getInstance("object");

         ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);

    }
}
