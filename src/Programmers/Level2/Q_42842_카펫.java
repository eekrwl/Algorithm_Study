package Programmers.Level2;

public class Q_42842_카펫 {
    public static void main(String[] args) {
        int[] A=solution(10,2);
        System.out.println(A[0]+" "+A[1]);
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer=new int[2];
        //brown=2x+2y-4
        //yellow=(x-2)(y-2)
        //brown+yellow=x*y
        for (int i = 3; i < brown; i++) {
            for (int j = 3; j < brown; j++) {
                if (i>=j && i * j == brown + yellow) {
                    if ((i - 2) * (j - 2) == yellow) {
                        if (2 * (i + j) - 4 == brown) {
                            answer[0]=i;
                            answer[1]=j;
                            break;
                        }
                    }
                }
            }
            if(answer[0]!=0) break;
        }
        return answer;
    }
}