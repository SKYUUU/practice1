package example06;

public class CardEx {
    public static void main(String[] args) {

        Card card1 = new Card();
        card1.setColor("yellow");
        card1.setCompany("국민은행");

        System.out.println(card1);
        card1.showInfo();

        // static 변수는 반드시 클래스명.static 변수명으로 접근하여야 함
//        card1.width = 80;
//        card1.height = 150;

        Card.width = 80;
        Card.height = 150;

        Card card2 = new Card();
        card2.setColor("blue");
        card2.setCompany("농협");
        System.out.println(card2);
    }
}
