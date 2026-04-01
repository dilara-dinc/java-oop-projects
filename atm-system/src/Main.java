import model.Account;
import service.ATMService;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("Dilara", 1000);

        ATMService atm = new ATMService(account);

        atm.start();
    }
}
