package example08;

public class CallStackEx {

  public static void main(String[] args) {

    // Call Stack 은 LIFO
    System.out.println("main() 실행됨");
    CallStackEx.first();
    System.out.println("main() 종료됨");
  }

  public static void first() {
    System.out.println("first() 실행됨");
    CallStackEx.second();
    System.out.println("first() 종료됨");
  }

  public static void second() {
    System.out.println("second() 실행됨");
    CallStackEx.third();
    System.out.println("second() 종료됨");
  }

  public static void third() {
    System.out.println("third() 실행됨");
    System.out.println("third() 종료됨");
  }
}
