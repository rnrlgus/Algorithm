package haspMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Compare {

    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c1 : str1.toCharArray()) {
            map.put(c1, map.getOrDefault(c1, 0) + 1);
        }

        for (char c2:str2.toCharArray()) {
            if (!map.containsKey(c2) || map.get(c2) == 0) {
                return "NO";
            } else map.put(c2, map.get(c2) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Compare main = new Compare();
        Scanner scan = new Scanner((System.in));

        String str1= scan.next();
        String str2 = scan.next();

        System.out.println(main.solution(str1, str2));
    }
}