package day4.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift =new PointsGift("T-shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
