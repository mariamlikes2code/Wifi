package com.abstractdevices;

//MAIN CLASS
import java.util.Scanner;

public class WifiDeviceDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Router router = new Router("MyRouter", "192.168.1.1", "v1.0");
		Smartphone smartphone = new Smartphone("MyPhone", "192.168.1.2", "Android");

		int choice;
		do {
			System.out.println("\nWelcome to the WiFi Device Management System!");
			System.out.println("\nMenu:");
			System.out.println("1. Connect to WiFi");
			System.out.println("2. Display Device Information");
			System.out.println("3. Update Firmware");
			System.out.println("4. Install App (Smartphone Only)");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				router.connectToWifi();
				smartphone.connectToWifi();
				break;
			case 2:
				System.out.println("Router Information: " + router.toString());
				System.out.println("Smartphone Information: " + smartphone.toString());
				break;
			case 3:
				System.out.print("Enter new firmware version: ");
				String newVersion = scanner.next();
				router.updateFirmware(newVersion);
				break;
			case 4:
				if (smartphone instanceof Smartphone) {
					System.out.print("Enter app name to install: ");
					String appName = scanner.next();
					smartphone.installApp(appName);
				} else {
					System.out.println("This option is only applicable to smartphones.");
				}
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Thank you for using the WiFi Device Management System!\n");
			}
		} while (choice != 0);

		scanner.close();
	}
}
