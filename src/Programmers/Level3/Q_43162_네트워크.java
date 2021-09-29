package Programmers.Level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Q_43162_네트워크 {

    /*//되긴하는데 시간초과남.......성능개선 나름 했는데 슬프다
    static ArrayList<ArrayList<Integer>> ARR=new ArrayList<ArrayList<Integer>>();
    static int L=0;
    static int fin;
    static int[] check;

    public int solution(int n, int[][] computers) {
        int answer=0;
        fin=n;
        for (int i = 0; i < n; i++) {
            int already=0;
            check=new int[n];
            check[i]=1;
            for (int a = 0; a < ARR.size(); a++) {
                if(ARR.get(a).contains(i)) {
                    already++;break;
                }
            }
            if(already==0)  {
                ARR.add(new ArrayList<Integer>());
                ARR.get(ARR.size()-1).add(i);
                DFS(0,i,computers,ARR.size()-1);
            }
        }
        for (int i = 0; i < ARR.size(); i++) {
            int overlap=0;
            for (int j = 0; j < i; j++) {
                if(ARR.get(i).containsAll(ARR.get(j))) overlap++;
            }
            if (overlap == 0) {
                answer++;
            }
        }

        return answer;
    }

    public void DFS(int L, int k, int[][] computers,int ARRnum) {
        if (L == fin) {
            return;
        } else {
            for (int i = 0; i < fin; i++) {
                if (check[i] == 0 && computers[k][i]==1) {
                    ARR.get(ARRnum).add(i);
                    check[i]=1;
                    DFS(L+1,i,computers,ARRnum);
                    check[i]=0;
                }
            }
        }
    }*/

    /*public int solution(int n, int[][] computers) {
        int answer=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for (int i = 0; i < n; i++) {
            hash.put(i,1);
        }

        ArrayList<Integer> ARR=new ArrayList<>();
        while (!hash.isEmpty()) {
            for (int x : hash.keySet()) {
                if (ARR.isEmpty()) {
                    ARR.add(x);
                } else {
                    //if(computers[x])
                }
            }
        }


        return answer;
    }*/

    static ArrayList<ArrayList<Integer>> ARR = new ArrayList<ArrayList<Integer>>();

    public int solution(int n, int[][] computers) {
        for (int i = 0; i < n; i++) {
            int already = 0;
            int myLoc = -1;
            for (int a = 0; a < ARR.size(); a++) {
                if (ARR.get(a).contains(i)) {
                    already++;
                    myLoc = a;
                    break;
                }
            }
            if (already == 0) {
                ARR.add(new ArrayList<Integer>());
                ARR.get(ARR.size() - 1).add(i);
                myLoc = ARR.size() - 1;
            }

            for (int j = 0; j < n; j++) {
                if (!ARR.get(myLoc).contains(j) && computers[i][j] == 1)
                    ARR.get(myLoc).add(j);

            }
        }

        return ARR.size();
    }
        public static void main(String[] args) {
            int n = 3;
            int[][] c1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
            //int[][] c2={{1,1,0},{1,1,1},{0,1,1}};

            Q_43162_네트워크 T = new Q_43162_네트워크();

            System.out.println(T.solution(n, c1));
            //System.out.println(T.solution(n,c2));
        }

}