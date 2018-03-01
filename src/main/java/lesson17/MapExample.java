package lesson17;

import org.testng.annotations.Test;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {


        Map<String, Double> treeMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            //получить ключ
            String key = entry.getKey();
            //получить значение
            Double value = entry.getValue();
        }
    }

    @Test
    public void listIterator(){
        List<String> sexNames = new ArrayList<>();
        sexNames.add("Slava");
        sexNames.add("Kolia");
        sexNames.add("Jesika");
        sexNames.add("Jack");
        System.out.println(sexNames);
    }

    @Test
    public void mapFor(){
    Map<String, Double> map = new HashMap<>();
    map.put("aaaaa", 8.3);
    map.put("bbbbb", 9.0);
    map.put("ccccc", 5.7);


        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for(Map.Entry<String, Double> entry : entries){
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("movie title: " + key+ " Reting: "+value);
        }
    }

}
