package example11;

public class StudentEx {

    public static void main(String[] args) {

        // 기본생성자 호출
        Student student = new Student();
        System.out.println(student);

        // 매개변수가 있는 생성자 호출
        Student student2 = new Student("하치", 15);
        System.out.println(student2);

        Student student3 = new Student("하치");
        System.out.println(student3);

        Student student4 = new Student(15);
        System.out.println(student4);
    }
}
