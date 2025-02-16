package junit.basicjunittesting;

public class DatabaseConnection {
    private boolean connected;
    //Method for data connection
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    //Method for data disconnection
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    //Method to check data connection
    public boolean isConnected() {
        return connected;
    }
    public static void main(String[] args) {
        // Create an object of DatabaseConnection
        DatabaseConnection dbConnection = new DatabaseConnection();
        // Connect to the database
        dbConnection.connect();
        // Check if connected
        if (dbConnection.isConnected()) {
            System.out.println("Connection is established.");
        }
        // Disconnect from the database
        dbConnection.disconnect();
        // Check if disconnected
        if (!dbConnection.isConnected()) {
            System.out.println("Connection is closed.");
        }
    }
}
