package com.java.polymorphism;

public class Animal {
	String hunger;
	String sound;
	String jump;
	public String getHunger(String name) {
		return hunger;
	}
	public String getHunger(String name,String color) {
		return "abcd";
	}
	public void getHunger() {
		
	}
    public void setHunger(String hunger) {
    	this.hunger = hunger;
    }
    public String getSound() {
    	return sound;
    }
    public void setSound(String sound) {
    	this.sound = sound;
    }
    public String getJump() {
    	return jump;
    }
    public void setJump(String jump) {
    	this.jump = jump;
    }
}
