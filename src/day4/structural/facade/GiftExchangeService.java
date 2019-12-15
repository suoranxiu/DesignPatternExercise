package day4.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvalible(pointsGift)){
            if(pointsPaymentService.pay(pointsGift)){
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("Ordering successfully! "+shippingOrderNo);
            }
        }
    }
    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }
}
