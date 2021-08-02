package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder answer = new StringBuilder("");
        char bf=str.charAt(0);
        int cnt=1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == bf) {
                cnt++;
            } else {
                answer.append(bf);
                if(cnt!=1)
                    answer.append(Integer.toString(cnt));
                bf=str.charAt(i);
                cnt=1;
            }
        }
        answer.append(bf);
        if(cnt!=1)
            answer.append(Integer.toString(cnt));
        System.out.println(answer.toString());
    }
}
