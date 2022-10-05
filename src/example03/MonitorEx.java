package example03;

public class MonitorEx {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        System.out.println(monitor.toString());

        monitor.channel = 5;
        monitor.setPower();
        monitor.setChannelUp();
        monitor.setChannelUp();
        monitor.setChannelDown();
        monitor.setVolumeUp();
        monitor.setVolumeUp();
        monitor.setVolumeUp();
        monitor.setVolumeDown();

        monitor.setPower();

        System.out.println(monitor);
    }
}
