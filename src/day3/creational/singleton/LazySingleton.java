package day3.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;
    private LazySingleton(){
        if(flag){
            flag = false;
        } else {//防止反射攻击
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }//在类外部无法构造

    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //模拟多线程反射攻击，修改private 变量 flag 来完成反射攻击
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(01,true);
        LazySingleton o2 = (LazySingleton)constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }
}
