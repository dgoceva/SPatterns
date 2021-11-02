import java.awt.Color;

public class FlyweightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100;i++) {
			Vehicle car = VehicleFactory.createVehicle(getRandomColor());
			System.out.println(car+"\t"+car.getColor());
		}
	}
	
	public static Color getRandomColor() {
		return new Color((int)(Math.random()*1000)%256);
	}

}
