
public class Main {
	
	public static void main(String[] args) {
		Computer c = new Computer();
		Laptop l = new Laptop();
		StationaryComputer sc = new StationaryComputer();
		
		c.turnOn();
		c.playVideo();
		c.playMusic();
		c.turnOff();
		
		l.turnOn();
		l.playVideo();
		l.playMusic();
		l.turnOff();
		
		sc.turnOn();
		sc.playVideo();
		sc.playMusic();
		sc.turnOff();
		
		
		
	}
}
