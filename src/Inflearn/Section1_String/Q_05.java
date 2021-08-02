package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb=new StringBuilder(str);
        in.close();
        int[] index = new int[str.length()];
        int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                index[cnt++]=i;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index[cnt++]=i;
            }
        }
        for (int i = 0; i < cnt/2; i++) {
            char temp=str.charAt(index[i]);
            sb.setCharAt(index[i],str.charAt(index[cnt-1-i]));
            sb.setCharAt(index[cnt-1-i],temp);
        }
        System.out.println(sb.toString());
    }
}
