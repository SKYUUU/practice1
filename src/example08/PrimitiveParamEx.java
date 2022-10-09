package example08;

class A {
    int data;
}

public class PrimitiveParamEx {

    public static void main(String[] args) {

        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출전 main()내의 값 : " + a.data);
        // 값만 읽을 수 있음
        // call by value(값에 의한 복사)
        PrimitiveParamEx.dataChange(a.data);
        System.out.println("dataChange() 호출 후");
        System.out.println("메서드 호출 후 main()내의 값 : " + a.data);
    }

    public static void dataChange(int data) {
        // 지역변수 data 라는 값은 값복사가 이루어졌기 때문에
        // 호출한 곳에서 영향 받지 않음
        data = 44;
        System.out.println("dataChange() 내의 값 : " + data);
        return;
    }
}
