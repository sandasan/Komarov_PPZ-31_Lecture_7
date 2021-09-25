package Example_7_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UsbDrive fl1 = new UsbDrive(16, "Transcend", 2);
        UsbDrive fl2 = new UsbDrive(4, "Kingston", 3);
        UsbDrive fl3 = new UsbDrive(32, "Samsung", 2);
        UsbDrive fl4 = new UsbDrive(1, "Silicon Power", 2);
        UsbDrive fl5 = new UsbDrive(16, "Kingston", 3);
        UsbDrive fl6 = new UsbDrive(32, "Kingston", 2);
        UsbDrive fl7 = new UsbDrive(16, "Samsung", 2);
        UsbDrive fl8 = new UsbDrive(4, "Silicon Power", 3);
        UsbDrive fl9 = new UsbDrive(16, "Samsung", 3);
        UsbDrive fl10 = new UsbDrive(1, "Transcend", 2);

        UsbDrive[] usbMass = { fl1, fl2, fl3, fl4, fl5, fl6, fl7, fl8, fl9, fl10 };

        String[] sortingFields = {"brand", "size", "type"};

        UsbDrive.setSortingFields(sortingFields);

        Arrays.sort(usbMass);

        for (UsbDrive usbDrive :
                usbMass) {
            System.out.println(usbDrive);
        }
    }
}
