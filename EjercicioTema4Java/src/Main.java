public class Main {

    public static void main(String[] args) {



        SmartDevice BlackBerryS2 = new SmartDevice(12.5,1.5,1.2,16,true,true);

        SmartDevice.SmartPhone SamsungGalaxyS2 = new SmartDevice.SmartPhone(20.34,4.5,3.2,28,false,true);

        SmartDevice.SmartWatch HuaweiWatchG5 = new SmartDevice.SmartWatch(15.3,2.4,2.2,17,true,false);

        System.out.println(BlackBerryS2.velocityProcessor + " " + BlackBerryS2.size + " " + BlackBerryS2.memory + " " + BlackBerryS2.capacity + " " + BlackBerryS2.bluetooth + " " + BlackBerryS2.NFC);
        System.out.println(SamsungGalaxyS2.velocityProcessor + " " + SamsungGalaxyS2.size + " " + SamsungGalaxyS2.memory + " " + SamsungGalaxyS2.capacity + " " + SamsungGalaxyS2.bluetooth + " " + SamsungGalaxyS2.NFC);
        System.out.println(HuaweiWatchG5.velocityProcessor + " " + HuaweiWatchG5.size + " " + HuaweiWatchG5.memory + " " + HuaweiWatchG5.capacity + " " + HuaweiWatchG5.bluetooth + " " + HuaweiWatchG5.NFC);
    }
}