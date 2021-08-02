package Inflearn.Section1_String;

import java.io.*;

public class Q_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        str = str.toLowerCase();
        int check=0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check=1;
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(check==0)
            bw.write("YES");
        else
            bw.write("NO");
        bw.flush();
        bw.close();

    }
}
