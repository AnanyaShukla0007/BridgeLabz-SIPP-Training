class Device {
    String deviceId;
    String status;

    Device(String id, String status) {
        this.deviceId = id;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String id, String status, int temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting);
    }

    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH-101", "Active", 24);
        thermostat.displayStatus();
    }
}