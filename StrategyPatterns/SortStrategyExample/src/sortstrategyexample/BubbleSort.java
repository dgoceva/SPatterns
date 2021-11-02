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
public class BubbleSort implements SortStrategy{

    @Override
    public void sort(ArrayList array) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<array.size()-1;i++)
            for(int j=1;j<array.size()-i;j++)
            {
                 if ((int)(array.get(j-1))>(int)(array.get(j)))
                { 
                    Object temp = array.get(j-1);
                    array.set(j-1,array.get(j));
                    array.set(j, temp);
                }
           }
    }
    
}
