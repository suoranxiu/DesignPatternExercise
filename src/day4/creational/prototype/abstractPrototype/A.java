package day4.creational.prototype.abstractPrototype;

public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
