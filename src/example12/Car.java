package example12;

public class Car {

    String color;
    String gearType;
    int door;

    // 기본 생성자
    public Car() {
        // 직접적으로 인스턴스 멤버변수를 초기화
//        this.color = "노랑";
//        this.gearType = "수동";
//        this.door = 4;
        // 같은 클래스내의 매개변수가 3개 있는 생성자를 호출
        this("검정", "수동", 4);
    }

    // this : 참조변수와 같은 역할, 매개변수와 멤버변수를 구분짓는데 사용
    public Car(String color, String gearType, int door) {
//        color = color; // 변수의 모호성이 일어나 초기화가 이루어지지 않는다.
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    // 인스턴스 복제를 위한 생성자
    public Car(Car c) {
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}
