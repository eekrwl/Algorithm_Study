package Inflearn.Section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str=str.toUpperCase();
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                sb.append(str.charAt(i));
            }
        }
        int check=0;
        for (int i = 0; i < sb.length()/2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                check++;
                break;
            }
        }
        if(check==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
