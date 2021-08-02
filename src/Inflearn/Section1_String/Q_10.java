package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String[] temp=str.split(" ");
        String s=temp[0];
        char t=temp[1].charAt(0);

        int[] t_loc = new int[s.length()];
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t) {
                t_loc[i]=++cnt;
            }
            else
                cnt=0;
        }

        for (int i = s.length()-1; i >= 0; i--) {
            if (t_loc[i] == 0) {
                for (int j = i; j > 0; j--) {
/*                    if (t_loc[j] == t_loc[j - 1] || t_loc[j] == t_loc[j-2]) {
                        break;
                    } else {
                        t_loc[j-1]=t_loc[j]+1;
                    }*/
                    if(j>0 && t_loc[j]==t_loc[j-1])
                        break;
                    else if(j>1 && t_loc[j]==t_loc[j-2])
                        break;
                    else
                        t_loc[j-1]=t_loc[j]+1;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(t_loc[i]+" ");
        }
    }
}
