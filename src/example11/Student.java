package example11;

public class Student {

    // 인스턴스 멤버 변수 선언
    private String name;
    private int age;

    // 클래스명과 생성자명이 반드시 같아야 한다.
    // 생성자는 리턴타입이 존재하지 않는다.
    public Student() {
        System.out.println("기본생성자 호출");
    }

    public Student(String name){
        System.out.println("매개변수 String만 있는 생성자 호출");
        this.name = name;
    }

    public Student(int age){
        System.out.println("매개변수 int만 있는 생성자 호출");
        this.age = age;
    }
    // 매개변수가 있는 생성자
    // 생성자라는 것은 인스턴스 초기화 메서드라고 생각
    public Student(String name, int age){
        System.out.println("매개변수가 있는 생성자 호출");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
