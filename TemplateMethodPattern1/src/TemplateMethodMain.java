
public class TemplateMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Making tea:");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("\nMaking coffee:");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();

	}

}
