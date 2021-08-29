package Inflearn.Section7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Q_07 { //이진트리 넓이우선탐색, 레벨탐색(BFS:Breadth-First Search) 1 2 3 4 5 6 7 이런식으로
    Node root;
    public void BFS(Node root) {
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0; //몇번만에 그 노드로 가는지
        while (!Q.isEmpty()) {
            int len=Q.size();
            System.out.print(L+" : ");
            for (int i = 0; i < len; i++) {
                Node cur=Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q_07 tree_ = new Q_07();
        tree_.root=new Node(1);
        tree_.root.lt=new Node(2);
        tree_.root.rt=new Node(3);
        tree_.root.lt.lt=new Node(4);
        tree_.root.lt.rt=new Node(5);
        tree_.root.rt.lt=new Node(6);
        tree_.root.rt.rt=new Node(7);
        tree_.BFS(tree_.root);
    }
}
