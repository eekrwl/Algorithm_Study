package Programmers.Level2;

import java.util.HashMap;

public class Q_42888_오픈채팅방 {
    public static void main(String[] args) {
        String[] record={"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result=solution(record);
        for(String x:result)
            System.out.println(x);
    }
    public static String[] solution(String[] record) {
        int answerLine=0; //리턴값 String 개수

        HashMap<String, String> hash = new HashMap<>(); //구성원 정보 적을 해쉬 (uid,닉네임)
        String[][] info=new String[record.length][3];
        for (int i = 0; i < record.length; i++) {
            info[i]=record[i].split(" "); //info에 record 정보 " " 단위로 끊어서 저장
            if (info[i][0].equals("Enter") || info[i][0].equals("Change")) { //Enter나 Change 일때 hash에 값 저장(닉네임 변화 가능성 있음)
                hash.put(info[i][1],info[i][2]);
            }
            if (info[i][0].equals("Enter") || info[i][0].equals("Leave")) {
                answerLine++; //답이 몇줄인지 센다
            }
        }

        String[] answer=new String[answerLine];
        int lineCnt=0;
        for (int i = 0; i < record.length; i++) {
            if (info[i][0].equals("Enter")) {
                answer[lineCnt]=hash.get(info[i][1]);
                answer[lineCnt++]+="님이 들어왔습니다.";
            } else if (info[i][0].equals("Leave")) {
                answer[lineCnt]=hash.get(info[i][1]);
                answer[lineCnt++]+="님이 나갔습니다.";
            }
        }
        return answer;
    }
}
