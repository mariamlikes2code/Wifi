package com.abstractdevices;

//ABSTRACT CLASS
public abstract class WifiDevice {

	private String name;
	private String ipAddress;
	
	public WifiDevice(String name, String ipAddress) {
		this.setName(name);
		this.setIpAddress(ipAddress);
}
	public abstract void connectToWifi();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
