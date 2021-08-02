package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tokens=br.readLine().split(" ");
        int[] intTokens=new int[n];
        for(int i=0;i<n;i++)
            intTokens[i]=Integer.parseInt(tokens[i]);
        System.out.print(intTokens[0]+" ");
        for (int i = 1; i < n; i++)
            if(intTokens[i-1]<intTokens[i])
                System.out.print(intTokens[i]+" ");
    }
}
