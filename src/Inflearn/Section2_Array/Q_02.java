package Inflearn.Section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        String[] temp=br.readLine().split(" ");
        int[] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i]=Integer.parseInt(temp[i]);
        }
        int cnt=1;
        int tall=height[0];
        for(int i=1;i<num;i++) {
            if (height[i - 1] >= height[i])
                ;
            else if(height[i-1]<height[i] && height[i]>tall){
                cnt++;
                tall=height[i];
            }
        }
        System.out.println(cnt);


    }
}
