package com.vishal.CollectionsFramework.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();    //    do not allow duplicates
        map.put("us","United States");
        map.put("in","India");

        Set<Map.Entry<String,String>> num=map.entrySet();
        for (Map.Entry<String,String> it: num
             ) {
            System.out.println(it.getKey()+" " + it.getValue());
        }
//        Set<String> set=map.keySet();
//        Set<String> setval=new HashSet<>(map.values());
//        System.out.println(setval);
//        System.out.println(set);
//        Map<String,String> map2= (Map<String, String>) map.entrySet();
//        Set<String > map2= (Set<String>) map.values();
//        System.out.println(map2);


////        map.put("in","India2");  //   this will modify the previous value
//        map.putIfAbsent("in","India2");
//        map.put("en","England");
//        map.remove("in");
//        System.out.println(map.containsKey("in"));
//        System.out.println(map);
//        System.out.println(map.get("en"));    //   if not present return null
//        System.out.println(map.getOrDefault("us","others"));   //  if not present return default value "Others"
    }
}
