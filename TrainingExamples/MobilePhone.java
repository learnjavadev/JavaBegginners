package com.example.mobilephone;

public class MobilePhone {

	// fields/state/attributes
	int ram;
	int storageCapacity;
	String processor;
	int cameraMP;
	
	// why we need a data type?
	
	
	// action/behaviors
	// call
	// video call
	// watch video
	// gaming
	
	public void call() {
		System.out.println("I'm calling");
		// dial number
		// check network
		// valid number check
	}
	
	public void videoCall() {
		System.out.println("I'm doing a video call");
	}
	
	public void playGame() {
		System.out.println("I'm playing a game");
	}
	
	public void clearRam() {
		ram = 0;	
	}
	
}

class MainClass{
	public static void main(String[] args) {
		MobilePhone nokia = new MobilePhone();
		System.out.println("This is start of java exec");

	}
}
