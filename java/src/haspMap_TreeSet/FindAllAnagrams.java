package haspMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagrams {

    public int solution(String str1, String str2) {
        int answer = 0;
//        bacaAacba
//        abc
        HashMap<Character, Integer> h2 = new HashMap<>();
        HashMap<Character, Integer> h1 = new HashMap<>();
        for (char x: str2.toCharArray()) h2.put(x, h2.getOrDefault(x, 0) + 1);
        int len = str2.length() - 1;
        for (int i = 0; i < len; ++i) {
            h1.put(str1.charAt(i), h1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        int start = 0;
        for (int end = len; end < str1.length(); ++end) {
            h1.put(str1.charAt(end), h1.getOrDefault(str1.charAt(end), 0) + 1);
            if (h1.equals(h2)) answer++;
            h1.put(str1.charAt(start), h1.get(str1.charAt(start)) - 1);
            if (h1.get(str1.charAt(start)) == 0) h1.remove(str1.charAt(start));
            start++;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindAllAnagrams main = new FindAllAnagrams();
        Scanner scan = new Scanner((System.in));

        String str1 = scan.next();
        String str2 = scan.next();

        System.out.print(main.solution(str1, str2));
    }
}