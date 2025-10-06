package testing;

import io.github.pavelicii.allpairs4j.AllPairs;
import io.github.pavelicii.allpairs4j.Parameter;

import java.util.Arrays;

//https://github.com/pavelicii/allpairs4j
public class AllPairsTest {
    public static void main(String[] args) {

        AllPairs allPairs = new AllPairs.AllPairsBuilder()
                .withParameters(Arrays.asList(
                                new Parameter("Тип файла", "Arial", "Calibri", "TNR"),
                                new Parameter("Размер файла", "Курсив", "Жирный"),
                                new Parameter("Типы данных", 12, 14),
                                new Parameter("Кодировка файла", "Word", "Notepad"),
                                new Parameter(" Деньги есть?", "Windows", "Linux"),
                                new Parameter("Цвет", "Чёрный", "Красный")
                        )
                ).build();
        
        System.out.println(allPairs);

    }

}
