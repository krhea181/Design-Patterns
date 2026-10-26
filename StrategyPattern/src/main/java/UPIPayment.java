public class UPIPayment implements PaymentStrategy{
    int upiId;

    UPIPayment(int upiId){
        this.upiId=upiId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("UPIPayment : amout paid : "+amount + " UpiID "+upiId);
    }
}
