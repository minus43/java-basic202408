package basic.constate;

import java.util.Scanner;

public class IfQuiz {

    public static void main(String[] args) {

        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        int max = 0, mid = 0, min = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int a = sc.nextInt();
        System.out.println("정수를 입력하세요: ");
        int b = sc.nextInt();
        System.out.println("정수를 입력하세요: ");
        int c = sc.nextInt();

        if(a>b & a>c){
            max=a;
            mid=b;
            min=c;
        } else if (b>c & b>a) {
            max=b;
            mid=a;
            min=c;
        } else{
            max=c;
            mid=a;
            min=b;
        }

        if(min>mid){
            int temp=mid;
            mid=min;
            min=temp;
        }

        System.out.println("max:"+max+"mid:"+mid+"min"+min);
    }
}
