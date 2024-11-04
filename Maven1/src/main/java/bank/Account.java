package bank;

public class Account {
    private AccountType accountType;
    private Client client;
    private Employee employee;

    public Account(AccountType accountType, Client client, Employee employee) {
        this.accountType = accountType;
        this.client = client;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Konto: " + accountType + " | Klient: " + client;
    }
}

