package day4.structural.facade;

public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("paying "+pointsGift.getName());
        return true;
    }
}
