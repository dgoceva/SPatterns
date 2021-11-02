/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstrategyexample;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class InsertionSort implements SortStrategy{

    @Override
    public void sort(ArrayList array) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int i;
        for(int j=1;j<array.size();j++)
        {
            int key = (int)array.get(j);
            for (i=j-1; (i>=0) && ((int)array.get(i)<key);i--)
                array.set(i+1,array.get(i));
            array.set(i+1,key);
        }
        
    }
    
}
