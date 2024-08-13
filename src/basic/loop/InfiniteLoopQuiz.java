package basic.loop;

import java.util.Scanner;

public class InfiniteLoopQuiz {

    public static void main(String[] args) {

        /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
        int count0=0;
        int countTrue=0;
        Scanner sc =new Scanner(System.in);

        while(true){
            int a=(int)(Math.random()*100+1);
            int b=(int)(Math.random()*100+1);
            System.out.printf("%d x %d =?\n",a,b);
            int result =sc.nextInt();

            if(result!=a*b){
                System.out.println("오답입니다~");
                count0++;
                if(count0==2){
                    System.out.println("오답이 많아 종료되었습니다.");
                    System.out.println("정답 횟수: "+countTrue+" 오답 횟수: "+count0);
                    break;
                }
            } else if (result==a*b) {
                System.out.println("정답입니다~");
                countTrue++;
            }

        }

        }

    }

