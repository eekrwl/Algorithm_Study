package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] s=br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j]=Integer.parseInt(s[j]);
            }
        }

        /*int[] mentee = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; i < n; j++) {
              //  if(arr[m][n]<arr[m][i])
            } //????????????????
        }
        [사람수][사람수]
*/
        int cnt=0,answer=0;
        for(int k=0;k<n;k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][k] - arr[i][j] < 0)
                        cnt++;
                }
            }
            if (cnt == 0)
                answer++;
            System.out.print("cnt:"+cnt+"   ");
            cnt=0;
        }
        System.out.println();
        System.out.print(answer);

    }
}
