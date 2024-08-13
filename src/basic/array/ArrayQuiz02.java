package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {

    public static void main(String[] args) {
        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */
        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
        while(true) {
            System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
            System.out.print("삭제할 친구를 입력하세요: ");
            String name = sc.next();
            boolean flag = false;
            for (int i = 0; i < kakao.length; i++) {
                if (name.equals(kakao[i])) {
                    flag = true;
                    for (int j = i; j < kakao.length - 1; j++) {
                        kakao[j] = kakao[j + 1];
                    }
                    break;
                }
            }

            if (!flag) { //flag == false?
                System.out.println(name + "은(는) 없는 이름입니다.");
            } else {
                if(kakao.length==1){
                    kakao=null;
                    break;
                }
                String[] temp = new String[kakao.length - 1];
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = kakao[k];
                }
                kakao = temp;
                temp = null;
                System.out.println("삭제 후 정보: " + Arrays.toString(kakao));

            }
        }
        System.out.println("저장된 친구가 없습니다.");
        sc.close();
    }
}











