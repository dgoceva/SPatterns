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
// A subclass of Observable that allows delegation.
public class DelegatedObservable extends Observable {

  public void clearChanged() {
    super.clearChanged();
  }

  public void setChanged() {
    super.setChanged();
  }

}
