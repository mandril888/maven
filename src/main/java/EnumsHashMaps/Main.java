package EnumsHashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Antonio", "C/ a", 100.50,"11111");
        Account account2 = new Account("Alberto", "C/ b", 50.88,"22222");
        Account account3 = new Account("Marc", "C/ c", 120.00,"33333");

        Map<String, Account> accountsMap = new HashMap<>();
        accountsMap.put(account1.getAccountNumber(), account1);
        accountsMap.put(account2.getAccountNumber(), account2);
        accountsMap.put(account3.getAccountNumber(), account3);
    }
}
