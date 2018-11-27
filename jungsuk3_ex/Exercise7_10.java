
package jungsuk3_ex;

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	/* 알맞은 코드를 넣어 완성하시오 (1) . */
	
	public void setChannel(int i) {
		this.channel = i ;
	}

	public void setVolume(int i) {
		this.volume = i ; 
	}

	public int getChannel() {
		return this.channel;
	}

	public int getVolume() {
		return this.volume;
	}
	
} 

class Exercise7_10 {
	public static void main(String args[]) { 
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume()); 
	} 
}