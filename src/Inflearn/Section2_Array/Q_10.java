package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] temp = new String[n][n];
        int[][] arr=new int[n+2][n+2];

        for (int i = 1; i < n+1; i++) {
            temp[i-1]=br.readLine().split(" ");
            for (int j = 1; j < n+1; j++) {
                System.out.println("i:" + i + "  j:" + j);
                arr[i][j] = Integer.parseInt(temp[i-1][j-1]);
            }
        }
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int cnt=0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                int t=arr[i][j];
                if (t > arr[i - 1][j] && t > arr[i][j - 1] && t > arr[i + 1][j] && t > arr[i][j + 1]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
