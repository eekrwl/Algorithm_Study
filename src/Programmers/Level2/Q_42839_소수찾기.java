package Programmers.Level2;

import java.util.HashMap;

/*public class Q_42839_소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution("17"));
        makeNum("17",2,2);
        for (String x : hash.keySet()) {
            System.out.println("HIHI : "+x);
        }
    }
    public static int solution(String numbers) {
        int answer=0;

        char[] arr=numbers.toCharArray();
        for (int i = 1; i <= arr.length; i++) {

        }

        return answer;
    }

    static boolean[] check=new boolean[7];
    static HashMap<String,Integer> hash=new HashMap<>();
    public static void makeNum(String numbers, int ingredient, int len) {

        String str="";
        for (int i = 0; i < ingredient; i++) {
            if (str.length() == len && !hash.containsKey(str)) {
                hash.put(str, 0);
                str="";
            }
            if (!check[i]) {
                str+=numbers.charAt(i);
                check[i]=true;
            }
            System.out.println("MAKENUM : "+str);
            if(len>0) makeNum(numbers,ingredient,len-1);
        }
    }
}*/

public class Q_42839_소수찾기 {
    public static void main(String[] args) {
        //System.out.println(solution("17"));
        System.out.println(solution("011"));
    }
    public static int solution(String numbers) {
        int answer=0;

        for (int i = 1; i <= numbers.length(); i++) {
            makeNum(numbers,i);
            for (int a = 0; a < 7; a++) {
                check[a] = false;
            }
            str="";
        }
        for (Integer x : hash.keySet()) {
            System.out.print(x+" ");
            answer+=calc(x);
        }
        System.out.println();


        return answer;
    }

    static boolean[] check=new boolean[7];
    static String str="";
    static HashMap<Integer, Integer> hash=new HashMap<>();
    public static void makeNum(String numbers,int len) {
        System.out.println("len ===== "+len);
        for (int i = 0; i < numbers.length(); i++) {
            if(!check[i]) {
                str += numbers.charAt(i);
                check[i] = true;
                if (str.length() == len) {
                    System.out.println("str : "+str);
                    if (!hash.containsKey(Integer.parseInt(str))) {
                        hash.put(Integer.parseInt(str), 1);
                        str = "";
                        for (int a = 0; a < 7; a++) {
                            check[a] = false;
                        }
                    } else {
                        str="";
                    }

                } else {
                    makeNum(numbers,len);
                }
            }
        }
    }

    public static int calc(int N) { //소수인지 확인
        if(N==0 || N==1) return 0;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(N%i==0) return 0;
        }
        return 1;
    }



    /*public static int make1(String numbers) {
        String str="";
        int cnt=0;
        for (int i = 0; i < numbers.length(); i++) {
            str+=numbers.charAt(i);
            if (str.length() == 1) {
                cnt+=calc(str);
                str="";
            }
        }
        return cnt;
    }

    public static int make2(String numbers) {
        String str="";
        int cnt=0;
        boolean[] check = new boolean[2];
        for (int i = 0; i < numbers.length(); i++) {
            str+=numbers.charAt(i);
            check[i]=true;
            for (int j = 0; j < numbers.length(); j++) {
                if (!check[j]) {
                    str+=numbers.charAt(j);
                    check[j]=true;
                }
                if (str.length() == 2) {
                    cnt+=calc(str);
                    str="";
                    for(int a=0;a<2;a++) check[a]=false;
                }
            }
        }
        return cnt;
    }*/
}


