package day5.structural.adapter;


public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.ouptputDC5V();
    }
}

