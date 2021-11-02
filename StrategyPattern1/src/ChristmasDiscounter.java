import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {

	@Override
	public BigDecimal applyDiscount(BigDecimal amount) {
		// TODO Auto-generated method stub
        return amount.multiply(BigDecimal.valueOf(0.9));
	}

}
