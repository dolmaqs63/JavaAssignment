public class Restaurant implements Observer {
    public void update(String status) {
        System.out.println("Restaurant notified: " + status);
    }
}
