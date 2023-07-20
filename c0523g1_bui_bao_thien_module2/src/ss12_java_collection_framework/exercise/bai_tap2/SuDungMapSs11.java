package ss12_java_collection_framework.exercise.bai_tap2;

import java.util.HashMap;
import java.util.Map;

public class SuDungMapSs11 {
    public static void rateCheck(String string) {
        String[] strings = string.split(" ");

        Map<String, Integer> myMap = new HashMap();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].toLowerCase();
            int defaultValue = 1;
            if (!myMap.containsKey(key)) {
                myMap.put(key, defaultValue);
            } else {
                int temp = myMap.get(key) + 1;
                myMap.put(key, temp);
            }
        }
        for (Map.Entry<String, Integer> map : myMap.entrySet()) {
            System.out.println("từ " + map.getKey() + " xuất hiện " + map.getValue());
        }
    }
}
