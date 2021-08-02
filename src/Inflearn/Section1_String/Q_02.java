package Inflearn.Section1_String;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        in.close();

        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)-91)<0)
                System.out.print((char) (str.charAt(i) + 32)) ;
            else
                System.out.print((char) (str.charAt(i) - 32)) ;
        }
    }
}
