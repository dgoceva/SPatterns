/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegatedobservable;

import java.util.Observable;

/**
 *
 * @author Admin
 */
public class SpecialSubject extends ParentClass {

    private String name;
    private float price;

    private DelegatedObservable obs;

    public SpecialSubject(String name, float price) {
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

    public Observable getObservable() {
        return obs;
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
