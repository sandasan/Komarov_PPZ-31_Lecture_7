package Example_7_1;

public class Main {
    public static void main(String[] args) {

        Goods corn = new Goods(20, 20, 300, "Fresh corn", "Kiev", 2015);

        Manager m = new Manager("Danil", 23, "Novice");

        m.raisePrice(corn, 15);

        System.out.println(corn.getPrice());

        DeliveryMan dm = new DeliveryMan("Igor", 35);

        dm.delivered(corn);

        SanStation ss1 = new SanStation("Kiev SES");

        ss1.check(corn);
    }
}
