import java.util.Scanner;

public class Account {
    int balance;
    int previusTransaction;
    String customerName;
    String customerID;

    Account(String name, String cid) {
        customerName = name;
        customerID = cid;
    }
}
