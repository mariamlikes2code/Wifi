package com.abstractdevices;

//SUBCLASS OF WIFIDEVICE
public class Router extends WifiDevice{
	
	private String firmwareVersion;
	
	public Router(String name, String ipAddress, String firmwareVersion) {
		super(name, ipAddress);
		this.setFirmwareVersion(firmwareVersion);
	}
	
	@Override
	public void connectToWifi() {
		System.out.println("Connecting to Wifi...");
	}
	
	public void updateFirmware(String newVersion) {
		System.out.println("Updating firmware to version: " + newVersion);
		this.setFirmwareVersion(newVersion);
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
}
