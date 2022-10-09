package example07;

public class MemberEx {

//    public static void s1(){
//        System.out.println("static method");
//    }
//
//    public void m1(){
//        System.out.println("instance method");
//    }

    public static void main(String[] args) {

//      me.m1();

        // static 멤버들이므로 인스턴스 생성없이 접근 가능
        Member.smethod();
        Member.cv = 500;

        // 인스턴스 멤버들을 사용하기 위해서는 new 연산자를 통해 인스턴스를 만들어야 사용 가능
        Member m = new Member();
        m.imethod();
        m.iv = 999;
        m.imethod();
    }
}
