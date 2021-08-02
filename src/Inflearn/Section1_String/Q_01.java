package Inflearn.Section1_String;

import java.util.Scanner;
//다 대문자로 바꿔버린대.. 대박..
public class Q_01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char ch=in.next().charAt(0);

        in.close();
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch || str.charAt(i)==ch-32 || str.charAt(i)==ch+32)
                cnt++;
        }
        /* 대문자로 바꾸는 코드
        str=str.toUpperCase();
        ch=Character.toUpperCase(t);
         */

        /* forEach 사용
        for(char x : str.toCharArray()) //문자 배열 생성!
            if(x==t) cnt++;
         */
        System.out.println(cnt);
    }
}
