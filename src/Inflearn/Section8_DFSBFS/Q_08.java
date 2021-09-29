package Inflearn.Section8_DFSBFS;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        sc.close();
        int n=Integer.parseInt(st.nextToken());
        int f=Integer.parseInt(st.nextToken());

        int sum=0;
        int n1=0,n2=0;
        for (int i = 1; i <= n; i++) {
            sum+=(i*(n-1));
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if((sum-i*(n-2)-j*(n-2))==f) {
                    n1=i;
                    n2=j;
                }
            }
        }
        System.out.print(n1);
        for (int i = 1; i <= n; i++) {
            if(i!=n1 && i!=n2) System.out.print(" "+i);
        }
        System.out.print(" "+n2);
    }
}
