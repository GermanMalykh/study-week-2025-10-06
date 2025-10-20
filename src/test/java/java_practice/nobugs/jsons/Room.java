package java_practice.nobugs.jsons;

import java.util.List;
import java.util.Map;

public record Room(String id, Caretaker caretaker, List<Map<String, Object>> animals) {
}
