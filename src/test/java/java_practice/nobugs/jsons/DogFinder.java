package java_practice.nobugs.jsons;

import com.fasterxml.jackson.databind.ObjectMapper;
import java_practice.javarush.level22.lecture01.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.nonNull;

/*
    Написать метод:
    List<Dog> findDogsByBreedYoungerThan(File json, String breed, int maxAgeExclusive)
    который возвращает всех собак (type == "dog")
    с ageYears < maxAgeExclusive и breed.equalsIgnoreCase(breed) из всех комнат.
*/
public class DogFinder {
    private final ObjectMapper om = new ObjectMapper();

    public List<Dog> findDogsByBreedYoungerThan(InputStream is, String breed, int maxAgeExclusive) throws IOException {
        Root root = om.readValue(is, Root.class);
        if (root == null || root.shelter() == null || root.shelter().rooms() == null) return List.of();

        return root.shelter().rooms().stream()
                .filter(Objects::nonNull)
                .map(Room::animals)
                .filter(Objects::nonNull)
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .filter(a -> "dog".equalsIgnoreCase((String) a.get("type")))
                .map(a -> new Dog(
                        num(a.get("id"), -1),
                        (String) a.get("name"),
                        (String) a.get("breed"),
                        num(a.get("ageYears"), Integer.MAX_VALUE)
                ))
                .filter(d -> d.ageYears() < maxAgeExclusive)
                .filter(d -> nonNull(d.breed()) && d.breed().equalsIgnoreCase(breed))
                .toList();
    }

    private static int num(Object o, int def) {
        return (o instanceof Number n) ? n.intValue() : def;
    }
}

class Test {
    public static void main(String[] args) throws Exception {
        DogFinder dogFinder = new DogFinder();

        try (InputStream is = Main.class.getResourceAsStream("/jsons/dogs.json")) {
            if (is == null) {
                throw new FileNotFoundException("Не нашёл /jsons/dogs.json в classpath. " +
                        "Проверь, что файл лежит в src/main/resources/jsons/dogs.json и собирается в target/classes.");
            }
            List<Dog> dogs = dogFinder.findDogsByBreedYoungerThan(is, "Beagle", 3);
            System.out.println("Найдено собак: " + dogs.size());
            dogs.forEach(System.out::println);
        }
    }
}

