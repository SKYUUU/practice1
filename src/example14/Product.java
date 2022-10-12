package example14;

public class Product {

    static int number = 0;
    int countNo;
    int[] arr = new int[10];

    // 정적 초기화 블럭(단 한번만 실행)
    static {
        System.out.println("정적 초기화 블럭 호출됨");
    }

    // 인스턴스 초기화 블럭(정적멤버 사용할 수 있음)
    {
        System.out.println("인스턴스 초기화 블럭 호출됨");
        ++number;
        this.countNo = number;
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    public Product() {
        System.out.println("기본 생성자 호출");
    }
}
