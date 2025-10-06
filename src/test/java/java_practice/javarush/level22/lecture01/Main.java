package java_practice.javarush.level22.lecture01;

import java.util.HashMap;
import java.util.Map;

record Client(String name, int id) { }

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", 123);
        System.out.println(client.name()); // Иван
        System.out.println(client.id());   // 123
        System.out.println(client);        // Client[name=Иван, id=123]

        Map<Client, String> clients = new HashMap<>();
        clients.put(new Client("Анна", 42), "VIP");

        System.out.println(clients.get(new Client("Анна", 42))); // VIP
    }
}
