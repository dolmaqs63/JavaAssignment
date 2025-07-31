public class UserFactory {
    public static User createUser(String type) {
        switch (type) {
            case "Admin": return new Admin();
            case "Customer": return new Customer();
            case "Delivery": return new DeliveryBoy();
            default: return null;
        }
    }
}
