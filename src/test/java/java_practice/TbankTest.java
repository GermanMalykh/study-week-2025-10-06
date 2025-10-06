package java_practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbankTest {
//    У QA-инженера есть статистика по багам на проде за несколько дней 📊
//    Он написал функцию, для подсчета метрик качества. А именно, для коэффициента ошибок, пропущенных на прод, за период
//    Коэффициент считается как отношение багов прода ко всем найденным багам.
//    Вроде все работает корректно... Или нет 🤔
//    Помогите найти и исправить ошибку 🐞
}

class MissRateCalc {

    // Паритет с Python-логикой: если total_test_bugs == 0 → вернуть 0.0
    public static double calculateMissRate(List<Map<String, Integer>> data) {
        int totalProdBugs = 0;
        int totalTestBugs = 0;

        for (Map<String, Integer> e : data) {
            totalProdBugs += e.getOrDefault("prod_bugs", 0);
            totalTestBugs += e.getOrDefault("test_bugs", 0);
        }

//        int denom = totalProdBugs + totalTestBugs;
        if (totalTestBugs == 0) return 0.0;
//        if (denom == 0) return 0.0;
        return (double) totalProdBugs / (totalProdBugs + totalTestBugs);
//        return (double) totalProdBugs / denom;
    }

    // Пример данных
    public static void main(String[] args) {
        List<Map<String, Integer>> data = List.of(
                new HashMap<>(Map.of("day", 1, "prod_bugs", 4, "test_bugs", 1)),
                new HashMap<>(Map.of("day", 2, "prod_bugs", 7, "test_bugs", 20)),
                new HashMap<>(Map.of("day", 3, "prod_bugs", 2, "test_bugs", 2))
        );

        double missRate = calculateMissRate(data);
        System.out.println(missRate);
    }
}
