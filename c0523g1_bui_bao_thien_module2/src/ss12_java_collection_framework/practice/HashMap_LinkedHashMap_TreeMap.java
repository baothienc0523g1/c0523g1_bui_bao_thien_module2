package ss12_java_collection_framework.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Le Quyen", 30);
        myHashMap.put("My Tam", 29);
        myHashMap.put("Chipu", 28);
        myHashMap.put("Liu Grace", 27);
        System.out.println("Display entries is myHashMap");
        System.out.println(myHashMap + "\n");

        Map<String, Integer> myLinkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        myLinkedHashMap.put("Binz", 30);
        myLinkedHashMap.put("Bray", 31);
        myLinkedHashMap.put("Andree", 32);
        myLinkedHashMap.put("VD", 29);
        System.out.println("\nThe age for " + "Andree is " + myLinkedHashMap.get("Andree"));
    }
}
