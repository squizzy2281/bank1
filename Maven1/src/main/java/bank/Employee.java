package bank;

public class Employee {
    private static Employee instance;

    private Employee() {
        // Konstruktor prywatny
    }

    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;
    }
}

