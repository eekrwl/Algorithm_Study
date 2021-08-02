package Programmers.Level1;

import java.util.Scanner;
/*
 //다른 사람들 substring 쓴다 이게뭐지
substring(int beginIndex, int endIndex) 문자열 자르는 함수
return word.substring((word.length()-1) / 2, word.length()/2 + 1);
이거 한줄로 끝내버리네...
 */
public class Q_12903_가운데글자가져오기 {
    public static void main(String args[]) {
        String answer="";
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        if(s.length()%2==0) //짝수
        {
            char[] ch=new char[2];
            ch[0]=s.charAt(s.length()/2-1);
            ch[1]=s.charAt(s.length()/2);
            answer = String.valueOf(ch);
        }
        else //홀수
        {
            char ch=s.charAt(s.length()/2);
            answer = String.valueOf(ch);
        }
        System.out.println(answer);
    }
}
