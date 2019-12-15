package day3.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable{
    //类加载的时候就初始化完成
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    //或者放到静态块中初始化
//    static {
//        hungrySingleton = new HungrySingleton();
//    }
    private HungrySingleton(){
        //防止反射攻击
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        //解决序列化和反序列化的instance不是同一个
        return hungrySingleton;
    }

    /**
     * 防止实现Cloneable接口后，遭到反射clone攻击造成单例破坏
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
