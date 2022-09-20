package haspMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class FindLeader {

    public char solution(int n, String str) {
        int max = Integer.MIN_VALUE;
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // map.containsKey('A') 해당 key 있는지 없는지 boolean 반환
        // map.size() : key 종류 수 
        // map.remove('A') 키 A 삭제 : 삭제되기 전 A의 value 반환

        for (char key : map.keySet()) {
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        FindLeader main = new FindLeader();
        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();
        String str = scan.next();

        System.out.println(main.solution(n, str));
    }
}