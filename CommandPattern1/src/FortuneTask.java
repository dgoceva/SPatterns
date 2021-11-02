/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class FortuneTask implements Task {
     int nextFortune = 0;
     String[] fortunes = {"She who studies hard, gets A",
       "Seeth the pattern and knoweth the truth",
       "He who leaves state the day after final, graduates not" };
     public FortuneTask() {}
     public void performTask() {
       System.out.println("Your fortune is: " +
                                              fortunes[nextFortune]);
       nextFortune = (nextFortune + 1) % fortunes.length;
     }
     public String toString() {return ("Fortune Telling Task");}
   }
