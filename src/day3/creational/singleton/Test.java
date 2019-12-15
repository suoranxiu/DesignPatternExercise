package day3.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        System.out.println("main Thread: "+ThreadLocalInstance.getInstance());
        System.out.println("main Thread: "+ThreadLocalInstance.getInstance());
        System.out.println("main Thread: "+ThreadLocalInstance.getInstance());
        System.out.println("main Thread: "+ThreadLocalInstance.getInstance());
        System.out.println("main Thread: "+ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        Thread t3 = new Thread(new T());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Program end");
//        HungrySingleton instance = HungrySingleton.getInstance();
////        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
////
////        oos.writeObject(instance);
////
////        File file = new File("singleton_file");
////        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
////
////        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
////        System.out.println(instance);
////        System.out.println(newInstance);
////        System.out.println(instance == newInstance);


////        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
////        HungrySingleton instance = HungrySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        System.out.println(instance);
////        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println(instance);
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());
    }
}
