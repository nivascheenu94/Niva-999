package org.compmanufacturer;

public class Desktop implements Hardware, Software {
private void desktopMode1() {
System.out.println("Desktop mode is : mobile broser/pc browser");
}

@Override
public void softwareResources() {
	System.out.println("MS word, Win RAR, Eclipse");
	
}

@Override
public void hardwareResources() {
	System.out.println("CD Drive, Graphics Drive, Sound Driver");
	
}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopMode1();
	d.softwareResources();
	d.hardwareResources();
	
}
}