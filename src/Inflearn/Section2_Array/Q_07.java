package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] result = new int[num];
        String temp = br.readLine();
        String[] temp2=temp.split(" ");
        for (int i = 0; i < num; i++) {
            result[i] = Integer.parseInt(temp2[i]);
        }

        int score=0;
        int sc=1;
        for (int i = 0; i < num; i++) {
            if (result[i] == 1) {
                score += sc++;
            } else {
                sc=1;
            }
        }
        System.out.println(score);
    }
}
