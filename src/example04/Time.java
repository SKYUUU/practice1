package example04;

public class Time {

    // private : 같은 클래스 내에서만 접근 가능
    // protected : 같은 패키지, 자손 클래스에서만 접근 가능
    // default : 같은 패키지에서만 접근 가능
    // public : 누구나 다 접근 가능

    // 멤버변수는 private 접근제어자 사용(캡슐화)하고 getter() 제공
    private int hour;
    private int minute;
    private int second;

    // getter() : 멤버변수의 값을 읽어가는 메서드
    // setter() : 멤버변수의 값을 수정하는 메서드
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23){
            System.out.println("시를 잘못 입력하셨습니다.");
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59){
            System.out.println("분을 잘못 입력하셨습니다.");
            return;
        }
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59){
            System.out.println("초를 잘못 입력하셨습니다.");
            return;
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return this.getHour() + "시 " +
                this.getMinute() + "분 " +
                this.getSecond() + "초 ";
    }
}
