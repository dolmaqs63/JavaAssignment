public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Connected to Database");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Using the same DB instance");
    }
}
