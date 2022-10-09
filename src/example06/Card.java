package example06;

public class Card {
    // instance variables : 반드시 인스턴스를 생성해야 접근 가능
    private String color;
    private String company;
    // static variables : 인스턴스 생성 없이도 클래스명.static 변수명으로 접근 가능
    static int width = 100;
    static int height = 50;

    // getter, setter : 인스턴스 메서드
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void showInfo() {
        // 지역변수는 반드시 초기화를 해야한다.

        // 메서드 안에 static 변수 사용 X,
        // static 은 인스턴스 생성 없이도 접근 가능해야 하는데
        // 언제 인스턴스가 생성될지 모르기 때문에 올바른 방법이 아님
//        static int i = 10;
        String color = this.color;
        String company = this.company;
        System.out.println(color + ", " + company);

    }

    @Override
    public String toString() {
        // static 변수는 접근방법이 반드시 클래스명.static 변수명으로 접근
        return "card1의 색상 : " + this.getColor() + ", card1의 회사 : " + this.getCompany() +
                ", 크기 : (" + Card.height + ", " + Card.width + ")";
    }
}
