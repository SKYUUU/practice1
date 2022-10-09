package example07;

public class CalculatorEx {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        // 인스턴스 메서드 호출
        int addResult = cal.add(100,200);
        System.out.println("addResult : " + addResult);

        // static 메서드 호출
        long mulResult = Calculator.multiply(100,20);
        System.out.println("mulResult : " + mulResult);

        double divResult = Calculator.divide(100, 4);
        System.out.println("divResult : " + divResult);

        // static 메서드 예시(선언부에 static 제어자가 붙어 있음)
//        Integer.parseInt("100");
//        Math.random();

    }
}