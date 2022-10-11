package example13;

public class User {

    // 해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성하고 있음
    private static User singleton = new User();

    // 해당 클래스를 외부에서 new 연산자로 인스턴스를 생성못하게 막기
    private User() {
    }

    // 해당 클래스 멤버의 주소를 넘겨주기(공유) 위해서 외부에서 호출할 수 있는
    // getter 매서드를 제공
    public static User getInstance() {
        return User.singleton;
    }
}
