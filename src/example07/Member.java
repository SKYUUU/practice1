package example07;

public class Member {

  int iv = 100; // 인스턴스 멤버변수
  static int cv = 200; // static 멤버변수

  // 인스턴스 메서드
  public void imethod() {
    System.out.println("iv : " + this.iv);
    // System.out.println("cv : " + Member.cv); // 클래스명.정적변수명
  }

  // static 메서드
  public static void smethod() {
    // System.out.println("iv : " + this.iv); // 언제 인스턴스가 만들어질지 모름
    // static 변수 cv는 인스턴스 생성 없이도 접근 가능
    // static 메서드 내에서는 얼마든지 접근 가능
    System.out.println("cv : " + Member.cv);
  }
}
