import java.math.BigDecimal;

public class StrategyPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discounter easter = new EasterDiscounter();
		BigDecimal discountedValue = easter
				  .applyDiscount(BigDecimal.valueOf(100));
		System.out.println("Easter discount of 100 is "+discountedValue);
		Discounter christmas = new ChristmasDiscounter();
		BigDecimal discountedValue1 = christmas
				  .applyDiscount(BigDecimal.valueOf(100));
		System.out.println("Christmas discount of 100 is "+discountedValue1);
				 
	}

}
