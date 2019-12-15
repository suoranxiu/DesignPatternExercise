package day4.creational.prototype.clone;

import day3.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("Peggi",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        //注意深克隆还是浅克隆
        pig1.getBirthday().setTime(666666L);
        System.out.println(pig1);
        System.out.println(pig2);

        //模拟反射clone攻击单例模式
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton clonedHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(clonedHungrySingleton);
//        System.out.println(hungrySingleton == clonedHungrySingleton);
    }
}
