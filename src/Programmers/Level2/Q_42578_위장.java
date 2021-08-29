package Programmers.Level2;

import org.w3c.dom.Node;

import java.util.HashMap;

public class Q_42578_위장 {
    public static void main(String[] args) {
        String[][] c = {{"yellowhat", "headgear"}, {"bluesungalsses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(c));
    }
    public static int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0) + 1);
        }

        int kinds=hash.size();
        int[] cntArr=new int[kinds];
        int cnt=0;
        for(String x:hash.keySet()) cntArr[cnt++]=hash.get(x);
/*
        boolean[][] calArr=new boolean[(int)Math.pow(2,kinds)][kinds];
        for (int i = 0; i < kinds; i++) {

        }*/

        int len=1;
        Node root=new Node(1);
        Node tmp=root;
        while (len < kinds) {
            root.addLeftNode(len++);
            tmp=
        }

        return 1;
    }
}

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }

    public void addLeftNode(int len) {
        lt=new Node(0);
        rt=new Node(1);
    }
}
