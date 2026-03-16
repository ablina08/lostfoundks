public class Main {

    public static void main(String[] args) {

        User user = new User("Arben", "arben@email.com");

        Item lostItem = new Item("Wallet", "Pristina", "Black wallet with ID");

        System.out.println("User: " + user.name);
        System.out.println("Lost Item: " + lostItem.name);
        System.out.println("City: " + lostItem.city);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lostItems = new ArrayList<>();

        System.out.println("Lost & Found KS");
        System.out.print("Enter lost item name: ");
        String item = scanner.nextLine();
        lostItems.add(item);

        System.out.println("Items in list: " + lostItems);
    }
}