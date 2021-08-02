package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String[] arr=str.split(" ");
        int len=arr[0].length();
        int answer=0;
        for (int i = 1; i < arr.length; i++) {
            if(len<arr[i].length()) {
                len = arr[i].length();
                answer=i;
            }
        }
        System.out.println(arr[answer]);
    }
}
