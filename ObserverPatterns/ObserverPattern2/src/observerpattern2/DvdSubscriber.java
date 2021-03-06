package observerpattern2;


import observerpattern2.DvdRelease;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DvdSubscriber {  
   private String subscriberName; 
   
   public DvdSubscriber(String subscriberNameIn) {
       this.subscriberName = subscriberNameIn;
   }
   
   public String getSubscriberName() {
       return this.subscriberName;
   }
   
   public void newDvdRelease(DvdRelease newDvdRelease, 
                             String subscriptionListName) {
       System.out.println("");
       System.out.println("Hello " + this.getSubscriberName() + 
                          ", subscriber to the " + 
                             subscriptionListName + 
                          " DVD release list.");
       System.out.println("The new Dvd " + 
                            newDvdRelease.getDvdName() + 
                          " will be released on " + 
                            newDvdRelease.getDvdReleaseMonth() + "/" + 
                            newDvdRelease.getDvdReleaseDay() + "/" + 
                            newDvdRelease.getDvdReleaseYear() + ".");
   }
   
   public void updateDvdRelease(DvdRelease newDvdRelease, 
                                String subscriptionListName) {
       System.out.println("");
       System.out.println("Hello " + this.getSubscriberName() + 
                          ", subscriber to the " + 
                            subscriptionListName +
                          " DVD release list.");
       System.out.println(
         "The following DVDs release has been revised: " + 
         newDvdRelease.getDvdName() + " will be released on " + 
         newDvdRelease.getDvdReleaseMonth() + "/" + 
         newDvdRelease.getDvdReleaseDay() + "/" + 
         newDvdRelease.getDvdReleaseYear() + ".");
   }   
}
