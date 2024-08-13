package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {

        /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력:");
        int n=sc.nextInt();
        sc.close();

        int k=2;
        int count=0;
        System.out.print("소수: ");
        while(k<=n) {
            int j=2;
            while (k % j != 0) {
                j++;
            }
            if(k==j){
                System.out.print(" "+k);
                count++;
            }
            k++;
        }
        System.out.println();
        System.out.println("소수의 개수: "+count);

    }
}
