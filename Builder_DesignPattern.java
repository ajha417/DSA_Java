class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public Phone(String os, int ram, String processor, double screensize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "[os="+os+", ram="+ram+", processor="+processor+", screensize="+screensize+", battery="+battery+"]";
    }
}

class PhoneBuilder{
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreensize(double screensize) {
        this.screensize = screensize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,  ram,  processor, screensize, battery);
    }

}
public class Builder_DesignPattern {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
        System.out.println(p);
    }
}
