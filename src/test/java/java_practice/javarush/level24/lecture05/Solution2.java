package java_practice.javarush.level24.lecture05;

class MagicArtifact implements AutoCloseable {
    @Override
    public void close() {
        // Сообщение, подтверждающее автоматическое отключение артефакта
        System.out.println("Магический артефакт безопасно отключён");
    }
}

public class Solution2 {
    public static void main(String[] args) {
        // try-with-resources гарантирует автоматический вызов close()
        // даже если внутри блока произойдет исключение
        try (MagicArtifact ma = new MagicArtifact()) {
            System.out.println("Идёт работа с магическим артефактом");
        }
    }
}

