package Inflearn.Section4_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str=br.readLine();
        int[] rank=new int[5];
        for (int i = 0; i < n; i++) {
            rank[str.charAt(i)-'A']++;
        }
        char max=0;
        for (int i = 1; i < 5; i++) {
            if(rank[i]>rank[max])
                max=(char)i;
        }
        System.out.print((char)(max+'A'));
    }
}
/*

//HashMap (key-value)

public char solution(int n, String s) {
    char answer=' ';
    HashMap<Character, Integer> map=new HashMap<>();
    for(char x:s.toCharArray()) { //for each
        map.put(x, map.getOrDefault(x,0)+1); //x가 없다면 0을 리턴
    }
    //System.out.println(map.containsKey('A')); //A라는 key가 존재하는지? t,f 리턴함
    //map.size() -> key가 몇개인지 리턴
    //map.remove('A'); //A라는 key제거!
    int max=Integer.MIN_VALUE;
    for(char key:map.keySet()) {
        //System.out.println(key+" "+map.get(key));
        //keySet key들이 출력됨 / get은 value값
        if(map.get(key)>max) {
            max=map.get(key);
            answer=key;
        }
    }
    return answer;
}
*/
