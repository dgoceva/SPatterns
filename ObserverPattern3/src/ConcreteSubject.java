import java.util.Observer;

/**
* A subject to observe!
*/
public class ConcreteSubject {
   
     private String name;
     private float price;
     private DelegatedObservable obs;

     public ConcreteSubject(String name, float price) {
         this.name = name;
         this.price = price;
         this.obs = new DelegatedObservable();
         System.out.println("ConcreteSubject created: " + name + " at "
                     + price);
}
     public String getName() {return name;}
     
     public float getPrice() {return price;}
     
     public void setName(String name) {
           this.name = name;
           obs.setChanged();
           obs.notifyObservers(name);
      }
     public void setPrice(float price) {
            this.price = price;
            obs.setChanged();
            obs.notifyObservers(new Float(price));
     }
     public void addObserver(Observer ob) {
    	 obs.addObserver(ob);
     }
}
