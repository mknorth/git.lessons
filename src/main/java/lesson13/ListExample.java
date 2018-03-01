package lesson13;

import org.testng.annotations.Test;

import java.util.*;

public class ListExample {

    /*@Test
    public void azaza(){
        List<String>stringList = new ArrayList<>();
        stringList.add("asdasd");
        stringList.add("asfasf");
        System.out.println(stringList);
    }*/

    @Test
    public void countryClass() {
        Set<String> countrySet = new TreeSet<>();
        countrySet.add("Россия");
        countrySet.add("Франция");
        countrySet.add("Гондурас");
        countrySet.add("Кот-Д'Ивуар"); // любимая страна всех котов
        System.out.println(countrySet);
    }

}
