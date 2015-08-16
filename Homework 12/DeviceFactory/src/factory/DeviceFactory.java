package factory;

import device.*;

public class DeviceFactory {
	private static DeviceFactory instance = new DeviceFactory();
	
	private DeviceFactory(){
		
	}
	
	public static DeviceFactory getInstance(){
		return instance;
	}
	
	public Device createDevice(String[] infoDevice){
		
		if(infoDevice[0].equalsIgnoreCase("Tablet")){
			return new Tablet(infoDevice[1], infoDevice[2], Float.parseFloat(infoDevice[3]));
		}else if(infoDevice[0].equalsIgnoreCase("Phone")){
			return new Phone(infoDevice[1], infoDevice[2], Short.parseShort(infoDevice[3]));
		}else if(infoDevice[0].equalsIgnoreCase("Laptop")){
			return new Laptop(infoDevice[1], infoDevice[2], infoDevice[3]);
		}else{
			return null;
		}
	}
}
