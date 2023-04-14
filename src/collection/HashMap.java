package collection;

import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> hMap = new java.util.HashMap<>();
        hMap.put(101,"Cricket");
        hMap.put(102,"Hockey");
        hMap.put(103,"Basketball");

        System.out.println("HashMap elements: "+hMap);

        hMap.remove(102,"Hockey");

        System.out.println("HasMap Element after removing :"+hMap);

        for (Map.Entry mEntry : hMap.entrySet()){
            System.out.println("key: "+ mEntry.getKey() + " & Value: " +mEntry.getValue());
        }
    }
}
