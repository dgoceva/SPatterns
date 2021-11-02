/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlevisitorexample;

public class GameInfo extends AbstractTitleInfo {  
   public GameInfo(String titleName) {
       this.setTitleName(titleName);
   }    
   
   public void accept(TitleBlurbVisitor titleBlurbVisitor) {
       titleBlurbVisitor.visit(this);
   }
}