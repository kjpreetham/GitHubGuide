package org.example;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static List<Integer> list = new CopyOnWriteArrayList<>();

   public static void main(String... args) throws InterruptedException {
      String input = "Programming";
      Map<Character, Integer> map = new LinkedHashMap<>();
      for(char c : input.toCharArray())
          map.put(c,map.getOrDefault(c,0)+1);
      List<Character> result = map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).toList();
       System.out.println(result);
        }

}
