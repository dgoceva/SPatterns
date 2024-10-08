import java.util.Observable;
import java.util.Observer;

// An observer of price changes.
      @SuppressWarnings("deprecation")
	public class PriceObserver implements Observer {
           private float price;
           public PriceObserver() {
                 price = 0;
                System.out.println("PriceObserver created: Price is " + price);
          }
          public void update(Observable obj, Object arg) {
                if (arg instanceof Float) {
                        price = ((Float)arg).floatValue();
                        System.out.println("PriceObserver: Price changed to " +
                                price);
                 } else {
                         System.out.println("PriceObserver: Some other change to subject!");
                 }
         }
}
