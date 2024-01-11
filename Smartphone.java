package com.abstractdevices;

//SUBLCASS OF WIFIDEVICE
public class Smartphone extends WifiDevice{
	private String operatingSystem;
	
	public Smartphone(String name, String ipAddress, String operatingSystem) {
		super(name, ipAddress);
		this.operatingSystem = operatingSystem;
	}
	
	@Override
	public void connectToWifi() {
		System.out.println("Connecting to Wifi. Operating System: " + operatingSystem);
		
	}
	
	public void installApp(String appName) {
		System.out.println("Installing app: " + appName);
	}

}
