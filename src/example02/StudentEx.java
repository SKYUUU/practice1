package example02;

public class StudentEx {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 15;
        s1.name = "하치";

        s2 = s1;
        // garbage collector 가 s2 를 소멸시킴
        s2.age = 11;

        System.out.println(s1);
        System.out.println(s2);
    }
}
