package Inflearn.Section7_Recursive_Tree_Graph;

public class Q_09 { //DFS로 푸는데 사실 BFS로 풀어야하는 문제
    Node root;
    public static void main(String[] args) {
        Q_09 tree=new Q_09();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);

        System.out.println(tree.DFS(0, tree.root));

    }
    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

}
