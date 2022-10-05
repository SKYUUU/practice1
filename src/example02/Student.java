package example02;

public class Student {
    // 멤버변수(필드)
    String name;
    int age;

    @Override
    public String toString() {
//        String str = "이름 : " + this.name + ", " + "나이 : " + this.age;

        // this : 클래스의 주소(new 라는 연산자가 인스턴스를 생성하면 비로소 활성화)
        // this 는 static 메서드나 클래스 안에 사용할 수 없음
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
//        return str;
    }
}
