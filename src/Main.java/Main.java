public class Main {

    public static void main(String[] args) {

        User user = new User("Arben", "arben@email.com");

        Item lostItem = new Item("Wallet", "Pristina", "Black wallet with ID");

        System.out.println("User: " + user.name);
        System.out.println("Lost Item: " + lostItem.name);
        System.out.println("City: " + lostItem.city);
    }
}