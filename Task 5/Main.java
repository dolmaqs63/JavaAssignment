public class Main {
    public static void main(String[] args) {
        
        System.out.println("---- Singleton Pattern ----");
        Database db1 = Database.getInstance();
        db1.connect();
        Database db2 = Database.getInstance();
        db2.connect();
        System.out.println("Same instance? " + (db1 == db2));

      
        System.out.println("\n---- Factory Pattern ----");
        User user1 = UserFactory.createUser("Customer");
        User user2 = UserFactory.createUser("Admin");
        User user3 = UserFactory.createUser("Delivery");
        user1.showRole();
        user2.showRole();
        user3.showRole();

      
        System.out.println("\n---- Observer Pattern ----");
        OrderTracker order = new OrderTracker();
        order.register(new CustomerObserver());
        order.register(new Restaurant());
        order.register(new DeliveryPartner());
        order.setOrderStatus("Order Placed");
        order.setOrderStatus("Out for Delivery");
        order.setOrderStatus("Delivered");
    }
}
