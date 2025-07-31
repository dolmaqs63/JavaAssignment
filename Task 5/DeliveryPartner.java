public class DeliveryPartner implements Observer {
    public void update(String status) {
        System.out.println("Delivery notified: " + status);
    }
}
