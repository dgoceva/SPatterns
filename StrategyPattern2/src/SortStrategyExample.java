/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class SortStrategyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList array = new ArrayList<Object>();
        array.add(10);
        array.add(-3);
        array.add(2);
        array.add(-42);
        SortArray sa = new SortArray();

        sa.setStrategy(new NullStrategy());
        sa.sort(array);
        for(Object obj: array)
            System.out.print(obj+"\t");
        System.out.println();

        sa.setStrategy(new BubbleSort());
        sa.sort(array);
       for(Object obj: array)
            System.out.print(obj+"\t");
        System.out.println();
 
        sa.setStrategy(new InsertionSort());
        sa.sort(array);
        for(Object obj: array)
            System.out.print(obj+"\t");
        System.out.println();
    }
    
}
