package java_practice.other.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class UserTest {

    @Test
    void equalsUsers() {
        User user1 = new User("1", "Ivan");
        User user2 = new User("1", "Kolya");
        Assertions.assertEquals(user1, user2);
        Assertions.assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    void notEqualsUsers() {
        User user1 = new User("1", "Ivan");
        User user2 = new User("2", "Kolya");
        Assertions.assertNotEquals(user1, user2);
    }

    @Test
    void nullsThrow() {
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new User(null, "Test")
        );
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> new User("1", null)
        );
    }

    @Test
    void setDeduplicatesById() {
        var set = new HashSet<User>();
        set.add(new User("7", "Ann"));
        set.add(new User("7", "Anna"));
        Assertions.assertEquals(1, set.size());
    }

    @Test
    void mapOverwritesValueForEqualKey() {
        var map = new HashMap<User, String>();
        map.put(new User("10", "Bob"), "first");
        map.put(new User("10", "Bobby"), "second"); // ключ «равен» по id
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals("second", map.get(new User("10", "X")));
    }

}
