package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] table = new int[2][num];
        for (int i = 0; i < 2; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < num; j++) {
                table[i][j] = Integer.parseInt(temp[j]);
            }
        }
        for (int i = 0; i < num; i++) {
            if(table[0][i]-table[1][i]==1 || table[0][i]-table[1][i]==-2)
                System.out.println("A");
            else if(table[0][i]==table[1][i])
                System.out.println("D");
            else
                System.out.println("B");
        }
    }
}
