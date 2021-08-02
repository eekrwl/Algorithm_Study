package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][5];
        for (int i = 0; i < n; i++) {
            String[] str=br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j]=Integer.parseInt(str[j]);
            }
        }

        //int cnt[]
    }
}
