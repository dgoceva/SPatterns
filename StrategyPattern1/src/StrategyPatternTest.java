import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class StrategyPatternTest {

	@Test
	public void test() {
		Discounter easterDiscounter = new EasterDiscounter();
		 
		BigDecimal discountedValue = easterDiscounter
		  .applyDiscount(BigDecimal.valueOf(100));
		 
		assertEquals(discountedValue, 
				BigDecimal.valueOf(50.0));	
	}
	
	@Test
	public void test1() {
		Discounter easterDiscounter = new Discounter() {
		    @Override
		    public BigDecimal applyDiscount(final BigDecimal amount) {
		        return amount.multiply(BigDecimal.valueOf(0.5));
		    }
		};
	}

}
