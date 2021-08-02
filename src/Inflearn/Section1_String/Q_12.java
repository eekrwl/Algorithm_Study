package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        StringBuilder str = new StringBuilder(sc.nextLine());
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='#') {
                str.setCharAt(i,'1');
            } else {
                str.setCharAt(i, '0');
            }
        }
        char[] nums=new char[num];
        int temp=0;
        for (int i = 0; i < num*7; i+=7) {
            String t=str.substring(i,i+7);
            nums[temp]=(char)Integer.parseInt(t,2);
            System.out.print(nums[temp++]);
        }
    }
}
