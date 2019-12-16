package day5.structural.adapter;

public class PowerAdapter implements DC5{

    private AC220 ac220 = new AC220();

    @Override
    public int ouptputDC5V() {
        int adapterInput = ac220.outputAC220v();

        //变压器。。。
        int adapterOutput = adapterInput/44;
        System.out.println("PowerAdapter output DC "+adapterOutput+" v");
        return adapterOutput;
    }
}
