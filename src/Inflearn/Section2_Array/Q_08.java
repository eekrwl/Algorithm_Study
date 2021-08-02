package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp=br.readLine().split(" ");
        int[][] sc=new int[2][n];
        for (int i = 0; i < n; i++) {
            sc[0][i]=Integer.parseInt(temp[i]);
        }
        int rank=1;
        int more=0;
        for (int i = 100; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (sc[0][j] == i) {
                    sc[1][j]=rank;
                    more++;
                }
            }
            rank+=more;
            more=0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sc[1][i]+" ");
        }
    }
}
