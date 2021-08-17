package Inflearn.Section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack<Character> stk=new Stack<>();
        int i;
        for (i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(')
                stk.push('(');
            else if(!stk.isEmpty() && str.charAt(i)==')')
                stk.pop();
            else
                break;
        }
        if(stk.isEmpty() && i==str.length())
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

/*
public String solution(String str) {
    String answer="YES";
    Stack<Character> stack=new Stack<>();
    for (char x : str.toCharArray()) {
        if(x=='(') stack.push(x);
        else {
            if(stack.isEmpty()) return "NO";
            stack.pop();
        }
    }
    if(!stack.isEmpty()) return "NO";
    return answer;
}*/
