/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegatedobservable2;

import java.util.Observer;

/**
 *
 * @author Admin
 */
/**
 * A subject to observe! But this subject already extends another class. So use
 * a contained DelegatedObservable object. Note that in this version of
 * SpecialSubject we provide implementations of two of the methods of
 * Observable: addObserver() and deleteObserver(). These implementations simply
 * pass the request on to our contained DelegatedObservable reference. Now
 * clients can use the normal Observable semantics to add themselves as
 * observers of this object.
 */
public class SpecialSubject2 extends ParentClass {

    private String name;
    private float price;
    private DelegatedObservable obs;

    public SpecialSubject2(String name, float price) {
        this.name = name;
        this.price = price;
        obs = new DelegatedObservable();
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void addObserver(Observer o) {
        obs.addObserver(o);
    }

    public void deleteObserver(Observer o) {
        obs.deleteObserver(o);
    }

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

}
