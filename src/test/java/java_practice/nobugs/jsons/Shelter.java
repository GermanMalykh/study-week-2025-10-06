package java_practice.nobugs.jsons;

import java.util.List;

public record Shelter(String name, String city, List<Room> rooms) {
}
