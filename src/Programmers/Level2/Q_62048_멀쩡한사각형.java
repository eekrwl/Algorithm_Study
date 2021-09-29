package Programmers.Level2;

public class Q_62048_멀쩡한사각형 {
    public static void main(String[] args) {
        int w=4;
        int h=4;
        System.out.println(solution(w,h));
    }

    public static long solution(int w,int h) {
        long answer=0;
        double hh=(double)h;
        double[] yArr=new double[w+1];

        for (int i = 0; i < w+1; i++) {
            //yArr[i]=(hh/(double)w)*i; //y=(h/w)x 함수
            yArr[i]=(hh*i)/(double)w;
        }

        int y=0; //y가 정수일때 체크
        for (int i = 0; i < w; i++) {
            answer++; //x가 1 늘때, 하나는 어차피 잘림
            if((yArr[i]-y)==0) y++; //첫시작점이 정수일때 y++
            while(yArr[i]<(double)y && yArr[i+1]>(double)y) { //y좌표가 정수인 부분이 선에 걸칠때
                answer++;
                y++;
            }
        }
        return (long)w*h-answer;
    }
}
