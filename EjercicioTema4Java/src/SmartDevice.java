public class SmartDevice {

    protected double velocityProcessor;
    protected double size;
    protected double memory;
    protected int capacity;
    protected boolean bluetooth;
    protected boolean NFC;



    public SmartDevice() {

    }

    public SmartDevice(double velocityProcessor, double size, double memory, int capacity, boolean bluetooth, boolean NFC) {
        this.velocityProcessor = velocityProcessor;
        this.size = size;
        this.memory = memory;
        this.capacity = capacity;
        this.bluetooth = bluetooth;
        this.NFC = NFC;
    }

    static class SmartPhone extends SmartDevice {

        public SmartPhone() {

        }

        public SmartPhone(double velocityProcessor, double size, double memory, int capacity, boolean bluetooth, boolean NFC) {
            super(velocityProcessor, size, memory, capacity, bluetooth, NFC);
        }
    }

    static class SmartWatch extends SmartDevice {

        public SmartWatch() {

        }

        public SmartWatch(double velocityProcessor, double size, double memory, int capacity, boolean bluetooth, boolean NFC) {
            super(velocityProcessor, size, memory, capacity, bluetooth, NFC);
        }
    }
}