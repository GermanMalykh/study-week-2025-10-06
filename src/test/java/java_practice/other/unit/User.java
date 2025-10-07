package java_practice.other.unit;

public final class User {
    private final String id;
    private final String name;

    public User(String id, String name) {
        if (id == null || name == null) throw new IllegalArgumentException("id and name must not be null");
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);         // равенство только по id
    }

    @Override
    public int hashCode() {
        return id.hashCode();              // согласован с equals
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "'}";
    }
}
