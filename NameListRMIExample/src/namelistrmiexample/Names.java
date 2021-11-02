/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namelistrmiexample;

import java.io.Serializable;

public class Names implements Serializable {

    protected String[] theNames = new String[1000];
    protected int nameCount = 0;

    public void add(String name) {
        theNames[nameCount] = name;
        ++nameCount;
    }

    public String[] getList() {
        return theNames;
    }
 
}