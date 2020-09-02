package dz7;

public class Contacts {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Солдатов","89660745601");
        phoneBook.add("Солдатов","89660745602");
        phoneBook.add("Заварухин","89660745603");
        phoneBook.add("Немов","89660745604");

        phoneBook.get("Солдатов");
        phoneBook.get("Заварухин");
        phoneBook.get("Немов");
    }
}
