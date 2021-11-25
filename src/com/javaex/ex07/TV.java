package com.javaex.ex07;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {
		System.out.println("TV()");
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel=7;
		this.volume=20;
		this.power=false;
		System.out.println("TV(1)");
	}
	
	//메소드 g/s
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	//메소드 일반
	public void power(boolean power) {
		this.power=!power;
	}
	

	public void channel(int channel) {
	 if(channel>0 && channel<=255) {
		 
	 	}else {
	 		this.channel=1;
	 	}		 
	}
	
	public void channel(boolean up) {
		int sum=channel;
		sum=sum+channel;
		if(up==true) {
			channel++;
		}else{
			channel--;
		}
			
	}
	
	public void volume(int volume) {
		if(volume>=0 && volume<=100) {
			
		}else {
			this.volume=100;
		}
	}
	
	public void volume(boolean up) {
		int sum=volume;
		sum=sum+volume;
		if(up==true) {
			volume++;
		}else{
			volume--;
		}
	}

	
	//출력
	public void status() {
		System.out.println("");
		System.out.println("상태:"+power+" 음량:"+volume+" 채널 번호:"+channel+"번");
	}
	
	
//	@Override
//	public String toString() {
//		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
//	}
//	
}
