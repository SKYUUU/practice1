package example08;

public class ReferenceParamEx {

  public static void main(String[] args) {

    A a = new A();
    a.data = 77;
    System.out.println("메서드 호출전 main()내의 값 : " + a.data);
    // 값을 읽고 수정 가능
    // call by reference(주소에 의한 호출)
    ReferenceParamEx.dataChange(a);
    System.out.println("dataChange() 호출 후");
    System.out.println("메서드 호출 후 main()내의 값 : " + a.data);
  }

  // int[], String .... → 참조변수 형태 호출
  public static void dataChange(A a) {
    // a 라는 주소값이 매개변수로 넘어왔기 때문에 주소를 공유
    // 호출한 곳에서 영향을 받는다
    a.data = 44;
    System.out.println("dataChange() 내의 값 : " + a.data);
    return;
  }
}
