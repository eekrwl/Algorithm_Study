package Programmers.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_72410_신규아이디추천 {
    public static void main(String[] args) {
        String id="...!@BaT#*..y.abcdefghijklm";
        System.out.println("1 : "+solution(id));
        System.out.println("2 : "+solution("z-+.^."));
        System.out.println("3 : "+solution("=.="));
        System.out.println("4 : "+solution("123_.def"));
        System.out.println("5 : "+solution("abcdefghijklmn.p"));
    }
    public static String solution(String new_id) {
        Map<Character, Integer> hash = new HashMap<>();
        hash.put('.', 1);
        hash.put('_', 1);
        hash.put('-', 1);
        char[] arr = new_id.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < new_id.length(); i++) { //1,2단계
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                list.add((char) (arr[i] + 'a' - 'A'));
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                list.add(arr[i]);
            } else if (hash.containsKey(arr[i])) {
                list.add(arr[i]);
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                list.add(arr[i]);
            }
        }
        int cnt = 1;
        while (cnt != list.size()) { //3단계
            if (list.get(cnt) == '.' && list.get(cnt - 1) == '.') {
                list.remove(cnt);
            } else
                cnt++;
        }

        //4단계
        if (list.get(0) == '.') list.remove(0);
        if (list.size()!=0 && list.get(list.size() - 1) == '.') list.remove(list.size() - 1);
        //5단계
        if (list.size() == 0) list.add('a');
        //6단계
        if (list.size() > 15) {
            while (list.size() > 15) {
                list.remove(list.size() - 1);
            }
        }
        if (list.get(list.size() - 1) == '.') list.remove(list.size() - 1);
        //7단계
        if (list.size() <= 2) {
            while (list.size() < 3) {
                list.add(list.get(list.size() - 1));
            }
        }
        StringBuilder sb=new StringBuilder();
        for (char x : list) {
            sb.append(x);
        }
        return sb.toString();
    }
}
