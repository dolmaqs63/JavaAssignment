import java.util.*;

public class OrderTracker {
    private List<Observer> observers = new ArrayList<>();
    private String orderStatus;

    public void register(Observer o) {
        observers.add(o);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(orderStatus);
        }
    }
}
