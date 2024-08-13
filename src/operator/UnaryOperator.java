package operator;

public class UnaryOperator {

    public static void main(String[] args) {

        // 증감 연산자(++,--)
        // 변수의 값을 단순히 하나 오릴거나 내릴 때 사용합니다.

        int i = 1;
        int j = i++;    //후위 연산 (선연사 후증감)
        int k = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("j = " + j);
    }
}
