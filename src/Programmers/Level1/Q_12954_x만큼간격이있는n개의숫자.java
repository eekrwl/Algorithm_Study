package Programmers.Level1;

import java.util.Scanner;

public class Q_12954_x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        long[] answer=new long[n];
        for (int i = 0; i < n; i++) {
            answer[i]=x*(i+1);
            System.out.print(answer[i]+" ");
        }
    }
}
