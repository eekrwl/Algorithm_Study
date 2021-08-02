package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] temp=new String[n][n];
        int[][] arr = new int[n][n];

        int max=0;
        int h=0,v=0,c1=0,c2=0;
        for (int i = 0; i < n; i++) {
            temp[i] = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(temp[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            c1+=arr[i][i];
            c2+=arr[i][n-1-i];
            for (int j = 0; j < n; j++) {
                h+=arr[i][j];
                v+=arr[j][i];
            }
            if (h > max) {
                max=h;
            }
            if (v > max) {
                max=v;
            }
            h=0;
            v=0;
        }
        if(c1>max)
            max=c1;
        if(c2>max)
            max=c2;
        System.out.println(max);
    }
}
