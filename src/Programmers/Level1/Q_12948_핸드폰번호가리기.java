package Programmers.Level1;

public class Q_12948_핸드폰번호가리기 {
    public static void main(String[] args) {
        String str="01012341234";
        System.out.println(solution(str));
    }
    public static String solution(String phone_number) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < phone_number.length()-4; i++) {
            sb.append('*');
        }
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            sb.append(phone_number.charAt(i));
        }
        String answer = sb.toString();
        return answer;

        /*
        toCharArray()랑 String.valueOf...
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);*/
    }
}
