package Inflearn.Section1_String;

import java.io.*;

public class Q_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = new char[str.length()];
        int cnt = 0, check = 0;
        for (int i = 0; i < str.length(); i++) {
            check=0;
            for (int j = 0; j < cnt; j++) {
                if(ch[j]==str.charAt(i))
                    check++;
            }
            if(check==0) {
                System.out.print(str.charAt(i));
                ch[cnt++] = str.charAt(i);
            }
        }
    }
}
