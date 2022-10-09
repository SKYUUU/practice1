package example07;

public class Calculator {
    // 인스턴스 메서드
    // new 연산자로 인스턴스를 생성해야지만 참조변수명.인스턴스메서드명 으로 접근 가능
    public int add(int x, int y){
        double dresult = Calculator.divide(10.5, 11.7);
        System.out.println("dresult : " + dresult);
        return x + y;
    }

    public int substract(int x, int y){
        return x - y;
    }

    // static 메서드
    // 인스턴스 생성없이 클래스명, 정적메서드 명으로 바로 접근 가능
    public static long multiply(long x, long y){
        // static 메서드는 인스턴스 생성없이 접근 가능해야 하는데
        // 아래 코드는 인스턴스가 생성되어야지만 사용가능한 add()
        // 인스턴스가 언제 생성될지 모름
//        this.add(10,5);
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }
}
