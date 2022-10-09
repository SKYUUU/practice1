package example09;

public class ReferenceParamArrayEx {

    public static void main(String[] args) {

        int[] arr = new int[] {10, 20, 30, 40, 50};
        System.out.println("change 메서드 호출 전의 값 : " + arr[0]);
        System.out.println("main() arr 의 주소값 : " + arr);
        change(arr);
//        change(new int[] {10, 20, 30});
        System.out.println("change 메서드 호출 후의 값 : " + arr[0]);
    }

    public static void change(int[] arr){
        System.out.println("change arr 의 주소값 : " + arr);
        arr[0] = 999;
        System.out.println("change 메서드 내의 값 : " + arr[0]);
        return;
    }
}
