package com.company;

public class SingletonPatternDemo {

    public static void main(String[] args) {
	// write your code here
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();
        System.out.println("object: "+object);
        System.out.println("object1: "+object1);


        //show the message
        object.showMessage();
    }
}
