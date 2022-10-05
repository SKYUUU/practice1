package example01;

public class FieldInit {
    // 기본형 변수
    byte byteField;     // 1
    short shortField;   // 2
    int intField;       // 4
    long longField;     // 8

    boolean boolField;  // 1
    char charField;     // 2

    float floatField;   // 4
    double doubleField; // 8

    // 참조형 변수
    int[] arrField;     // 4
    String strField;    // 4

    // toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나
    // 원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용함
    @Override
    public String toString() {

        String str = "byteField : " + byteField + " shortField : " + shortField +
                " int Field : " + intField + " boolField : " + boolField +
                " strField : " + strField;
        return str;
    }
}
