package Programmers.Level1;

public class Q_67256_키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        int n = numbers.length;
        char[] Answer = new char[n];
        int lLoc = 10; //*를 10으로 둔다
        int rLoc = 12; //#를 12로 둔다
        Length ll = new Length();
        for (int i = 0; i < n; i++) {
            if (numbers[i] == 0) numbers[i] = 11; //0을 11로 둔다
            if (numbers[i] % 3 == 1) { //1,4,7일때, 왼손
                Answer[i] = 'L';
                lLoc = numbers[i];
            } else if (numbers[i] % 3 == 0) { //3,6,9일때, 오른손
                Answer[i] = 'R';
                rLoc = numbers[i];
            } else if (numbers[i] % 3 == 2) { //2,5,8,0일때
                if (ll.len(lLoc, numbers[i]) > ll.len(rLoc, numbers[i])) { //오른손이 더 가까움
                    Answer[i] = 'R';
                    rLoc = numbers[i];
                } else if (ll.len(lLoc, numbers[i]) < ll.len(rLoc, numbers[i])) { //왼손이 더 가까움
                    Answer[i] = 'L';
                    lLoc = numbers[i];
                } else { // 오른손, 왼손 거리 같음
                    if (hand.equals("right")) { //오른손잡이
                        Answer[i] = 'R';
                        rLoc = numbers[i];
                    } else { //왼손잡이
                        Answer[i] = 'L';
                        lLoc = numbers[i];
                    }
                }
            }
        }
        return String.valueOf(Answer);
    }
}

class Length {
    int len = -1;

    public Length() {

    }

    public int len(int handLoc, int touch) {
        int temp = handLoc - touch;
        if (temp == 0) {
            len = 0;
        } else if (temp == 1 || temp == -1) {
            len = 1;
        } else if (temp == 2 || temp == -2) {
            len = 2;
        } else if (temp == 3 || temp == -3) {
            len = 1;
        } else if (temp == 4 || temp == -4) {
            len = 2;
        } else if (temp == 5 || temp == -5) {
            len = 3;
        } else if (temp == 6 || temp == -6) {
            len = 2;
        } else if (temp == 7 || temp == -7) {
            len = 3;
        } else if (temp == 8 || temp == -8) {
            len = 4;
        } else if (temp == 9 || temp == -9) {
            len = 3;
        } else if (temp == 10 || temp == -10) {
            len = 4;
        }
        return len;
    }
}
