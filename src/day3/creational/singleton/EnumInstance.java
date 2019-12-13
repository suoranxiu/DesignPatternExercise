package day3.creational.singleton;

/**
 * 枚举类 可解决序列化与反序列化 、反射攻击等问题
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
