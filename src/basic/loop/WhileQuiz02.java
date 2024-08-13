package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

    public static void main(String[] args) {

        /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력:");
        int n=sc.nextInt();
        sc.close();

        if(n==1){
            System.out.println("1은 소수가 아닙니다");
            return;
        }

        int start=2;
        while(start<n){
            if(n%start==0){
                System.out.println("n은 소수가 아닙니다");
                break;
            } else if (start==n-1) {
                System.out.println("n은 소수입니다.");
            }
            start++;
        }

    }
}
