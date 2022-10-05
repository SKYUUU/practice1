package example03;

public class Monitor {
    // 멤버변수(Field)
    String color;   // 모니터의 색상
    int channel;    // 채널
    int volume;
    boolean power;   // 전원상태(on/off)

    // 멤버메서드
    public void setPower(){
        if(!this.power){
            System.out.println("모니터가 켜졌습니다.");
        } else{
            System.out.println("모니터가 꺼졌습니다.");
        }
        this.power = !power;
    }
    public void setChannelUp(){
        this.channel++;
        System.out.println("현재 채널 : " + this.channel);
    }
    public void setChannelDown(){
        System.out.println("현재 채널 : " + (--this.channel));
    }
    public void setVolumeUp(){
        System.out.println("현재 볼륨 : " + (++this.volume));
    }

    public void setVolumeDown(){
        System.out.println("현재 볼륨 : " + (--this.volume));
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "color='" + this.color + '\'' +
                ", channel=" + this.channel +
                ", volume=" + this.volume +
                ", power=" + this.power +
                '}';
    }
}
