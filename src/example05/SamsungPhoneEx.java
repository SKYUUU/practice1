package example05;

public class SamsungPhoneEx {

    public static void main(String[] args) {

        SamsungPhone sam = new SamsungPhone();
        sam.setCompany("삼성");
        sam.setModel("갤럭시폴드4");
        sam.setRelease(2022);
        sam.setColor("검정");

        System.out.println(sam);

        SamsungPhone sam1 = new SamsungPhone();
        sam1.setCompany("애플");
        sam1.setModel("아이폰13");
        sam1.setRelease(2021);
        sam1.setColor("하얀");

        System.out.println(sam1);

    }
}
