package example01;

public class FieldInitEx {

    public static void main(String[] args) {
        // new 연산자가 클래스에 있는 멤버들의 바이트 크기만큼
        // 힙에 메모리 할당을 하며 동시에 초기화 시켜주는 역할을 함
        FieldInit fi = new FieldInit();
        System.out.println(fi.byteField);
        System.out.println(fi.boolField);
        System.out.println(fi.floatField);
        System.out.println(fi.arrField);

        System.out.println(fi.toString());
        System.out.println(fi);
    }
}
