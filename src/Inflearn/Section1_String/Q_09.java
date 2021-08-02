package Inflearn.Section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer;
        char[] ch=new char[str.length()];
        int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ch[cnt++]=str.charAt(i);
            }
        }
        answer=String.valueOf(ch,0,cnt);
        System.out.println(Integer.parseInt(answer));
    }
}
