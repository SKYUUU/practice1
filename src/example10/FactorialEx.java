package example10;

public class FactorialEx {

    public static void main(String[] args) {

        long result = factorial(5);
        System.out.println("5!의 값 : " + result);
    }

    public static long factorial(long n){

        long result = 0;

        if (n == 1) {  // 탈출조건
            result = 1;
        } else {
            System.out.println("result값 : " + result + " n값 : " + n);
            result = n * factorial(n-1);
        }

        return result;
    }
}
