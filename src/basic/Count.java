package basic;

public class Count {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        while(n<=30000){
            if(n%258==0){
                count +=1;
            }
            n++;
        }
        System.out.println(count);
    }
}
